/* Напишите функцию, которая найдет общие элементы у двух массивов
 и вернет их в виде массива. Пример: [1,2,3,8], [2,4,6,8,12]->[2,8]
 */
package hw_11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex_3 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 8};
        int[] b = new int[]{2, 4, 6, 8, 12};

        System.out.println(Arrays.toString(generalArray(a, b)));
    }

    public static int[] generalArray(int[] a, int[] b) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    counter++;
                }
            }
        }

        int[] c = new int[counter];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[counter - 1] = a[i];
                    counter--;
                }
            }
        }
        Arrays.sort(c);
        return c;
    }
}
