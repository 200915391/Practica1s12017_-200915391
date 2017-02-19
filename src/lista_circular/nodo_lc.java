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
public class nodo_lc {
    private int valor;
    private String nombre;
    private nodo_lc siguiente;
    
    
    public  void Nodo_1(){
    this.valor = 0;
    this.nombre = null;
    this.siguiente = null;     
    }
    
    public int getValor(){
    return valor;
    }
    
    public void setValor(int valor){
    this.valor = valor;
    }
    
    public String getNombre(){
    return nombre;    
    }
    
    public void setNombre(String Nombre){
    this.nombre = Nombre;
    }
    
    public nodo_lc getSiguiente(){
     return siguiente;
    }
    
    public void setSiguiente(nodo_lc siguiente){
    this.siguiente = siguiente;
    }
    
    
}
