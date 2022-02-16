
package br.uern.di.poo.joaolucas.trabalho1.Quesao438;
import java.util.Arrays;
        
public class Criptografa {
    private int num;
    
    public int getNum() {
	return num;
    }

    public void setNum(int num) {
	this.num = num;
    }
    
    public int [] transformaArray(int num){
        int vetor[] = String.valueOf(num).chars().map(Character::getNumericValue).toArray();
    return vetor;
    }
    //public int array [];
    /*  entrada         soma 7              resto da divisão        troca
        9461   ->      16 11 13 8 ->            6 1 3 8        ->   3 8 6 1
    */
    public int [] crip(int vetor[]){
    
    for (int i=0; i<vetor.length; i++){
        vetor[i] = vetor[i]+7;
        vetor[i] = vetor[i]%10;   
    }
    int aux[] = Arrays.copyOf(vetor, vetor.length);
    
    vetor[0] = aux[2];
    vetor[1]= aux[3];
    vetor[2] = aux[0];
    vetor[3] = aux[1];
        
    
    return vetor;
    }
    
    
    public static void imprimevetor(int vetor[]){
        System.out.println("Criptografado");
        for (int i=0; i<vetor.length; i++){
          System.out.print(vetor[i]);
        }
    }




}
