import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

// public class Task_2 {
//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<>();
//         int[] m = { 1, 4, 2, 8, 9, 6, 11 };
//         for (int i : m)
//             list.add(i);
//         System.out.println(list);
//         System.out.println("Максимальный элемент: " + Collections.max(list));
//         System.out.println("Минимальный элемент: " + Collections.min(list));
//         System.out.println("Среднее арифметическое: " + ave_list(list));
//     }
    
//     static <T extends  Number> double ave_list(List<T> list)
//     {
//         double sum = 0.;
//         for (T i : list) 
//             sum += + i.doubleValue();
//         return sum / list.size();
//     }
// }


public class Task_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++){
            list.add(rand.nextInt(100)); 
        }
        System.out.println(list);
        int sum = 0;
        for (Integer item : list) {
            sum += item;
        }
        System.out.println("Минимальное число: " + Collections.min(list));
        System.out.println("Максимальное число: " + Collections.max(list));
        System.out.println("Среднее арифметическое: " + (double) sum/list.size());
        
    }
}