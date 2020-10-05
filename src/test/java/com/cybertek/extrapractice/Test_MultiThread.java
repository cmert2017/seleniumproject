package com.cybertek.extrapractice;

public class Test_MultiThread {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.activeCount());
        System.out.println("hi");
        Thread.sleep(3000);
      //  Thread.currentThread();
        int x = 5;
        System.out.println(x);
        Thread.sleep(3000);
       // Thread.currentThread();
        System.out.println(Thread.activeCount());

        int y = (byte) 4.5;
        Thread.sleep(3000);
       // Thread.currentThread();
        System.out.println(Thread.activeCount());

        int z = x > y ? 4 : (4-5);

        System.out.println(Thread.activeCount());

        System.out.println("z is the  result: " + z);
        //Thread.dumpStack();
        Thread.yield();
    }
}
