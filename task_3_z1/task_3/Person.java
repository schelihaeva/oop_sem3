package task_3;

public class Person implements Comparable<Person> { //класс Person представляет человека с двумя атрибутами
    private String name; //атрибут имя, поле -имя
    private int age;  //атрибут возраст, поле-возраст
    
    public Person(String name, int age) { //создаем конструктор, задав имя и возраст
    this.name = name; //создаем список людей из имен
    this.age = age; //создаем список людей по возрасту
    }
    
    // Геттеры и сеттеры
    
    @Override //реализуем метод, переопределяем
    public int compareTo(Person otherPerson) { //принимаем человека Person 
    return Integer.compare(this.age, otherPerson.age); //возвращаем возраст того человека,которому соответсвует имя Person, сравниваем с другим человеком возраст больше то это, если меньше, то -1, если равно, то 0
    }
    
    @Override
    public String toString() {  //выводим всю информацию на экран
    return "Person{" +
    "name='" + name + '\'' +
    ", age=" + age +
    '}';
    }
    }
