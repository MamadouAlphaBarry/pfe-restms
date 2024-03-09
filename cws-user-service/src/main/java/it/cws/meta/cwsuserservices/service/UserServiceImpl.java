package it.cws.meta.cwsuserservices.service;

import it.cws.meta.cwsuserservices.dao.UserRepository;
import it.cws.meta.cwsuserservices.dto.UserDtoRequest;
import it.cws.meta.cwsuserservices.dto.UserDtoResponse;
import it.cws.meta.cwsuserservices.entities.User;
import it.cws.meta.cwsuserservices.exception.EmailAlreadyUsedException;
import it.cws.meta.cwsuserservices.exception.UserNotFoundException;
import it.cws.meta.cwsuserservices.mapper.UserMapper;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    /**
     * @param userDtoRequest
     * @return UserDtoResponse
     */
    @Override
    public UserDtoResponse storeUser(UserDtoRequest userDtoRequest) throws EmailAlreadyUsedException {

        //if(userRepository.checkIfUserEmailExist()) throw  new RuntimeException(("user.email.Exist.Exception"));
        User user = userMapper.fromUserDtoRequestToUser(userDtoRequest);
        User savedUser = userRepository.save(user);
        return userMapper.fromUserToUserDtoResponse(savedUser);
    }

    /**
     * @param id
     */
    @Override
    public void removeUser(Long id) throws UserNotFoundException {
      User user=  userRepository.findById(id).orElseThrow(()->new UserNotFoundException("user.id.NotFound.Exception"));
      userRepository.delete(user);


    }

    /**
     * @param id
     * @return
     */
    @Override
    public UserDtoResponse modifyUser(Long id,UserDtoRequest userDtoRequest) throws UserNotFoundException {
        User userById = userRepository.findById(id).orElseThrow(()->new UserNotFoundException("user.email.Exist.Exception"));
        return userMapper.fromUserToUserDtoResponse(userById);
    }

    /**
     * @return
     */
    @Override
    public List<UserDtoResponse> showAllUser() {
        List<UserDtoResponse> userDtoResponses= new ArrayList();
        List<User> users= userRepository.findAll();
      // List<UserDtoResponse> us= users.forEach(user -> userMapper.fromUserToUserDtoResponse(user));
        for (User u:users) {
            userDtoResponses.add(userMapper.fromUserToUserDtoResponse(u));


        }
        return userDtoResponses;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public UserDtoResponse showdUserById(Long id) throws UserNotFoundException {
        User user= userRepository.findById(id).orElseThrow(()->new UserNotFoundException("user.id.NotFound.Exception"));
        return userMapper.fromUserToUserDtoResponse(user);
    }
}
