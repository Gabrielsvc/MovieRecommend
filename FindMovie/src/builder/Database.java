package builder;

import java.util.*;
import java.io.*;
import java.io.FileReader;

public class Database {
	List<Filme> pop = new ArrayList<Filme>();
	

public void populate(){
		String filmes = "titles.tsv";
		BufferedReader br = null;
		String line = "";
		int numberline = 0;
		String tsvSplitBy = "\t";
		PrintWriter filmesSemBaboseira = new PrintWriter("filmes.tsv","UTF-8");
		try{
			br = new BufferedReader(new FileReader(filmes));
			while((line = br.readLine()) != null){
				String[] info = line.split(tsvSplitBy);
				if(info[1] != "movie")
					continue;
				filmesSemBaboseira.println(line);
				}
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(br != null){
				try{
					br.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
	}
}