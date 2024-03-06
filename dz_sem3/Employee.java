// Создайте класс Employee с полями name, age и salary.Реализуйте интерфейс Comparable<Employee> для сравнения сотрудников по их возрасту.

package dz_sem3;
public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) { //создаем три поля
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) { //сравнение сотрудников по возрасту
        return Integer.compare(this.age, other.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + '}';
    }
}