package it.cws.meta.cwsuserservices.mapper;

import it.cws.meta.cwsuserservices.dto.UserDtoRequest;
import it.cws.meta.cwsuserservices.dto.UserDtoResponse;
import it.cws.meta.cwsuserservices.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserMapperImpl implements UserMapper {
    /**
     * @param user
     * @return
     */
    @Override
    public UserDtoResponse fromUserToUserDtoResponse(User user) {
        UserDtoResponse userDtoResponse= UserDtoResponse.builder()
                .name(user.getName())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .initials(user.getInitials())
                .picture(user.getPicture())
                .country(user.getCountry())
                .address(user.getAddress())
                .postalCode(user.getPostCode())
                .sede(user.getSede())
                .mobile(user.getMobile())
                .phone(user.getPhone())
                .city(user.getCity())
                .title(user.getTitle())
                .state(user.getState())
                .ipphone(user.getIpphone())
                .displayName(user.getDisplayName())
                .isAd(user.isIs_ad())
                .isAdmin(user.isIs_admin())
                .build();
        return userDtoResponse;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public User fromUserDtoRequestToUser(UserDtoRequest user) {
        User user1 = User.builder()
                .name(user.getName())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .initials(user.getInitials())
                .picture(user.getPicture())
                .country(user.getCountry())
                .address(user.getAddress())
               // .postalCode(user.getPostCode())
                .sede(user.getSede())
                .mobile(user.getMobile())
                .phone(user.getPhone())
                .city(user.getCity())
                .title(user.getTitle())
                .state(user.getState())
                .ipphone(user.getIpphone())
                .displayName(user.getDisplayName())
                //.isAd(user.isIs_ad())
               // .isAdmin(user.isIs_admin())
                .build();
        return user1;
    }
}
