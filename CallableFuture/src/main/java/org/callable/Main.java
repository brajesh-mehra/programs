package org.callable;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Callable and Future");
        // Create a callable task which will return the result
        // submit the task to Thread Executor
        // Receive the result in future.get()

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<Integer> f1 = executor.submit(new SquareCalculator(5));
        Future<Integer> f2 = executor.submit(new SquareCalculator(6));
        Future<Integer> f3 = executor.submit(new SquareCalculator(24));

//        while (!f1.isDone() & !f2.isDone() && !f3.isDone()){
//            System.out.println("threads haven't finished yet");
//        }

        System.out.println("F1 :"+ f1.get());
        System.out.println("F2 :"+ f2.get());
        System.out.println("F3 :"+ f3.get());
        System.out.println("Main thread");
        executor.shutdown();

        System.out.println("Main thread - last");
    }
}