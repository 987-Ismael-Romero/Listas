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

}