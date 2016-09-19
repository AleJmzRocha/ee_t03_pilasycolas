package ee_t03_pilasycolas;

public class Cola<T> {
	/**
	 * La clase Cola<T> implementa una estructura génerica usando listas
	 */
	private Lista<T> cola = new Lista<T>();
    
    public void insertar(T dato){
        cola.agregarFinal(dato);
    }
    
    public T retirar(){
        return cola.eliminaInicioDevolviendo();
    }
}