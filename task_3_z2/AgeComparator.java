package task_3_z2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> { //cоздаем класс для сортировки объектов по возрасту
@Override
public int compare(Person person1, Person person2) { //на вход принимаем два объекта
return Integer.compare(person1.getAge(), person2.getAge()); //возвращает объект  с большим возрастом(1-больше, -1меньше,0-значение совпадает)
}
}