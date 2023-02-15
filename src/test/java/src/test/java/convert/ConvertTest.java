package src.test.java.convert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.java.convert.Convert;

public class ConvertTest {
    @Test
    void test_if_twenty_return_XX() {

        String actual = Convert.convert(20);

        String expected = "XX";

        Assertions.assertEquals(actual.compareTo(expected), 0);
    }

    @Test
    void test_if_fifty_return_L() {

        String actual = Convert.convert(50);

        String expected = "L";

        Assertions.assertEquals(actual.compareTo(expected), 0);
    }

    @Test
    void test_if_1666_return_MDCLXVI() {

        String actual = Convert.convert(1666);

        String expected = "MDCLXVI";

        Assertions.assertEquals(actual.compareTo(expected), 0);
    }

    @Test
    void test_if_negative_number_return_empty_string() {

        String actual = Convert.convert(-378193);

        String expected = "";

        Assertions.assertEquals(actual.compareTo(expected), 0);
    }
}
