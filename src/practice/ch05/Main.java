package practice.ch05;

public class Main {
    public static void main(String[] args) {
        // Singleton s1 = new Singleton(); private 생성자 - 컴파일 에러 발생 
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        // System.out.println("s2: " + s2);
        // System.out.println("s3: " + s3); // 골뱅이 뒤에 나온 게 주소 -> 다른 객체 두 개 생성됨 
        
        if (s2 == s3) {
            System.out.println("s2와 s3는 같은 Singleton 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 객체입니다.");
        }

        Singleton2 s4 = Singleton2.INSTANCE;
        s4.hello();
    }

    
}
