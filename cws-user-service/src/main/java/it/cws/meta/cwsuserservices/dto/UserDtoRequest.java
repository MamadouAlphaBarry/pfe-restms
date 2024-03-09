package it.cws.meta.cwsuserservices.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class UserDtoRequest {
    private int id;
    private String name;
    private String email;
    private String password;
    private String rememberToken;
   // private LocalDateTime createdAt;
   // private LocalDateTime  updatedAt;
   // private LocalDateTime  deletedAt;
    private String username;
    private String firstName;
    private String lastName;
    private String initials;
    private String picture;
    private String country;
    private String address;
    private String postalCode;
    private String sede;
    private String phone;
    private String mobile;
    private String city;
    private String title;
    private String state;
    private String ipphone;
    private String displayName;
    private boolean isAdmin;
    private boolean isAd;
}
