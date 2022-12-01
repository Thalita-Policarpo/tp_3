package br.edu.infnet.tp03_thalita_policarpo.dominio;


public class Aluno extends Pessoa {
    private static float av1;
    private static float av2;
    private static float media;
    private static String status;
    
    public Aluno() {}
    
    
       
    public Aluno(String oNome, String cargoAluno, int aIdentificacao, float atribuicao1, float atribuicao2) {
          	
        Aluno al = new Aluno();
        al.setNome(oNome);
        al.setCargo(cargoAluno);
        al.setIdentificacao(aIdentificacao);
        al.av1 = atribuicao1;
        al.av2 = atribuicao2;
        
    }
    

	public static void setStatus(String status) {
		Aluno.status = status;
	}



	public float mediaAluno() {
        return (Aluno.av1 + Aluno.av2) / 2;
    }
    
    
    public static String status() {   
        if(media >= 4 && media < 7) {
            return status = "Prova final";           
        }else if (media >= 7) {
            return status = "Aprovado";
        }
        return status = "Reprovado";
    }
    
    
    public void dadosAluno() {
    	Aluno.media = mediaAluno();
    	Aluno.status = status();
    	
    	
    	System.out.println( "Nome do aluno: " +
			    			"\n Nota AV1: "+ av1 +
			    			"\n Nota AV2: "+ av2 +
			    			"\n MediaFinal: " + media +
			    			"\n Situacao: " + status);
    }
    
@Override
public String toString() {
	return super.toString() +"Nota da avaliacao 1: " + av1 + "Nota da avaliacao 1: " + av2 +"Media final: " + media;
}
   

public static float getAv1() {
	return av1;
}



public static void setAv1(float av1) {
	Aluno.av1 = av1;
}



public static float getAv2() {
	return av2;
}



public static void setAv2(float av2) {
	Aluno.av2 = av2;
}



public static float getMedia() {
	return media;
}



public static void setMedia(float media) {
	Aluno.media = media;
}



public static String getStatus() {
	return status;
}
}