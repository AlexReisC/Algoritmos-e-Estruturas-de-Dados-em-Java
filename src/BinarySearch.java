public class BinarySearch{
    public int Busca(int indice, int array[]){
        int inicio = 0;
        int fim = array.length -1;
        int meio = array.length / 2;
        while (meio != indice && fim != inicio) {
            if (indice < meio){
                fim = meio;
                meio = (inicio + fim) / 2;
            } else {
                inicio = meio;
                meio = (inicio + fim) / 2;
            }
        }
        if (meio == indice){
            return array[meio];
        } else{
            System.out.println("Indice não encontrado");
            return -1;
        }
    }
    public static void main(String[] args) {
        int a = 6;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearch busca = new BinarySearch();
        int num = busca.Busca(a, array);
        System.out.println(num);
    }
}