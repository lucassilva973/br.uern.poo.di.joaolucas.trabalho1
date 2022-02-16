package br.uern.di.poo.joaolucas.trabalho1.Quesao531;


public class Questionario {
    private int alter1;
    private int alter2;
    private int alter3;
    private int alter4;
    private int alter5;
    
    private boolean result1;
    private boolean result2;
    private boolean result3;
    private boolean result4;
    private boolean result5;
    
    // gets e sets
        public int getAlter1() {
		return alter1;
	}
	public void setAlter1(int alter1) {
		this.alter1 = alter1;
	}
	public int getAlter2() {
		return alter2;
	}
	public void setAlter2(int alter2) {
		this.alter2 = alter2;
	}
	public int getAlter3() {
		return alter3;
	}
	public void setAlter3(int alter3) {
		this.alter3 = alter3;
	}
	public int getAlter4() {
		return alter4;
	}
	public void setAlter4(int alter4) {
		this.alter4 = alter4;
	}
	public int getAlter5() {
		return alter5;
	}
	public void setAlter5(int alter5) {
		this.alter5 = alter5;
	}
	public boolean getResult1() {
		return result1;
	}
	public void setResult1(boolean result1) {
		this.result1 = result1;
	}
	public boolean getResult2() {
		return result2;
	}
	public void setResult2(boolean result2) {
		this.result2 = result2;
	}
	public boolean getResult3() {
		return result3;
	}
	public void setResult3(boolean result3) {
		this.result3 = result3;
	}
	public boolean getResult4() {
		return result4;
	}
	public void setResult4(boolean result4) {
		this.result4 = result4;
	}
	public boolean getResult5() {
		return result5;
	}
	public void setResult5(boolean result5) {
		this.result5 = result5;
	}
  
    public static void MostraQuest1(){
    	System.out.println("Q1- O aquecimento global é um processo caracterizado pelo aumento da temperatura média do planeta.\nEle é consequência da intensificação de qual fenômeno natural do planeta?");
        System.out.println("1) Destruição da camada de ozônio");
        System.out.println("2) Inversão térmica");
        System.out.println("3) Efeito estufa");
        System.out.println("4) Chuva ácida");  
    }
    public static boolean RespQuest1(int alternativa){
      if (alternativa==3)
            return true;
        else
            return false;   
    }
    ///
    public static void MostraQuest2(){
    	System.out.println("Q2- O aquecimento global acarretará uma série de alterações no planeta ao longo do tempo.\nAnalise as alternativas abaixo e marque aquela que não indica uma consequência desse grave\naumento da temperatura do planeta.");
        System.out.println("1) Derretimento das calotas polares");
        System.out.println("2) Aumento da ocorrência de terremotos");
        System.out.println("3) Mudanças nos regimes de chuvas");
        System.out.println("4) Aumento dos níveis dos oceanos");     
    }
    public static boolean RespQuest2(int alternativa){
      if (alternativa==2)
            return true;
        else
            return false;
    }
    ///
    public static void MostraQuest3(){
    	System.out.println("Q3- O aquecimento global é considerado por inúmeros cientistas como um fenômeno provocado pelo homem\nem função do desequilíbrio causado no ciclo do carbono. Considerando que esses cientistas\nestejam certos, é correto afirmar que:");
        System.out.println("1) Mecanismos que aumentam o sequestro de carbono por organismos autotróficos reduzem a disponibilidade do monóxido de carbono na atmosfera, contribuindo para a diminuição do efeito estufa.");
        System.out.println("2) A liberação do gás carbônico na atmosfera em decorrência de atividades humanas, como a queima de combustíveis fósseis, é feita a uma velocidade muito maior do que sua assimilação pela fotossíntese.");
        System.out.println("3) O aumento da concentração de gás carbônico na atmosfera está sendo provocado, principalmente, pela diminuição no sequestro do carbono pelos organismos fotossintetizantes.");
        System.out.println("4) As queimadas florestais são a principal causa do aquecimento global.");
    }
    public static boolean RespQuest3(int alternativa){
      if (alternativa==2)
            return true;
        else
            return false;
    }
    ///
    public static void MostraQuest4(){
    	System.out.println("Q4- Cientistas acreditam que o reflorestamento e o plantio de árvores em áreas sem vegetação podem contribuir\npara minimizar o aquecimento global. redução desse aquecimento ocorreria porque:");
        System.out.println("1) diminuiria a quantidade de dióxido de carbono na atmosfera, que seria utilizado pela fotossíntese.");
        System.out.println("2) aumentaria a quantidade de dióxido de carbono na atmosfera, liberado pela respiração celular.");
        System.out.println("3) a expansão das florestas seria inibida, em longo prazo, pelo excesso de gás carbônico liberado.");
        System.out.println("4) diminuiria o efeito estufa, com a liberação de gás carbônico, em decorrência da expansão da cobertura vegetal.");
    }
    public static boolean RespQuest4(int alternativa){
      if (alternativa ==1)
            return true;
        else
            return false;
    }
    ///
   public static void MostraQuest5(){
	   System.out.println("Q5- A biodiversidade é afetada de diferentes formas pelo aquecimento global.\nSobre o tema, analise as alternativas abaixo e marque a incorreta.");        
       System.out.println("1) Muitas espécies podem entrar em extinção em decorrência do aquecimento global.");
       System.out.println("2) O urso-polar é um grande símbolo na luta contra o aquecimento global, em decorrência do aumento exagerado de indivíduos, causado pelo aumento de alimentos disponíveis no oceano, fato que leva à competição.");
       System.out.println("3) O aquecimento global pode desencadear um aumento de epidemias no planeta, uma vez que ambientes quentes favorecem a multiplicação de vários vetores, como o Aedes aegypti.");
       System.out.println("4) Secas e chuvas inesperadas podem afetar a reprodução de uma série de espécies de plantas.");
    }
   public static boolean RespQuest5(int alternativa){
      if (alternativa==2)
            return true;
      else
            return false;
    }

    public static void resposta(boolean q1,boolean q2,boolean q3,boolean q4,boolean q5){
        int i=0;
        if (q1==true)
            i+=1;
            
        
        if (q2==true)
            i+=1;
            
        
        if (q3==true)
            i+=1;
            
            
        if (q4==true)
            i+=1;
            
        
        if (q5==true)
            i+=1;
              
           
        switch(i){
            case 0:
               System.out.println("Ã‰ o momento de aprimorar seu conhecimento sobre o aquecimento global");
               System.out.println("0 acerto");
            break;
            
            case 1:
               System.out.println("Ã‰ o momento de aprimorar seu conhecimento sobre o aquecimento global"); 
               System.out.println("1 acerto");
            break;
                
            case 2:
                System.out.println("Ã‰ o momento de aprimorar seu conhecimento sobre o aquecimento global");
                System.out.println("2 acertos");
            break;
                
            case 3:
                System.out.println("Ã‰ o momento de aprimorar seu conhecimento sobre o aquecimento global");
                System.out.println("3 acertos");
            break;
            
            case 4:
                System.out.println("Muito bom");
                System.out.println("4 acertos");
            break;
            
            case 5:
                System.out.println("Excelente");
                System.out.println("5 acertos");
            break;
        }
        System.out.println("execicio retirado do site: ");
        System.out.println("https://exercicios.mundoeducacao.uol.com.br/exercicios-biologia/exercicios-sobre-aquecimento-global-biodiversidade.htm#resposta-6192");
    }
    



}