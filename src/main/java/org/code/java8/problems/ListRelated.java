package org.code.java8.problems;

import org.code.java8.reduce.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListRelated {

    //Find the duplicate elements in a list using streams.
    static void findDuplicate(){
        List<String> list = List.of("name","list","name","king","queen","king","zero","limit","girl");
        List<String> ans=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(key->key.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(ans);

    }


    //Find the unique elements in a list using streams.
    static void findUnique(){
        List<String> list = List.of("name","list","name","king","queen","king","zero","limit","girl");
         List<String> ans= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                  .entrySet().stream()
                  .filter(entry-> entry.getValue()<2).map(Map.Entry::getKey).toList();

         ans.forEach(System.out::println);
    }


    //Find the maximum and minimum number in a list using streams.
    static void findMinAndMax(){
        List<Integer> numbers=List.of(2,3,4,56,1,0,22,33,44,111,55,67,89,533,6,7,8,10);
        int min=numbers.stream().mapToInt(Integer::intValue).min().orElse(0);
        int max=numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);

        int maxUsingComparator=numbers.stream().max(Comparator.naturalOrder()).orElse(0);
        int minUsingComparator=numbers.stream().min(Comparator.naturalOrder()).orElse(0);


        System.out.println("maxUsingComparator: "+maxUsingComparator);
        System.out.println("minUsingComparator: "+minUsingComparator);
    }


    //Find the second highest and second lowest number in a list.
    static void findSecondHighAndLow(){
        List<Integer> numbers=List.of(2,3,4,56,1,0,22,33,44,111,55,67,89,533,6,7,8,10);
      int secondLow =  numbers.stream().sorted().skip(1).findFirst().orElse(0);
      int secondHigh = numbers.stream()
              .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

        System.out.println("Second Low: "+secondLow);
        System.out.println("Second High: "+secondHigh);

    }

    //Find the Nth highest salary from a list of employees using streams.
    static void findNthHighSalary(int n){
       List<Employee> employees=Employee.getEmployees();
        employees.forEach(System.out::println);
        double sal=employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(n-1).mapToDouble(Employee::getSalary).findFirst().orElse(0d);

        System.out.println(sal);

    }



    //Partition a list of numbers into even and odd using streams.
    static void partitionUsingStream(){

        Map<Boolean,List<Integer>>ans=IntStream.range(1,50).boxed()
                .collect(Collectors.partitioningBy(i->i%2==0));

        ans.forEach((aBoolean, integers) -> System.out.println(aBoolean+"  "+integers));
    }

    //Find all elements starting with a given prefix (like "A") from a list.
    static void findA(){
        List<String> list = List.of("name","Alist","name","king","Aqueen","king","Azero","Alimit","girl");
        list.stream().filter(l->l.startsWith("A")).toList().forEach(System.out::println);
    }


    //Sum of all even numbers in a list using streams.
    static void sumOfAllNum(){
      long ans=  IntStream.range(1,50).summaryStatistics().getSum();
        System.out.println(ans);
    }


    //Flatten a List<List<T>> (nested lists) and remove duplicates, then sort.
    static void flattenList(){
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(5, 3, 1, 2),
                Arrays.asList(2, 4, 6, 1),
                Arrays.asList(7, 8, 5, 9, 10)
        );

        List<Integer> ans=numbers.stream()
                .flatMap(list->list.stream()).distinct().sorted().toList();
        ans.forEach(System.out::println);

    }

    //Given a list of optional values (List<Optional<T>>), extract all present values and collect.
    static void extractAll(){
        List<Optional<Integer>> numbers = Arrays.asList(
                Optional.of(10),
                Optional.empty(),
                Optional.of(25),
                Optional.of(10),
                Optional.empty(),
                Optional.of(50)
        );

      List<Integer> ans=  numbers.stream()
              .filter(Optional::isPresent)
              .map(Optional::get).toList();

      ans.forEach(System.out::println);
    }


    //Check if any/all/none elements in a list satisfy
    // a compound condition (e.g. multiple predicates combined) using allMatch / noneMatch.

    //We can test compound conditions like:
    //
    //Number is greater than 10 AND even
    //
    //Number is divisible by 5
    //
    //Number is less than 50
    static void testCompound(){
       List<Employee> employees=Employee.getEmployees();

       //All employees in IT have salary > 50,000
        boolean allEmpAns=employees.stream().anyMatch(emp->emp.getSalary()>50000);

        //// Any HR employee with salary < 35,000
        boolean ansHR=employees.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("HR"))
                .anyMatch(emp->emp.getSalary()<35000);

        // No employee with salary < 25,000
        boolean noneBelow25k = employees.stream()
                .noneMatch(e -> e.getSalary() < 25000);


    }


    public static void main(String[] args) {
        extractAll();
    }
}
