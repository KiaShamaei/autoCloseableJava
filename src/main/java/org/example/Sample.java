package org.example;

public class Sample implements AutoCloseable {
    public void m1() {
        System.out.println("method call ...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close method call automatically ... ");
    }
}


