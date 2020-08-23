package example.junit5.annotations.repeated.test;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReapetedTestExample {

    @RepeatedTest(5)
    public void myFirstTest () {
        assertEquals(2, 1+1);
    }
}
