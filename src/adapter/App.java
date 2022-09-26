package adapter;

public class App {
    public static void main(String[] args) {
        CoffeeMachine m = new CoffeeMachine();
        m.brew(new Americano());
        m.brew(new CafeLatte());
        m.brew(new AmericanoAdapter(new Americano())); // 데코레이트 기법
        // 이거 오류났던 이유, 아메리카노 어뎁터에 커피를 스트레테기에 있는 어뎁터로 임플리먼츠해서 오류남
        // 다른 걸 임포트하면 다른 타입으로 인식함

        // 아메리카노에 시럽 하나를 추가하려면?

        // 어뎁터
        // 활용1: 기능 추가
        // 활용2: ex01에 가짜 클래스
    }
}
