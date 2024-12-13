import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        Robo robo = new Robo();
        String op;

        System.out.println("Movimentando o Robo");
        do{
            robo.posicaoAtual();
            System.out.println("    'w' anda para cima");
            System.out.println("    's' anda para baixo");
            System.out.println("    'd' anda para direita");
            System.out.println("    'a' anda para esquerda");
            System.out.println("    'e' para sair");
            System.out.println("Digite a opção: ");
            op = sin.nextLine();

            switch(op){
                case "w":
                    robo.andarCima();
                break;
                case "s":
                    robo.andarBaixo();
                break;
                case "d":
                    robo.andarDireita();
                break;
                case "a":
                    robo.andarEsquerda();
                break;
                case "e":
                    System.out.println("Programa finalizado!");
                break;
                default: System.out.println("Opção inválida!");
            }

        }while(!op.equals("e"));

    }
}