package org.locks;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Multi-threading with volatile");
//        SBIVolatile sbi = new SBIVolatile();
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                sbi.withdraw(50);
//            }
//        };
//
//        Thread t1 = new Thread(task, "Volatile Thread 1 - ");
//        Thread t2 = new Thread(task, "Volatile Thread 2 - ");
//        t1.start();
//        t2.start();

//        System.out.println("Multi-threading with synchronized");
//        SBISynchronized sbiS = new SBISynchronized();
//        Runnable task2 = new Runnable() {
//            @Override
//            public void run() {
//                sbiS.withdraw(50);
//            }
//        };
//        Thread t3 = new Thread(task2, "synchronized Thread 3 - ");
//        Thread t4 = new Thread(task2, "synchronized Thread 4 - ");
//        t3.start();
//        t4.start();
        System.out.println("Multi-threading with reentrantLock");
        SBIReentrantLock sbiE = new SBIReentrantLock();
        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                sbiE.withdraw(50);
            }
        };
        Thread t5 = new Thread(task3, "ReentrantLock Thread 5 - ");
        Thread t6 = new Thread(task3, "ReentrantLock Thread 6 - ");
        t5.start();
        t6.start();
    }
}