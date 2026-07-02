import java.util.Locale;
import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        /*
        ENUMERAÇÕES:
        Enumerações
        • É um tipo especial que serve para especificar de forma literal um
        conjunto de constantes relacionadas
        • Palavra chave em Java: enum
        • Vantagem: melhor semântica, código mais legível e auxiliado pelo
        compilador
        • Referência: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

        Exemplo:
        Ciclo de vida de um pedido:
        PendingPayment --> Processing --> Shipped --> Delivered -->
                    billing         dispatch    deliver

        NOTAÇÃO UML:
        <<enum>>                                               <<enum>>   
        OrderStatus                                            OrderStatus
        PENDING_PAYMENT : int = 0                             <<enum constant>> PENDING_PAYMENT : int = 0    
        PROCESSING : int = 1                                  <<enum constant>> PROCESSING : int = 1      
        SHIPPED : int = 2                                     <<enum constant>> SHIPPED : int = 2   
        DELIVERED : int = 3                                   <<enum constant>> DELIVERED : int = 3 

        Vamos falar um pouco de design:

        Categorias de classes
        • Em um sistema orientado a objetos, de modo geral "tudo" é objeto.
        • Por questões de design tais como organização, flexibilidade, reuso,
        delegação, etc., há várias categorias de classes:
        VIEWS        CONTROLLERS         ENTITIES           SERVICES            REPOSITORIES
        Composição
        • É um tipo de associação que permite que um objeto contenha outro

        • Relação "tem-um" ou "tem-vários"

        • Vantagens
        • Organização: divisão de responsabilidades
        • Coesão
        • Flexibilidade
        • Reuso
        
        • Nota: embora o símbolo UML para composição (todo-parte) seja o diamante preto, neste contexto estamos chamando de composição qualquer associação
        tipo "tem-um" e "tem-vários

        */

        sc.close();
    }
}
