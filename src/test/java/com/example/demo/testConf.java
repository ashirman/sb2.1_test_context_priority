package com.example.demo;

import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class testConf {
    @Bean
    //@Primary
    public Bar bar(){
        return Mockito.mock(Bar.class);
    }
}
