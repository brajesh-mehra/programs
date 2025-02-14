package org.locks;

public class SBIVolatile {

    private int balance = 100;

    private volatile boolean isThreadRunning = false;
    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw Rs. = "+ amount);
        if(!isThreadRunning){
            isThreadRunning = true;
            if (amount <= balance) {
                this.balance =- amount;
                System.out.println(Thread.currentThread().getName() + " has withdrawn Rs. = "+ amount);
                isThreadRunning = false;
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " couldn't execute because other thread is running");
        }
    }
}
