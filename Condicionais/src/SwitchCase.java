public class SwitchCase{
    public static void main(String[] args) {
       String tamanho ="P";
       switch ( tamanho ){
           case "M":{
               System.out.println("medio");
               break;

           }
           case "P":{
               System.out.println("pequeno");
           break;
           }
           case "G":{
               System.out.println("grande");
           break;
           }
           default:
           System.out.println("indefinido");
       }
    }
}
