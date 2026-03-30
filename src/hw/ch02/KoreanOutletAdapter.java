package hw.ch02;

// Adapter: Charger 인터페이스 구현 + 내부적으로 KoreanOutlet 객체 사용 
public class KoreanOutletAdapter implements Charger {
    private KoreanOutlet koreanOutlet;

    public KoreanOutletAdapter(KoreanOutlet koreanOutlet) {
        this.koreanOutlet = koreanOutlet;
    }

    @Override
    public int charge() {
        return koreanOutlet.provide();
    }
}
