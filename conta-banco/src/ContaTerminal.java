import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
                // Criação do objeto Scanner para receber dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e armazenamento dos dados
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer após a leitura de número

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}
