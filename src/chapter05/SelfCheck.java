package chapter05;

import java.util.Scanner;

public class SelfCheck {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("현재 투입된 금액: " + sum + "원");
            System.out.println("1. 콜라(1,500원)");
            System.out.println("2. 오렌지주스(2,000원)");
            System.out.println("3. 생수(1,000원)");
            System.out.println("4. 종료");

            int select = sc.nextInt();

            if(select == 4) {
                sc.close();
                break;
            }

            if(select == 1) {
                if(sum > 1500) {
                    sum -= 1500;
                } else {
                    System.out.println("돈을 더 투입하세요");
                    sum += 1500;
                }
            } else if(select == 2) {
                if(sum > 2000) {
                    sum -= 2000;
                } else {
                    System.out.println("돈을 더 투입하세요");
                    sum += 2000;
                }
            } if(select == 3) {
                if(sum > 1000) {
                    sum -= 1000;
                } else {
                    System.out.println("돈을 더 투입하세요");
                    sum += 1000;
                }
            }
        }
    }
}
