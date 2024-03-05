package task_3_z3;

import java.util.Iterator;

public class MyList implements Iterable<Integer> {
private int[] elements; //создаем массив

public MyList(int[] elements) { //  в конструкторе создаем массив
this.elements = elements;
}

@Override
public Iterator<Integer> iterator() { //возвращает Integer который используется для перебора элементов в списке
return new MyListIterator();
}

private class MyListIterator implements Iterator<Integer> { //внутренний класс реализует интерфейс Iterator 
private int currentIndex = 0;

@Override
public boolean hasNext() { // метод hasNet который проверяет есть ли элемент и 
return currentIndex < elements.length;
}

@Override
public Integer next() { // метод next возвращает элемент
return elements[currentIndex++];
}
}
}