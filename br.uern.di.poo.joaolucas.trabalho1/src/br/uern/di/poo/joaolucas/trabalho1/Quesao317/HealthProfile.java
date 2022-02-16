
package br.uern.di.poo.joaolucas.trabalho1.Quesao317;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HealthProfile {
    /// atributos
    private String nome;
    private String sobrenome;
    private String sexo;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private double peso;
    
    /// construtor
    public HealthProfile(String nome, String sobrenome,String sexo, int dia, int mes, int ano, double altura, double peso) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
	this.altura = altura;
	this.peso = peso;
    }
    
    // gets e sets
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
    public String getSexo() {
    return sexo;
    }
    public void setSexo(String sexo) {
    this.sexo = sexo;
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
    public double getAltura() {
    return altura;
    }
    public void setAltura(double altura) {
    this.altura = altura;
    }
    public double getPeso() {
    return peso;
    }
    public void setPeso(double peso) {
    this.peso = peso;
    }

    /// metodos
    public static int calula_idade(int dia,int mes,int ano){
		
	Calendar calendar = new GregorianCalendar();
	int dia_atual = calendar.get(Calendar.DAY_OF_MONTH);
	int mes_atual = calendar.get(Calendar.MONTH);
	int ano_atual = calendar.get(Calendar.YEAR);
		
	int idade=ano_atual-ano-1;
	if(mes>mes_atual && dia>dia_atual)	
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
    
    public static double calcula_imc(double pessoa_altura,double pessoa_peso){	
	double resultado = pessoa_peso/(pessoa_altura*pessoa_altura);
        return resultado;
    }
    
    
    
		
}
    
    
            
            
            
            

