package example.junit5.annotations.display.name;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Название класса")
public class DisplayNameExample {
    @DisplayName("Название теста")
    @Test
    public void myFirstTest () {
        assertEquals(2, 1+1);
    }
}
