package ee_t03_pilasycolas;

public class Cola<T> {
	private Lista<T> cola = new Lista<T>();
    
    public void insertar(T dato){
        cola.agregarFinal(dato);
    }
    
    public T retirar(){
        return cola.eliminaInicioDevolviendo();
    }
}