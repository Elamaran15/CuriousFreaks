package org.code.java8.reduce;

import java.util.List;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String department;
    double salary;
    List<String> skills;

    public Employee(int id, String name, String department, double salary, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.skills = skills;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public List<String> getSkills() { return skills; }


    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(1, "Elamaran", "IT", 75000, List.of("Java", "Spring", "Docker")),
                new Employee(2, "Arun", "HR", 50000, List.of("Recruitment", "Communication")),
                new Employee(3, "JayKumar", "IT", 90000, List.of("Java", "AWS", "Kubernetes")),
                new Employee(4, "Vijay", "Finance", 60000, List.of("Excel", "Finance", "Python")),
                new Employee(5, "Ravi", "IT", 85000, List.of("Python", "Docker", "Kubernetes")),
                new Employee(6, "Jayam", "HR", 15000, List.of("Recruitment", "Docker", "Communication"))

        );
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", skills=" + skills +
                '}';
    }


    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.getSalary(),other.getSalary());
    }
}
