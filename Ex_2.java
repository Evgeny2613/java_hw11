// Напишите функцию, рекурсивно вычисляющую наибольший общий делитель двух целых с помощью алгоритма Евклида

package hw_11;

public class Ex_2 {
    public static void main(String[] args) {

        System.out.println(greatestCommonDivisor(14, 21));
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (b == a)
            return a;
        else if (a < b)
           return greatestCommonDivisor(a, b-a);
        return greatestCommonDivisor(a-b, b);
    }
}
