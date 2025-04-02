package chapter04;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        switch (score) {
            case (100) :
                System.out.println("A학점입니다.");
                break;
            case (90) :
                System.out.println("B학점입니다");
                break;
            default:
                System.out.println("재수강하세요.");
                break;
        }

        String result = (score >= 90) ? "A" : "B";
        System.out.println(result + " 점입니다.");

        sc.close();
    }
}
