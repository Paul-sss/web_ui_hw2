package example.junit5.assertions.assertAll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExample {
    @Test
    void myF() {
        Assertions.assertAll( "User",
                ()-> Assertions.assertEquals("Иван", "Петр"),
                ()-> Assertions.assertEquals("Федя", "Петр"),
                ()-> Assertions.assertEquals("Иван", "Иван ")
                );

    }
}
