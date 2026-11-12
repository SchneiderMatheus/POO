public class Aula17 {
    public static void main(String[] args) {
        /*
        Generics
        • Generics permitem que classes, interfaces e métodos possam ser
        parametrizados por tipo. Seus benefícios são:
        • Reuso
        • Type safety
        • Performance
        • Uso comum: coleções
        List<String> list = new ArrayList<>();
        list.add("Maria");
        String name = list.get(0)

        Problema motivador 1 (reuso)

        Deseja-se fazer um programa que leia uma quantidade N, e depois N números
        inteiros. Ao final, imprima esses números de forma organizada conforme
        exemplo. Em seguida, informar qual foi o primeiro valor informado.

        How many values? 3 Criar um serviço de impressão:
        10
        8
        23
        [10, 8, 23]
        First: 10

        Problema motivador 2 (type safety & performance)
        Deseja-se fazer um programa que leia uma quantidade N, e depois N nomes de
        pessoas. Ao final, imprima esses números de forma organizada conforme
        exemplo. Em seguida, informar qual foi o primeiro valor informado.

        How many values? 3 Criar um serviço de impressão:
        10
        8
        23
        [10, 8, 23]
        First: 10

        Solução com generics
        Deseja-se fazer um programa que leia uma quantidade N, e depois N números
        inteiros. Ao final, imprima esses números de forma organizada conforme
        exemplo. Em seguida, informar qual foi o primeiro valor informado.

        Usando Generics


        Genéricos delimitados
        Problema

        Uma empresa de consultoria deseja avaliar a performance de produtos,
        funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
        o maior dentre um conjunto de elementos. Fazer um programa que leia um
        conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
        mostre o mais caro deles.

Criar um serviço de cálculo:

Computer,890.50
IPhone X,910.00
Tablet,550.00
Most expensive:
IPhone, 910.00

         */
    }
}
