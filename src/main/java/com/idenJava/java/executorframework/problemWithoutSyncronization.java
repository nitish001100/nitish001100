package com.idenJava.java.executorframework;

class Table {
    int n;

    void print(int n) {
        this.n = n;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }
    }
}

class Thread1 extends Thread {

    Table table;

    public Thread1(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.print(5);
    }

}

class Thread2 extends Thread {

    Table table;

    public Thread2(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.print(100);
    }
}

public class problemWithoutSyncronization {

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();
        Thread1 t1 = new Thread1(table);
        Thread2 t2 = new Thread2(table);

        t1.start();
        t2.start();

        /**
         1: Synchronized Method.
         2: Synchronized Block.
         3: Static Synchronization - Suppose there are two resources (r1 and r2) , r1 is shared to t1 and t2 and r2 is shared with t3 and t4, in this we are sure that t1 and t2 will not
         interfere between each other and t3 and t4 will not between them.
         But we are not sure that t3 will not access r1 and t2 will not access r2.

         For this do static syncronization.

         synchronized static void printTable(int n){
                    for(int i=1;i<=10;i++){
                        System.out.println(n*i);
                    try{
                        Thread.sleep(400);
                    }catch(Exception e){}
                }
            }
         }

         */

    }

}
