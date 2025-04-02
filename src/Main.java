import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // \n : 개행문자
        System.out.print("Hello\n");
        System.out.print("Java\n");

        //println : 자동줄바꿈
        System.out.println("Hello");
        System.out.println("Java");

        //입력기능, Util 제공
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine()); //엔터 기준 누르기전까지 입력받음
        System.out.println(scanner.nextLine()); //공백 기준 공백나오기전까지 입력받음
        System.out.println(scanner.nextInt()); //숫자받기

        scanner.close(); //안닫으면 계속 사용상태로 메모리 낭비
    }
}