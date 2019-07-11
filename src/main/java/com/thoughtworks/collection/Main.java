package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Integer> input=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            input.add(i);
        }
        for (Integer integer:input) {
            System.out.println(integer);
        }
    }
}
