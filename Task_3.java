import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
//Вывести название каждой планеты и количество его повторений в списке.

import java.util.Collections;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        // Заполнение списка в произвольном порядке с повторениями
        String[] planets_m = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        List<String> planets_l = new ArrayList<>();
        Random rnd = new Random();
        for (int index = 0; index < (planets_m.length); index++) {
            planets_l.add(planets_m[rnd.nextInt(0, planets_m.length)]);
        }
        Collections.shuffle(planets_l);
        System.out.println(planets_l);

        // Подсчет элементов и вывод на экран
        int count = 0;
        for (int i = 0; i < planets_m.length; i++) {
            for (int j = 0; j < planets_l.size(); j++) {
                if (planets_m[i] == planets_l.get(j)){
                    count++;
                }
            }
            System.out.printf("%s : %d \n", planets_m[i], count);
            count = 0;
        }
    }
}

// public class Task_3 {
//        public static void main(String[] args) {
//            ArrayList<String> planets = new ArrayList<>(Arrays.asList("Меркурий", "Земля ", "Венера", "Нептун", "Юпитер",
//                    "Земля ", "Земля ", "Марс", "Венера", "Юпитер", "Сатурн", "Меркурий", "Земля ", "Венера",
//                    "Марс", "Нептун"));
//            int count = 1;
//            for (int i = 0; i < planets.size(); i++) {
//                count = 1;
//                for (int j = i+1; j < planets.size(); j++) {
//                    if (planets.get(i).equals(planets.get(j))) {
//                        planets.remove(j);
//                        j--;
//                        count ++;
//                    }
//                }
//                System.out.printf("Планета %s повторяется %d раз(а)", planets.get(i), count);
//                System.out.println();
//            }
//            System.out.println(planets);
//        }
//     }
