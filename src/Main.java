public class Main {
    public static void main(String[] args) {
        // Создание экземпляра GenericArrayList для Integer
        GenericArrayList<Integer> integerList = new GenericArrayList<>();

        // Добавление элементов в список
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        // Получение и вывод размера списка
        System.out.println("Размер: " + integerList.size());

        // Получение и вывод элементов списка
        System.out.println("Элементы:");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }

        // Создание экземпляра GenericArrayList для String
        GenericArrayList<String> stringList = new GenericArrayList<>();

        // Добавление элементов в список
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");

        // Получение и вывод размера списка
        System.out.println("\nРазмер: " + stringList.size());

        // Получение и вывод элементов списка
        System.out.println("Элементы:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
