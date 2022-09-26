package strategy;

public class CoffeeMachine {
    public void brew(Coffee coffee){
        // (어떤 생성자의 객체를 쓰는) 주입 방법 3 가지
        // 1. 상속 : 다형성 성립이 안 돼서 안 됨
        // 2. 컴포지션 : 생성자 주입을 통해
        // 3. 메서드 주입
        System.out.println(coffee.make());
    }

//    public void brew(CafeLatte cafeLatte){
//        System.out.println(cafeLatte);
//    } 오버로딩 사용 x

}
