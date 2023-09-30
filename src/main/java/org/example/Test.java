package org.example;

public class Test {
    public static void main(String[] args) {
        //in this part close method call automatically
        try(Sample s = new Sample()) {
            s.m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
