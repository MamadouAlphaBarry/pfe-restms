package it.cws.meta.cwsuserservices.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.server.i18n.LocaleContextResolver;


//@Configuration
public class AppConfig {

    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    public LocaleContextResolver localeResolver() {
       // SessionLocaleResolve localeResolver = new SessionLocaleResolver();
       // CookieLocaleRes
      // localeResolver.setDefaultLocale(Locale.US); // Locale par défaut
        return null;//localeResolver;
    }
}
