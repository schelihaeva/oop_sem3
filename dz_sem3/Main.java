//Итератор и итерируемость (Iterable):

// Создайте класс MyLinkedList, который будет представлять собой простую односвязную цепочку.
// Реализуйте интерфейс Iterable для этого класса. Это позволит перебирать элементы списка с помощью цикла for-each.
// Напишите методы добавления, удаления и получения элементов из списка в классе MyLinkedList.
// Создайте тестовый класс для проверки функциональности MyLinkedList, включая использование цикла for-each для перебора элементов списка.
// Компаратор и компарируемость (Comparator и Comparable):

// Создайте класс Employee с полями name, age и salary.
// Реализуйте интерфейс Comparable<Employee> для сравнения сотрудников по их возрасту.
// Создайте компаратор EmployeeSalaryComparator, который будет сравнивать сотрудников по их зарплате.
// Напишите тестовый класс для проверки сортировки массива сотрудников с использованием как Comparable, так и Comparator.

// в классе Main Создам компаратор EmployeeSalaryComparator, который будет сравнивать сотрудников по их зарплате.

package dz_sem3;

import java.util.Comparator;

public class Main implements Comparator<Employee> {
    @Override
    public int compare(Employee ex1, Employee ex2) {
        return Double.compare(ex1.getSalary(), ex2.getSalary());
    }
}