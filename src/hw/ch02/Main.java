package hw.ch02;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== [Step 1] 110V 충전기로 충전 ===");
        // 1. 일반 110V 충전기 생성 (Charger 인터페이스 사용)
        Charger charger110V = new AC110VCharger();
        // 2. 스마트폰에 연결
        Smartphone smartphone1 = new Smartphone(charger110V);
        // 3. 충전 실행
        smartphone1.charge();

        System.out.println("\n=== [Step 2] 한국 콘센트 Adapter로 충전 ===");
        // 1. 220V 한국 콘센트(기존 부품) 준비
        KoreanOutlet outlet220V = new KoreanOutlet();
        
        // 2. 어댑터(돼지코)에 220V 콘센트 연결! (이 어댑터는 이제 Charger 취급을 받음)
        Charger adapter = new KoreanOutletAdapter(outlet220V);
        
        // 3. 스마트폰에 돼지코(어댑터) 연결
        Smartphone smartphone2 = new Smartphone(adapter);
        
        // 4. 충전 실행
        smartphone2.charge();
    }
}