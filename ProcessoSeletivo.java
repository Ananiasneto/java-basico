import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class processoSeletivo{
    public static void main(String[] args) {
     String[] candidatos = {"joao","maria","fernando","rayanne","kappo"};

        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while(continuarTentando && tentativasRealizadas < 3);
        
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO: 3 TENTATIVAS REALIZADAS");
    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados() {
        String[] candidatos = {"joao","maria","fernando","rayanne","kappo"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");
        for(String candidato: candidatos) { 
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }




    static void selecaoCandidados() { 
    String [] candidatos={"joao","maria","fernando","rayanne","kappo","pedro","pec","kaio","matheus"};
    int candidatosSelecionados=0;
    int candidatosAtual=0;
    double salario=2000.0;
    while(candidatosSelecionados < 4 && candidatosAtual < candidatos.length){
        String novo = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.print("o candidado "+novo+" solicitou este valor de salario :"+salarioPretendido);
    
        if(salario>=salarioPretendido){
             System.out.println("O candidato "+novo+" foi selecionado pra vaga");
            candidatosSelecionados++;
        }
        candidatosAtual++;
    }


    }
     static double valorPretendido() { 
         return ThreadLocalRandom.current().nextDouble(1800,2020);
     }
       static void analisarcandidado(double salarioPretendido) { 
           double salario=2000.0;
        if(salarioPretendido<salario){
            System.out.print("LIGAR PARA O CANDIDATO");
        }else if(salarioPretendido==salario){
            System.out.print("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
           System.out.print("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
        
        
    }
}