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
 */
    }
}
