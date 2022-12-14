public class Cats implements Comparable<Cats> {
    /**
     * Поле имя
     */
    private String name;
    /**
     * Поле возраст
     */
    private int age;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     *
     * @param name - имя
     * @param age  - возраст
     */
    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Метод compareTo сравнение по возрасту
     *
     */
    @Override
    public int compareTo(Cats cats) {
        return this.age - cats.age;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
