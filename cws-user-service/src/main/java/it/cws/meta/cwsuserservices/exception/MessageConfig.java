package it.cws.meta.cwsuserservices.exception;

import org.hibernate.validator.spi.messageinterpolation.LocaleResolver;
import org.hibernate.validator.spi.messageinterpolation.LocaleResolverContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.server.i18n.FixedLocaleContextResolver;
//import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class MessageConfig {

   @Bean(name = "validation")
    LocalValidatorFactoryBean localValidatorFactoryBean(){
        LocalValidatorFactoryBean bean= new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return  bean;
    }

    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource resource= new ResourceBundleMessageSource();
        resource.setBasename("messages");
        return  resource;
    }

   /*@Bean
    public LocaleResolver localeResolver(){
        SessionLocaleResolver sessionLocaleResolver= new SessionLocaleResolver();
       // sessionLocaleResolver.setDefaultLocale(LocaleContextHolder.getLocale());
        sessionLocaleResolver.setDefaultLocale(new Locale("it"));
        return (LocaleResolver) sessionLocaleResolver;
    }*/
   @Bean
   public LocaleResolver localeResolver() {

       return localeResolverContext -> Locale.forLanguageTag(localeResolverContext.getDefaultLocale().getDisplayLanguage(Locale.ITALIAN));
   }

}
