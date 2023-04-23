import java.util.ArrayList;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него четные числа


public class Task_1 {
    public static void main(String[] args) {
        List<Integer> list = createList(10, 1, 10);
        System.out.println(list);
        removeAll(list);
        System.out.println(list);
    }

    static void removeAll(List<Integer> list) {
        list.removeIf(item -> (item % 2 == 0));
    }

    static List<Integer> createList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int)(Math.random() * (max-min+1) + min));
        }
        return result;
    }
}
