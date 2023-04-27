package org.example;
import java.util.Scanner;


public class task1 {
    /**
     * @param one Первое дробное число
     * @param two Второе дробное число
     * @return сумма one и two
     */
    public static double add(double one, double two) {
        return one + two;
    }

    /**
     * @param one Первое дробное число
     * @param two Второе дробное число
     * @return разность one и two
     */
    public static double subtract(double one, double two) {
        return one - two;
    }

    /**
     * @param one Первое дробное число
     * @param two Второе дробное число
     * @return разность one и two
     */
    public static double multiply(double one, double two) {
        return one * two;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: "); //Запросить у пользователя первое число
        double one = sc.nextDouble();
        System.out.print("Введите второе число: "); //Запросить у пользователя второе число
        double two = sc.nextDouble();


        System.out.print("Введите действие выполняемое с числами: ");//Запросить у пользователя операцию
        char sim = sc.next().charAt(0);

        double result = 0;
        if (sim == '+') {
            result = add(one, two);
            System.out.printf("Резульат операции: %.4f", result);
        } else if (sim == '-') {
            result = subtract(one, two);
            System.out.printf("Результат операции: %.4f", result);
        } else if (sim == '*') {
            result = multiply(one, two);
            System.out.printf("Результат операции: %.4f", result);
        } else if (sim == '/') {
            if (two == 0) {
                System.out.println("Математическая логика сломалась");
            } else {
                System.out.printf("Результат операции: " + "%.4f", one / two);
            }
        }

    }
}
