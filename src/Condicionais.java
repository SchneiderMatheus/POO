import java.util.Scanner;

public class Condicionais {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorPlano=50, minutos=0;
        System.out.println("Quantos minutos voce usou?");
        minutos = sc.nextInt();
        if (minutos>100) {
            valorPlano += (minutos-100)*2;
            System.out.println("Valor da contra é R$ "+valorPlano);
        } else {
            System.out.println("Valor a pagar R$ "+valorPlano);
        }

        /*int x=6;
        int y=25;
        

        if(x%y==0){
            System.out.println("são muiltiplos");
        }else {
            System.out.println("não são multiplos");

        }*/

        int horaInicial=18;
        int horaFinal=12;

        int duracao;
        if (horaInicial<horaFinal){
            duracao = horaFinal - horaInicial;
        }else 
            duracao = (24 - horaInicial) + horaFinal;

        System.out.println("O Jogo durou "+duracao+ "Horas");

        /* EXPRESSÃO CONDICIONAL TERNÁRIA
        Estrutura opcional ao if-else quanso se deseja decidir um calor com base em uma condiçao
        (condicao) ? valor_se_verdadeiro : valor_se_falso
        (2>4) ? 50 ; 80 essa expressao seria 80
        */

        /*double preco = 34.5;
        double desconto;
        if (preco < 20) {
            desconto = preco*0.1;
        }else {
            desconto = preco * 0.05;
        }*/

        //TERNARIA A MESMA COISA:

        double preco =34.5;
        double desconto = (preco <20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    
    sc.close();
    }
}
