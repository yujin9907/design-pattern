package adapter.ex01;

import adapter.lib.Email;

public class Ex01App {
    public static void main(String[] args) {
        CustomerService cs = new CustomerService(new EmailAdapter());
        cs.acceptClaim("싫어");

        // 실제 코드 적용시, 위의 가짜코드를 이 코드로 변경만 해주면 됨
        CustomerService cs2 = new CustomerService(new Email());
    }
}
