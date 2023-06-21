package algoritmosDeOrdenacao;

public class BubleSort {
    
    public static void bubleSort(int[] vetor){
        int tamanho = vetor.length;
        int i, j, aux;
        for (i = 0; i < tamanho; i++) {
            for (j = 1; j < tamanho-i; j++) {
                if(vetor[j-1] > vetor[j]){
                    aux = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] vet = {33, 5, 8, 2, 11};
        bubleSort(vet);

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }
    
}
