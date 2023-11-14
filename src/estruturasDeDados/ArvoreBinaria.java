package estruturasDeDados;

public class ArvoreBinaria {
    NoDaArvore raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public NoDaArvore getRaiz() {
        return raiz;
    }

    public void setRaiz(NoDaArvore raiz) {
        this.raiz = raiz;
    }
    
    public boolean isEmpity(){
        return (raiz == null) ? true : false;
    }

    public void preOrdem(NoDaArvore x){
        if(x != null){
            System.out.print(x.getValor() + " ");
            preOrdem(x.getEsquerda());
            preOrdem(x.getDireita());
        }
    }

    public void emOrdem(NoDaArvore x){
        if (x != null) {
            emOrdem(x.getEsquerda());
            System.out.print(x.getValor() + " ");
            emOrdem(x.getDireita());
        }
    }

    public void posOrdem(NoDaArvore x){
        if (x != null) {
            posOrdem(x.getEsquerda());
            posOrdem(x.getDireita());
            System.out.print(x.getValor() + " ");
        }
    }

    public void percorrer(int v){
        if(isEmpity()){
            System.out.println("Arvore vazia!");
        } else if(v == 1){
            preOrdem(raiz);
            System.out.println();
        } else if(v == 2){
            emOrdem(raiz);
            System.out.println();
        } else if(v == 3){
            posOrdem(raiz);
            System.out.println();
        }
    }

    // public int altura()

    // public int qtdNos()

    public boolean inserir(int valor){
        if(isEmpity() == true){
            raiz = new NoDaArvore(valor);
            return true;
        }
        else{
            NoDaArvore aux = raiz;
            NoDaArvore pai = null;
            while(aux != null) {
                pai = aux;
                if(valor < pai.getValor()){
                    aux = aux.getEsquerda();
                } else if(valor > pai.getValor()){
                    aux = aux.getDireita();
                } else{
                    System.out.println("No ja existe");
                    return false;
                }
            }

            if (valor < pai.getValor()) {
                pai.setEsquerda(new NoDaArvore(valor));
                
            } else {
                pai.setDireita(new NoDaArvore(valor));
            }
        }
        return true;
    }

    public boolean remover(int valor){
        if(isEmpity() == true){
            System.out.println("Arvore vazia!");
            return false;
        } else if(raiz == null){
            return false;
        } else{
            NoDaArvore atual = raiz;
            NoDaArvore pai = atual;
            while (atual != null && atual.getValor() != valor) {
                pai = atual;
                if(valor < pai.getValor()){
                    atual = pai.getEsquerda();
                }
                if(valor > pai.getValor()){
                    atual = pai.getDireita();
                }
            }
            if(atual == null){
                System.out.println("Nó não encontrado");
                return false;
            }
            if (atual.getEsquerda() != null && atual.getDireita() != null) { // no tem dois filhos
                NoDaArvore paiMaiorEsq = atual.getEsquerda();
                NoDaArvore maiorEsq = paiMaiorEsq.getDireita();
                while (maiorEsq != null) {
                    paiMaiorEsq = maiorEsq;
                    maiorEsq = maiorEsq.getDireita();
                }
                if (paiMaiorEsq == atual.getEsquerda()) {
                    atual.setValor(paiMaiorEsq.getValor());
                    atual.setEsquerda(null);
                } else {
                   atual.setValor(paiMaiorEsq.getDireita().getValor());
                   paiMaiorEsq.setDireita(null);
                }
            } else if (atual.getEsquerda() == null && atual.getDireita() != null){ // nó tem apenas um filho
                NoDaArvore paiMenorDir = atual.getDireita();
                NoDaArvore menorDir = paiMenorDir.getEsquerda();
                while (menorDir != null) {
                    paiMenorDir = menorDir;
                    menorDir = menorDir.getEsquerda();
                }
                if (paiMenorDir == atual.getDireita()){ // se o filho nao tem filhos
                    atual.setValor(paiMenorDir.getValor());
                    atual.setDireita(null);
                } else {
                    atual.setValor(paiMenorDir.getEsquerda().getValor());
                    paiMenorDir.setEsquerda(null);    
                }
            } else { // nó nao tem filho
                if (pai.getEsquerda() == atual){
                    pai.setEsquerda(null);
                } else {
                    pai.setDireita(null);
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria();
        ab.inserir(5);
        ab.inserir(3);
        ab.inserir(8);
        ab.inserir(2);
        ab.inserir(1);
        ab.inserir(9);
        ab.inserir(7);
        ab.inserir(4);
        ab.inserir(6);
        ab.inserir(10);
        ab.remover(1);
        ab.remover(8);
        ab.remover(9);
        ab.percorrer(1);
        ab.percorrer(2);
        ab.percorrer(3);
    }
}
