package org.code.java8.collect;

import org.code.java8.reduce.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class TestMain {

    //Collect All Names into a List
    static void countNames(){
        List<String> names=Employee.getEmployees()
                .stream()
                .map(Employee::getName)
                .toList();

        System.out.println(names);
    }

    //Collect All Unique Skills (flatMap + Set)
    static void uniqueSkill(){
        Set<String> ans = Employee.getEmployees().stream()
                .flatMap(skillList-> skillList.getSkills().stream())
                .collect(Collectors.toSet());

        System.out.println(ans);
    }

    //Join All Names into a Single String
    static void joinNames(){
        String names=Employee.getEmployees().stream().
                map(Employee::getName)
                .collect(Collectors.joining(","));
        System.out.println(names);
    }

    //// 3. Collect skills starting with "J" into List
    static void start(){
        String ans=Employee.getEmployees().stream()
                .map(Employee::getSkills)
                .flatMap(Collection::stream)
                .filter(a-> a.startsWith("J"))
                .collect(Collectors.joining());
        System.out.println(ans);
    }

    // 4. Collect departments into TreeSet
    static void treeSet(){
      Set<String> ans=  Employee.getEmployees().stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(ans);
    }
    // 5. Collect name-length map
    static void collectName(){
       Map<String,Integer> ans= Employee.getEmployees().stream()
                .collect(toMap(Employee::getName,a-> a.getName().length()));

        System.out.println(ans);
    }

    //// 6. Collect salary map (ID → Salary)
    static void collectSal(){
        Map<Integer,Double> ans =  Employee.getEmployees().stream()
                .collect(Collectors.toMap(Employee::getId,Employee::getSalary));

        System.out.println(ans);
    }

    //// 7. Employees as Map → Dept → Names concatenated
    static void concatDept(){
     Map<String,String> ans=   Employee.getEmployees().stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors.mapping(Employee::getName,
                                        Collectors.joining(", "))));

        System.out.println(ans);
    }

    //Collect salaries per department.
    static void collectSalDept(){
       Map<String,List<Double>> ans= Employee.getEmployees().stream().
                collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary,Collectors.toList())));

        System.out.println(ans);
    }

    //Map<Department, Count of Employees>
    static void countDeptEmp(){
     Map<String,Long> ans=   Employee.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));

        System.out.println(ans);
    }

    //Map<Department, Average Salary>
    static void avgSalary(){
     Map<String,Double>  ans=  Employee.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(ans);
    }

    // Map<Department, All Skills (comma-separated)>
    static void deptSkill(){
    Map<String,String> ans=   Employee.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                       Collectors.flatMapping(list->list.getSkills().stream(),
                               Collectors.joining(", "))));

        System.out.println(ans);
    }





    public static void main(String[] args) {
    }
}
