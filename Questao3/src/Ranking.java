import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ranking {

    public static final String RANKING = "ranking.txt";

    public static void exibirRanking() {
        try (BufferedReader reader = new BufferedReader(new FileReader(RANKING))) {
            String linha;
            System.out.println("TOP FIVE - JOGO DOS DADOS:");
            int i = 1;
            while ((linha = reader.readLine()) != null && i <= 5) {
                System.out.println(i + ". " + linha);
                i++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ranking: " + e.getMessage());
        }
    }

    public static void atualizarRanking(String vencedor) {
        try {
            List<String> ranking = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(RANKING))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    ranking.add(linha);
                }
            }

            boolean vencedorEncontrado = false;
            for (int i = 0; i < ranking.size(); i++) {
                String[] dados = ranking.get(i).split(" - ");
                if (dados[0].equals(vencedor)) {
                    int vitorias = Integer.parseInt(dados[1].split(" ")[0]) + 1;
                    ranking.set(i, vencedor + " - " + vitorias + " vitórias");
                    vencedorEncontrado = true;
                    break;
                }
            }
            if (!vencedorEncontrado) {
                ranking.add(vencedor + " - 1 vitórias");
            }
            ranking.sort((a, b) -> {
                int vitoriasA = Integer.parseInt(a.split(" - ")[1].split(" ")[0]);
                int vitoriasB = Integer.parseInt(b.split(" - ")[1].split(" ")[0]);
                return Integer.compare(vitoriasB, vitoriasA); // Ordenação decrescente
            });

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(RANKING))) {
                for (String rankingLine : ranking) {
                    writer.write(rankingLine);
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao atualizar o ranking: " + e.getMessage());
        }
    }
}
