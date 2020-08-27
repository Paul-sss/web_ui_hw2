package example.junit5.assertions.array.equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AssertExample {
    @Test
    void myF() {
        String[] strings = {"123", "345"};
        String[] strings1 = {"123", "3245"};

        assertArrayEquals(strings,strings1);
    }
}
