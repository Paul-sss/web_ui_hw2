package example.junit5.assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertThrowsExample {
    @Test
    public void myFirstTest () {
        File file = new File("src/test/resources/lesson4");
        Assertions.assertThrows(FileNotFoundException.class, () ->new Scanner(file));


    }




}
