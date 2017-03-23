package org.foobarspam.dni;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.*;

public class MainRegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n ***** Casos test DNI correctos ***** \n");
		
		String[] casosTest = { 
                // casos DNI PASS
                "78484464T","72376173A","01817200Q","95882054E","63587725Q",
                "26861694V","21616083Q","26868974Y","40135330P","89044648X",
                "80117501Z","34168723S","76857238R","66714505S","66499420A",
                // casos NIE PASS
                "X1234567T", "Y1234567T", "Z1234567T",
                // casos NIE FAIL
                "J1234567T", "H1234567T", "R1234567T",
                "X12345678X", "X1234T", "X1234567I"
                };
		
		Short indexCaso = 0;
		for(String caso : casosTest){
			
			indexCaso++;
			Matcher m = Validador.p.matcher(caso);
			
			if(m.find()){
				String cadenaMatch = m.group();
				if(cadenaMatch == caso){
					System.out.println(indexCaso.toString() + ": " + cadenaMatch + " PASS" );
					
				}else{
					System.out.println(indexCaso.toString() + ": " + cadenaMatch + " FAIL");
				}
			}
			else{
				System.out.println("No se ha encontrado el patrón");
			}
			
		}
		
		System.out.println("\n ***** Casos test DNI Incorrectos ***** \n");
		
		char[] letrasNoPermitidas = {'I', 'Ñ', 'O', 'U'};
		int numeroCasos = 7;
		String caso;
		
		ArrayList<String> casosTestPochos = new ArrayList<>();
		
		for(int contador = 1; contador <= numeroCasos; contador++){
			caso = "";
			for(int longitudDni = 1; longitudDni<=9; longitudDni++){
				Integer caracterAscii = ThreadLocalRandom.current().nextInt(48, 58);
				caso = caso + String.valueOf(Character.toChars(caracterAscii));
			}
			caso = caso + letrasNoPermitidas[ThreadLocalRandom.current().nextInt(0, 4)];
			casosTestPochos.add(caso);
		}
		
	}

}
