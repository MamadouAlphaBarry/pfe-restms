package it.cws.meta.cwsuserservices.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter

public class ErrorResponse {
    private Date date;
    private int statuscode;
    private String message;
}
