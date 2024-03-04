import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import task_3.Person;

public class Main {
public static void main(String[] args) {
// Создаем список людей
List<Person> people = new ArrayList<>(); // создаем список людей,который можем увеличивать

// Добавляем людей в список
people.add(new Person("Alice", 25));
people.add(new Person("Bob", 30));
people.add(new Person("Charlie", 20));

// Выводим список до сортировки
System.out.println("Список людей до сортировки:");
for (Person person : people) { //перебираем список людей, заданных в методе Person
System.out.println(person);
}

// Сортируем список
Collections.sort(people);

// Выводим отсортированный список
System.out.println("\nСписок людей после сортировки по возрасту:");
for (Person person : people) {
System.out.println(person);
}
}
}