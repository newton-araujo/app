import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Classe "Conta Terminal"</h1>
 * <p>Essa classe recebe valores informados pelo o usuário e retorna as informações que o usuário solicitou através do metedo <b>'informaçoesDoUsuario'</b>.
 * 
 * <h2>Informações das variaveis do sistema.</h2>
 * <ul>
 * <li>Numero da conta</li>
 * <li>Agencia</li>
 * <li>Nome Cliente</li>
 * <li>Saldo</li>
 * </ul>
 * <br/>
 * 
 * <h2>Informaçoes:
 * 
 * @author Newton Araujo
 * @version 1.0
 * @since 2024
 * 
 */
public class ContaTerminal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" --- Informe os dados abaixo --- ");

        //Numero da conta
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        //Numero da agencia 
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        //Nome do cliente
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        //Saldo
        System.out.println("Saldo: ");
        Double saldo = scanner.nextDouble();

        informacoesDoUsuário(numeroConta, agencia, nomeCliente, saldo);


    }


    /**
     * <h1>Informações do Usuário</h1>
     * <p>Esse metodo tem como função imprimir os dados do usário</p>
     * 
     * 
     * 
     * @author Newton Araujo
     * @version 1.0
     * @since 2024
     * 
     * 
     */
    public static void informacoesDoUsuário(int numeroConta, String agencia, String Cliente, double saldo){
        System.out.println("Olá, Seja bem-vindo " + Cliente + "Sua conta: " + numeroConta + " Agência: " + agencia + " saldo: R$ " + saldo);
    }
}
