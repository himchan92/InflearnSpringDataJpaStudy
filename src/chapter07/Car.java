package chapter07;

public class Car {
    static int countOfCars = 0;

    String brand;
    int year;
    String color;

    //생성자 : 객체 생성될때마다 호출
    public Car(String brand, int year, String color) {
        System.out.println("새 차 인스턴스 생성");
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.carInfo();
    }

    public void carInfo() {
        System.out.println("자동차 정보");
        System.out.println("브랜드 : " + brand);
        System.out.println("연식: " + year);
        System.out.println("색: " + color);
    }

    public static void countOfCarsInfo() {
        System.out.println("자동차 수량: " + countOfCars);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 2025, "blue");
        car.countOfCarsInfo();
    }
}
