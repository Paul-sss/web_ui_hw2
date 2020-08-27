package example.junit5.assertions.equals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AssertTrueExample {
    @Test
    void myF() {
        Assertions.assertTrue(2==3, "супер");
    }
}
