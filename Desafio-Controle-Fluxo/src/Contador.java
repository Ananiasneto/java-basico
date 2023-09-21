    
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int primeiroParametro = teclado.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int segundoParametro = teclado.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException exception){
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro ) throws ParametrosInvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoParametro - primeiroParametro + 1;
        for (int indice = 0; indice < contagem; indice++) {
            System.out.println("Imprimindo o numero " + (primeiroParametro + indice));
        }
    }
}

