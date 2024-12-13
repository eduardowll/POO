// Classe concreta C5 herdando de C2 e implementando I1
class C5 extends C2 implements I1 {
    private String atributoC5;

    public C5(String atributoC1, String atributoC2, String atributoC5) {
        super(atributoC1, atributoC2);
        this.atributoC5 = atributoC5;
    }

    @Override
    public void metodoI1() {
        System.out.println("Método da interface I1 em C5");
    }

    public void metodoC5() {
        System.out.println("Método de C5: " + atributoC5);
    }
}