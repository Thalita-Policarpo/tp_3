package br.edu.infnet.tp03_thalita_policarpo.dominio;

import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;
import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Menus;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Pessoa;


public class Aluno extends Pessoa {
    private static float av1;
    private static float av2;
    private static float media;
    private static String status;
    
    public Aluno() {}
  
    public Aluno(String oNome, String cargoAluno, int aIdentificacao, float nota1, float nota2) {
        super(oNome, cargoAluno,aIdentificacao);  	
        Aluno.av1 = nota1;
        Aluno.av2 = nota2;
        Aluno.media = mediaAluno(Aluno.av1, Aluno.av2);
    	Aluno.status = status(Aluno.media);
    	 
//    	String[] tokens = getNome().split(" ");
//         Aluno.setNome(tokens[0]);
//         
//         for(int i = 1; i < tokens.length-1; i++) {
//         	Aluno.setSobrenome(getSobrenome().append(tokens[i]).append(" "));
//         }
//         
//        Aluno.setUltimoNome(tokens[tokens.length -1]);   
//        Aluno.setNomeCompleto(getNomeCompleto().append(Aluno.getNome()).append(" ").append(Aluno.getSobrenome()).append(Aluno.getUltimoNome())); 	
    }
    

	public float mediaAluno(float nota1, float nota2) {
        return (nota1 + nota2) / 2;
    }
    
    
    public static String status(float aMedia) {   
        if(aMedia >= 4 && aMedia < 7) {
            return "Prova final";           
        }else if (aMedia >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }
    
    @Override
    public void imprimir() {
    	for (int i = 0; i <Constante.lista.size(); i++) {
		    if(Constante.lista.get(i).getCargo() == "aluno") {
        	        
	            System.out.println("Nome do aluno: " + Constante.lista.get(codigoConsulta).getNome()    
				               +"\n Nota da AV1: " + Constante.lista.get(codigoConsulta).Aluno.getAv1()
				               +"\n Nota da AV2: " + Constante.lista[codigoConsulta].getAv2()
				               +"\n Media final: " + Constante.lista[codigoConsulta].getMedia()        
				               +"\n Situacao: " + Constante.lista[codigoConsulta].getStatus()                  
				               +"\n Identificacao: "                 
				               +"\n ");
		    }
    	}
    }

    
@Override
public String toString() {
	return super.toString() +"\nNota da avaliacao 1: " + av1 + "\nNota da avaliacao 2: " + av2 +"\nMedia final: " + media + "\nStatus: "+ status;
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