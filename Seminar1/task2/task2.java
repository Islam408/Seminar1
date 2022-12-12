// Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
package Seminar1.task2;
import java.util.Random;
public class task2 {
    public static int hihg_bit_line(int n){
        int res = 0;
        while (n != 1){
            n >>= 1;
            res++;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int i = new Random().nextInt(-100, 100);
        System.out.println(i);
        System.out.println(hihg_bit_line(i));       
    }
}
