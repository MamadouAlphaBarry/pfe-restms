package it.cws.meta.cwsuserservices.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import it.cws.meta.cwsuserservices.dto.UserDtoRequest;
import it.cws.meta.cwsuserservices.dto.UserDtoResponse;
import it.cws.meta.cwsuserservices.exception.*;
import it.cws.meta.cwsuserservices.service.UserService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/v1")
@Slf4j
@Transactional
public class UserRestController {
  private UserService userService;
  private ResourceBundleMessageSource errMessage;



    public UserRestController(UserService userService, ResourceBundleMessageSource errMessage) {
        this.userService = userService;
        this.errMessage = errMessage;
    }
    @GetMapping("/map")
    public Map<String,String>find(){
        Map<String,String> map= new LinkedHashMap<String,String>();
        map.put("KEY","hello");
        return map;
    }


    @GetMapping("/users")
    @Operation(summary = "Get all user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Utenti trovati",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserDtoRequest.class)) }),
            @ApiResponse(responseCode = "400", description = "Error di recuperation degli utenti",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Utenti non trovati",
                    content = @Content) })

    public List<UserDtoResponse> index() throws UserNotFoundException {
        List<UserDtoResponse> userDtoResponseList=userService.showAllUser();

        if (userDtoResponseList.isEmpty()){
            String ErrMsg = String.format("***************Nessun Utente trovoto**************************");
            log.warn(ErrMsg);
            throw  new UserNotFoundException("Aucun n'Utilisateur trouvè dans la base de donnèes");
        }
        log.info(String.format("**************Otteniamo Tutti gli utenti: "+userDtoResponseList+"*********************"));
        return userDtoResponseList;
    }
    @PostMapping("/users")
    public  UserDtoResponse createUser(  BindingResult bindingResult, @Valid @RequestBody UserDtoRequest userDtoRequest) throws EmailAlreadyUsedException, BindingException {
        log.info("tentativo di salvataggio del User: "+userDtoRequest.toString());
if (bindingResult != null) {


        if (bindingResult.hasErrors()){
            String MsgErr="Error logique";
           // String MsgErr=errMessage.getMessage(bindingResult.getFieldError(), LocaleContextHolder.getLocale());
            log.warn("ERRORE DI SALVATAGGIO "+userDtoRequest.toString());
            log.warn(MsgErr);
            throw  new BindingException(MsgErr);
        }}

        log.info("Salviamo utente "+userDtoRequest.toString());

       return  userService.storeUser(userDtoRequest);
    }
    @PutMapping("/users/{id}")
    UserDtoResponse editUser(@PathVariable("id") Long id,UserDtoRequest userDtoRequest) throws UserNotFoundException {
        log.info("****************Modifichiamo l'articolo con l'id "+id+"************************");

       return  userService.modifyUser(id,userDtoRequest);
    }
   @GetMapping("/users/{id}")
    public UserDtoResponse findUserById(@PathVariable(name = "id") Long id) throws UserNotFoundException {
       log.info("****************Recuperiamo l'articolo con l'id "+id+"************************");
       return  userService.showdUserById(id);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable(name = "id") Long id) throws UserNotFoundException {
        userService.removeUser(id);
    }

    @PostMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ErrerResponse> updateUser(
             @Valid @RequestBody UserDtoRequest user,
            BindingResult bindingResult) {

        if (bindingResult.hasFieldErrors()) {

            List<InputFieldError> fieldErrorList = bindingResult.getFieldErrors().stream()
                    .map(error -> new InputFieldError(error.getField(), error.getDefaultMessage()))
                    .collect(Collectors.toList());

            ErrerResponse updateResponse = new ErrerResponse(fieldErrorList);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(updateResponse);
        }
        else {
            // Update logic...
            return ResponseEntity.status(HttpStatus.OK).build();
        }
    }
}
