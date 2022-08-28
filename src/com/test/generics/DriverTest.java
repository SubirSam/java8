package com.test.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DriverTest {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(10,2,3,4,5,6,7,89,22);
        System.out.println(refactorTest(listOfInteger));
    }
    private static List<?> refactorTest(List<?> listOfSomeThing) {
       return listOfSomeThing.stream().filter(s-> s instanceof Integer && (Integer)s % 2==0).collect(Collectors.toList());
    }
}
