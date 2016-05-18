package java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<String> mList = Arrays.asList("aa1", "cc2", "cc1", "aa2", "bb1");

        mList
                .stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        IntStream.range(2, 7).sum();
    }
}
