// Напишите функцию, которая рекурсивно вычисляет сумму цифр целого числа. Пример 1432 ->10

package hw_11;

public class Ex_4 {
    public static void main(String[] args) {

        System.out.println(sumOfCharacter(1432));
    }

    public static int sumOfCharacter(int a){
        if (a <= 10)
            return a;
        return (a % 10 + sumOfCharacter(a/10));
    }
}
