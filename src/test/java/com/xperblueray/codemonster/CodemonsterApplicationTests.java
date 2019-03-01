package com.xperblueray.codemonster;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringApplicationConfiguration(
        classes = CodemonsterApplication.class
)
@WebAppConfiguration
@SpringBootTest
public class CodemonsterApplicationTests {

    @Test
    public void contextLoads() {
    }

}
