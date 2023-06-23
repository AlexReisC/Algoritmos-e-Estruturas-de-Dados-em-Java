package estruturasDeDados;

public class Pilha {
    private No primeiro;
    private No ultimo;

    public Pilha() {
        this.ultimo = null;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public boolean isEmpty(){
        return (ultimo == null) ? true : false;
    }

    public void inserir(int valor){
        if (isEmpty()) {
            primeiro = ultimo = new No(null, valor);
        } else{
            ultimo.setProximoNo(new No(null, valor));
            ultimo = ultimo.getProximoNo();
        }
    }

    public boolean topo(){
        if(isEmpty()){
            return false;
        } else{
            System.out.println("Topo: " + ultimo.getValor());
            return true;
        }
    }

    public boolean remover(){
        No aux = primeiro;
        while (aux != null) {
            if(aux.getProximoNo() == ultimo){
                aux.setProximoNo(null);
                ultimo = aux;
                return true;
            }
            aux = aux.getProximoNo();
        }
        return false;
    }

    public void imprimir(){
        No aux = primeiro;
        while(aux != null){
            System.out.print(aux.getValor() + " | ");
            aux = aux.getProximoNo();
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.inserir(10);
        p.inserir(9);
        p.inserir(8);
        p.imprimir();
        p.remover();
        p.topo();
    }

}

    
