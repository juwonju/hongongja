package sec05.exam03;   //정적 메소드 선언 시 주의할 점으로는 인스턴스 필드와 메소드를 정적 메소드 내에선 바로 사용할 수 없다.

public class Car {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
