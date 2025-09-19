package org.code.java8.comparator;


import org.code.java8.reduce.Employee;

import java.rmi.server.RMIClassLoader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCompare {

    //Using class sorting by comparable
    static void sortUsingComparable(){
        List<Employee> list= new java.util.ArrayList<>(Employee.getEmployees());
        Collections.sort(list);
        System.out.println(list);
    }

    //Problem 1: Top 3 Highest Paid Employees
    static void highPaid(){
        List<Employee> ans = Employee.getEmployees().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)).limit(3).toList();
        System.out.println(ans);

    }

    //Problem 2: Sort by Name then Salary
    static void sortNameAnsSal(){
        List<Employee> ans = Employee.getEmployees().stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary).reversed()).toList();

        System.out.println(ans);
    }

    //Find the highest paid employee using Comparator
    static void highPaidEmp(){
       Employee ans= Employee.getEmployees().stream()
                .max(Comparator.comparing(Employee::getSalary)).orElse(null);
       System.out.println(ans);
    }

    //6. Sort by number of skills (descending)
    static void sortNoOfSkills(){
        List<Employee> ans = Employee.getEmployees().stream()
                .sorted(Comparator.comparingInt((Employee emp) -> emp.getSkills().size()).reversed())
                .toList();

        System.out.println(ans);
    }

    //Sort employees by department and then by salary descending.
    static void ques1(){
       List<Employee> ans=Employee.getEmployees().stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getSalary).reversed()).toList();

        System.out.println(ans);
    }

    //Sort employees by name but case-insensitive.
    static void emp1(){
        List<Employee> ans=Employee.getEmployees().stream()
                .sorted(Comparator.comparing(emp->emp.getName().toLowerCase()))
                .toList();
        System.out.println(ans);
    }

    //Get the second highest salary using Streams and Comparator
    static void second(){
     Employee ans=Employee.getEmployees().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(ans);
    }


    //Find all employees with salary > average salary and sort by name
    static void avg(){
        double avg = Employee.getEmployees().stream()
                .mapToDouble(Employee::getSalary)
                .average().orElse(0d);

        List<Employee> ans = Employee.getEmployees().stream()
                .filter(emp->emp.getSalary()>avg)
                .sorted(Comparator.comparing(Employee::getName)).toList();

        System.out.println(ans);
    }

    public static void main(String[] args) {
        avg();
    }
}
