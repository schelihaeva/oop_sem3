//Iterable представляет собой обьект,кторый содержит набор элементов и содержит в себе метод для перебора элементов
//Iterator перебирает элементв коллекциях
package task_3_z3;

public class Main {
    public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5}; //создаем массив
    MyList list = new MyList(numbers); //создаем объект помещаем в него число
    
    // Используем цикл for-each для перебора элементов списка
    for (int num : list) {  //перебираем числа из созданного массива
    System.out.println(num); //записываем нужное число
    }
    }
    }
