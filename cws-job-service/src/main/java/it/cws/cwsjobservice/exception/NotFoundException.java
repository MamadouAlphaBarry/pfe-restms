package it.cws.cwsjobservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends  Exception{
    private  String  message;
}
