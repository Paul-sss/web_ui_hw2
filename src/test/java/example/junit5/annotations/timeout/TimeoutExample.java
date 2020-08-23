package example.junit5.annotations.timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeoutExample {

    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    @Test
    public void myFirstTest () throws InterruptedException {
        assertEquals(2, 1+1);
        Thread.sleep(5000);
    }
}
