import java.util.Scanner; 
 
public class ContaTerminal {
 
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nomeCliente=teclado.nextLine();
        
        
        System.out.println("digite o numero da conta");
        int numeroConta=teclado.nextInt();

        
        System.out.println("digite sua agencia");
        String agencia=teclado.next();
        
        System.out.println("digite o saldo da conta");
        Float saldo=teclado.nextFloat();
  
  System.out.println("Ola "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia e "+agencia+", conta "+numeroConta+ "e seu saldo "+saldo+" ja esta disponivel para saque");


  }
 
}