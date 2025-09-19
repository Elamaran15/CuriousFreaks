package org.code.coreJava.thread;

import java.util.concurrent.*;

public class virtualThread {


    public static void main(String[] args) {
        try(ExecutorService executorService= Executors.newVirtualThreadPerTaskExecutor()){
            System.out.println("Main thread starts....");

            Callable<String> task1=()->{
                Thread.sleep(1000);
                return "Elamaran";
            };

            Callable<String> task2=()->{
                Thread.sleep(1000);
                return "Reo";
            };

           Future<String> future  =  executorService.submit(task1);
           Future<String> future2 =  executorService.submit(task2);

            System.out.println("Main thread executing....");
            System.out.println("Result one: "+future.get());
            System.out.println("Result Two: "+future2.get());

            System.out.println("Main thread Completed....");

        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
