package com.g1rna;

import com.g1rna.service.UserService;
import com.g1rna.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes={ConsumerServerApplication.class})
class ConsumerServerApplicationTests {

    @Autowired
    UserServiceImpl userService;
    @Test
    void contextLoads() {
        for (int i = 0;i<25;i++){
            userService.buyTicket();
        }
    }

}
