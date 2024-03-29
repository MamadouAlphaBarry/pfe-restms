package it.cws.meta.cwsuserservices.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class OpenAPIConfig {

  //  @Value("${bezkoder.openapi.dev-url}")
    private String devUrl;

   // @Value("${bezkoder.openapi.prod-url}")
    private String prodUrl;

   @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");

        Server prodServer = new Server();
        prodServer.setUrl(prodUrl);
        prodServer.setDescription("Server URL in Production environment");

        Contact contact = new Contact();
        contact.setEmail("alpha.barry@cws.it");
        contact.setName("Mamadou Alpha");
        contact.setUrl("https://meta.cws.it");
       Map<String,Object> map= new LinkedHashMap();
       map.put("Key1",new Object());
        contact.setExtensions(map);

        License mitLicense = new License().name("PERSONAL LICENCE").url("https://meta.cws.it/");

        Info info = new Info()
                .title("" +
                        "META USERSERVICE MANAGEMENT API" +
                        "")
                .version("1.0")
                .contact(contact)
                .description("" +
                        "<h3>CET API EXPOSE LES ENPOINTS  POUR LA GESTION DE UTILISATEURS DE L'ENTREPRISE</h3>" +
                        "").termsOfService("https://meta.cws.it/")
                .license(mitLicense);

        return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
    }
}
