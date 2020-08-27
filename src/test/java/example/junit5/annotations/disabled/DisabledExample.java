package example.junit5.annotations.disabled;

//import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisabledExample {
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

}
