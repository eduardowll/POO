public class Jogador {
    String nome;
    int aposta;
    boolean ganhou;

    Jogador(String nome, int aposta){
        this.nome = nome;
        this.aposta = aposta;

}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAposta(int valor) {
        this.aposta = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getAposta() {
        return aposta;
    }

    public boolean isGanhou() {
        return ganhou;
    }

    public void setGanhou(boolean ganhou) {
        this.ganhou = ganhou;
    }
}
