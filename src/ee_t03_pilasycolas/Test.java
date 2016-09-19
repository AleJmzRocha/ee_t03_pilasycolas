package ee_t03_pilasycolas;
import java.io.*;

public class Test {
	/**
	 *Clase que implementa pilas y colas 
	 */
	Pila<String> pila = new Pila<String>();
	Cola<String> cola = new Cola<String>();
	
	public void leer(){		
		//Lee el archivo
		File file = new File("datos.txt");
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine(); //Lee la pimera línea del documento
			if(s.equals("0")){ //Si el primer número es 0, usará pilas
				System.out.println("Pila:");
				s = in.readLine(); //Lee la siguiente línea
				while(s != null){
					//Si se antepone un 0, se meterá a la pila
					if(s.substring(0,1).equals("0"))
						pila.push(s.substring(2,3));
					else{
						if(s.equals("1")) //Si hay un uno, saca de la pila un elemento
							System.out.println(pila.pop());
						else
							if(s.equals("2")) //Si es un dos, muestra lo que tiene la pila en el tope
								System.out.println(pila.peek());
							else
								System.out.println("No existe la instrucción.");
					}
					s = in.readLine(); //Lee la siguiente línea y regresa al ciclo
				}		
				in.close(); //Se cierra la lectura del documento
			}
		}catch (FileNotFoundException e1) {
		      System.err.println("El archivo: " + file + " no existe");
	    } catch (IOException e2){
	      e2.printStackTrace();
	    }
	}
	
	public void leer2(){
		//Lee el archivo
		File file = new File("datos2.txt");
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine(); //Lee la pimera línea del documento
			if(s.equals("1")){ //Si el primer número es 1, usará colas
				System.out.println("Cola:");
				s = in.readLine(); //Lee la siguiente línea
				while(s != null){
					if(s.substring(0,1).equals("0")) 
						//Si se antepone un cero, se insertará en la cola el elemento siguiente
						cola.insertar(s.substring(2,3));
					else
						if(s.equals("1"))
							//Si es un uno, se sacará de la cola un elemento
							System.out.println(cola.retirar());
					s = in.readLine(); //Lee la siguiente línea y regresa al ciclo
				}
				in.close(); //Se cierra la lectura del documento
			}
		}catch (FileNotFoundException e1) {
		      System.err.println("El archivo: " + file + " no existe");
	    } catch (IOException e2){
	      e2.printStackTrace();
	    }
	}
	
	public static void main(String[] args){
		//Se instancia un objeto de la clase
		Test t = new Test();
		//Se prueban ambos métodos
		t.leer();
		System.out.println();
		t.leer2();
		//Se hace por métodos para ver la funcionalidad de las clase implementadas
	}
}