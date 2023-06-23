package estruturasDeDados;

public class ListaDuplamenteEncadeada {
    private Node primeiro;
    private Node ultimo;
    public ListaDuplamenteEncadeada() {
        primeiro = null;
        ultimo = null;
    }
    public Node getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Node primeiro) {
        this.primeiro = primeiro;
    }
    public Node getUltimo() {
        return ultimo;
    }
    public void setUltimo(Node ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean isEmpty(){
        return (primeiro == null) ? true : false;
    }

    public void inserirInicio(int valor){
        if(isEmpty()){
            primeiro = ultimo = new Node(null, null, valor);
        } else{
            Node aux = new Node(primeiro, null, valor);
            primeiro.setAnterior(aux);
            primeiro = aux;
        }
    }

    public void inserirFim(int valor){
        if(isEmpty()){
            primeiro = ultimo = new Node(null, null, valor);
        } else{
            ultimo.setProximo(new Node(null, ultimo, valor));
            ultimo = ultimo.getProximo();
        }
    }

    public void imprimir(){
        Node aux = primeiro;
        System.out.print("NULL");
        while (aux != null) {
            System.out.print(" <- " + aux.getValor() + " -> ");
            aux = aux.getProximo();
        }
        System.out.println("NULL");
    }

    public boolean buscar(int valor){
        Node aux = primeiro;
        while (aux != null) {
            if (aux.getValor() == valor) {
                System.out.println("Node encontrado");
                return true;
            }
            aux = aux.getProximo();
        }
        System.out.println("Node não encontrado");
        return false;
    }

    public boolean remover(int valor){
        Node aux = primeiro;
        Node ant = primeiro;
        while(aux != null){
            if(aux.getValor() == valor){
                ant.setProximo(aux.getProximo());
                System.out.println("Node " + aux.getValor() + " removido");
                return true;
            }
            ant = aux;
            aux  = aux.getProximo();
        }
        System.out.println("Node nao encontrado");
        return false;
    }

    public static void main(String[] args) {
        ListaDuplamenteEncadeada listaD = new ListaDuplamenteEncadeada();
        listaD.inserirInicio(1);
        listaD.inserirInicio(2);
        listaD.inserirFim(0);
        listaD.imprimir();
        listaD.remover(0);
        listaD.imprimir();
    }
    
}
