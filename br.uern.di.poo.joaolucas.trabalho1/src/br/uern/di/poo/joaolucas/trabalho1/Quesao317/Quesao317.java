
package br.uern.di.poo.joaolucas.trabalho1.Quesao317;
import java.util.Scanner;

public class Quesao317 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HealthProfile pessoa = new HealthProfile(null,null,null,0,0,0,0.0,0.0);
        
        System.out.println("Qual seu nome?");
		pessoa.setNome(entrada.nextLine()); 
			
		System.out.println("Qual seu sobrenome?");
		pessoa.setSobrenome(entrada.nextLine());
		
        System.out.println("Qual seu sexo?");
        pessoa.setSexo(entrada.nextLine());
        
		System.out.println("Qual o dia de nascimento?");
		pessoa.setDia(entrada.nextInt());
			
		System.out.println("Qual o mês de nascimento?");
		pessoa.setMes(entrada.nextInt());
			
		System.out.println("Qual o ano de nascimento?");
		pessoa.setAno(entrada.nextInt());
        
        System.out.println("Qual o sua altura em metros?");
        pessoa.setAltura(entrada.nextDouble());
        
        System.out.println("Qual o peso em quilogramas?");
        pessoa.setPeso(entrada.nextDouble());
    
        ///uso dos metodos 
        
        int idade = pessoa.calula_idade(pessoa.getDia(), pessoa.getMes(), pessoa.getAno());
        int cardiaca_maxima = pessoa.freq_cardic_max(idade);
        double vetor[]= pessoa.freq_alvo(cardiaca_maxima);
        double imc = pessoa.calcula_imc(pessoa.getAltura(),pessoa.getPeso());
        
        // impressÃ£o
        
        System.out.println("seu nome: " + pessoa.getNome());
        System.out.println("seu sobrenome: " + pessoa.getSobrenome());
        System.out.println("seu sexo: " + pessoa.getSexo());
        System.out.println("Data de nascimento: " + pessoa.getDia() + "/" + pessoa.getMes() + "/" + pessoa.getAno());
        System.out.println("Sua altura: " + pessoa.getAltura());
        System.out.println("Seu peso: " + pessoa.getPeso());
        System.out.println("Sua idade: " + idade);
        System.out .println("Seu indice de massa corporal: " + imc);
        System.out.println("Frequência cardíaca máxima: " + cardiaca_maxima);
        System.out.println("Frequência cardíaca alvo: " + vetor[0] + " a " + vetor[1] );
        
        /// graficos de valores 
        System.out.println("");
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
    }
}
