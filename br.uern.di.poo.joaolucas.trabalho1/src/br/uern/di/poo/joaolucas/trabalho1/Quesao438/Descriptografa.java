
package br.uern.di.poo.joaolucas.trabalho1.Quesao438;
import java.util.Arrays;

public class Descriptografa {
    private int num;
    
    public int getNum() {
	return num;
    }

    public void setNum(int num) {
	this.num = num;
    }
    
    public int [] transformaArray(int num){
        int vetor[] = String.valueOf(num).chars().map(Character::getNumericValue).toArray();
        int vetoraux[] = {0,0,0,0};
        if(vetor.length < 4){
            vetoraux[0] = 0;
            vetoraux[1] = vetor[0];
            vetoraux[2] = vetor[1];
            vetoraux[3] = vetor[2];
            return vetoraux;
        }else
            return vetor;
    }
    /* crip        inverte            -7           <0 soma10            descrip
       0189  ->  8901     ->    12-7-6  ->   1234  ->             9461
    */
    
    
    
    public int [] Descrip(int vetor[]){
          
        int aux[] = Arrays.copyOf(vetor, vetor.length);
        vetor[0] = aux[2];
        vetor[1]= aux[3];
        vetor[2] = aux[0];
        vetor[3] = aux[1];
        for (int i=0; i<vetor.length; i++){
          vetor[i]= vetor[i]-7;
          if (vetor[i]<0)
              vetor[i]+=10;
        
        }
    return vetor;    
    }
    public static void imprimevetor(int vetor[]){
        System.out.println("Descriptografado");
        for (int i=0; i<vetor.length; i++){
          System.out.print(vetor[i]);
        }
    }
}
