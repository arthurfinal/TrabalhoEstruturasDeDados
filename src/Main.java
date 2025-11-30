import java.util.Random;
import estruturas.ArvoreBST;
import testes.TesteBusca;
import utils.GeradorDados;
import testes.TesteInsercao;
import testes.TesteOrdenacao;

public class Main {

    private static final int[] TAMANHOS = {100, 1000, 10000};
    private static final String[] ORDENS = {"Ordenada", "Inversa", "Aleatória"};

    public static void main(String[] args) {
        System.out.println("--- Análise de Desempenho de Estruturas de Dados e Algoritmos de Ordenação ---");
        System.out.println("Resultados em milissegundos (média de 5 execuções).\n");
        System.out.println("=================================================================================================");
        System.out.println("                                 TEMPOS DE INSERÇÃO");
        System.out.println("=================================================================================================");
        System.out.printf("%-20s | %-10s | %-15s | %-15s | %-15s\n", "Tamanho / Ordem", "Vetor", "Árvore BST", "Árvore AVL", "Busca (BST)");
        System.out.println("---------------------|------------|-----------------|-----------------|-----------------");
        
        for (int tamanho : TAMANHOS) {
            for (String ordem : ORDENS) {
                int[] dados = gerarDados(tamanho, ordem);
                
                double tempoVetor = TesteInsercao.testarVetor(dados);
                double tempoBST = TesteInsercao.testarArvoreBST(dados);
                double tempoAVL = TesteInsercao.testarArvoreAVL(dados);
                ArvoreBST arvoreBST = new ArvoreBST();
                for (int valor : dados) {
                    arvoreBST.inserir(valor);
                }
                int elementoBusca = dados[new Random().nextInt(tamanho)];
                double tempoBuscaBST = TesteBusca.testarBuscaArvoreBST(arvoreBST, elementoBusca);

                System.out.printf("%-20s | %-10.3f | %-15.3f | %-15.3f | %-15.3f\n", 
                    tamanho + " / " + ordem, 
                    tempoVetor, 
                    tempoBST, 
                    tempoAVL,
                    tempoBuscaBST);
            }
        }
        System.out.println("=================================================================================================\n");
        System.out.println("=================================================================================================");
        System.out.println("                                 TEMPOS DE ORDENAÇÃO (Vetor)");
        System.out.println("=================================================================================================");
        System.out.printf("%-20s | %-15s | %-15s\n", "Tamanho / Ordem", "Bubble Sort", "Merge Sort");
        System.out.println("---------------------|-----------------|-----------------");

        for (int tamanho : TAMANHOS) {
            for (String ordem : ORDENS) {
                int[] dados = gerarDados(tamanho, ordem);
                
                double tempoBubble = TesteOrdenacao.testarBubbleSort(dados);
                double tempoMerge = TesteOrdenacao.testarMergeSort(dados);

                System.out.printf("%-20s | %-15.3f | %-15.3f\n", 
                    tamanho + " / " + ordem, 
                    tempoBubble, 
                    tempoMerge);
            }
        }
        System.out.println("=================================================================================================\n");
    }

    private static int[] gerarDados(int tamanho, String ordem) {
        switch (ordem) {
            case "Ordenada":
                return GeradorDados.gerarOrdenado(tamanho);
            case "Inversa":
                return GeradorDados.gerarInversamenteOrdenado(tamanho);
            case "Aleatória":
                return GeradorDados.gerarAleatorio(tamanho);
            default:
                throw new IllegalArgumentException("Ordem de dados inválida: " + ordem);
        }
    }
}
