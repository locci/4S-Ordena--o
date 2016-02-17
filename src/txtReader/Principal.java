package txtReader;

import java.io.IOException;

	/**
	 * Essa classe possui apenas o objetivo de obter os métodos da classe TXTReader
	 * 
	 * @author Kelvy
	 * @param args
	 * @throws IOException
	 */
public class Principal 
{

	public static void main(String[] args) throws IOException 
	{
		TXTReader tr = new TXTReader();
		tr.readLines();
	}
}
