import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GenericArrayListTest {

    // Тест для проверки добавления элементов и получения их по индексу
    @Test
    void testAddAndGet() {
        // Создаем экземпляр GenericArrayList для Integer
        GenericArrayList<Integer> list = new GenericArrayList<>();
        // Добавляем элементы
        list.add(1);
        list.add(2);
        list.add(3);

        // Проверяем размер списка и значения элементов по индексу
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    // Тест для проверки получения размера списка
    @Test
    void testSize() {
        // Создаем экземпляр GenericArrayList для String
        GenericArrayList<String> list = new GenericArrayList<>();
        // Проверяем размер пустого списка
        assertEquals(0, list.size());

        // Добавляем элементы и проверяем размер списка после каждого добавления
        list.add("apple");
        assertEquals(1, list.size());

        list.add("banana");
        assertEquals(2, list.size());
    }

    // Тест для проверки исключения при попытке доступа к элементу по недопустимому индексу
    @Test
    void testOutOfBounds() {
        // Создаем экземпляр GenericArrayList для Character
        GenericArrayList<Character> list = new GenericArrayList<>();
        // Добавляем один элемент
        list.add('a');
        // Проверяем, что исключение IndexOutOfBoundsException выбрасывается при попытке доступа к элементу с недопустимым индексом
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(1);
        });
    }
}
