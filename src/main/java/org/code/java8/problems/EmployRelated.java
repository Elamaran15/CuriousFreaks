package org.code.java8.problems;

import org.code.java8.reduce.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployRelated {



    //Get the names of employees who earn more than X salary using streams.
    static void findSal(double salary){
        List<Employee> employees=Employee.getEmployees();
       List<String> ans= employees.stream()
               .filter(employee -> employee.getSalary()>salary)
               .map(Employee::getName)
               .toList();
        ans.forEach(System.out::println);
    }

    //Group employees by department and count them.
    static void groupEmpByDept(){
        List<Employee> employees=Employee.getEmployees();
        Map<String,Long> ans=employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        ans.forEach((s, aLong) -> System.out.println("Department: "+s+"  Count: "+aLong));
    }


    //Group employees by department and get the highest-paid employee in each department.
    //Using  Collectors.collectingAndThen()
    static void groupEmpAndPaid(){
        List<Employee> employees=Employee.getEmployees();
        Map<String,Employee> group = employees.stream()
                .collect(Collectors
                .groupingBy(Employee::getDepartment,
                        Collectors
                                .collectingAndThen(Collectors
                                        .maxBy(Comparator.comparingDouble(Employee::getSalary)),employee -> employee.orElse(null))));
        group.forEach((s, employees1) -> System.out.println(s+ "    "+ employees1));
    }

    //Group employees by department and get the highest-paid employee in each department.
    //Direct using Collectors.maxBy
    static void groupEmpAndPaid2(){
        List<Employee> employees=Employee.getEmployees();

        Map<String, Optional<Employee>> group = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
    }


    //Sort a list of employees by salary, then by name using streams.
    static void sortSal(){
        List<Employee> employees=Employee.getEmployees();

       List<Employee> ans= employees
               .stream()
               .sorted(Comparator.comparingDouble(Employee::getSalary)
                       .thenComparing(Employee::getName)).toList();

        ans.forEach(System.out::println);
    }


    //Join all employee names into a single string (comma-separated) using streams.
    static void joinNames(){
        List<Employee> employees=Employee.getEmployees();
       String names= employees.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(names);
    }


    //Calculate the average salary of employees using streams.
    static void calculateAvgSal(){
        List<Employee> employees=Employee.getEmployees();
       double avg= employees.stream().mapToDouble(Employee::getSalary).average().orElse(0d);
        System.out.println(avg);
    }



    //Find the highest-paid employee in the whole company using max()
    static void highPaid(){
        List<Employee> employees=Employee.getEmployees();

        Employee maxEmp=employees
                .stream()
                .max(Comparator.comparing(Employee::getSalary)).orElse(null);

        System.out.println(maxEmp);
    }


    //Get a map of department → average salary using Collectors.groupingBy().
    static void mapDeptAvg(){
        List<Employee> employees=Employee.getEmployees();
        Map<String, Double> ans=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(Collectors.averagingDouble(Employee::getSalary),employee->employee)));


        ans.forEach((s, aDouble) -> System.out.println(s +"    "+aDouble));
    }


    //Partition employees into two groups: those having salary above average and those below or equal.
    static void partitionSalary(){
        List<Employee> employees=Employee.getEmployees();


        double avg=employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);

      Map<Boolean,List<Employee>>  ans=employees.stream().collect(Collectors.partitioningBy(employee -> employee.getSalary()>avg));


        ans.forEach((aBoolean, employees1) -> System.out.println("Flag: "+aBoolean +"  emp: "+employees1));
    }


    public static void main(String[] args) {
        partitionSalary();
    }
}
