package it.cws.meta.cwsuserservices.services;

import it.cws.meta.cwsuserservices.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    List<User> findUsersNotAssignedBu();
     List<User> findAllUsersDependenti();
     List<User> findAllUsersCollboratori();
     User createUser(User user);
     User editUsers(User user);
     Void deleteUser(User user);


}
