// Classe principal
public class Principal {
    public static void main(String[] args) {
        C2 c2 = new C2("Atributo C1 de C2", "Atributo C2");
        C3 c3 = new C3("Atributo C1 de C3", "Atributo C3");
        C4 c4 = new C4("Atributo C1 de C4", "Atributo C2 de C4", "Atributo C4");
        C5 c5 = new C5("Atributo C1 de C5", "Atributo C2 de C5", "Atributo C5");

        c2.metodoC1();
        c2.metodoC2();

        c3.metodoC1();
        c3.metodoI1();
        c3.metodoI2a();
        c3.metodoI2b();

        c4.metodoC1();
        c4.metodoC2();

        c5.metodoC1();
        c5.metodoC2();
        c5.metodoI1();
        c5.metodoC5();
    }
}
