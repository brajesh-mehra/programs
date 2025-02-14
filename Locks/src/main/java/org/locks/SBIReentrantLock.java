package org.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SBIReentrantLock {
    private int balance = 100;
    Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to acquire the lock");
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is processing withdrawal of Rs = " + amount);
                    this.balance = balance - amount;
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + " after balance = " + balance);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " couldn't acquire the lock after waiting for " + 1000 + " millis");
            }
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
