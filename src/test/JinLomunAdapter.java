package test;

public class JinLomunAdapter implements Lomun{

    private JinLomun jinLomun;

    public JinLomunAdapter(JinLomun jinLomun) {
        this.jinLomun = jinLomun;
    }

    @Override
    public void cook() {
        jinLomun.cook();
        System.out.println("계란 추가");
    }
}
