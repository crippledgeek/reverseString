package se.disabledsecurity.challenge.reversestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverserTest {

    @Test
    void reverseOrder() {
        Assertions.assertEquals("olleh", Reverser.reverseOrder("hello"));
    }
}