import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Jogo {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Dado dado1 = new Dado(), dado2 = new Dado();
        Scanner sin = new Scanner(System.in);
        Set<Integer> apostas = new HashSet<>();
        int num_jogador;
        int result;

        Ranking.exibirRanking();

        System.out.println("\nSerão quantos jogadores?: ");
        num_jogador = sin.nextInt();

        for(int i = 0; i < num_jogador; i++){
            System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
            String nome = sin.next();

            int aposta;
            do {
                System.out.println("Digite o número para aposta (entre 1 e 12): ");
                aposta = sin.nextInt();

                if (apostas.contains(aposta)) {
                    System.out.println("Aposta inválida. Tente outro número.");
                }
            } while (aposta < 1 || aposta > 12 || apostas.contains(aposta));
            apostas.add(aposta);

            Jogador jogador = new Jogador(nome, aposta);
            jogadores.add(jogador);
        }

        result = dado1.jogarDado() + dado2.jogarDado();

        int aux = 0;
        for(Jogador jogador : jogadores){
            if (jogador.getAposta() == result) {
                jogador.setGanhou(true);
                aux++;
            } else {
                jogador.setGanhou(false);
            }
        }

        if (aux == 0) {
            System.out.println("O número sorteado foi o " + result + ", mas a máquina que ganhou o jogo!");
        } else {
            Jogador vencedor = jogadores.stream()
                    .filter(Jogador::isGanhou)
                    .findFirst()
                    .get();

            System.out.println("O número sorteado foi o " + result + " e o " + vencedor.getNome() + " que ganhou o jogo!");

            Ranking.atualizarRanking(vencedor.getNome());
        }
    }
}
