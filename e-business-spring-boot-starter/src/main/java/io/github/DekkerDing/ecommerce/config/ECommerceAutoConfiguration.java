package io.github.DekkerDing.ecommerce.config;

import io.github.DekkerDing.ecommerce.domain.model.Marke;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ConditionalOnBean({Marke.class})
public class ECommerceAutoConfiguration {

    @Bean
    public String xxx(){
        return "";
    }

}
