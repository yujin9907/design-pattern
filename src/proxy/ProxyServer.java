package proxy;

public class ProxyServer implements Server{

    private Server server;
//    private BlogServer server; 본 코드는 블로그서버와 서버기 때문에 이렇게 div안 지키고대충 써도 됨 이건


    public ProxyServer(Server server) {
        this.server = server;
    }

    @Override
    public void request() {
        System.out.println("json을 자바오브젝트로");
        server.request();
        System.out.println("자바 오브젝트를 json으로");
    }

    // 어뎁터와 뭐가 다름?
}
