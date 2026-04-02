package practice.ch05.ex;

public class Main extends Thread {
    public static void main(String[] args) {
        // 스레드를 2개 만듦
        Thread a = new Main("Thread A"); // 인자 있는 main() 생성자 필요함 - 만들어 줘야 함!
        Thread b = new Main("Thread B");

        // 스레드를 시작함 
        a.start();
        b.start();
    }

    @Override
    // Thread의 run( 메소드를 오버라이드함
    // 이 스레드가 실행할 코드가 run() 메소드 안에 있음 
    public void run() {
        Singleton s = Singleton.getInstance(); // Singleton 인스턴스를 얻음 
        System.out.println(getName()+ ": " + s); // 인스턴스의 참조값 출력 
    }
    
    public Main(String name) {
        super(name); // Thread 클래스의 생성자에 이름 전달 
    }
}
