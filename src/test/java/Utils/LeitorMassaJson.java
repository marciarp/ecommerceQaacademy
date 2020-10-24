package Utils;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;

public class LeitorMassaJson {
	// create Gson instance
    Gson gson = new Gson();
    Reader reader;
    Map<String, String> map;
    

	public void main(String[] args) throws IOException {

		leitorJson();
	    gravaArquivoJson();
	    
	}
/**
 * grava arquivos json no diretorio correspondente
 * @throws IOException
 */
	public  void gravaArquivoJson() throws IOException {
		FileWriter writer = new FileWriter("."+File.separator+"dados_testes_copy.json");
	    gson.toJson(map,writer);
	    writer.flush();
	    writer.close();
	}
	
	/**
	 * faz a leitura de um arquivo json
	 * @throws IOException
	 */
	public void leitorJson() throws IOException {

	    // Leitor do Java
	    reader = new FileReader("."+File.separator+"dados_testes.json");
	    // convert JSON file to map
	    map = gson.fromJson(reader, Map.class);
	    exibirmapJson(map);
	    System.out.println(map.get("url"));

	    // close reader
	    reader.close();

	}

	/**
	 * exibe todos os registros do json lido
	 * @param map
	 */
	public void exibirmapJson(Map<String, String> map) {
		// print map entries
	    for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + "=" + entry.getValue());
	    }
	}
	
	public String getMassa (String chave) {
	return map.get(chave);	
		
	}

	

}