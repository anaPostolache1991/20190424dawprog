package examen.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;



public class ejercicio3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String, String> mapaIp = new HashMap<>();
		Map<String, String> mapaMesaje = new HashMap<>();
		Map<String, String> mapaUsuario = new HashMap<>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean fin = false;
		do {
			System.out.print("> ");
			Scanner s = new Scanner(in.readLine());
			int estado = 0;
			String token;
			String usuario = null;
		     
			while (estado != 6) {
				switch (estado) {
				case 0:
					try {
						//IP=(dirección ip) mensaje=(texto del mensaje) usuario=(nombre de usuario)
						token = s.skip("fin|ip|mensaje|usuario|\\p{L}+(\\s+\\p{L}+)*" ).match().group();
						if (token.equals("fin")) {
							estado = 6;
							fin = true;
						}
						else if (token.equals("ip"))
							estado = 2;
						else if (token.equals("mensaje"))
							estado = 1;
						else if (token.equals("usuario"))
							estado = 1;
						else {
							usuario = token;
							estado = 1;
						}
					} catch (NoSuchElementException e) {
						System.out.println("Se esperaba 'buscar' o 'fin' o un nombre");
						estado = 6;
					}
					break;
				case 1:
					try {
						s.skip("=");
						estado = 5;
						
					}catch (NoSuchElementException e) {
						System.out.println("Se esperaba '='");
						estado = 6;
					}
					break;
				case 2:
					try {
						s.skip("=");
						estado = 4;
					}catch (NoSuchElementException e) {
						System.out.println("Se esperaba '='");
						estado = 6;
					}
					break;
				case 3:
					try {
						token = s.skip("\\d{9}").match().group();
						mapaIp.put(usuario, token);
						estado = 6;
					}catch (NoSuchElementException e) {
						System.out.println("Se esperaba un teléfono");
						estado = 6;
					}
					break;
				case 4:
					try {
						token = s.skip("\\d").match().group();
						String direcionIp = mapaIp.get(token);
							
						if(direcionIp==null) {
							mapaMesaje.put(token, direcionIp);
							System.out.println("se insero");
							mapaIp.put(token,direcionIp);
						}else {
							System.out.println("no se insero");
							
						}
						
						estado=6;
					} catch (NoSuchElementException e) {
						System.out.println("Se esperaba una direcion ip");
						estado = 6;
					}
					break;
				case 5:
					try {
						token = s.skip("\\p{L}+(\\s+\\p{L}+)*").match().group();
						String mesaje=mapaMesaje.get(token);
						
							mapaMesaje.put(token, mesaje);
						System.out.println(mapaMesaje);
						if(mesaje==null) {
							mapaMesaje.put(token, mesaje);
							System.out.println("se insero");
							fin=true;
							estado=6;
						}else {
							System.out.println("no se insero");
							fin=true;
							estado=6;
							
						}
						estado = 6;
						fin=true;
					} catch (NoSuchElementException e) {
						System.out.println("Se esperaba un mensaje o nombre");
						estado = 6;
					}
					break;
				}
			}
		} while (!fin);
	
System.out.println(mapaMesaje);
System.out.println(mapaMesaje);

}
	
}
