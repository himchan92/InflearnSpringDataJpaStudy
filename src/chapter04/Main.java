package chapter04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int score = 60;

        //조건 만족 시 수행
        if(score >= 60) {
            System.out.println("합격입니다.");
        } else { //조건 아니면 수행
            System.out.println("불합격입니다.");
        }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        sc.close();
    }
}