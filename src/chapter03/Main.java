package chapter03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 변수 초기화 필수
        int a; //에러
        int b = 10;

        a = 20; //초기화는 별도 혹은 동시에 가능(int a = 20)
        System.out.println(a);
        System.out.println(b);

        // printf 줄바꿈이 없어 \n필요
        System.out.printf("이름 : %s\n", "코천이");
        System.out.printf("나이 : %d\n", 21);
        System.out.printf("취미 : %s", "코딩");

        //변하지 않는 상수 값은 final 붙이며 변수명은 대문자 관례
        final int START_YEAR = 2025;

        System.out.println(100 + 3);
        System.out.println(100 - 3);
        System.out.println(100 * 3);
        System.out.println(100 / 3);

        //문자열과 연산은 결합
        System.out.println("100" + 3);

        int age = 34;
        System.out.println("올해 나이는 " + age + " 입니다.");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double num2 = sc.nextDouble();

        System.out.println("덧셈 결과 : " + (int)(num + num2));
        System.out.println("뺄셈 결과 : " + (num - num2));
        System.out.println("곱셈 결과 : " + (num * num2));
        System.out.println("나눗셈 결과 : " + (int)(num / num2));

        sc.close();

    }
}