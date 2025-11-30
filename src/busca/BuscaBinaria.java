package busca;

public class BuscaBinaria {
    public static boolean buscar(int[] arr, int valor) {
        int esquerda = 0;
        int direita = arr.length -1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (arr[meio] == valor) {
                return true;
            }

            if (arr[meio] < valor) {
                esquerda = meio + 1;
            }else{
                direita = meio - 1;
            }
        }
        return false;
    } 
}
