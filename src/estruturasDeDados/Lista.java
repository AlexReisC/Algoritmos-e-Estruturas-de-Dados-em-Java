package estruturasDeDados;

public class Lista {
    private No primeiroNo;
    private No ultimoNo;

    public Lista(No primeiroNo, No ultimoNo) {
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
            ;
        } else{
            primeiroNo = new No(primeiroNo, valor);
        }
    }

    public void inserirFim(int valor){
        if(isEmpity()){
            primeiroNo = ultimoNo = new No(null, valor);
        } else{
            ultimoNo.setProximoNo(new No(ultimoNo, valor));
            ultimoNo = ultimoNo.getProximoNo();
        }
    }
    
    public void remover(){

    }

    

}
