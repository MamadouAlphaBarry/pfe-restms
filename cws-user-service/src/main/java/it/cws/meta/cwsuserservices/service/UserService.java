package it.cws.meta.cwsuserservices.service;

import it.cws.meta.cwsuserservices.dto.UserDtoRequest;
import it.cws.meta.cwsuserservices.dto.UserDtoResponse;
import it.cws.meta.cwsuserservices.exception.EmailAlreadyUsedException;
import it.cws.meta.cwsuserservices.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    UserDtoResponse storeUser(UserDtoRequest userDtoRequest) throws EmailAlreadyUsedException;
    void  removeUser(Long id) throws UserNotFoundException;
    UserDtoResponse modifyUser(Long id,UserDtoRequest userDtoRequest) throws UserNotFoundException;
    List<UserDtoResponse> showAllUser();
    UserDtoResponse showdUserById(Long id) throws UserNotFoundException;

}
