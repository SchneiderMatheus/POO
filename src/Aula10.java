import java.util.Locale;

public class Aula10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /* Classes são tipos referência
            Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim
            “tentáculos” (ponteiros) para caixas.
            exemplo: product p1, p2; 
                     p1 = new Product("TV", 900, 0); // criasse uma instancia onde o produto p1 tem esses valores.
                     p2 = p1 // p2 aponta para a mesma instancia que o p1;

            Tipos primitivos são tipos valor
            Em Java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros.
            exemplo: int x = 1 // cria uma caixa X e coloca o valor 10 ali dentro.

            Valores padrão
            • Quando alocamos (new) qualquer tipo estruturado (classe ou array),
            são atribuídos valores padrão aos seus elementos
            • números: 0
            • boolean: false
            • char: caractere código 0
            • objeto: null




        */
    }
}
