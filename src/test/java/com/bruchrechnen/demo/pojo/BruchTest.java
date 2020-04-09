package com.bruchrechnen.demo.pojo;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BruchTest {



    @Test
    void ggt() {
        assertEquals(5, Bruch.ggt(0,5));
        assertEquals(5, Bruch.ggt(5,0));
        assertEquals(3, Bruch.ggt(6,9));
        assertEquals(25, Bruch.ggt(25,25));
        assertEquals(1, Bruch.ggt(5,7));
    }
}