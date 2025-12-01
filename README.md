# TrabalhoEstruturasDeDados
//Arthur Final

# Análise de Desempenho de Estruturas de Dados em Java

Este projeto tem como objetivo comparar o desempenho de diferentes estruturas de dados (vetores, árvores binárias de busca e árvores AVL) em operações de inserção e busca, além de comparar o desempenho dos algoritmos de ordenação Bubble Sort e Merge Sort.

## Estrutura do Projeto

O projeto segue a seguinte estrutura de diretórios:

```
.
├── src/
│   ├── busca/
│   │   ├── BuscaBinaria.java
│   │   └── BuscaSequencial.java
│   ├── estruturas/
│   │   ├── ArvoreAVL.java
│   │   ├── ArvoreBST.java
│   │   └── Vetor.java
│   ├── ordenacao/
│   │   ├── BubbleSort.java
│   │   └── MergeSort.java
│   ├── testes/
│   │   ├── TesteBusca.java
│   │   ├── TesteInsercao.java
│   │   └── TesteOrdenacao.java
│   ├── utils/
│   │   ├── Cronometro.java
│   │   └── GeradorDados.java
│   └── Main.java
└── README.md
```

## Como Compilar e Executar

**Pré-requisitos:**
* Java Development Kit (JDK) 8 ou superior.

**Passos:**

1. **Compilar:**
   Abra o terminal na raiz do projeto e execute o comando de compilação para todos os arquivos `.java`:
   ```bash
   javac src/**/*.java
   ```

2. **Executar:**
   Execute a classe principal `Main` a partir da pasta `src`:
   ```bash
   java -cp src Main
   ```

O programa irá executar os testes de desempenho e imprimir os resultados no console.

## Requisitos do Trabalho

Este projeto implementa:
* **Estruturas de Dados:** `Vetor`, `ArvoreBST` (Árvore Binária de Busca) e `ArvoreAVL` (Árvore AVL).
* **Algoritmos de Ordenação:** `BubbleSort` (simples) e `MergeSort` (avançado).
* **Algoritmos de Busca:** `BuscaSequencial` e `BuscaBinaria`.
* **Utilitários:** `Cronometro` para medição de tempo e `GeradorDados` para criação dos conjuntos de teste.

Os resultados detalhados e a análise completa do desempenho estão contidos no **Relatório Técnico** que acompanha este código-fonte.
