public class Robo {
    int linha;
    int coluna;
    int passo;
    String[][] sala;

    Robo() {
        linha = 0;
        coluna = 0;
        passo = 1;
        sala = new String[20][40];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 40; j++) {
                sala[i][j] = ".";
            }
        }
        sala[linha][coluna] = "R";
    }

    public void posicaoAtual() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void andarCima() {
        sala[linha][coluna] = ".";

        if (linha - passo >= 0) {
            linha -= passo;
        }
        sala[linha][coluna] = "R";
    }

    public void andarBaixo() {
        sala[linha][coluna] = ".";

        if (linha + passo < 20) {
            linha += passo;
        }
        sala[linha][coluna] = "R";
    }

    public void andarDireita() {
        sala[linha][coluna] = ".";

        if (coluna + passo < 40) {
            coluna += passo;
        }
        sala[linha][coluna] = "R";
    }

    public void andarEsquerda() {
        sala[linha][coluna] = ".";

        if (coluna - passo >= 0) {
            coluna -= passo;
        }
        sala[linha][coluna] = "R";
    }
    public int getColuna() {
        return coluna;
    }
    public int getLinha() {
        return linha;
    }
    public int getPasso() {
        return passo;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void setPasso(int passo) {
        this.passo = passo;
    }
}
