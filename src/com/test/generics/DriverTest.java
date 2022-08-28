package com.test.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DriverTest {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(10,2,3,4,5,6,7,89,22);
        System.out.println(refactorTest(listOfInteger));

        Printer<Integer> ptr = new Printer();
        ptr.setWhatToPrint(11);
        System.out.println(ptr.getWhatToPrint());

        Printer<String> ptr1 = new Printer();
        ptr1.setWhatToPrint("India!!!!");
        System.out.println(ptr1.getWhatToPrint());





    }
    private static List<?> refactorTest(List<?> listOfSomeThing) {
       return listOfSomeThing.stream().filter(s-> s instanceof Integer && (Integer)s % 2==0).collect(Collectors.toList());
    }
}
