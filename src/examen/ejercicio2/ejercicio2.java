package examen.ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ejercicio2 {
	public static void main(String[] args) throws IOException {
		/*
		 * •En la primera línea el usuario escribirá dos números enteros, 
		 * n y m, mayores que uno, que representan la cantidad de elementos 
		 * de dos conjuntos de números enteros. Utilizar un objeto Scanner
		 *  para leer los datos introducidos en esta línea. Habrá que detectar posibles 
		 *  errores en la introducción de datos: introducción de datos no numéricos
		 *   (se detectará mediante el tratamiento de excepciones lanzadas por los métodos del scanner) 
		 *   o introducción de más de un dato por línea. Si se produce alguno de estos errores,
           el programa finalizará sin mostrar ningún resultado.
           -----
           •En las siguientes n+m líneas se introducirán los números pertenecientes a ambos conjuntos,
            a razón de uno por línea. La lectura y creación de cada conjunto la llevará a cabo un método llamado
             leerConjunto que recibirá como parámetro el número de elementos y retornará el conjunto correspondiente. 
             Este método lanzará una checked exception llamada numeroRepetidoException si el usuario intenta introducir 
             un número repetido. Aquí también habrá que detectar posibles errores si se introducen datos no numéricos 
             o se introduce más de un dato por línea, lanzando en ambos casos una checked exception llamada datosIncorrectosException
              con el mensaje que corresponda.
		 */
		
     
		
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> listaPrimerNumero = new ArrayList<Integer>();
		List<Integer> listaPrimerSegundo = new ArrayList<Integer>();
	    int n=0;
	    String[] a;
	   int cont=0;
		do {
			
			System.out.println(">");
			Scanner sc=new Scanner(System.in);
			
			
		    
			a=sc.nextLine().split(" ");
		
	}while(n!=0);
		//int numEntero = Integer.parseInt(cadena);
		for(String s:a) {
			int numEntero = Integer.parseInt(s);
			System.out.println(numEntero);
			for(int i=0;i<numEntero;i++) {
				//int[]primero=numeroEntero;
			}
		}
	}
	
	
	static void mostrarColeccion(Collection<Integer> c) {
	Iterator<Integer> it = c.iterator();
		while (it.hasNext()) {
			if (it.hasNext())
				System.out.print(it.next());
		}
	
	}
	

	public Set<Integer> conjunto(int l){
		return null;
		
		
	}
}
