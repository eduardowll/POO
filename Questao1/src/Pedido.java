import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Pedido {
    String endereco;
    int qntd_botijao;
    String numcartao;
    String status;
    int cod_pedido;
    float precototal;
    String hora_compra;
    String hora_entrega;

    public Pedido() {
        this.cod_pedido = gerarCod_pedido();
        geraHora();
    }

    public static void menu(){
        System.out.println("-----------LOJA DE BOTIJÃO DE GÁS---------------");
        System.out.println("        1. Fazer pedido;");
        System.out.println("        2. Confimar pedido;");
        System.out.println("        3. Ver pedidos confirmados/entregas;");
        System.out.println("        4. Finalizar atendimento.");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setQntd_botijao(int qntd_botijao) {
        this.qntd_botijao = qntd_botijao;
    }

    public String getNumcartao() {
        return numcartao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setNumcartao(String numcartao) {
        this.numcartao = numcartao;
    }

    public int getCod_pedido() {
        return cod_pedido;
    }

    private int gerarCod_pedido() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

    public float getPrecototal() {
        return precototal;
    }

    public void setPrecototal(float precototal) {
        this.precototal = precototal;
    }

    public void geraHora(){
        LocalDateTime hora_auxiliar;

        hora_auxiliar = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        hora_compra = hora_auxiliar.format(formatter);
        hora_auxiliar = hora_auxiliar.plusHours(6);
        hora_entrega = hora_auxiliar.format(formatter);
    }

}
