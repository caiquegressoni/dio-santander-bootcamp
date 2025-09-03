package candidaturas;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivos {
    public static void main(String args[]){
        selecaoCandidatos();

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Maria", "João", "José", "Ana", "Clara", "Juliana", "Paulo", "Pedro", "Carla", "Renata"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato ", candidato, " solicitou este valor de salário: %.2f%n", salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
                
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }
}
