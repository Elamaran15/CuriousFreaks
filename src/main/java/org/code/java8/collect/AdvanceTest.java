package org.code.java8.collect;

import org.code.java8.reduce.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvanceTest {

    //Map<Department, Max Salary Employee Name>
    static void mapSalMax(){
        Map<String, String> deptMaxSalaryEmp = Employee.getEmployees().stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,                               // Group by department
                        Collectors.collectingAndThen(                          // Post-process the result of collector
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), // Find max salary
                                e -> e.map(Employee::getName).orElse("")           // Extract name from Optional
                        )
                ));
        System.out.println(deptMaxSalaryEmp);
    }

    //1. Map<Department, Min Salary Employee Name>
    static void minSal(){
      Map<String,String> ans= Employee.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))
                        ,emp->emp.map(Employee::getName).orElse(""))));

        System.out.println(ans);
    }

    //Map<Department, List of Employee Names Sorted by Salary>
    static void sortBySal(){
       Map<String, List<Employee>> ans=Employee.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                emp->emp.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList())));

        System.out.println(ans);
    }

    public static void main(String[] args) {
        sortBySal();
    }


}
