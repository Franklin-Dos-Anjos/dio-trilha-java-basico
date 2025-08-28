public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //todo:Conhecer e importar a classe Scanner
        //Exibir mensagem ao usuário
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        
        int numeroConta ;
        String agencia ;
        String nomeCliente;
        double saldo;
        
        System.out.println("Por favor, digite o número da conta: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();  
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo da conta ");
        saldo = scanner.nextDouble();  
        scanner.close();    
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        

        
    }
}
