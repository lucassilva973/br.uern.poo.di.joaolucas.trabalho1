package br.uern.di.poo.joaolucas.trabalho1.Quesao438;
import java.util.Scanner;

public class Quesao438 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       // Criptografa
       Criptografa numero = new Criptografa();
       System.out.println("Digite o numero para Criptografar");
       numero.setNum(entrada.nextInt()); 
       
       int vetor[] = numero.crip(numero.transformaArray(numero.getNum()));
       
       numero.imprimevetor(vetor);
        
       System.out.println("");
       
       // Descriptografa
       
       Descriptografa desc = new Descriptografa();
       System.out.println("Digite o numero para Descriptografar");
       desc.setNum(entrada.nextInt());
       int vetor1[] = desc.Descrip(desc.transformaArray(desc.getNum()));
       desc.imprimevetor(vetor1);
    
    }   
 }
