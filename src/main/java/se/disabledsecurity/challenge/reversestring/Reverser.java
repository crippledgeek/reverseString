package se.disabledsecurity.challenge.reversestring;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverser {

    public static String reverseOrder(String in) {
        return IntStream.range(0, in.length())
                .mapToObj(x-> in.charAt((in.length()-1)-x))
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}
