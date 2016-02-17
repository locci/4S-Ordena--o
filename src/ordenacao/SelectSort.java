package ordenacao;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) 
	{
		
		int[] array = {10, 5,  8 , 9 , 14,
					   19, 11, 18, 2 , 4,
					   13, 7,  3,  1,  12,
					   6,  16, 17, 15, 0};
	
		for (int i = 0; i < array.length - 1; i++) {
			 int lowerValue = i;			
			for (int j = lowerValue + 1; j < array.length; j++){
				if (array[j] < array[lowerValue]) lowerValue = j;
			}
			if (lowerValue != i) {

                int aux        = array[i];
                array[i]  = array[lowerValue];
                array[lowerValue] = aux;
                System.out.println(Arrays.toString(array));
			}
		}

	}

}
