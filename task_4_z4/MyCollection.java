package task_4_z4;

import java.util.Iterator;

public class MyCollection implements Iterable<Integer> {
private Integer[] elements;

public MyCollection(Integer[] elements) {
this.elements = elements;
}

@Override
public Iterator<Integer> iterator() {
return new Iterator<Integer>() {
private int currentIndex = 0;

@Override
public boolean hasNext() {
return currentIndex < elements.length;
}

@Override
public Integer next() {
return elements[currentIndex++];
}
};
}

public static void main(String[] args) {
Integer[] data = {1, 2, 3, 4, 5};
MyCollection collection = new MyCollection(data);

// Использование итератора
Iterator<Integer> iterator = collection.iterator();
while (iterator.hasNext()) {
System.out.println(iterator.next());
}
}
}