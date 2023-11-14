package estruturasDeDados;

public class Fila {
    No primeiro;
    No ultimo;

    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public No getPrimeiro() {
        return primeiro;
    }
    
    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public boolean isEmpty(){
        return (primeiro == null) ? true : false;
    }

    public void inserir(int valor){
        if(isEmpty()){
            primeiro = ultimo = new No(null, valor);
        } else{
            ultimo.setProximoNo(new No(null, valor));
            ultimo = ultimo.getProximoNo();
        }
    }

    public boolean buscar(int valor){
        No aux = primeiro;
        while(aux != null){
            if(aux.getValor() == valor){
                return true;
            }
            aux = aux.getProximoNo();
        }
        return false;
    }

    public boolean remover(){
        if (isEmpty()) {
            return false;
        } else {
            primeiro = primeiro.getProximoNo();
            return true;
        }
    }

    public void imprimir(){
        No aux = primeiro;
        while(aux != null){
            System.out.print(aux.getValor() + " -> ");
            aux = aux.getProximoNo();
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Fila f = new Fila();
        f.inserir(0);
        f.inserir(1);
        f.remover();
        f.inserir(2);
        f.imprimir();
    }
    
}
