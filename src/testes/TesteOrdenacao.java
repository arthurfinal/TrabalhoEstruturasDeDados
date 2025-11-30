package testes;

import ordenacao.BubbleSort;
import ordenacao.MergeSort;
import utils.Cronometro;

public class TesteOrdenacao {

    private static final int REPETICOES = 5;

    public static double testarBubbleSort(int[] dados) {
        Cronometro cronometro = new Cronometro();
        double tempoTotal = 0;

        for (int r = 0; r < REPETICOES; r++) {
            int[] copia = dados.clone();
            cronometro.iniciar();
            BubbleSort.ordenar(copia);
            cronometro.parar();
            tempoTotal += cronometro.getTempoEmMilissegundos();
        }

        return tempoTotal / REPETICOES;
    }

    public static double testarMergeSort(int[] dados) {
        Cronometro cronometro = new Cronometro();
        double tempoTotal = 0;

        for (int r = 0; r < REPETICOES; r++) {
            int[] copia = dados.clone();
            cronometro.iniciar();
            MergeSort.ordenar(copia);
            cronometro.parar();
            tempoTotal += cronometro.getTempoEmMilissegundos();
        }

        return tempoTotal / REPETICOES;
    }
}
