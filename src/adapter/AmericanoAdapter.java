package adapter;

public class AmericanoAdapter implements Coffee {

    private Americano americano; // 컴포지션

    public AmericanoAdapter(Americano americano) {
        this.americano = americano;
    } // 컴포지션 + 생성자주입 : 아메리카노를 재사용

    @Override
    public String make() {
        System.out.println("시럽추가");
        return americano.make();
    }
    // 기능을 하나 추가하는데, 기존 클래스 변형 없이 -> 목표
    // 타입을 coffee로 일치시킴
    // 새로운 클래스를 만들었다는 개념보단, 기존 코드를 활용해서 한 줄 적는 개념
    // 오버라이딩할 때, 아메리카노의 make가 실행되도록 해야 됨 => 방법 1 extands 아메리카노 (다형성 위배기 때문에 다른 방법)
    // => 방법2 컴포지션

    // 즉, 기능 추가 시 어뎁터 사용
}
