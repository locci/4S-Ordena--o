package ep4;

	/**
	 * Classe Microondas Padrão
	 * @author Kelvy
	 *
	 */

public class CC52258342 {
	
	int tempoMaxCosimento = 100;
	int potenciaMax = 100;
	
	int descongelar(String value){
		return 1;
	}	

	int cozinhar(String value){
		return 1;
	}

	int timer(String value){
		return 1;
		
	}
	
	int pipoca(String value){
		return 1;
		
	}
	
	int cha(String value){
		return 1;
		
	}
	
	int grelhar(String value){
		return 1;
	}
}

	/**
	 * Classe Potente
	 * @author Kelvy
	 *
	 */

 	class MicroondasPotente extends CC52258342 {
	
	
	
	int cozimentoAlto(String value){
		return 1;		
	}

}
 	
 	/**
 	 * 
 	 * Interface Potenciador que será implementada futuramente por MicroondasPotente
 	 * @author Kelvy
 	 */
 	interface Potenciador {
 		
 		int superDescongelante(String value);
 		int superTostado(String value);

 	}
	
 	

 	/**
 	 * Classe Economico
 	 * @author Kelvy
 	 *
 	 */

 	class MicroondasEconomico extends AbstractMicroondasEconomico{
	
	int cozimentoBaixo(String value){
		return 1;
		
	}

	@Override
	int pesarPeixe(String value) {
		return 1;
	}
	
}
	/**
	 * Classe AbstractEconomico
	 * @author Kelvy
	 *
	 */
 	abstract class AbstractMicroondasEconomico extends CC52258342{
 			
 		abstract int pesarPeixe(String value);
 		
 		int pesarCarne(String value){
 			return 1;
 			
 		}
 		int pesarAves(String value){
 			return 1;
 			
 		}
}

 
 
 
 
 