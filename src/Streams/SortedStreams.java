package Streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortedStreams {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("z");
        list.add("p");
        List<String> list2 = new ArrayList<>();
        list2 = (List<String>) list.stream().sorted().toList();
        list.stream().sorted().forEachOrdered(System.out::println);
        System.out.println(list2);
    }
}
