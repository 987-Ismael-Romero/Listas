/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import javax.swing.JOptionPane;



/**
 *
 * @author Cristofer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
      Metodos l = new Metodos();//
        int opcion=0;
      
      
      do{
          
       try{   
     opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"----------------Menu---------------\n"
     +"1.- Agregar al inicio de la lista \n"
     +"2.- Agregar al final de la lista \n"
     +"3.- Eliminar dato del inicio \n"
     +"4.- Mostrar lista\n"
     +"5.- Limpiar lista\n"
     +"6.- Salir\n\n"
     +"Ingrese numero de opción"));
     
     
     switch(opcion){
         
         case 1://Se solicita el dato y se llama al metodo para agregar un nodo pasandole el parametro. 
            String a = JOptionPane.showInputDialog(null,"Ingresa dato: ");
            
             l.InsertarInicio(a);       
             break;
             
         case 2://Se solicita dato y se llama al metodo para agregar al final pasandole el parametro.  
           String b = JOptionPane.showInputDialog(null,"Ingresa dato: "); 
           
             l.InsertarFinal(b);
             
             break;
             
         case 3://Se llama al metodo para eliminar el dato del inicio
             
             l.EliminarInicio();
             
             break;
         
         case 4://Se llama al metodo para mostrar la lista
             
            l.Listar();
             break;
         
         case 5://Se llama al metodo para limpiar la lista
             
             l.eliminar();
             break;
          
         case 6:
          break;
             
       default:
       JOptionPane.showMessageDialog(null,"Opcion inexistente");
     }
       }catch(Exception e){   
       }
      }while(opcion !=6);        
       
    
}
}