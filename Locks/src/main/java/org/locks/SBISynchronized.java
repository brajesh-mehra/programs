package org.locks;

public class SBISynchronized{

    private int balance = 100;

    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawn Rs = "+ amount);
        }
        System.out.println(Thread.currentThread().getName() + " after balance = "+ balance);
    }
}
