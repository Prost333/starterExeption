package by.starterExeption.config;

import by.starterExeption.DefaultExceptionHandler;
import by.starterExeption.ExceptionHandler;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Slf4j
@Configuration
public class ExceptionHandlerAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public ExceptionHandler exceptionHandler() {
        return new DefaultExceptionHandler();
    }


    @PostConstruct
    void init() {
        log.info("LoggingAutoConfiguration init");
    }
}
