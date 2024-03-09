package it.cws.meta.cwsuserservices;

import it.cws.meta.cwsuserservices.dao.UserRepository;
import it.cws.meta.cwsuserservices.dto.UserDtoRequest;
import it.cws.meta.cwsuserservices.entities.User;
import it.cws.meta.cwsuserservices.web.UserRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;

import java.util.Locale;

@SpringBootApplication
public class CwsUserServicesApplication {



    public static void main(String[] args) {
        SpringApplication.run(CwsUserServicesApplication.class, args);
    }

   @Bean
    CommandLineRunner commandLineRunner(UserRestController userRestController){
        return args -> {
            UserDtoRequest userDtoRequest= UserDtoRequest.builder()
                    .name("Alpha")
                    .address("Via Giacome Medici")
                    .email("test@gmail.com")
                    .country("Italia")
                    .displayName("Mamadou Alpha")
                    .firstName("Alpha")
                    .lastName("Barry")
                    .isAdmin(false)
                    .ipphone("iphone")
                    .postalCode("03043")
                    .sede("Torino")
                    .title("ICT DEV")
                    .initials("MAB")
                    .build();

           // userRestController.createUser(userDtoRequest,null);
        };
    }

}
