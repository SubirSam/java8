package com.test.generics;

public class Printer<T> {
    T whatToPrint;
    public T getWhatToPrint() {
        return whatToPrint;
    }
    public void setWhatToPrint(T whatToPrint) {
        this.whatToPrint = whatToPrint;
    }
}
