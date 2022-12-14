import java.util.ArrayList;
/**
 * Класс CatsSort создает массив из Cats и методом sortCats сортирует котов по возрасту с помощью quicksort и
 * Comparable
 */

public class CatsSort {
    static ArrayList<Cats> arrayList1 = new ArrayList();
    /**
     * Метод sortCats сортирует котов по возрасту
     */
    public static void sortCats() {
        System.out.println("До сортировки по возрасту " + arrayList1.toString());
        arrayList1.sort(Cats::compareTo);
        System.out.println("После сортировки по возрасту " + arrayList1.toString());
    }


}
