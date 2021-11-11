package com.eleonoralion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.eleonoralion")
public class SpringConfig {

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
}
