package estruturas;

public class ArvoreAVL {
    private No raiz;
    private class No {
        int valor;
        int altura;
        No esquerda;
        No direita;

        public No(int valor) {
            this.valor = valor;
            this. altura = 1;
            this.esquerda = null;
            this.direita = null;
        }       
    }

    //Ultilitários 
    private int altura(No N) {
        if (N == null)
            return 0;
        return N.altura;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private int getFatorBalanceamento(No N) {
        if (N == null)
            return 0;
        return altura(N.esquerda) - altura(N.direita);
    }
}