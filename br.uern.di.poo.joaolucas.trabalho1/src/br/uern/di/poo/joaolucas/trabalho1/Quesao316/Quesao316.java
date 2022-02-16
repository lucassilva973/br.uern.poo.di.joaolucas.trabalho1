
package br.uern.di.poo.joaolucas.trabalho1.Quesao316;


import java.util.Scanner;

public class Quesao316 {

    public static void main(String[] args) {
	HeartRates pessoa = new HeartRates(null, null, 0, 0, 0);
	Scanner entrada = new Scanner(System.in);
		
	System.out.println("Qual seu nome?");
	pessoa.setNome(entrada.nextLine()); 
		
	System.out.println("Qual seu sobrenome?");
	pessoa.setSobrenome(entrada.nextLine());
		
	System.out.println("Qual o dia de nascimento?");
	pessoa.setDia(entrada.nextInt());
		
	System.out.println("Qual o m�s de nascimento?");
	pessoa.setMes(entrada.nextInt());
		
	System.out.println("Qual o ano de nascimento?");
	pessoa.setAno(entrada.nextInt());
		
	/// metodos utilizados
		
	int idade = pessoa.calula_idade(pessoa.getDia(), pessoa.getMes(), pessoa.getAno());
	int cardiaca_maxima = pessoa.freq_cardic_max(idade);
	double vetor[]= pessoa.freq_alvo(cardiaca_maxima);
		
	// Impress�o na tela
		
	System.out.println("seu nome �: " + pessoa.getNome());
	System.out.println("seu sobrenome �: " + pessoa.getSobrenome());
	System.out.println("Data de nascimento: " + pessoa.getDia() + "/" + pessoa.getMes() + "/" + pessoa.getAno());
	System.out.println("Sua idade: " + idade);
	System.out.println("Frequ�ncia card�aca m�xima: " + cardiaca_maxima);
	System.out.println("Frequ�ncia card�aca alvo: " + vetor[0] + " a " + vetor[1] );
		
	}

}
