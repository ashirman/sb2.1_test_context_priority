package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class, TestConf.class})
public class DemoApplicationTestSBTestConfig {

    @Autowired
    private Foo foo;

    @Autowired
    private Bar bar;

    @Test
    public void test() {
        org.junit.Assert.assertNotEquals(null, bar);
    }
}
