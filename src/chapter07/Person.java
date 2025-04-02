package chapter07;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person("김길벗", 21);
        p.displayInfo();
        p.setName("이코천");
        p.setAge(22);
        System.out.println("수정한 이름: " + p.getName());
        System.out.println("수정한 나이: " + p.getAge());
    }
}
