package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {DemoApplicationTest.testConf.class, DemoApplication.class})
//@SpringBootTest(classes = {DemoApplication.class, testConf.class})
//@SpringBootTest(classes = DemoApplicationTest.testConf.class)
//@Import(DemoApplicationTest.testConf.class)
@ContextConfiguration(classes = {DemoApplication.class,
        testConf.class
})
//@Import(DemoApplicationTest.testConf.class)
public class DemoApplicationTest {

    @Autowired
    private Foo foo;

    @Autowired
    private Bar bar;

    @Test
    public void f(){
        org.junit.Assert.assertNotEquals(null, bar);
    }
}