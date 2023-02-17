package com.generation;

import java.util.Scanner;// se importo java util

public class CodigoOtros5 {
	
	public static void name() { //agregar static metodo
		Scanner s = new Scanner(System.in); //se agrego system.in
	    System.out.println("Introduzca un número: ");//cambiar comilla
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni);//se convirtio el String en numerber
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) { //se cambio la variable a c ya que se requiere un entero
		  int digito = (ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  //int ni /= 10;
	    }

	    if (c > noAfo) { // se tiene que comparar un entero
	      System.out.prinln("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
		
	}

}
