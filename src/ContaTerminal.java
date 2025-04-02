import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        int number = scan.nextInt();
        System.out.println("Agora a sua Agência!");
        String agent = scan.next();
        System.out.println("Seu nome");
        String clientName = scan.next();
        System.out.println("Digite seu saldo");
        double balance = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f%n já está disponível para saque.", clientName, agent, number, balance);
        scan.close();
    }
}
