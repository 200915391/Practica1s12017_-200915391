/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_circular;
import UI.*;
import UI.UI_ventana_juego;
import javax.swing.JTextArea;

/**
 *
 * @author R0GV3
 */
public class lista_circular_lc {
    private nodo_lc inicio;
    private nodo_lc ultimo;
    private int tamaño;
    
    UI.UI_ventana_juego ventana_j = new UI.UI_ventana_juego();
    
    
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
        nuevo.setNombre(nombre);
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
        
    
    
    public void getSiguiente(){
    int i =0 ;
    nodo_lc aux2 =inicio;
          //System.out.println(aux2.getNombre());
      // if (aux2==inicio){
      
           System.out.println(aux2.getNombre());
           
         // aux2 = aux2.getSiguiente();
      // }
      
    
    }
    
    
    public void MostrarSiguiente(){
        
        
        if (!esVacia()) {
            nodo_lc aux = inicio;
            int i = 0;
            
            do{
                System.out.print(i + ".[ " + aux.getValor() + " ]" +" "+"["+aux.getNombre()+"]"+"\n");
               
               
                aux = aux.getSiguiente();
                i++;
                
            }while(aux != inicio);
                
             
            
        }
       
    }
    
    
     public int getTamaño(){
        return tamaño;
    }
    
     public void buscar(String referencia){
       
        nodo_lc aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al primer nodo nuevamente.
        do{
            // Consulta si el valor del nodo es igual al de referencia.
            if ( aux.getNombre().toString().equals(referencia.toString())  ){
                // Canbia el valor de la bandera.
                encontrado = true;
                System.out.println("llego");
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
                System.out.println("No llego");
            }
        }while(aux != inicio && encontrado != true);

         System.out.println("termina");
         
    }

    
    
    
}
