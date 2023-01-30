package homework3;

//Задание 1: пусть дан произвольный список целых чисел.
// Удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++) {
            int someNum = random.nextInt(-1000, 1000);
            arrayList.add(someNum);
        }

        int i = 0;
        while (i < arrayList.size()) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf(String.valueOf(arrayList));
    }
}