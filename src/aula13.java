public class aula13 {
    public static void main(String[] args) {
        /* Herança
        • É um tipo de associação que permite que uma classe herde todos dados e
        comportamentos de outra
        • Definições importantes
        • Vantagens
        • Reuso
        • Polimorfismo
        • Sintaxe
        • class A extends B
        
        Suponha um negócio de banco que possui uma conta comum e uma conta para
        empresas, sendo que a conta para empresa possui todos membros da conta
        comum, mais um limite de empréstimo e uma operação de realizar empréstimo.

        DEFINIÇOES IMPORTANTES HERANÇA:
        Relação "é um"

        Generalização/especialização

        Superclasse (classe base) / subclasse (classe derivada)

        Herança / Extensão

        Herança é uma associação entre calsses (e não entre objetos)



        UPCASTING     AND      DOWNCASTING

        Upcasting
        • Casting da subclasse para superclasse
        • Uso comum: polimorfismo

        Downcasting
        • Casting da superclasse para subclasse
        • Palavra instanceof
        • Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)


        Sobreposição ou sobrescrita
        • É a implementação de um método de uma superclasse na subclasse
        • É fortemente recomendável usar a
        anotação @Override em um método
        sobrescrito
        • Facilita a leitura e compreensão do
        código
        • Avisamos ao compilador (boa prática)


        Sobreposição ou sobrescrita
        • É a implementação de um método de uma superclasse na subclasse
        • É fortemente recomendável usar a
        anotação @Override em um método
        sobrescrito
        • Facilita a leitura e compreensão do
        código
        • Avisamos ao compilador (boa prática)

        Suponha que a operação de
        saque possui uma taxa no valor
        de 5.0. Entretanto, se a conta
        for do tipo poupança, esta taxa
        não deve ser cobrada.
        Como resolver isso?
        Resposta: sobrescrevendo o
        método withdraw na subclasse
        SavingsAccount
        

        Palavra super
        É possível chamar a implementação da superclasse usando a palavra super.
        @Override
        public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
        }
        
        Classes e métodos final
        • Palavra chave: final
        • Classe: evita que a classe seja herdada
        public final class SavingsAccount {
        • Método: evita que o método sob seja sobreposto

        Exemplo - Classe final
        Suponha que você queira evitar que
        sejam criadas subclasses de
        SavingsAccount
        public final class SavingsAccount {
        (...)

        Exemplo - método final
        Suponha que você não queira que o método Withdraw de
        SavingsAccount seja sobreposto
        @Override
        public final void withdraw(double amount) {
        balance -= amount;
        }

        Pra quê?
    • Segurança: dependendo das regras do negócio, às vezes é desejável
    garantir que uma classe não seja herdada, ou que um método não
    seja sobreposto.
    • Geralmente convém acrescentar final em métodos sobrepostos, pois
    sobreposições múltiplas podem ser uma porta de entrada para
    inconsistências

    
    • Performance: atributos de tipo de uma classe final são analisados de
    forma mais rápida em tempo de execução.
    • Exemplo clássico: String


    POLIMORFISMO:

    Em Programação Orientada a Objetos, polimorfismo é recurso que
    permite que variáveis de um mesmo tipo mais genérico possam
    apontar para objetos de tipos específicos diferentes, tendo assim
    comportamentos diferentes conforme cada tipo específico.

    Account x = new Account(1020, "Alex", 1000.0);
    Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
    x.withdraw(50.0);
    y.withdraw(50.0);

    Importante entender
    • A associação do tipo específico com o tipo genérico é feita em tempo de
    execução (upcasting).
    • O compilador não sabe para qual tipo específico a chamada do método
    Withdraw está sendo feita (ele só sabe que são duas variáveis tipo Account):

    Classes abstratas
    • São classes que não podem ser instanciadas
    • É uma forma de garantir herança total: somente subclasses não
    abstratas podem ser instanciadas, mas nunca a superclasse abstrata

    Suponha que em um negócio relacionado a banco, apenas
    contas poupança e contas para empresas são permitidas.
    Não existe conta comum.
    Para garantir que contas comuns não possam ser
    instanciadas, basta acrescentarmos a palavra "abstract" na
    declaração da classe.
        public abstract class Account {
        (...)
    Notação UML: itálico

    Questionamento
    • Se a classe Account não pode ser instanciada, por
    que simplesmente não criar somente SavingsAccount
    e BusinessAccount?
    • Resposta: 
    • Reuso
    • Polimorfismo: a superclasse classe genérica nos permite tratar
    de forma fácil e uniforme todos os tipos de conta, inclusive
    com polimorfismo se for o caso (como fizemos nos últimos
    exercícios). Por exemplo, você pode colocar todos tipos de
    contas em uma mesma coleção.
    • Demo: suponha que você queira: • Totalizar o saldo de todas as contas.
    • Depositar 10.00 em todas as contas.
                        */
    }
}
