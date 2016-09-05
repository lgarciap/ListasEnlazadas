import java.util.Random;
import java.text.NumberFormat;
import java.util.*;

/**
 * 
 */

/**
 * @author flaquitqm
 *
 */

public class PruebaLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Generando una lista de enteros
		SinglyLinkedList<Integer> lista = new SinglyLinkedList<Integer>();
		Random num = new Random(100);
		//Se le añaden 10 números aleatorios
		for (int i=0; i<5; i++){
			lista.addLast(num.nextInt(100));
		}
		System.out.println(lista);
		
		//Probando el indexOf    
		
		//
		//
		Integer valor = lista.indexOf(50);
		
	}
	


}
