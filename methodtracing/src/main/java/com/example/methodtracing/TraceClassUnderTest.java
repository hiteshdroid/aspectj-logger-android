package com.example.methodtracing;

public class TraceClassUnderTest {
    public void test() {
        try{
            Thread.sleep(3);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
