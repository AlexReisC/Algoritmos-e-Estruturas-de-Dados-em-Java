package estruturasDeDados;

public class Node {
    Node proximo;
    Node anterior;
    int valor;
    
    public Node(Node proximo, Node anterior, int valor) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.valor = valor;
    }
    
    public Node getProximo() {
        return proximo;
    }
    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
    public Node getAnterior() {
        return anterior;
    }
    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }    
}
