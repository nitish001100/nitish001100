package com.idenJava.java.executorframework.threading;


class Resource  extends Thread{

    @Override
    public void run() {
        int i = 10;
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println("Start the thread "+ i1);
        }

    }
}
public class CreateThread {
    public static void main(String[] args) {
        Resource r = new Resource();
        r.start();
    }
}
