package proxy;

public class ProxyApp {
    public static void main(String[] args) {
        ProxyServer ps = new ProxyServer(new BlogServer());
        ps.request();

        // 어뎁터와 차이 : 바라보는 대상이 다름름
    }

}