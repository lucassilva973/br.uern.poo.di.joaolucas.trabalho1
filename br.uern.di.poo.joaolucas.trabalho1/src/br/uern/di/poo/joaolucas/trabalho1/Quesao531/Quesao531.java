package br.uern.di.poo.joaolucas.trabalho1.Quesao531;
import java.util.Scanner;

public class Quesao531 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Questionario pessoa1 = new Questionario();
        
        pessoa1.MostraQuest1();
        pessoa1.setAlter1(entrada.nextInt());
        pessoa1.setResult1(pessoa1.RespQuest1(pessoa1.getAlter1()));
        
        pessoa1.MostraQuest2();
        pessoa1.setAlter2(entrada.nextInt());
        pessoa1.setResult2(pessoa1.RespQuest2(pessoa1.getAlter2()));
        
        pessoa1.MostraQuest3();
        pessoa1.setAlter3(entrada.nextInt());
        pessoa1.setResult3(pessoa1.RespQuest3(pessoa1.getAlter3()));
        
        pessoa1.MostraQuest4();
        pessoa1.setAlter4(entrada.nextInt());
        pessoa1.setResult4(pessoa1.RespQuest4(pessoa1.getAlter4()));
        
        pessoa1.MostraQuest5();
        pessoa1.setAlter5(entrada.nextInt());
        pessoa1.setResult5(pessoa1.RespQuest5(pessoa1.getAlter5()));
        
        
        pessoa1.resposta(pessoa1.getResult1(), pessoa1.getResult2(), pessoa1.getResult3(), pessoa1.getResult4(), pessoa1.getResult5());
       
    }
}
