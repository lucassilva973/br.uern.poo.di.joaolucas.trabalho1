
package br.uern.di.poo.joaolucas.trabalho1.Quesao233;

import java.util.Scanner;

public class Quesao233 {
    public double altura;
    public double peso;


    public static void calcula_imc(double pessoa_altura,double pessoa_peso){
		
		double resultado = pessoa_peso/(pessoa_altura*pessoa_altura);
		
		System.out.print("Seu Indice de massa corporal é: ");
		System.out.println(resultado);
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
	}

    public static void main(String[] args) {
        
    	Quesao233 imc_pessoa = new Quesao233();
    	Scanner entrada = new Scanner(System.in);
		
    	System.out.println("Qual sua altura em metros? ");
		imc_pessoa.altura = entrada.nextDouble();
		
		System.out.println("Qual seu peso quilogramas? ");
		imc_pessoa.peso = entrada.nextDouble();
		
		calcula_imc(imc_pessoa.altura,imc_pessoa.peso);
    }
}


