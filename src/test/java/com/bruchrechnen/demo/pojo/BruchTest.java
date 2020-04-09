package com.bruchrechnen.demo.pojo;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BruchTest {

    private Bruch b1,b2,b3;

    @BeforeEach
    public void setUp(){
        System.out.println("before");
        Bruch b1 =new Bruch(3,4);
        Bruch b2 = new Bruch(4,8);
        Bruch b3 = new Bruch(12,3);
        System.out.println(b1);

    }

    @Test
    void ggt() {
        assertEquals(0, Bruch.ggt(0,0));
        assertEquals(5, Bruch.ggt(0,5));
        assertEquals(5, Bruch.ggt(5,0));
        assertEquals(3, Bruch.ggt(6,9));
        assertEquals(25, Bruch.ggt(25,25));
        assertEquals(1, Bruch.ggt(5,7));
    }

    @Test
    void multiplyTest(){
        System.out.println("testing multiplication");
        System.out.println(b2);
        //assertEquals("3/8",b1.mul(b2).toString());

    }
}