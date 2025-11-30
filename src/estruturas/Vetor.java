package estruturas;

public class Vetor {
    private int[] elementos;
    private int tamanhoAtual;

    public Vetor(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanhoAtual = 0;
    }

    public void inserir(int valor) {
        if (tamanhoAtual < elementos.length) {
            elementos[tamanhoAtual] = valor;
            tamanhoAtual++;
        } else {
            System.err.println("Vetor cheio. Não foi possível inserir " + valor);
        }
    }

    public boolean buscar(int valor) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (elementos[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public int[] getArray() {
        int[] arrayCopia = new int[tamanhoAtual];
        System.arraycopy(elementos, 0, arrayCopia, 0, tamanhoAtual);
        return arrayCopia;
    }

    public int getTamanho() {
        return tamanhoAtual;
    }
}

