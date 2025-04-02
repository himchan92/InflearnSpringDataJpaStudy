package chapter04;

import java.util.Scanner;

public class SelfCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();

        switch(alphabet) {
            case "a" :
                System.out.println("A");
                break;
            case "b" :
                System.out.println("B");
                break;
            case "c" :
                System.out.println("C");
                break;
            default :
                System.out.println("일치하는 알파벳이 없습니다.");
                break;
        }

        sc.close();
    }
}
