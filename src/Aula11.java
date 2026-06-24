import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Conceitos importantes
        • Data-[hora] local:
        ano-mês-dia-[hora] sem fuso horário
        [hora] opcional • Data-hora global:
        ano-mês-dia-hora com fuso horário
        • Duração:
        tempo decorrido entre duas data-horas
         Quando usar?
        • Data-[hora] local:
        Quando o momento exato não interessa a pessoas de outro fuso horário.
        Uso comum: sistemas de região única, Excel.
        Data de nascimento: "15/06/2001"
        Data-hora da venda: "13/08/2022 às 15:32" (presumindo não interessar fuso horário) 

        • Data-hora global:
        Quando o momento exato interessa a pessoas de outro fuso horário.
        Uso comum: sistemas multi-região, web.
        2022-07-23T14:30:00Z
        Quando será o sorteio? "21/08/2022 às 20h (horário de São Paulo)"
        Quando o comentário foi postado? "há 17 minutos"
        Quando foi realizada a venda? "13/08/2022 às 15:32 (horário de São Paulo)"
        Início e fim do evento? "21/08/2022 às 14h até 16h (horário de São Paulo) 

        Timezone (fuso horário) • GMT - Greenwich Mean Time
        • Horário de Londres
        • Horário do padrão UTC - Coordinated Universal Time
        • Também chamado de "Z" time, ou Zulu time
        • Outros fuso horários são relativos ao GMT/UTC: • São Paulo: GMT-3
        • Manaus: GMT-4
        • Portugal: GMT+1
        • Muitas linguagens/tecnologias usam nomes para as timezones: • "US/Pacific"
        • "America/Sao_Paulo"
        • etc.

        Padrão ISO 8601
        Data-[hora] local:
        2022-07-21
        2022-07-21T14:52
        2022-07-22T14:52:09
        2022-07-22T14:52:09.4073
        Data-hora global:
        2022-07-23T14:52:09Z
        2022-07-23T14:52:09.254935Z
        2022-07-23T14:52:09-03:00


        Operações importantes com data-hora
        • Instanciação
        • (agora) ➞ Data-hora
        • Texto ISO 8601 ➞ Data-hora
        • Texto formato customizado ➞ Data-hora
        • dia, mês, ano, [horário] ➞ Data-hora local • Formatação
        • Data-hora ➞ Texto ISO 8601
        • Data-hora ➞ Texto formato customizado

        Operações importantes com data-hora
        • Converter data-hora global para local • Data-hora global, timezone (sistema local) ➞Data-hora local 
        • Obter dados de uma data-hora local • Data-hora local ➞ dia, mês, ano, horário
        • Cálculos com data-hora
        • Data-hora +/- tempo ➞ Data-hora
        • Data-hora 1, Data-hora 2 ➞ Duração

*/
    }
}
