package propias;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Teclado.java
 * Esta clase es una clase que hice el año pasado para leer por teclado
 * de manera sencilla
 * 
 * @version 1.0.1 20 May 2014
 * @author Rubén Gabás
 */
public class Teclado {
    static Scanner lector = new Scanner(System.in);

    public static String leerCadena(String cadenaMostrar) {
        System.out.println(cadenaMostrar);
        return lector.nextLine();
    }

    public static String leerPalabra(String cadenaMostrar) {
        System.out.println(cadenaMostrar);
        return lector.next();
    }

    public static int leerEnteroMinimo(String cadenaMostrar,int minimo) {
        boolean correcto;
        int entero = 0;
        do {
            try {
                System.out.println(cadenaMostrar);
                entero = lector.nextInt();
                lector.nextLine();
                if(entero>= minimo){
                        correcto = true;
                }else{
                        correcto = false;
                        System.out.println("Por favor introduzca "
                                           + "un valor mayor que "
                                           + minimo +":");
                }
            }catch(InputMismatchException e){
                System.out.println("No has escrito el "
                                   + "valor numerico correcto");
                lector.nextLine();
                correcto = false;
            }
        }while(!correcto);

        return entero;
    }

    public static int leerEntero(String cadenaMostrar) {
        boolean correcto;
        int entero = 0;
        do {
            try { 
                System.out.println(cadenaMostrar);
                entero = lector.nextInt();
                lector.nextLine();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("No has escrito el valor "
                                   + "numerico correcto");
                lector.nextLine();
                correcto = false;
            }
        } while (!correcto);

        return entero;
    }
 
    public static double leerDouble(String cadenaMostrar){
        boolean correcto;
        double valor = 0.00;

        do{
            try {
                System.out.println(cadenaMostrar);
                valor = lector.nextDouble();
                lector.nextLine();
                correcto = true;
            } catch (InputMismatchException e){
                System.out.println("No has escrito el valor"
                                   + " numerico correcto");
                lector.nextLine();
                correcto = false;
            }
        } while (!correcto);

        return valor;
    }
	

}
