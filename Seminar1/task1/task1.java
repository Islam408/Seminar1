// Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i

package Seminar1.task1;

import java.util.Random;

/**
 * dz_1_1
 */
public class task1 {

    public static void main(String[] args) {
        int i = new Random().nextInt(-1000, 1000);
        System.out.println(i);
    }
}