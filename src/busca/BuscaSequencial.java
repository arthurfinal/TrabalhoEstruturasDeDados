package busca;

public class BuscaSequencial {
    public static boolean buscar(int[] arr, int valor) {
        for (int elemento : arr) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }
}