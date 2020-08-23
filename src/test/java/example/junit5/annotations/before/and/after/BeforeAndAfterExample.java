package example.junit5.annotations.before.and.after;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeAndAfterExample extends BaseTest {

    @BeforeAll
    static void beforeAll () {
        System.out.println("BeforeAndAfterExample: beforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeAndAfterExample: setUp");
    }

    @Test
    public void test1 () {
        System.out.println("BeforeAndAfterExample: Test1");
    }

    @Test
    public void test2 () {
        System.out.println("BeforeAndAfterExample: Test2");
    }

    @AfterEach
    void tearDown() {
        System.out.println("BeforeAndAfterExample: tearDown");
    }


    @AfterAll
    static void afterAll () {
        System.out.println("BeforeAndAfterExample: setUp");
    }


}
