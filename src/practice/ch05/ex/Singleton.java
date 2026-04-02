package practice.ch05.ex;

// 싱글톤 패턴 적용하기
public class Singleton {

    private static Singleton singleton = null;

        private Singleton() {
        System.out.println("Singleton 객체가 생성됩니다.");
        slowdown();
    }

    public static synchronized Singleton getInstance() { // static이 없으면 객체에 속함
        if (Singleton.singleton == null) {
            Singleton.singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU 1초 간 쉼
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
