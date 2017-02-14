/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_circular_nombres;

/**
 *
 * @author R0GV3
 */
public class Nodo_lc1 {
    
    private int valor;
    private String Nombre;
    private Nodo_lc1 siguiente;
  
    public void Nodo(){
    this.valor = 0;
    this.Nombre = null;
    this.siguiente = null; 
    }
    
    public int getValor(){
    return valor;
    }
    
    public void setValor(int valor){
    this.valor = valor;
    }
    
    public String getNombre(){
    return Nombre;    
    }
    
    public void setNombre(String Nombre){
    this.Nombre = Nombre;
    }
    
    public Nodo_lc1 getSiguiente(){
     return siguiente;
    }
    
    public void setSiguiente(Nodo_lc1 siguiente){
    this.siguiente = siguiente;
    
    }
    
}
