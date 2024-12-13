// Classe concreta C4 herdando de C2
class C4 extends C2 {
    private String atributoC4;

    public C4(String atributoC1, String atributoC2, String atributoC4) {
        super(atributoC1, atributoC2);
        this.atributoC4 = atributoC4;
    }

    @Override
    public void metodoC2() {
        System.out.println("Método C2 sobreposto em C4: " + atributoC4);
    }
}