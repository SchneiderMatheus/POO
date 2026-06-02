import java.util.Locale;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Locale.setDefault(Locale.US); // colocar os padroes como padroes americanos, tipo o "." na hora de numeros decimais.

        System.out.println("Hello, World!");

        System.out.println("Bom dia");
        double y = 18.2567;
        System.out.printf("%.2f\n",y); // %. 2f está falando que eu quero delimitar duas casas decimais, tem que usar "," e dai a variavel.

        System.out.println("Resultado: "+y+" Metros"); // concatenando usando prinLN.
        System.out.printf("Resultado : %.2f metros\n",y); // aqui usando printF


        String nome = "Maria";
        int idade =31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.0f reais\n", nome, idade, renda); 
        // Marcadores para pontos flutuantes: %f,    inteiros: %d,   %s = texto,   \n ou %n= quebra de linha


        int a, b;
        double resultado;
        a=5;
        b=2;

        resultado = (double) a/b; // para mostrar dois numeros INT divididos  que resultam em um numero decimal, indicar um double.(casting)

        System.out.println(resultado);


        double pi = 3.14159;
        double area, raio;

        System.out.println("informe o valor do raio: ");
        raio =sc.nextDouble();

        area = pi*Math.pow(raio,2);

        System.out.println(area);



        
        sc.close();
    }
}
