package org.code.coreJava.thread;

import java.util.concurrent.*;

public class ExecuterServiceUsingCallable {


    public static void main(String[] args) {
        try(ExecutorService executorService= Executors.newSingleThreadExecutor()){
            Callable<String> callable=() -> {
                String a="Ela";
                String b="Reo";
                return a+b;
            };
            Future<String> future=executorService.submit(callable);
            System.out.println(future.get());
            executorService.shutdown();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
