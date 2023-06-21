package algoritmosDeOrdenacao;

public class InsertionSort {
    public static void insertionSort(int[] vetor){
        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i - 1;

            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j = j - 1;
            }
            vetor[j+1] = aux;
        }
    }
    
    public static void main(String[] args) {
        int[] vetor = {23, 5, -45 , 6, 9};
        insertionSort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
