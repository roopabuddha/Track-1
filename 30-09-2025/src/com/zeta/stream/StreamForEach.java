package com.zeta.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamForEach {
    public static void main(String[] args) {
        List<String> membersList = new ArrayList<>();
        membersList.add("Rupa");
        membersList.add("Shekhar");
        membersList.add("Latha");
        membersList.add("Kiran");
        membersList.add("Uday");
        membersList.add("Ganesh");

        membersList.stream().filter(s -> s.startsWith("R")).forEach(System.out::println);
        membersList.stream().filter(s -> s.startsWith("L")).map(String::toUpperCase).forEach(System.out::println);

    }
}


