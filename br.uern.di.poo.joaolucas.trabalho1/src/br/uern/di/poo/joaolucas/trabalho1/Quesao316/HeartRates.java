package br.uern.di.poo.joaolucas.trabalho1.Quesao316;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HeartRates {

	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	
	public static int calula_idade(int dia,int mes,int ano){
		/*
		 * pegar a data do sistema, calcular a idade, compara se o dia e mes são < ou >= assim acrestando +1 ou não
		 */
		Calendar calendar = new GregorianCalendar();
		int dia_atual = calendar.get(Calendar.DAY_OF_MONTH);
		int mes_atual = calendar.get(Calendar.MONTH);
		int ano_atual = calendar.get(Calendar.YEAR);
		
		int idade=ano_atual-ano-1;
		if(mes>mes_atual && dia>dia_atual)	//02 >= 02  // 09 >= 09
			idade = idade;
		else 
			idade=idade+1;
		return idade;	
	}
	
	
	public static int freq_cardic_max(int pessoa_idade) {
		int frequencia = 220 - pessoa_idade;
		
		return frequencia;
	}
	
	public static double [] freq_alvo(int freq_maxima) {
		
		double freq1 = freq_maxima*0.50;
		double freq2 = freq_maxima*0.85;
		double array[] = {freq1, freq2};
		
		return array;
	}
	
	
	
	
	

}
