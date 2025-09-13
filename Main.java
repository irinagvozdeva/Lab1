package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Объявляем объект класса Scanner для ввода данных
        Scanner in = new Scanner(System.in);
        // Считывание пяти целых чисел из консоли
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        // Создание переменной-счетчика
        int k = 0;
        // Проверка, проходит ли шарик отверстия. Если не проходит - вывод ответа,
        // если проходит - увелечение k на один и переход к следующему отверстию.
        if (X>=A) {
            System.out.println(k);
        }
        else {
            k++;
            if (X>=B){
                System.out.println(k);}
            else {
                k++;
                if (X>=C){
                    System.out.println(k);}
                else {
                    k++;
                    if (X>=D){
                        System.out.println(k);}
                    else{
                        k++;
                        System.out.println(k);
                    }
                }
            }
        }
    }
}
