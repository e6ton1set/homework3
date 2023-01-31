package homework3;

// Задание 2: задан целочисленный список ArrayList.
// Найти минимальное,максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int someNum = random.nextInt(-1000, 1001);
            arrayList.add(someNum);
            System.out.printf(arrayList.toString());
        }

        int maxNum = arrayList.get(0);
        int minNum = arrayList.get(0);
        int sumIndex = 0;
        for (int item : arrayList) {
            if (item > maxNum) {
                maxNum = item;
            }
            if (item < minNum) {
                minNum = item;
            }
            sumIndex += item;
        }
        float average = (float) sumIndex / arrayList.size();

        System.out.printf("\nМаксимальный элемент %s\n", maxNum);
        System.out.printf("Минимальный элемент %s\n", minNum);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}
