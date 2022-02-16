package br.uern.di.poo.joaolucas.trabalho1.Quesao439;


public class Quesao439 {
    public static void main(String[] args){
        double percentual_crescimento = 1.1 ;
        double numero_habitantes = 7940222500.0;
        
        System.out.println("Numero de habitantes: 7940222500");
        System.out.println("Percentual de crescimento anual: 1.1%");
        System.out.println("Ano\t\tPopulação esperada\t\tAumento anual");
        
        double guarda_habitantes_inicial=numero_habitantes;
        int guarda_i=0;
        int vetor[]= new int[75];
        int j=0;
        for (int i=1;i<=75;i++){
            double taxa_crescimento = numero_habitantes*(1.0+(percentual_crescimento/100));
            double taxa_ano = numero_habitantes*(percentual_crescimento/100);
            numero_habitantes = taxa_crescimento;
            String taxa_cres = Double.toString(taxa_crescimento);
            String taxa_a =Double.toString(taxa_ano);
            System.out.println(i+"\t\t"+taxa_cres+"\t\t"+taxa_a);
            
            if((guarda_habitantes_inicial*2)<=taxa_crescimento){
                guarda_i = i;
                vetor[j] = guarda_i;
                j++;
            }
            
        }
        if(vetor[0]==0)
            System.out.println("A população não dobrara de tamanho");
        else
            System.out.println("A população dobrara de tamanho no ano: "+ vetor[0]);
    }
}
