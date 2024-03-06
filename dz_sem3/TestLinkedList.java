package dz_sem3;

import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        System.out.println("Linked List elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        Employee[] employees = {
                new Employee("Лариса", 25, 38800),
                new Employee("Глеб", 30, 78300),
                new Employee("Вадим", 28, 45800)
        };

        System.out.println("\nUnsorted Employees:");
        Arrays.stream(employees).forEach(System.out::println);

        Arrays.sort(employees);
        System.out.println("\nSorted Employees (by age):");
        Arrays.stream(employees).forEach(System.out::println);

        Arrays.sort(employees, new Main());
        System.out.println("\nSorted Employees (by salary):");
        Arrays.stream(employees).forEach(System.out::println);
    }
}
