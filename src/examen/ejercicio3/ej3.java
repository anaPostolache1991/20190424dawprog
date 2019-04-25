package examen.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ej3 {
	static Map<String, String> mapaIp = new HashMap<>();
	static Map<String, String> mapaMesaje = new HashMap<>();
	Map<String, String> mapaUsuario = new HashMap<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean fin = false;
		String usuario=null;
		int numeroMensajes=0;
		int numeroips=0;
		do {
			System.out.print("> ");
			Scanner s = new Scanner(in.readLine());
			int estado = 0;
			String token;
			
		     
			while (estado != 7) {
				switch (estado) {
				case 0:
					try {
						//IP=(dirección ip) mensaje=(texto del mensaje) usuario=(nombre de usuario)
						token = s.skip("fin|ip|mensaje|usuario|\\p{L}+(\\s+\\p{L}+)*" ).match().group();
						if (token.equals("fin")) {
							estado = 7;
							fin = true;
						}
						else if (token.equals("ip"))
							estado = 2;
						else if (token.equals("mensaje"))
							estado = 1;
						else if (token.equals("usuario"))
							estado = 3;
						else {
							usuario = token;
							estado = 1;
						}
					} catch (NoSuchElementException e) {
						System.out.println("Se esperaba 'buscar' o 'fin' o un nombre");
						estado = 7;
					}
					break;
				case 1:
					try {
						s.skip("=");
						estado = 5;
						
					}catch (NoSuchElementException e) {
						System.out.println("Se esperaba '='");
						estado = 7;
					}
					break;
				case 2:
					try {
						s.skip("=");
						estado = 4;
					}catch (NoSuchElementException e) {
						System.out.println("Se esperaba '='");
						estado = 7;
					}
					break;
				case 3:
					try {
						s.skip("=");
						estado = 6;
					}catch (NoSuchElementException e) {
						System.out.println("Se esperaba '='");
						estado = 7;
					}
					break;
				case 4:
					try {
						
					
						token = s.skip("\\d").match().group();
						String direcionIp = mapaIp.get(token);
							
						if(direcionIp==null) {
							mapaIp.put("numero de ips",token);
							System.out.println("se insero");
							numeroips++;
							estado=7;
							fin=true;
						}else {
							System.out.println("no se insero");
							
						}
						
						estado = 7;
					} catch (NoSuchElementException e) {
						System.out.println("Se esperaba una direcion ip");
						estado = 7;
					}
					break;
				case 5:
					try {
						token = s.skip("\\p{L}+(\\s+\\p{L}+)*").match().group();
						String mesaje=mapaMesaje.get(token);
						if(mesaje==null) {
							mapaMesaje.put("mensaje", token);
							System.out.println("se insero");
							numeroMensajes++;
							
							fin=true;
							estado = 7;
						}else {
							System.out.println("no se insero");
							fin=true;
							estado = 7;
							
						}
						estado = 7;
						fin=true;
					} catch (NoSuchElementException e) {
						System.out.println("Se esperaba un mensaje ");
						estado = 7;
						fin=true;
					}
					break;
				case 6:try {
					int cont=0;
					token = s.skip("\\p{L}+(\\s+\\p{L}+)*").match().group();
					String nombre=mapaMesaje.get(token);
					
					
					if(nombre==null) {
						mapaMesaje.put("usuario",token);
						System.out.println("se insero");
						fin=true;
						estado = 7;
					}else {
						System.out.println("no se insero");
						fin=true;
						estado = 7;
						
					}
					estado = 7;
					fin=true;
					
					
				
						
					
				} catch (NoSuchElementException e) {
					System.out.println("Se esperaba un  nombre");
					estado = 7;
					fin=true;
				}
					break;
				}
			}
		} while (!fin);
		fin=true;
		
			
			

System.out.println("nmbre usuario");		
System.out.println(mapaMesaje);
//IP => número de mensajes
//Número de IPs: número
System.out.println("Número de IPs"+" "+numeroips);
//Total de mensajes: número
System.out.println("Total de mensajes:"+" "+numeroMensajes);
	}
	
}
