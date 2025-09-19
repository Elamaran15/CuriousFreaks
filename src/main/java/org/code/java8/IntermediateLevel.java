package org.code.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Given a list of integers, find the maximum value using streams.

From a list of employees, get the names of employees whose salary is greater than 50,000.

Given a list of strings, find the first string with more than 5 characters.

Given a map of student name to marks, get the names of students who scored more than 75.

Given a list of strings, group them by their length.

 */
public class IntermediateLevel {

   //Given a list of integers, find the maximum value using streams.
    static int findMax(List<Integer> list){
          return list.stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    static List<String>  findEmpWithGreaterSalary(List<Employee> employeeList){
       return employeeList.stream().filter(s-> s.getSalary()>50000)
                .map(Employee::getName).toList();
    }

    //Generate a Sequence and Filter
    //Problem: Generate the first 10 multiples of 5, then filter out any multiples that are also multiples of 3.

    static List<Integer> findFilter(){
        // Generate first 10 multiples of 5
        // Then filter out those which are also multiples of 3
        List<Integer> result = IntStream.rangeClosed(1, 10) // Generates integers from 1 to 10
                .map(i -> i * 5) // Transforms to multiples of 5 (5, 10, ..., 50)
                .filter(n -> n % 3 != 0) // Filters out numbers divisible by 3
                .boxed() // Converts IntStream to Stream<Integer> for collecting to List<Integer>
                .toList();

        System.out.println("Numbers: " + result); // Output: [5, 10, 20, 25, 35, 40, 50]
        return result;
    }


    public static void main(String[] args) {
//      List<Integer> list=List.of(2,3,4,5,10,22,33,44);
//        System.out.println(findMax(list));

        Employee emp1=new Employee(20000.0,"Elamaran");
        Employee emp2=new Employee(50000.0,"Regan");
        Employee emp3=new Employee(60000.0,"Reo");
        Employee emp4=new Employee(80000.0,"Rohi");
        Employee emp5=new Employee(80000.0,"arun");
        Employee emp=new Employee(40000.0,"Lat");

        findEmpWithGreaterSalary(List.of(emp1,emp2,emp3,emp4,emp5,emp)).forEach(System.out::println);


    }
}
