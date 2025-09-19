package org.code.java8.reduce;

import java.util.concurrent.atomic.AtomicInteger;

public class TestMain {

    //Find the total salary of all employees
    static void totalSalary(){
        double totalSum = Employee.getEmployees()
                .stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total salary:"+totalSum);

        double reduceSum=Employee .getEmployees().stream()
                .map(Employee::getSalary)
                .reduce(0d,Double::sum);

        System.out.println("Total salary reduce: "+reduceSum);
        }


        //Find the concatenated names of all employees
       static void concate(){
           String ans= Employee.getEmployees()
                   .stream()
                   .map(Employee::getName)
                   .reduce((a,b)-> a+","+b).orElse("");
           System.out.println(ans);
    }

    //Find the highest-paid employee salary
    static void high(){
       double ans= Employee.getEmployees()
               .stream()
               .map(Employee::getSalary)
               .reduce(Double::max)
               .orElse(0d);
        System.out.println(ans);
    }

    //Count employees without using count() (use reduce())
    static void countEmp(){
      long ans=  Employee.getEmployees().stream()
                .map(a->1L)
                .reduce(0L, Long::sum);

        System.out.println(ans);

        AtomicInteger count= new AtomicInteger(0);
        Employee.getEmployees().forEach(a -> count.getAndIncrement());
        System.out.println(count.get());
    }

        public static void main(String[] args) {
            countEmp();

    }
}
