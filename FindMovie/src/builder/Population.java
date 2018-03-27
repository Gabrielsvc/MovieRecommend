package builder;

import java.util.*;
import java.util.ArrayList;;

public class Population {
	List<Filme> pop = new ArrayList<Filme>();
 
	
	public void setPop(Population pop, Filme e){
		pop.pop.add(e);
	}
	public void crossingOver(Population pop, Filme[] pais, Filme[] filhos){
		// Parte do cursamento, onde o filho recebe metade do pai
		// e metade da mae, onde 0 é o pai e 1 é a mae
		filhos[0].genres = pais[0].genres;
		filhos[1].genres = pais[1].genres;
		filhos[0].cast = pais[0].cast;
		filhos[1].cast = pais[1].cast;
		filhos[0].directors = pais[1].directors;
		filhos[1].directors = pais[0].directors;
		// nao coloquei a nota para tentar ser mais abrangente
		// o objetivo agora é verificar se o filho gerado é um filme
		// para isso vamos pesquisar na população o filme com esse atores 
		
		for(int i = 0; i<pop.pop.size() ;i++ ){
			//if(filhos[0].genres.equals(pop.pop.get(i)) && filhos[0].cast && filhos[0].directors) {
			//}
			System.out.println(pop.pop.get(i));
		}
	}
	public void selecao(Filme[] pais,Filme[] filhos){
			filhos[0].genres = pais[0].genres;
			filhos[1].genres = pais[1].genres;
			filhos[0].cast = pais[0].cast;
			filhos[1].cast = pais[1].cast;
			
	}
}
