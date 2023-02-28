package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>() {{
            add(30);
            add(10);
            add(20);
        }};

        Collections.sort(al, (e2, e1) -> {
            // return e2 > e1 ? 1 : -1; // v1 오름차순 정렬
            // return e2 > e1 ? -1 : 1; // v2 내림차순 정렬
            // return e2 - e1; // v3 오름차순 정렬
            return e1 - e2; // v4 내림차순 정렬
        });

        Collections.sort(al, (e2, e1) -> e1 - e2);

        System.out.println(al);
    }
}


