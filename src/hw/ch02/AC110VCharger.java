package hw.ch02;

public class AC110VCharger implements Charger {
    @Override
    public int charge() {
        System.out.println("110V 충전기에서 110V AC 를 제공합니다.");
        return 110;
    }
}