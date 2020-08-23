package example.hamcrest;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.greaterThan;

public class NumberTest {
    @Test
    void name() {
        int actual = 100;
        int expected = 101;

        MatcherAssert.assertThat(actual, greaterThan(expected));
    }
}
