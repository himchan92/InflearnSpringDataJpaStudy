package chapter05;

public class SumMain {

    public static void main(String[] args) {
        int sum = 0; //사용 전 초기화 필수
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
