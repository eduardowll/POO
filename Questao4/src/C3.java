// Classe concreta C3 herdando de C1 e implementando I1 e I2
class C3 extends C1 implements I1, I2 {
    protected String atributoC3;

    public C3(String atributoC1, String atributoC3) {
        super(atributoC1);
        this.atributoC3 = atributoC3;
    }

    @Override
    public void metodoC1() {
        System.out.println("Método C1 em C3: " + atributoC1);
    }

    @Override
    public void metodoI1() {
        System.out.println("Método da interface I1 em C3");
    }

    @Override
    public void metodoI2a() {
        System.out.println("Método I2a em C3");
    }

    @Override
    public void metodoI2b() {
        System.out.println("Método I2b em C3");
    }
}

