// Classe concreta C2 herdando de C1
class C2 extends C1 {
    protected String atributoC2;

    public C2(String atributoC1, String atributoC2) {
        super(atributoC1);
        this.atributoC2 = atributoC2;
    }

    @Override
    public void metodoC1() {
        System.out.println("Método C1 em C2: " + atributoC1);
    }

    public void metodoC2() {
        System.out.println("Método de C2: " + atributoC2);
    }
}
