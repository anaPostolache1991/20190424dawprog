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
		/*
     Scanner myObj = new Scanner(System.in);
		
		try {
			
			System.out.println("Introduce el 1º número entero >1");
			Integer n = myObj.nextInt();
			
			System.out.println("Introduce el 2º número entero >1");
			Integer m = myObj.nextInt();
			
			if(n<2||m<2) {
				throw new InputMismatchException();
			}
			
			System.out.println("Los números que has introducidos son "+n+" y " + m);
			}
		catch( InputMismatchException e) {
			// Finalizamos sin mostrar ningun resultado
//			System.err.println("Introducir datos númericos/ números enteros mayores que 1");
		}

	*/
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
	   int cont=0;
		do {
			//try {
				//System.out.println("Introduce 2 numeros mayores que 1");
				
				//n=Integer.valueOf(bf.readLine());
			System.out.println(">");
			
			
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			
		
			List<Integer> lista = new ArrayList<Integer>();
			Set<Integer> hash = new HashSet<Integer>(lista);
			Set<Integer> tree = new TreeSet<Integer>(lista);
			lista.add(n);
			mostrarColeccion(lista);
			mostrarColeccion(hash);
		
			mostrarColeccion(tree);
			//} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				//System.out.println("se esperava 2 numeros");
				
			//} 
		}while(n==1);
		
	    List<Integer> lista = new ArrayList<Integer>();
		Set<Integer> hash = new HashSet<Integer>(lista);
		Set<Integer> tree = new TreeSet<Integer>(lista);
		mostrarColeccion(lista);
		
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
