package it.cws.cwsjobservice.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import it.cws.cwsjobservice.dtos.JobDtoResponse;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@Transactional
@RequestMapping(value = "/api/v1")
public class JobRestController {
    @GetMapping("/jobs")
    @Operation(summary = "Get all jobs")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Job trovati",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = JobDtoResponse.class)) }),
            @ApiResponse(responseCode = "400", description = "Error di recuperation dei jobs",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Jobs non trovati",
                    content = @Content) })
    public Map<String,Object> index(){
        HashMap<String,Object> map= new HashMap<>();
        map.put("Key1",new String("Value"));
        return map;
    }

   @GetMapping("/user/{id}")
   @Operation(summary = "Get Job By given Id")
   @ApiResponses(value = {
           @ApiResponse(responseCode = "200",description = "Job avec l'identifiant Trouvè"),
           @ApiResponse(responseCode = "404",description = "Aucun Job trouvè"),
           @ApiResponse(responseCode = "400",description = "ERROR de recuperation de JOB")
   })
    public  Map<String, Object> getJobById(@PathVariable(value = "id") Long id){
        HashMap<String,Object> jobMap= new HashMap<>();

        return jobMap  ;
    }

}
