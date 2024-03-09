package it.cws.meta.cwsuserservices.exception;

import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

//@ControllerAdvice
//@RestController
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

 /*  @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler( Exception ex){
          ErrorResponse errorResponse= new ErrorResponse();
          errorResponse.setStatuscode(HttpStatus.NOT_FOUND.value());
          errorResponse.setMessage(ex.getMessage());

        return  new ResponseEntity<ErrorResponse>(errorResponse,new HttpHeaders(),HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(EmailAlreadyUsedException.class)
    public  ResponseEntity<ErrorResponse> emailExisteExceptionHandler(Exception exception){
       ErrorResponse errorResponse= new ErrorResponse();
       errorResponse.setDate(new Date());
       errorResponse.setStatuscode(HttpStatus.BAD_REQUEST.value());
       errorResponse.setMessage(exception.getMessage());
       return  new ResponseEntity<ErrorResponse>(errorResponse, new HttpHeaders(),HttpStatus.BAD_REQUEST);
    }
   @ExceptionHandler(BindingException.class)
    ResponseEntity<ErrorResponse> bindingExceptionHandler(Exception exception){
       ErrorResponse errorResponse= new ErrorResponse();
       errorResponse.setDate(new Date());
       errorResponse.setMessage(exception.getMessage());
       errorResponse.setStatuscode(HttpStatus.BAD_REQUEST.value());
       return  new ResponseEntity<ErrorResponse>(errorResponse,new HttpHeaders(),HttpStatus.BAD_REQUEST);

    }

 */
}
