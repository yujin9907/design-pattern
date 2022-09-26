package adapter.ex01;

import adapter.lib.Email;

// 고객 클레임이 들어오면, 사과 이메일 보내기, 이메일 답장을 db에 저장하기 : 책임
public class CustomerService {

    private EmailSend emailSend;

    public CustomerService(EmailSend emailSend) {
        this.emailSend = emailSend;
    } // 주입은 메서드 주입보다 생성자 주입이 더 좋음(생성됨과 동시에 주입받을 수 있으니까)

    // private Email email;
    // 이메일 기능이 들 구현된 상태, 근데 3번 책임을 구현하려면, 이메일 기능이 있어야 됨
    // 이럴 때 가짜 객체=목크? 를 만들어야 됨

    public void acceptClaim(String msg){
        //1. 클레임받기
        String acceptMsg = msg;

        //2. 이메일 보내기
        sendEmail(); // 책임을 무조건 하나만 들고 있게 하기 위해서 빼기
    }
    public void sendEmail() {
        // email.send(); // 이 기능이 구현되기 전까지 딜레이?
        String result = emailSend.send();
        insertResultEmail();
    }

    public void insertResultEmail(){
        System.out.println("답장을 디비에 저장했습니다");
    }
}
