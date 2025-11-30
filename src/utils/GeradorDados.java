package utils;
import java.util.Random;

public class GeradorDados {

    public static int[] gerarOrdenado(int tamanho) {
        int[] arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int[] gerarInversamenteOrdenado(int tamanho) {
        int[] arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            arr[i] = tamanho - i;
        }
        return arr;
    }

    public static int[] gerarAleatorio(int tamanho) {
        int[] arr = gerarOrdenado(tamanho);
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            int indiceAleatorio = rand.nextInt(tamanho);
            int temp = arr[i];
            arr[i] = arr[indiceAleatorio];
            arr[indiceAleatorio] = temp;
        }
        return arr;
    }
}