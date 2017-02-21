/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_circular;
import UI.*;
import UI.UI_ventana_juego;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    
     public boolean buscar(String referencia){
       
        nodo_lc aux = inicio;
        boolean encontrado = false;
        do{
            if ( aux.getNombre().toString().equals(referencia.toString())  ){
                encontrado = true;
//                System.out.println("llego");
            }
            else{
                aux = aux.getSiguiente();
//                System.out.println("No llego");
            }
        }while(aux != inicio && encontrado != true);
         
        if (encontrado==true){
            //System.out.println("nombre existente");
        }else
        {
            //System.out.println("nodo agregado");
            
        }
        return encontrado;
         
    }

    
    
    
     public void getGraphiz(){
     
    try {
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
      
      String fileInputPath = "C:\\Users\\R0GV3\\Desktop\\EDD_pra1\\edd_prac1\\grafo1.dot";      
      String fileOutputPath = "C:\\Users\\R0GV3\\Desktop\\EDD_pra1\\edd_prac1\\src\\UI\\grafo1.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
       
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
       System.out.println(rt.toString());
      rt.exec( cmd );
      
    } catch (Exception ex) {
      //ex.printStackTrace();
        System.out.println("nel");
    } finally {
    }

  }
     
     public void getGenerarGrafica(){
            try{
            //Abro stream, crea el fichero si no existe
            FileWriter fw = new FileWriter("C:\\Users\\R0GV3\\Desktop\\EDD_pra1\\edd_prac1\\grafo1.dot");
            fw.write("digraph g { \n");
            
//            fw.write("node1;" + "\n");
//            fw.write("node2;"+ "\n");   
//            fw.write("node3;"+ "\n");
            ///////////////
            
             if (!esVacia()) {
            nodo_lc aux = inicio;
            int i = 0;
            
            do{
                System.out.print(aux.getNombre()+"->"+aux.getSiguiente().getNombre()+"\n");
               fw.write(aux.getNombre()+ "\n");
               fw.write(aux.getNombre()+"->"+aux.getSiguiente().getNombre()+"\n");
               
                aux = aux.getSiguiente();
                i++;    
            }while(aux != inicio);
    
        }
            
            
            
            
            /////////////////
            
            
            fw.write("} \n");
            //Cierro el stream
            fw.close(); 
                //Abro el stream, el fichero debe existir
            FileReader fr=new FileReader("C:\\Users\\R0GV3\\Desktop\\EDD_pra1\\edd_prac1\\grafo1.dot");
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
            //Cerramos el stream
            fr.close();
            
            //llamamos graphviz
            getGraphiz();
            
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
     }
     
     
}
