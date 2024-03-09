package it.cws.meta.cwsuserservices.mapper;

import it.cws.meta.cwsuserservices.dto.UserDtoRequest;
import it.cws.meta.cwsuserservices.dto.UserDtoResponse;
import it.cws.meta.cwsuserservices.entities.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Mapper(componentModel = "spring")
//@Component
public interface UserMapper {
    UserDtoResponse fromUserToUserDtoResponse(User user);
    User fromUserDtoRequestToUser(UserDtoRequest userDtoRequest);
}
