package chapter05;

import java.util.Scanner;

public class Gugudan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇단을 출력할까요? ");
        int dan = sc.nextInt();

        int value = 0;
        int num = 1;
        while(num <= 9) {
            value = dan * num;
            System.out.println(dan + " x " + num + " = " + (value));
            num++;
        }

        sc.close();
    }
}
