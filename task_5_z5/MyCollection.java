package task_5_z5;

public class MyCollection {
    private Integer[] elements;
    
    public MyCollection(Integer[] elements) {
    this.elements = elements;
    }
    
    // Метод для получения элемента по индексу
    public Integer getElement(int index) {
    if (index < 0 || index >= elements.length) {
    throw new IndexOutOfBoundsException("Index out of bounds");
    }
    return elements[index];
    }
    
    // Метод для получения размера коллекции
    public int size() {
    return elements.length;
    }
    
    // Метод для перебора элементов
    public void iterateElements() {
    for (int i = 0; i < elements.length; i++) {
    System.out.println(elements[i]);
    }
    }
    
    public static void main(String[] args) {
    Integer[] data = {1, 2, 3, 4, 5};
    MyCollection collection = new MyCollection(data);
    
    // Перебор элементов коллекции
    collection.iterateElements();
    }
    }