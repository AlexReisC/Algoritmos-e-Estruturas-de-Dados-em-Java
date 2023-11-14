package estruturasDeDados;

public class NoDaArvore {
    int valor;
    NoDaArvore direita, esquerda;

    public NoDaArvore(int valor) {
        this.valor = valor;
        this.direita = null;
        this.esquerda = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoDaArvore getDireita() {
        return direita;
    }

    public void setDireita(NoDaArvore direita) {
        this.direita = direita;
    }

    public NoDaArvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoDaArvore esquerda) {
        this.esquerda = esquerda;
    }
}
