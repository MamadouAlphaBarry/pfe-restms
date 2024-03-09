package it.cws.cwsjobservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CwsJobServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CwsJobServiceApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Hello workd");
        };
}
}
