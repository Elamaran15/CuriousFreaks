package org.code.coreJava.funtionalPrograming;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamTest {

    public static void main(String[] args) {
        // Sequential primitive stream
        long start1 = System.currentTimeMillis();
        int sum1 = IntStream.rangeClosed(1, 10_000_000).sum();
        long end1 = System.currentTimeMillis();
        System.out.println("Sequential (Primitive): " + (end1 - start1) + "ms");

        // Parallel primitive stream
        long start2 = System.currentTimeMillis();
        int sum2 = IntStream.rangeClosed(1, 10_000_000).parallel().sum();
        long end2 = System.currentTimeMillis();
        System.out.println("Parallel (Primitive): " + (end2 - start2) + "ms");

    }
}
