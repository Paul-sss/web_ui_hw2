package example.junit5.annotations.before.and.after;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeAll
    static void beforeAll () {
        System.out.println("BeforeAndAfterExample: beforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeAndAfterExample: setUp");
    }
}
