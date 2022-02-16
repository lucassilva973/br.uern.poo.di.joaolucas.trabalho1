package br.uern.di.poo.joaolucas.trabalho1.Quesao235;
import java.util.Scanner;

public class Quesao235 {
    private double KmTotal;
    private double precoGasolina;
    private double kmMedioLitro;
    private double taxaEstacionamento;
    private double pedagioDia;
    
    public double getKmTotal() {
    	return KmTotal;
    }
    public void setKmTotal(double kmTotal) {
    	KmTotal = kmTotal;
    }
    public double getPrecoGasolina() {
	return precoGasolina;
    }
    public void setPrecoGasolina(double precoGasolina) {
      	this.precoGasolina = precoGasolina;
    }
    public double getKmMedioLitro() {
    	return kmMedioLitro;
    }
    public void setKmMedioLitro(double kmMedioLitro) {
    	this.kmMedioLitro = kmMedioLitro;
    }
    public double getTaxaEstacionamento() {
    	return taxaEstacionamento;
    }
    public void setTaxaEstacionamento(double taxaEstacionamento) {
    	this.taxaEstacionamento = taxaEstacionamento;
    }
    public double getPedagioDia() {
    	return pedagioDia;
    }
    public void setPedagioDia(double pedagioDia) {
    	this.pedagioDia = pedagioDia;
    }
    
        public static double CustoParaDirigir(double km, double precogas,double kmPLitro, double estacionamento, double pedagio){
            double custo;
            
            custo = ((precogas/kmPLitro)*km) + estacionamento + pedagio;
            
            return custo;
        }
     
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Quesao235 p1 = new Quesao235();
                
        System.out.println("Digite a quantidade Quilometros totais dirigidos");
        p1.setKmTotal(entrada.nextDouble());
        
        System.out.println("Digite o preço por litro da gasolina");
        p1.setPrecoGasolina(entrada.nextDouble());
        
        System.out.println("Digite quantos KM por litro o carro consome");
        p1.setKmMedioLitro(entrada.nextDouble());
        
        System.out.println("Digite quanto foi o estacionamento");
        p1.setTaxaEstacionamento(entrada.nextDouble());
        
        System.out.println("Digite quanto foi a taxa de pedagio");
        p1.setPedagioDia(entrada.nextDouble());
        
        double valor = p1.CustoParaDirigir(p1.getKmTotal(), p1.getPrecoGasolina(), p1.getKmMedioLitro(), p1.getTaxaEstacionamento(), p1.getPedagioDia());
    
        System.out.println("O valor diario para dirigir é: " + valor);
        System.out.println("Usando a Faixa solidária o preço diario com mais 1 pessoa no veiculo seria: " + (valor/2));
        System.out.println("Usando a Faixa solidária o preço diario com mais 2 pessoa no veiculo seria: " + (valor/3));
        System.out.println("Usando a Faixa solidária o preço diario com mais 3 pessoa no veiculo seria: " + (valor/4));
        System.out.println("Usando a Faixa solidária o preço diario com mais 4 pessoa no veiculo seria: " + (valor/5));
        
    }
}
