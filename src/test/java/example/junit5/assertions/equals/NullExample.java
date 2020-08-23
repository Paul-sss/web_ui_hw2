package example.junit5.assertions.equals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NullExample {
    @Test
    void myF() {
        String name = "Кот";

        Assertions.assertNotNull(name);
    }
}
