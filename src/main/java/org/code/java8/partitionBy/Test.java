package org.code.java8.partitionBy;





import org.code.java8.reduce.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {


    //1. Partition employees by salary ≥ 80000
    static void salary(){
       Map<Boolean, List<Employee>> ans=Employee.getEmployees().stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() >=80000));

        System.out.println(ans);
    }

    //2. Partition employees based on whether they belong to "IT" department
    static void dept(){
    Map<Boolean,List<Employee>>  ans=   Employee.getEmployees()
                .stream()
                .collect(Collectors.partitioningBy(employee -> employee.getDepartment().contains("IT")));

        System.out.println(ans);
    }

    //**4. Partition employees into:
    //those who know both "Docker" and "Kubernetes"
    static void both(){
      Map<Boolean,List<Employee>> ans=  Employee.getEmployees()
                .stream()
                .collect(Collectors.partitioningBy(
                        employee -> employee.getSkills().containsAll(List.of("Docker","Kubernetes"))));

      System.out.println(ans);
    }

    //6. Max salary employee in each partition (based on "IT" department)
    static void sal(){
        Map<Boolean, Optional<Employee>> ans=  Employee.getEmployees()
                .stream()
                .collect(Collectors.partitioningBy(
                        employee -> employee.getDepartment().contains("IT"),
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));


        System.out.println(ans);
    }

    //7. Average salary in each partition (knows Java or not)
    static void avg() {
        Map<Boolean, Double> avgSalaryByJava = Employee.getEmployees().stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSkills().contains("Java"),
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByJava);
    }

    public static void main(String[] args) {
        salary();
    }
}
