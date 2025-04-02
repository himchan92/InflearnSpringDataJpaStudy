package chapter05;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        int num1 = 5;
        int num2 = 5;

        int result1 = num1++;
        int result2 = ++num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(num1);
        System.out.println(num2);
    }
}