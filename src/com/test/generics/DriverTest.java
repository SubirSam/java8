package com.test.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DriverTest {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(10,2,3,4,5,6,7,89,22);
        System.out.println(refactorTest(listOfInteger));

        Printer<Integer,String> ptr = new Printer();
        ptr.setWhatToPrint(11);
        ptr.setWhoToPrint("sam");
        System.out.println(ptr.getWhatToPrint());
        System.out.println(ptr.getWhoToPrint());

        Printer<String,Integer> ptr1 = new Printer();
        ptr1.setWhatToPrint("India!!!!");
        ptr1.setWhoToPrint(22);
        System.out.println(ptr1.getWhatToPrint());
        System.out.println(ptr1.getWhoToPrint());

        System.out.println(test(877879.9898,25));


    }

    public static <T,V> T test(T input, V output){
        System.out.println(input instanceof Double?"Double!!!!":"String");
        System.out.println(output instanceof Integer?"Integer!!!!":"String");
        return input;
    }
    private static List<?> refactorTest(List<?> listOfSomeThing) {
       return listOfSomeThing.stream().filter(s-> s instanceof Integer && (Integer)s % 2==0).collect(Collectors.toList());
    }
}
