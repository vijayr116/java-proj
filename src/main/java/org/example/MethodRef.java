package org.example;

import java.util.List;

public class MethodRef {
    public void demo() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().map(num -> num + 1).forEach(System.out::println);
    }
}
