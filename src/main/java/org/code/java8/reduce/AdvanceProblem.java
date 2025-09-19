package org.code.java8.reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class AdvanceProblem {


    //Find the total number of characters in all employee names.
    static void totalChar(){
        long names=Employee.getEmployees().stream()
                .map(s-> s.getName().length())
                .reduce(Integer::sum)
                .orElse(0);
         System.out.println(names);
    }

    //Minimum salary using reduce
    static void minimum(){
        double ans= Employee
                .getEmployees().stream()
                .map(Employee::getSalary)
                .reduce(Double::min)
                .orElse(0d);
        System.out.println(ans);
    }

    //// 3. Product of all employee IDs
    static void productOfAllEmploy(){
       int ans= Employee.getEmployees()
                .stream()
                .map(Employee::getId)
                .reduce((a,b)-> a*b)
               .orElse(0);
       System.out.println(ans);
    }

    // 4. Concatenate all departments with |
    static void concatnate(){
       String ans= Employee.getEmployees()
                .stream()
                .map(Employee::getDepartment)
               .distinct()
                .reduce((a,b)-> a+"|"+b)
               .orElse("");

        System.out.println(ans);
    }

    //// 5. Longest employee name
    static void longName(){
       String ans= Employee.getEmployees().stream()
                .map(Employee::getName)
                .reduce((a,b)-> a.length()>=b.length()?a:b)
                .orElse("");

        System.out.println(ans);
    }

    //// 6. Count employees with salary > 60,000
    static void countEmpSal(){
        long countUsingFilter=Employee.getEmployees().stream()
                .map(Employee::getSalary)
                .filter(a-> a>60000)
                .count();

        long usingReduce=Employee.getEmployees().stream()
                .map(a-> a.getSalary()>60000 ? 1l : 0l)
                .reduce(Long::sum).orElse(0l);

        System.out.println(countUsingFilter);
        System.out.println(usingReduce);
    }

    // 7. Difference between max and min salary
    static void findMinMax(){
        // 7. Difference between max and min salary
        double salaryDiff = Employee.getEmployees().stream()
                .map(Employee::getSalary)
                .reduce((a, b) -> a > b ? a : b).get()
                - Employee.getEmployees().stream().map(Employee::getSalary)
                .reduce((a, b) -> a < b ? a : b).get();
        System.out.println(salaryDiff);
    }

    public static void main(String[] args) {
        countEmpSal();
    }
}
