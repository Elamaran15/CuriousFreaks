package org.code.coreJava.thread;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class CompletableFutureThread {


    public static void main(String[] args) {
        System.out.println("Main thread starts....");

        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("completableFuture thread is sleeping...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return IntStream.rangeClosed(1,100000)
                    .reduce(0, Integer::sum);
        });
        System.out.println("Main thread executing....");
        int resultSum=completableFuture.join();
        System.out.println("After mainthread waits result from completableFuture: "+resultSum);

    }
}
