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
}

