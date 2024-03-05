//Задача. отсортировать объекты по их возрасту. необходимо создать Comparator

package task_3_z2;

public class Person {
    private String name; // создаем два поля name и age
    private int age;
    
    public Person(String name, int age) { //создаем конструктор
    this.name = name;
    this.age = age;
    }
    
    public String getName() {
    return name;
    }
    
    public int getAge() {
    return age;
    }
    
    @Override
    public String toString() { //выводим всю информацию на экран
    return "Person{" +
    "name='" + name + '\'' +
    ", age=" + age +
    '}';
    }
    }
