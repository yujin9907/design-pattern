package adapter.ex01;

public class EmailAdapter implements EmailSend {
    @Override
    public String send() {
        return "고맙습니다";
    }

    //가짜 객체 생성

    // 실제 객체가 만들어졌을 때 이것만 바꾸면 됨
    // 어차피 implements를 통해서 emailsend로 타입이 같기 때문에 (단, 실제 객체도 implements 이메일 센드를 해야 됨

}
