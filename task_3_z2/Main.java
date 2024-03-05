//compare() используется для сравнения объектов между собой
//Comparator  позволяет создавать правила сравнения для объектов, которые не реализует интерфейс Comperable

package task_3_z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
public static void main(String[] args) {
// Создаем список людей
List<Person> people = new ArrayList<>();

// Добавляем людей в список
people.add(new Person("Alice", 25));
people.add(new Person("Bob", 30));
people.add(new Person("Charlie", 20));

// Выводим список до сортировки
System.out.println("Список людей до сортировки:");
for (Person person : people) {
System.out.println(person);
}

// Сортируем список с использованием компаратора
Collections.sort(people, new AgeComparator()); //сортируем по возрасту, указываем объект по которму будем сортировать AgeComparator

// Выводим отсортированный список
System.out.println("\nСписок людей после сортировки по возрасту:");
for (Person person : people) {
System.out.println(person);
}
}
}
