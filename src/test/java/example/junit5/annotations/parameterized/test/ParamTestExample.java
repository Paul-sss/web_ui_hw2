package example.junit5.annotations.parameterized.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamTestExample {
    @Test
    public void myFirstTest () {
        assertEquals(2, 1+1);
    }

    @Test
    public void myTest2 () {
        assertEquals(2, 1+1);
    }

    //@Ignore
    @Test
    public void myTest3 () {
        assertEquals(2, 1+1);
    }

    @Disabled
    @Test
    public void myTest4 () {
        assertEquals(2, 1+1);
    }


    @ParameterizedTest
    @ValueSource(ints = {2,3,4,5})
    public void checkSum (int expected) {
        assertEquals(expected, 2);
    }

    @ParameterizedTest
    @MethodSource("dataProvidet")
    public void checkSum (int expected, int actual) {
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> dataProvidet() {
        return Stream.of(
                Arguments.of(2,3),
                Arguments.of(5,4),
                Arguments.of(4,4),
                Arguments.of(2,3)
        );
    }


}
