package org.callable;

import java.util.concurrent.Callable;

public class SquareCalculator implements Callable<Integer> {

    private Integer num;

    SquareCalculator(Integer num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " - " + num);
        return num * num;
    }
}
