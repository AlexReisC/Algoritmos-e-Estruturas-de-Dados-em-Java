package estruturasDeDados;

public class Lista {
    private No primeiroNo;
    private No ultimoNo;

    public Lista() {
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public No getPrimeiroNo() {
        return primeiroNo;
    }

    public void setPrimeiroNo(No primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No getUltimoNo() {
        return ultimoNo;
    }

    public void setUltimoNo(No ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public boolean isEmpity(){
        return (primeiroNo == null) ? true : false;
    }

    public void inserirInicio(int valor){
        if(isEmpity()){
            primeiroNo = ultimoNo = new No(null, valor);
        } else{
            primeiroNo = new No(primeiroNo, valor);
        }
    }

    public void inserirFim(int valor){
        if(isEmpity()){
            primeiroNo = ultimoNo = new No(null, valor);
        } else{
            ultimoNo.setProximoNo(new No(null, valor));
            ultimoNo = ultimoNo.getProximoNo();
        }
    }

    public boolean buscar(int valor){
        No aux = primeiroNo;

        while(aux != null){
            if (aux.getValor() == valor) {
                System.out.println("Encontrado!");
                return true;
            }
            aux = aux.getProximoNo();
        }
        System.out.println("Não encontrado!");
        return false;
    }
    
    public boolean remover(int valor){
        No atual = primeiroNo;
        while (atual != null) {
            if (atual.getValor() == valor) {
                No anterior = primeiroNo;
                while (anterior != null) {
                    if (anterior.getProximoNo() == atual) {
                        anterior.setProximoNo(atual.getProximoNo());
                        return true;
                    } else if(anterior == atual){
                        primeiroNo = atual.getProximoNo();
                        return true;
                    }
                    anterior = anterior.getProximoNo();
                }
            }
            atual = atual.getProximoNo();
        }
        return false;
    }

    public void imprimir(){
        No aux = primeiroNo;
        while (aux != null) {
            System.out.print(aux.getValor() + " ");
            aux = aux.getProximoNo();
        }
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirInicio(1);
        lista.inserirFim(2);
        lista.inserirInicio(5);
        lista.remover(2);
        lista.imprimir();
    }

}
