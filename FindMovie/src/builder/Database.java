package builder;// pacode que criamos

import java.util.*;// biblioteca que ser�o usadas 
import java.io.*; // biblioteca para leitura e eescrita de arquivos
import java.io.FileReader;

public class Database {
	List<Filme> pop = new ArrayList<Filme>(); // Lista de filmes que representa nossa popula��o
	

public void populate(){
		// endere�o do arquivo onde encontramos os filmes series etc  
		String filmes = "C:/Users/lucas/Documents/MovieRecommend/FindMovie/filmes.tsv"; 
		// base de leitura
		BufferedReader br = null; 
		
		// line � a linha que ser� lida
		String line = ""; 
		
		//o \t representa a tabula��o em java, portanto essa variavel � justamente 
		// para serparar a leitura
		String tsvSplitBy = "\t"; 
		
		try{
			//inicializando a leitura do arquivo
			br = new BufferedReader(new FileReader(filmes));
			
			//S� para mostrar quando come�a a ler
			System.out.println("Leitura de arquivo");
			
			String info[] = null;
			int i=0;
			line = br.readLine();
			while((( line = br.readLine()) != null )&& i<1000000){
				// leitura da linha
				Filme toadd = new Filme();
				//Divide a linha em vetor separados pelo tab
				info = line.split(tsvSplitBy);
				i++;
				//System.out.println(info[0]);
				toadd.genres.add(info[8]);
				toadd.cast.add(info[1]);
				toadd.cod = info[0];
				toadd.directors.add(info[3]);
				toadd.title = info[2];
				pop.add(toadd);
			}
			
			System.out.println("O filme � : " + pop.get(240280).toString());
			//S� para mostrar que finalizou a leitura
			System.out.println("acabou a escrita" );
			
		}
		
		// tratamento para saber se abriu e se existe o arquivo
		catch(FileNotFoundException e){
			
			//emite um erro
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		// finaliza 
		finally{
			if(br != null){
				try{
					// fecha o arquivo
					
					br.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
	}
public Filme get(int index) {
	Filme got;
	got = this.pop.get(index);
	return got;
}
}