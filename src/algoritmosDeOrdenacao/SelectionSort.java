package algoritmosDeOrdenacao;

public class SelectionSort{

    public static void selectionSort(int[] vetor){
        int menorIndice, i, j, aux;

        for(i = 0; i < vetor.length; i++){
            menorIndice = i;
            for(j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[menorIndice]){
                    menorIndice = j;
                }
            }
            if(menorIndice != i){
                aux = vetor[i];
                vetor[i] = vetor[menorIndice];
                vetor[menorIndice] = aux;
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = {4, 10, 3, 52, -9};
        selectionSort(vetor);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
    
}