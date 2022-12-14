import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Реализовать свой ArrayList (не потокобезопасный)/HashMap. Методы -
 * добавить элемент, получить элемент, удалить элемент, очистить всю
 * коллекцию, отсортировать (для мапы отсортировать по ключу - выдать
 * отсортированный массив ключей на выходе), остальное по желанию
 */


public class Map {
    /**
     * @param hashMap = хешмапа
     * @param key     = ключ для мапэ
     * @param value   = значение для мапэ
     * Метод add добавляет в мапу элемент ключ + значение
     * @return возвращает мапу hashMap
     */
    public static HashMap<String, Integer> add(HashMap<String, Integer> hashMap, String key, int value) {
        hashMap.put(key, value);
        System.out.println("Добавляем элемент " + hashMap.entrySet());
        return hashMap;
    }

    /**
     * Метод get
     *
     * @return возвращает мапу hashMap
     */
    public static HashMap<String, Integer> get(HashMap<String, Integer> hashMap) {
        System.out.println("Возвращаем " + hashMap.entrySet());
        return hashMap;
    }

    /**
     * Метод deleteEl удаляет элемент с ключом key
     *
     * @return возвращает мапу hashMap
     */
    public static HashMap<String, Integer> deleteEl(HashMap<String, Integer> hashMap, String key) {
        hashMap.remove(key);
        System.out.println("Удаляем элемент по ключу " + "ключ = " + key + " " + hashMap.entrySet());
        return hashMap;
    }

    /**
     * Метод deleteAll удаляет все элементы
     *
     * @return возвращает мапу hashMap
     */
    public static HashMap<String, Integer> deleteAll(HashMap<String, Integer> hashMap) {
        hashMap.clear();
        System.out.println("Очищаем коллекцию " + hashMap.entrySet());
        return hashMap;
    }

    /**
     * Метод sort передает ключ в аррейЛист и сортирует по ключи по алфавиту
     *
     * @return возвращает массив sortedKeys
     */
    public static ArrayList<String> sort(HashMap<String, Integer> hashMap) {
        System.out.println("Без сортировки " + hashMap.keySet());
        ArrayList<String> sortedKeys = new ArrayList<>(hashMap.keySet());
        Collections.sort(sortedKeys);
        System.out.println("Сортировка " + sortedKeys);
        return sortedKeys;

    }
}
