package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

/*   // @Configuration
    private static class InnerConf{
        @Bean
        public Bar bar(){
            return new Bar();
        }
    }*/
}
