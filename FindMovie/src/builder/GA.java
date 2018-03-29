package builder;

import java.util.*;
import java.util.ArrayList;;

public class GA {
	List<Filme> pop = new ArrayList<Filme>();
	Database data = new Database();
	int n;
 
	public void init(int tam){
		n = tam; //Tamanho da população
		Random aux = new Random();
		
		int numAleatorio;
		for(int i=0; i<50; i++){
			numAleatorio = aux.nextInt(1000);
			pop.add(data.get(numAleatorio));	
		}			
	}
	
	public int fitnessFunction(){
		for(int i=0; i<n; i++){
			
		}
		
	public void ordenar
	}
	

	
	/*public void crossingOver(GA pop, Filme[] pais, Filme[] filhos){
		// Parte do cursamento, onde o filho recebe metade do pai
		// e metade da mae, onde 0 � o pai e 1 � a mae
		filhos[0].genres = pais[0].genres;
		filhos[1].genres = pais[1].genres;
		filhos[0].cast = pais[0].cast;
		filhos[1].cast = pais[1].cast;
		filhos[0].directors = pais[1].directors;
		filhos[1].directors = pais[0].directors;
		// nao coloquei a nota para tentar ser mais abrangente
		// o objetivo agora � verificar se o filho gerado � um filme
		// para isso vamos pesquisar na popula��o o filme com esse atores 
		
		for(int i = 0; i<pop.pop.size() ;i++ ){
			//if(filhos[0].genres.equals(pop.pop.get(i)) && filhos[0].cast && filhos[0].directors) {
			//}
			System.out.println(pop.pop.get(i));
		}
	}*/
	
	public static void main(){
		
	}
}
