package ordenacao;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) 
	{
	
		int[] array = {10, 5, 8 ,9 ,14,
					   19, 11, 18, 2 ,4,
					   13, 7, 3, 1, 12,
					   6, 16, 17, 15, 0};
		int lastIndex = array.length;
		int aux = 0;
		for (int i = array.length-1; i >= 1; i--) {
					System.out.println("f1: "+"I= "+i);
			for (int j = 0; j < i; j++) {
					System.out.println("f2: "+"I= "+i+" J= "+j);
				if (array[j] > array[j+1]) {
					System.out.println("if: "+"I= "+i+" J= "+j+" J+1= "+(j+1));
				aux 	  = array[j];
					System.out.println("if: "+"I= "+i+" J= "+j+" J+1= "+(j+1)+" AUX= "+aux);
				array[j]  = array[j+1];
					System.out.println("if: "+"I= "+i+" J= "+j+" J+1= "+(j+1)+" AUX= "+aux);
				array[j+1]= aux;
					System.out.println("if: "+"I= "+i+" J= "+j+" J+1= "+(j+1)+" AUX= "+aux);
					System.out.println("");
				System.out.println(Arrays.toString(array));
				System.out.println("-----------------------------------------------------------------------");
				}
			}
		}
	}	
}
	