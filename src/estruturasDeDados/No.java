package estruturasDeDados;

public class No {
    private No proximoNo;
    private int valor;

    public No(No proximoNo, int valor) {
        this.proximoNo = proximoNo;
        this.valor = valor;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
