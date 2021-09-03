package ponyExpress;

import java.util.Objects;

public class PonyExpress {
	
	
	
	public static int caballos(int[] distancias) {
		
		int distanciaTotal = 0;
		int caballos = 1;
		
		
		for(int i = 0; i < distancias.length; i++) {
			if (distancias[i] < 1 || distancias[i] > 100)
				throw new Error("Distancia inválida");
			if (distanciaTotal + distancias[i] < 100){
				distanciaTotal += distancias[i];
			}else {
				caballos++;
				distanciaTotal = distancias[i];
				
			}
			
		}
		
		
		return caballos; 
	}
}
		
	



	