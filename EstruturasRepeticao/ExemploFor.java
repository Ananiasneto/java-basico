import java.util.Scanner;

public class ExemploFor{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("seu contador iniciara em 0");
        System.out.print("em qual numero ele ira estourar?");
        int contador=teclado.nextInt();
        for(int n=0;n<contador;n++){
           System.out.print(n+"-"); 
           if(n==contador-1){
               System.out.print("e boomm!!!!!!!!!");
           }
        }
    }
}