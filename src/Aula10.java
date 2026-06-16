import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Aula10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /* Classes são tipos referência
            Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim
            “tentáculos” (ponteiros) para caixas.
            exemplo: product p1, p2; 
                     p1 = new Product("TV", 900, 0); // criasse uma instancia OU HEAP onde o produto p1 tem esses valores.
                     p2 = p1 // p2 aponta para a mesma instancia que o p1;

            Tipos primitivos são tipos valor
            Em Java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros.
            exemplo: int x = 1 // cria uma caixa X e coloca o valor 10 ali dentro(não uma referencia ao um heap).

            Valores padrão
            • Quando alocamos (new) qualquer tipo estruturado (classe ou array),
            são atribuídos valores padrão aos seus elementos
            • números: 0
            • boolean: false
            • char: caractere código 0
            • objeto: null

            CLASSE                                //            PRIMITIVO
Vantagem: usufrui de todos recursos OO            // Vantagem: é mais simples e mais performático
Variáveis são ponteiros                           // Variáveis são caixas
Objetos precisam ser instanciados usando new, ou  //Não instancia. Uma vez declarados, estão prontos
apontar para um objeto já existente.              // para uso.
Aceita valor null                                 //Não aceita valor null
Y = X; "Y passa a apontar para onde X aponta"     // Y =X "Y recebe uma cópia de X"
Objetos instanciados no heap                      //"Objetos" instanciados no stack
Objetos não utilizados são desalocados em um      // "Objetos" são desalocados imediatamente quando 
momento próximo pelo garbage collector            // seu escopo de execução é finalizado 

        Desalocação de memória - garbage collector e escopo local
        Garbage collector
        • É um processo que automatiza o gerenciamento de memória de um
        programa em execução
        • O garbage collector monitora os objetos alocados dinamicamente
        pelo programa (no heap), desalocando aqueles que não estão mais
        sendo utilizados.

        Resumo
        • Objetos alocados dinamicamente, quando não possuem mais
        referência para eles, serão desalocados pelo garbage collector
        • Variáveis locais são desalocadas imediatamente assim que seu escopo
        local sai de execução

        VETORES:
        • Em programação, "vetor" é o nome dado a arranjos unidimensionais
        • Arranjo (array) é uma estrutura de dados: • Homogênea (dados do mesmo tipo)
        • Ordenada (elementos acessados por meio de posições)
        • Alocada de uma vez só, em um bloco contíguo de memória

        • Vantagens:
        • Acesso imediato aos elementos pela sua posição

        • Desvantagens:
        • Tamanho fixo
        • Dificuldade para se realizar inserções e deleções

        

         Problema exemplo de vetor: Fazer um programa para ler um número inteiro N e a altura de N
        pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
        */
        double soma =0;
        System.out.println("Digite o numero de pessoas que gostaria de anotar a altura: ");
        int n = sc.nextInt();
        double [] vetor = new double [n];

        for(int i= 0; i<n; i++){
            System.out.println("digite a altura a ser adicionada a sua lista: ");
            vetor[i]=sc.nextDouble();
            soma += vetor[i];
        }
        double media = soma/n;
        System.out.println("Aqui está a sua lista: "+Arrays.toString(vetor));
        System.out.println("Essa é a média das alturas: "+media);
            
       sc.close();
    }
    
}
