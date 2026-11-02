public class Aula16 {
    public static void main(String[] args) {
        /*Java e Orientação a Objetos
        Capítulo: Interfaces
        
        Aviso
        • A partir do Java 8, interfaces podem ter "default methods" ou
        "defender methods"
        • Isso possui implicações conceituais e práticas, que serão discutidas
        mais à frente neste capítulo
        • Primeiro vamos trabalhar com a definição "clássica" de interfaces.
        Depois vamos acrescentar o conceito de default methods.
        
       
        Interface é um tipo que define um conjunto de operações que umaclasse deve implementar.
        A interface estabelece um contrato que a classe deve cumprir.

        interface Shape { 
            double area();
            double perimeter();
            }
            
        Pra quê interfaces?
        • Para criar sistemas com baixo acoplamento e flexíveis.


        Inversão de controle, Injeção de dependência

        • Acoplamento forte
        • A classe RentalService conhece a dependência concreta
        • Se a classe concreta mudar, é preciso mudar a classe RentalService

        class RentalService {
            (...)
            private BrazilTaxService taxService;

         Acoplamento fraco
        • A classe RentalService não conhece a dependência concreta
        • Se a classe concreta mudar, a classe RentalService não muda nada
        class RentalService {
            (...)
            private TaxService taxService;
        
        Injeção de dependência por meio de construtor
        class Program {
            static void Main(string[] args) {
            (...)
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, newBrazilTaxService());
        
        class RentalService {
            private TaxService taxService;
            public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
                this.pricePerHour = pricePerHour;
                this.pricePerDay = pricePerDay;
                this.taxService = taxService;
                }
            • Inversão de controle
            Padrão de desenvolvimento que consiste em retirar da classe aresponsabilidade de instanciar suas 
            dependências.

            Injeção de dependência
        É uma forma de realizar a inversão de controle: um componente externoinstancia a dependência, que é então injetada no objeto "pai". 
        Pode serimplementada de várias formas: 
        • Construtor 
        • Classe de instanciação (builder / factory) 
        • Container / framework

        Herdar vs. cumprir contrato:

        Aspectos em comum entre herança e interfaces
        • Relação é-um
        • Generalização/especialização
        • Polimorfismo

        Diferença fundamental 
        • Herança => reuso
        • Interface => contrato a ser cumprido

        E se eu precisar implementar Shape como interface, porém também quiserdefinir uma estrutura comum reutilizável para todas figuras?


        Herança múltipla e o problema do diamante :

        A herança múltipla pode gerar oproblema do diamante: umaambiguidade causada pelaexistência do mesmo método emmais de uma superclasse.
        Herança múltipla não épermitida na maioria das linguagens!

        (Classe Superior (Device):No nível mais alto, encontra-se a classe base abstrata ou genérica chamada Device.   
        Contém o atributo - serialNumber : String e o método + processDoc(doc : String) : void.  
        
        Classes Intermediárias (Scanner e Printer):Abaixo de Device e herdando dela, estão duas classes: Scanner (à esquerda) e Printer (à direita). 
        As setas em forma de triângulo vazio indicam a herança apontando para Device.   
        A classe Scanner possui o atributo/método + processDoc(doc : String) : void e o método específico + scan() : String.   
        A classe Printer possui o método + processDoc(doc : String) : void e o método específico + print(doc : String) : void.   
        
        Classe Inferior (ComboDevice):Na base do diagrama, a classe ComboDevice herda simultaneamente de ambas as classes intermediárias (Scanner e Printer), 
        o que é representado por duas setas de herança subindo a partir dela.   Esta disposição geométrica forma a figura de um diamante entre as quatro classes, 
        evidenciando o conflito clássico de herança múltipla onde a classe inferior pode receber caminhos ambíguos para os membros da classe original Device)
 */

   }
}
