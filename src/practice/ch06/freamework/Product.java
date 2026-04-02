package practice.ch06.freamework;

public interface Product extends Cloneable { // Cloneable 인터페이스를 구현하는 클래스만 Clone 사용 가능
    public abstract void use(String s);
    public abstract Product createCopy(); // 복제 메소드 
}
