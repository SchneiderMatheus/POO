import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Whiles

        /*
         * int soma=0;
         * int numeros=1;
         * 
         * 
         * while (numeros!=0) {
         * System.out.println("Informe um número: ");
         * numeros= sc.nextInt();
         * soma +=numeros;
         * }
         * 
         * System.out.println("Soma é igual a: "+soma);
         */

        /*
         * String senha = "2002";
         * String tentativa = "";
         * 
         * 
         * while (!tentativa.equals(senha)) {
         * System.out.println("Digite a senha: ");
         * tentativa=sc.nextLine();
         * if (!tentativa.equals(senha)) {
         * System.out.println("Senha Invalida");
         * }else
         * System.out.println("Login efetuado");
         * }
         */

        /*
         * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
         * indeterminada de pontos no sistema
         * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O
         * algoritmo será encerrado quando pelo
         * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
         * alguma).
         */

        /*
         * int x=1,y=1;
         * 
         * 
         * while (x!=0 || y!=0) {
         * System.out.println("Digite o numero para X:");
         * x=sc.nextInt();
         * System.out.println("Digite o numero para Y:");
         * y=sc.nextInt();
         * 
         * 
         * if (x>0 && y>0) {
         * System.out.println("Primeiro Quadrante");
         * } else if (x>0 && y<0) {
         * System.out.println("Quarto Quadrante");
         * } else if (x<0 && y<0) {
         * System.out.println("Terceiro Quadrante");
         * }else
         * System.out.println("Segundo Quadrante");
         * }
         

        // FOR

        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor a ser calculado: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");*/

        String original = "abcde FGHIJ ABC abc DEFG ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j); 

        String s = "potato aple lemon orange";

        String[] vetor = s.split(" ");

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);


        sc.close();
    }
}
