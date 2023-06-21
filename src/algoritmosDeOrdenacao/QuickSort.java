package algoritmosDeOrdenacao;

public class QuickSort {
    public static void quickSort(int[] vetor, int inicio, int fim){
        if(inicio < fim){
            int pivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, pivo - 1);
            quickSort(vetor, pivo + 1, fim);
        }
    }

    public static int separar(int[] vetor, int inicio, int fim){
        int pivo = vetor[fim];
        int i = (inicio - 1);
        int aux;
        for (int j = inicio; j < fim; j++) {
            if(vetor[j] <= pivo){
                i++;
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }

        aux = vetor[i+1];
        vetor[i+1] = vetor[fim];
        vetor[fim] = aux;

        return i+1;
    }

    public static void main(String[] args) {
        int[] vetor = {1, 45, 87, 3, 7};
        quickSort(vetor, 0, vetor.length-1);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}