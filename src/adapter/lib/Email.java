package adapter.lib;

import adapter.ex01.EmailSend;

public class Email implements EmailSend {
    @Override
    public String send() {
        System.out.println("실제 이메일 기능");
        return "실제 이메일 기능 받음";
    }

    // 실제 완성된 이메일 기능이라고 가정

}
