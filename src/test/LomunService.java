package test;

public class LomunService {
    private Lomun lomun;

    public LomunService(Lomun lomun) {
        this.lomun = lomun;
    }

    public void 라면만들기(){
        lomun.cook();
    }
}
