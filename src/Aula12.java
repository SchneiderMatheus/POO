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
        
        */

        sc.close();
    }
}
