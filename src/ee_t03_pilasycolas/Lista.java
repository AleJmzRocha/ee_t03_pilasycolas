package ee_t03_pilasycolas;
import javax.swing.*;
//los comentarios sirven para documentar  código y generar el javadoc
/**
 * Esta clase implementa una lista simplemente ligada
 * @author Ale Rocha
 *
 */

public class Lista<T>{
	/**
	 * Este es el inicio de la lista
	 */
    private Nodo<T> inicio;
       
    public Lista(){
    	inicio = null;
    }
    
    public void agregarInicio(T dato){
        Nodo<T> nuevo = new Nodo<T>(dato);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }
    
    public void agregarFinal(T dato){
        Nodo<T> temporal = inicio;
        if(inicio == null)
           agregarInicio(dato);
        else{
             while(temporal.getSiguiente() != null)
                   temporal = temporal.getSiguiente();
             temporal.setSiguiente(new Nodo<T>(dato));
        }        
    }
    
    public void recorre(){
    	Nodo<T> temporal = inicio;
    	while(temporal != null){
    		System.out.print(temporal.getDato() + "-->");
    		temporal = temporal.getSiguiente();
    	}
    	System.out.print("null");
    }
    
    public void recorrerRecursivo(Nodo<T> p){
    	if(p != null){
    		System.out.println(p.getDato());
    		recorrerRecursivo(p.getSiguiente());
    	}
    }
    //Una limitante puede ser un StackOverFlow porque usa una pila, 
    //en cambio la iterativa usa un contador
        
    /**
     * Este método sobrescribe el método toString() de la clase Object
     */
    @Override
    public String toString(){
        Nodo<T> iterador = inicio;
        String s = "";
         while( iterador != null ){ 
             s += iterador.getDato() + " --> ";
             iterador = iterador.getSiguiente(); 
         } 
         s += null;
         return s;
    }
    
    public Nodo<T> getInicio(){
        return inicio;
    }
    
    public T eliminaFinalDevolviendo(){
        Nodo<T> temporal = inicio, anterior = null;
        try{
            if(inicio.getSiguiente() == null)
               inicio = null;
               else{
                   while(temporal.getSiguiente() != null){
                       anterior = temporal;
                       temporal = temporal.getSiguiente();
                    }                
                    anterior.setSiguiente(null);
            }     
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Lista vacía");
        }
        return temporal.getDato();
    }
    
    public T eliminaInicioDevolviendo(){
        Nodo<T> temporal = inicio;
        try{
            if(temporal.getSiguiente() != null)
                inicio = temporal.getSiguiente();
                else
                inicio = null;
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Lista vacía");
        }
        return temporal.getDato();
    }
    //Elimar final, eliminar inicio
}