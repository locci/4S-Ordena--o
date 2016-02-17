package txtReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TXTReader {
	
	Path path;
	
	public TXTReader() {
	this.path = Paths.get("C:/Users/Kelvy/Desktop/Documentos/textFile.txt");
	}
	
	/**
	 * Lê o texto todo como uma array de bytes
	 */
	void readTextInBytes() throws IOException
	{	
		byte[] textInBytes = Files.readAllBytes(path);
		System.out.println(new String(textInBytes));
	}
	
	/**
	 * Esceve linha por linha de texto no arquivo
	 */	
	void writeString(String text) throws IOException
	{
	BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
	writer.write(text+"\n");
	writer.flush();		
	}
	
	
	/**
	 * Lê linha por linha do arquivo
	 */
	void readLines() throws IOException
	{
	BufferedReader reader = Files.newBufferedReader(path);
	String line 		  = null;
	while((line 		  = reader.readLine()) != null){
		System.out.println(line);
		}
	}
}

