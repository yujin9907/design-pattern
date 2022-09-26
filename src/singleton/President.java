package singleton;

public class President {
    private static President instance = new President("운석열");
    public static President getInstance(){
        return instance;
    }
    private String name;
    private President(String name) {
        this.name = name;
    }
}
