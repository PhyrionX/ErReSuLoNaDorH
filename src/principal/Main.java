package principal;

import java.util.Random;

import propias.Teclado;

public class Main {

	public static void main(String[] args) {
		Random rd = new Random();
		// TODO Auto-generated method stub
		System.out.println("*************************");
		System.out.println("*    ErReSuLoNaDorH     *");
		System.out.println("*************************");
		StringBuilder frase = new StringBuilder(Teclado.leerCadena("Introduce tu frase a resulonar:").toLowerCase());
		boolean permitido = true;
		for (int i = 0; i < frase.length(); i++) {
			if (i % 2 == 0) {
				frase.setCharAt(i, Character.toUpperCase(frase.charAt(i)));
			}
			
			
			if ((frase.charAt(i) == ' ') && permitido) {
				switch (rd.nextInt(3)) {
				case 0:
					frase.insert(i, 'h');
					break;
				case 1:
					frase.insert(i, 'H');
					break;
				default:
					
					break;
				}
				
				permitido = false;
			} else {
				permitido = true;
			}
		}
		
		System.out.println(frase + "h");
	}

}
