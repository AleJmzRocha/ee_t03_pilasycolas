package ee_t03_pilasycolas;
import javax.swing.*;

public class Pila<T> {
	/**
	 * La clase Pila<T> implementa una estructura g�nerica usando listas
	 */
	public Lista<T> pila = new Lista<T>();
    
    public void push(T dato){
        pila.agregarFinal(dato);
    }
    
    public T pop(){
        return pila.eliminaFinalDevolviendo();
    }
    
    public T peek(){
        Nodo<T> temporal = pila.getInicio();
        if(temporal == null)
           return null;
           
        try{
            while(temporal.getSiguiente() != null)
                  temporal = temporal.getSiguiente();
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Lista vac�a");
        }
        return temporal.getDato();
    }
    
    public Boolean isVacia(){
        return pila.getInicio() == null;
    }
}