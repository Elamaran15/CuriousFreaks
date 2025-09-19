package org.code.coreJava.thread;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolThread {

    public static void main(String[] args) {
        try (ForkJoinPool forkJoinPool = ForkJoinPool.commonPool()) {
            forkJoinPool.submit(()->{
                System.out.println("In ForkJoinPool run()");
            });

        }
    }
}
