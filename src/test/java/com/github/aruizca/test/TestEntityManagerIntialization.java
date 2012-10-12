package com.github.aruizca.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author SRA Information Technology
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring/spring-orm.xml"})
public class TestEntityManagerIntialization {

    @Test
    public void testInitialization() {

    }
}
