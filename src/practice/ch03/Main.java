package practice.ch03;

public class Main {
    public static void main(String[] args) {
        // CharDisplay d1 = new CharDisplay('H');
        AbstractDisplay d1 = new CharDisplay('H');

        d1.display(); // 부모 AbstractDisplay.java의 display 실행됨 

        // StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        // 하위 클래스를 상위 클래스와 동일화시킴
        // AbstractDisplay d3 = new AbstractDisplay(); // 오류

        d2.display();
    }
}