package ordenacao;

public class MergeSort {
    public static void ordenar(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            mergeSort(arr, temp, esquerda, meio);
            mergeSort(arr, temp, meio + 1, direita);
            merge(arr, temp, esquerda, meio, direita);
        }
    }

    private static void merge(int[] arr, int[] temp, int esquerda, int meio, int direita) {
        for (int i = esquerda; i <= direita; i++) {
            temp[i] = arr[i];
        }

        int i = esquerda;
        int j = meio + 1;
        int k = esquerda;

        while (i <= meio && j <= direita) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= meio) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }
}
