import java.util.Arrays;

public class GenericArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements; // Массив для хранения элементов
    private int size; // Размер списка (количество элементов)

    // Конструктор, инициализирующий массив с дефолтной емкостью и размером 0
    public GenericArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Метод для добавления элемента в список
    public void add(E element) {
        // Если размер списка равен емкости массива, увеличиваем емкость
        if (size == elements.length) {
            increaseCapacity();
        }
        // Добавляем элемент в массив и увеличиваем размер списка
        elements[size++] = element;
    }

    // Метод для получения элемента списка по индексу
    public E get(int index) {
        // Проверяем, что индекс находится в пределах размера списка
        if (index < 0 || index >= size) {
            // Если индекс за пределами списка, выбрасываем исключение
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
        // Возвращаем элемент списка, приведенный к типу E
        return (E) elements[index];
    }

    // Метод для получения размера списка
    public int size() {
        return size;
    }

    // Приватный метод для увеличения емкости списка
    private void increaseCapacity() {
        int newCapacity = elements.length * 2; // Удваиваем текущую емкость
        // Создаем новый массив с увеличенной емкостью и копируем в него все элементы текущего массива
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
