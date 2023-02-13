import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    // Реализовать хранение фруктов в коробке.
    // Должны быть доступны следующие возможности
    // Добавление фрукта
    // Должен быть конструктор
    // Метод, который пересыпает фрукты из текущей коробки в другую коробку
    // Для внутреннего хранения можно использовать например List

    private final List<T> list;

    public Box() {
        list = new ArrayList<>();

    }

    public void add(T fruit) {
        list.add(fruit);

    }

    public double getSumWeight() {
        double sum = 0;
        for (T t : list) {
            sum += t.getWeight();
        }
        return sum;
    }

    public void moveTo(Box<? super T> anotherBox) {
        anotherBox.list.addAll(list);
        list.clear();
    }

    public String getTitle() {
        String str = "";
        for (T t : list) {
            str = t.getTitle();
            break;
        }
        if (list.size() == 0)
            return "Коробка пуста";
        else
            return str.toString();
    }
}