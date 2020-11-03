import javax.swing.JOptionPane;



/**
 *
 * @author Cristofer
 */
public class Main {

    public static void main(String[] args) {

        Metodos l = new Metodos();
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

                    case 1 -> {
                        //Se solicita el dato y se llama al método para agregar un nodo pasandole el parametro.
                        String a = JOptionPane.showInputDialog(null, "Ingresa dato: ");
                        l.InsertarInicio(a);
                    }

                    case 2 -> {
                        //Se solicita dato y se llama al método para agregar al final pasandole el parametro.
                        String b = JOptionPane.showInputDialog(null, "Ingresa dato: ");
                        l.InsertarFinal(b);
                    }

                    case 3 -> l.EliminarInicio(); //Se llama al método para eliminar el dato del inicio
                    case 4 -> l.Listar();         //Se llama al método para mostrar la lista
                    case 5 -> l.eliminar();       //Se llama al método para limpiar la lista
                    case 6 -> System.exit(0);

                    default -> JOptionPane.showMessageDialog(null, "Opcion inexistente");
                }
            }catch(Exception e){
                System.err.println(e.getMessage());
            }

        }while(opcion !=6);
    }
}