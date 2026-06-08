import java.util.Locale;
import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //construçoes, palavra this, sobrecarga e ENCAPSULAMENTO: 

        /* comando new = construtor
        mais de um construtor por classe == sobrecarga

        palavra this = referencia para o proprio objeto
        -> diferenciar atributos de variaveis locais
        -> passar o proprio objeto como argumento na chamada de um metodo ou construtor


        Sobrecarga = é um recurso que uma classe poussiu de oferecer mais de uma operaçao com o mesmo nome,
        porem com diferentes listas de paremetros;

        proposta de melhoria no projeto atividadeConstrutores;

        Vamos criar um contrutor opcional, o qual recebe apenas nome e preço do produto. A quantidade em estoque deste novo
        produto, por padrão, é zero.

        È possivel tbm incluir um construtor pedrão.


        Encapsulamento
        • É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas
        operações seguras e que mantenhamos objetos em um estado consistente.

        • Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

        Regra geral básica
        • Um objeto NÃO deve expor nenhum atributo (modificador de acesso
        private)
        • Os atributos devem ser acessados por meio de métodos get e set
        • Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans


         */

        
    }
}
