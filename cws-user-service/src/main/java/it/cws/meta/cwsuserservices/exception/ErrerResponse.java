package it.cws.meta.cwsuserservices.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ErrerResponse {

    private List<InputFieldError> fieldErrors;
}
