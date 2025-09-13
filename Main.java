package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int k = 0;

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
