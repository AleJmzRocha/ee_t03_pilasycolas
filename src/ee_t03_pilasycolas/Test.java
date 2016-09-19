package ee_t03_pilasycolas;
import java.io.*;

public class Test {
	Pila<String> pila = new Pila<String>();
	Cola<String> cola = new Cola<String>();
	
	public void leer(){
		File file = new File("datos.txt");
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			if(s.equals("0")){
				System.out.println("Pila:");
				s = in.readLine();
				while(s != null){
					if(s.substring(0,1).equals("0")){
						pila.push(s.substring(2,3));
					}
					else{
						if(s.equals("1"))
							System.out.println(pila.pop());
						else
							if(s.equals("2"))
								System.out.println(pila.peek());
							else
								System.out.println("No existe la instrucción.");
					}
					s = in.readLine();
				}		
				in.close();
			}
		}catch (FileNotFoundException e1) {
		      System.err.println("El archivo: " + file + " no existe");
	    } catch (IOException e2){
	      e2.printStackTrace();
	    }
	}
	
	public void leer2(){
		File file = new File("datos2.txt");
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s = in.readLine();
			if(s.equals("1")){
				System.out.println("Cola:");
				s = in.readLine();
				while(s != null){
					if(s.substring(0,1).equals("0")){
						cola.insertar(s.substring(2,3));
					}else
						if(s.equals("1"))
							System.out.println(cola.retirar());
					s = in.readLine();
				}
				in.close();
			}
		}catch (FileNotFoundException e1) {
		      System.err.println("El archivo: " + file + " no existe");
	    } catch (IOException e2){
	      e2.printStackTrace();
	    }
	}
	
	public static void main(String[] args){
		Test t = new Test();
		t.leer();
		System.out.println();
		t.leer2();
	}
}