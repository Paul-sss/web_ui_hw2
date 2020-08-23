package example.junit5.assertions;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsExample {
    @Test
    public void myFirstTest () {
        assertEquals(2, 1+1);


        Object o1 = new Object();
        Object o2 = new Object();

        assertEquals(o1, o2);



    }




}
