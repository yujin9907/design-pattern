package test;

public class App {

    public static void main(String[] args) {
        LomunService s = new LomunService(new JinLomunAdapter(new JinLomun()));
        s.라면만들기();
    }
}
