public class Metodos{

    Nodo inicio;
    Nodo fin;

    public Metodos(){
        inicio = null;
        fin = null;
    }

    public void InsertarInicio(String dato){
        inicio = new Nodo(dato, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
public void InsertarFinal(String dato){
        Nodo nuevo = new Nodo(dato,null);
        if(inicio == null){
            fin = inicio;
            inicio = fin;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
     public void Listar(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.println("["+aux.getdato()+"]");
            aux = aux.siguiente;
        }
        System.out.println("");
    }


}
