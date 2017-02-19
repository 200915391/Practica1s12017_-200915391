/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_circular;

/**
 *
 * @author R0GV3
 */
public class lista_circular_lc {
    private nodo_lc inicio;
    private nodo_lc ultimo;
    private int tamaño;
    
    public void lista_lc(){
    inicio = null;
    ultimo = null;
    tamaño = 0;
    }
    
     public boolean esVacia(){
        return inicio == null;
    }
    
    public void agregarAlFinal(int valor,String nombre){
       
        nodo_lc nuevo = new nodo_lc();
        nuevo.setValor(valor);
        nuevo.setNombre("hola"+tamaño);
         if (esVacia()) {
           
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);      
        } else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
        // Incrementa el contador de tamaño de la lista
        tamaño++;
        
    }
    
    
    public void listar(){
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            nodo_lc aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            System.out.print("-> ");
            // Recorre la lista hasta llegar nuevamente al incio de la lista.
            do{
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getValor() + " ]" +aux.getNombre());
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }while(aux != inicio);
        }
    }
    
}
