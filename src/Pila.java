import java.util.Stack;

public class Pila {

    private Stack<Caja> almacenamiento;

    public Pila() {
        almacenamiento = new Stack<Caja>();
    }

    public boolean estaVaacia(){
        return almacenamiento.empty();
    }

    public void apilar(String codigo, String nombreEmpresa, String contenido){
        almacenamiento.push(new Caja(codigo, nombreEmpresa, contenido));
    }

    public Caja desapilar() throws Exception {
        if (estaVaacia())
            throw new Exception("No hay elementos");
        return almacenamiento.pop();
        //POP PARA SACAR ELEMENTOS
    }

    public Caja cima() throws Exception{
        if (estaVaacia())
            throw new Exception("No hay elementos");
        return almacenamiento.peek();
    }

    public int gettamanio(){
        return almacenamiento.size();
    }

    public int buscarElemento(String codigo) throws Exception {
        if (estaVaacia())
            throw new Exception("No hay elementos");
        for(int i=almacenamiento.size()-1; i>=0; i--){
            if(almacenamiento.get(i).getCodigo().equals(codigo))
                return i;
        }throw new Exception("No hay elementos");

    }

    @Override
    public String toString(){
        String mensaje = "";
        for (int i = almacenamiento.size()-1; i>= 0; i--){
            mensaje += almacenamiento.get(i)+ "\n";
        }
        return mensaje;
    }

    public int getTamanio(){
        return almacenamiento.size();

    }
    //metodo para saber cuantos elementos hay en lapila

}
