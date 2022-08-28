package com.test.generics;

public class Printer<T,V> {
    T whatToPrint;
    V whoToPrint;

    public V getWhoToPrint() {
        return whoToPrint;
    }

    public void setWhoToPrint(V whoToPrint) {
        this.whoToPrint = whoToPrint;
    }

    public T getWhatToPrint() {
        return whatToPrint;
    }
    public void setWhatToPrint(T whatToPrint) {
        this.whatToPrint = whatToPrint;
    }
}
