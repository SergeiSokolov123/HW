import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        Array.add(arrayList, 2);
        Array.get(arrayList);
        Array.deleteIndex(arrayList, 0);
        Array.deleteAll(arrayList);
        Array.sort(arrayList);

        Map.add(hashMap, "Мурка", 1);
        Map.add(hashMap, "Тузик", 0);
        Map.get(hashMap);
        Map.deleteEl(hashMap, "Мурка");
        Map.deleteAll(hashMap);
        Map.add(hashMap, "Мурка", 1);
        Map.add(hashMap, "Тузик", 0);
        Map.sort(hashMap);

        Cats cats = new Cats("Пупс", 8);
        Cats cats1 = new Cats("Белый", 1);
       CatsSort.arrayList1.add(cats);
       CatsSort.arrayList1.add(cats1);
        CatsSort.sortCats();
    }

}
