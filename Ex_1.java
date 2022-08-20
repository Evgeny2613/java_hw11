/*     Напишите функцию, которая проверит, содержатся ли в массиве все элементы из другого массива меньшего размера.
Пример [1,2,3,4], [2,3] -> true
 */

package hw_11;

public class Ex_1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{2,3};

        System.out.println(check(array1, array2));
    }

    public static boolean check(int[] array1, int[] array2) {
        int elementsToCheck = array2.length;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j])
                    elementsToCheck--;
            }
        }
        return elementsToCheck == 0 ? true : false;
    }
}
