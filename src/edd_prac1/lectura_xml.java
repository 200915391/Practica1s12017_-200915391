

package edd_prac1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import static javax.management.Query.lt;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.Namespace;
import org.jdom2.input.DOMBuilder;
import org.jdom2.input.SAXBuilder; // |






/**
 *
 * @author R0GV3
 */
public class lectura_xml {
 
    String texto="";
    
    
    public void cargarXml()
{
                
    
    
    
        String dimension_xml;
    
         SAXBuilder builder = new SAXBuilder();
	  File xmlFile = new File(texto);  //"c:\\Users\\R0GV3\\Desktop\\2.xml"
          //System.out.println("llego corazon");

	  try {             
		// 305 EDD lol
                Document document = (Document) builder.build(xmlFile);
		Element rootNode = document.getRootElement();
	
                //  las dimensiones ini
                dimension_xml = rootNode.getChild("dimension").getText(); // ya fue!!!
                System.out.println(dimension_xml);
                // las dimensiones fin
    
                //   ini dobles
                Element dobles_xml= rootNode.getChild("dobles");                
                List casilla_xml = dobles_xml.getChildren("casilla");       
                for (int i = 0; i < casilla_xml.size(); i++) {
		   Element node = (Element) casilla_xml.get(i);

		   System.out.println("posicion x : " + node.getChildText("x"));
		   System.out.println("posicion y : " + node.getChildText("y"));
		}
                // fin dobles

             //   ini triples
                Element triples_xml= rootNode.getChild("triples");                
                List casilla2_xml = triples_xml.getChildren("casilla");       
                for (int j = 0; j < casilla2_xml.size(); j++) {
		   Element node2 = (Element) casilla2_xml.get(j);

		   System.out.println("posicion x : " + node2.getChildText("x"));
		   System.out.println("posicion y : " + node2.getChildText("y"));
		}
                // fin triples
                
                
                 for (int k = 0; k < rootNode.getChild("diccionario").getContentSize(); k++) {
                Element diccionarioxml = rootNode.getChild("diccionario");
                List palabraxml = diccionarioxml.getChildren("palabra");
                Element nodito = (Element) palabraxml.get(k);

		   System.out.println(nodito.getText());
		  }
               
                // fin diccionario	

	  } catch (IOException io) {
		System.out.println(io.getMessage());
	  } catch (JDOMException jdomex) {
		System.out.println(jdomex.getMessage());
	  }
    
}
    
   
    
 

     public void abrir(){
       String aux="";   
       
  try
  {
   /**llamamos el metodo que permite cargar la ventana*/
   JFileChooser file=new JFileChooser();
   file.showOpenDialog(file);
   /**abrimos el archivo seleccionado*/
   File abre=file.getSelectedFile();
 
   /**recorremos el archivo, lo leemos para plasmarlo
   *en el area de texto*/
   if(abre!=null)
   {     
      FileReader archivos=new FileReader(abre);
      BufferedReader lee=new BufferedReader(archivos);
      while((aux=lee.readLine())!=null)
      {
         texto+= aux+ "\n";
      }
         lee.close();
         texto= abre.toString();
      // System.out.println(texto); 
    }    
   }
   catch(IOException ex)
   {
     JOptionPane.showMessageDialog(null,ex+"" +
           "\nNo se ha encontrado el archivo",
                 "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
    }
     
     //texto_xml= texto;
      //System.out.println(texto);
      cargarXml();
        
     }


}
