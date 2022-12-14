import java.util.ArrayList;
import java.util.Collections;

/**
 * @autor Соколов Сергей
 * Реализовать свой ArrayList (не потокобезопасный)/HashMap. Методы -
 * добавить элемент, получить элемент, удалить элемент, очистить всю
 * коллекцию, отсортировать (для мапы отсортировать по ключу - выдать
 * отсортированный массив ключей на выходе), остальное по желанию
 */
public class Array {
    /**
     * @param arrayList = эрейЛист
     * @param n = добавляем элемент n в массив
     * Метод add добавляет 2 раза элемент n в массив arrayList
     * @return возвращает массив arrayList
     */
    public static ArrayList<Integer> add(ArrayList<Integer> arrayList, Integer n) {
        arrayList.add(n);
        arrayList.add(n);
        System.out.println("Добавили 2 элемента " + arrayList);
        return arrayList;
    }

    /**
     * Метод get
     *
     * @return возвращает массив arrayList
     */
    public static ArrayList<Integer> get(ArrayList<Integer> arrayList) {
        System.out.println("Вернули массив " + arrayList);
        return arrayList;
    }

    /**
     * Метод deleteIndex удаляет элемент с индексом index
     *
     * @return возвращает массив arrayList
     */
    public static ArrayList<Integer> deleteIndex(ArrayList<Integer> arrayList, int index) {
        arrayList.remove(index);
        System.out.println("Удалили массив с индексом " + index + " " + arrayList);
        return arrayList;
    }

    /**
     * Метод deleteAll удаляет все элементы
     *
     * @return возвращает массив arrayList
     */
    public static ArrayList<Integer> deleteAll(ArrayList<Integer> arrayList) {
        arrayList.clear();
        System.out.println("Очистили массив " + arrayList);
        return arrayList;
    }

    /**
     * Метод sort добавляет 10 рандомных элементов, сортирует по возрастанию
     *
     * @return возвращает массив arrayList
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        System.out.println("Добавили в массив 10 рандомных чисел " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Сортировка по возрастанию " + arrayList);
        return arrayList;
    }
}
