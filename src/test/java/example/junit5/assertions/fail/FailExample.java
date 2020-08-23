package example.junit5.assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FailExample {
    @Test
    void myF() {
        Assertions.fail("Я в любом случае падаю");
    }
}
