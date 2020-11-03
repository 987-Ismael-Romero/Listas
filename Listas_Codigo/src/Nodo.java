//Emmanuel
public class Nodo{
    private String dato;
    Nodo siguiente;

    public Nodo(String i, Nodo s){
        dato = i;
        siguiente = s;
    }

    //Adiel
    public String getdato() {
        return dato;
    }

    public void setdato(String info) {
        this.dato = info;
    }

    //Yareli
    public Nodo getSiguiente (){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
}
