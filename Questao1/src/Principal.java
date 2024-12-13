import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        int preco_botijao = 90;
        int op = 0;
        int qntd_botijao = 0;

        do{
            Pedido.menu();
            System.out.print("Escolha a opção desejada: ");


            try{
                op = sin.nextInt();
                sin.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Opção inválida, digite uma opção do menu!");
                sin.nextLine();
                continue;
            }

            switch (op){
                case 1:
                    Pedido novoPedido = new Pedido();

                    System.out.print("Digite seu nome: ");
                    sin.nextLine();
                    System.out.print("Digite seu endereço: ");
                    String endereco = sin.nextLine();
                    novoPedido.setEndereco(endereco);
                    pedidos.add(novoPedido);

                    while (true) {
                        try {
                            System.out.println("DADOS DO PEDIDO: ");
                            System.out.println("Endereço: " + endereco);
                            System.out.println("Hora da compra: " + novoPedido.hora_compra);

                            System.out.println("Quer modificar o endereço? (sim/nao): ");
                            String resposta = sin.nextLine().trim().toLowerCase();

                            if (resposta.equals("sim")) {
                                System.out.println("Digite o novo endereço: ");
                                endereco = sin.nextLine();
                                novoPedido.setEndereco(endereco);
                            } else if (resposta.equals("nao")) {
                                break;
                            } else {
                                System.out.println("Entrada inválida! Digite 'sim' ou 'nao'.");
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao processar a entrada. Tente novamente!");
                            sin.nextLine();
                        }
                    }

                    novoPedido.setEndereco(endereco);

                    System.out.println("Preço unitário do botijão de 13kg = " + preco_botijao + "R$: ");
                    boolean qntd_valida = false;

                    while (!qntd_valida) {
                        System.out.print("Quantidade de botijões: ");
                        try {
                            qntd_botijao = sin.nextInt();
                            sin.nextLine();
                            if (qntd_botijao > 0) {
                                qntd_valida = true;
                            } else {
                                System.out.println("Insira um número maior que zero.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Digite um número inteiro.");
                            sin.nextLine();
                        }
                    }

                    novoPedido.setQntd_botijao(qntd_botijao);
                    float precototal = preco_botijao * qntd_botijao;
                    novoPedido.setPrecototal(precototal);

                    System.out.println("Digite o numero do cartão de crédito/débito para confirmar o pagamento: ");
                    String numcartao = sin.nextLine();
                    novoPedido.setNumcartao(numcartao);

                    novoPedido.setStatus("CONFIRMADO");

                    System.out.println("DADOS DA COMPRA:");
                    System.out.println("Endereço: " + novoPedido.getEndereco());
                    System.out.println("Horário da entrega: " + novoPedido.hora_entrega);
                    System.out.println("Preço total: " + novoPedido.getPrecototal());
                    System.out.println("Numero do cartão: " + novoPedido.getNumcartao());
                    System.out.println("Código da pedido: " + novoPedido.getCod_pedido());
                    break;
                case 2:
                    System.out.println("Digite o codigo do pedido: ");
                    int cod_aux = sin.nextInt();
                    boolean pedidoEncontrado = false;

                    for (Pedido pedido : pedidos) {
                        if (pedido.getCod_pedido() == cod_aux) {
                            System.out.println("Pedido encontrado! Alterando status para ENTREGUE!");
                            pedido.setStatus("ENTREGUE");
                            pedidoEncontrado = true;
                            break;
                        }
                    }

                    if (!pedidoEncontrado) {
                        System.out.println("Pedido não localizado!");
                        sin.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Lista de pedidos: ");
                    for (Pedido pedido : pedidos){
                        System.out.println("Codigo do pedido: " + pedido.getCod_pedido() + " e status do pedido: " + pedido.getStatus());
                    }
                    break;
                case 4:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(op != 4);
    }
}
