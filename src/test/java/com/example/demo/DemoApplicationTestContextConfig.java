package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {
        DemoApplication.class,
        TestConf.class
})
public class DemoApplicationTestContextConfig {

    @Autowired
    private Foo foo;

    @Autowired
    private Bar bar;

    @Test
    public void test() {
        org.junit.Assert.assertNotEquals(null, bar);
    }
}