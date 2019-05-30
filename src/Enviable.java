public class Enviable extends Elemento {
    private String tipo;

    public  String Listar(Criterio c1){
        if (this.cumple(c1)){
            return this.toString();
        }
        else
            return "";
    }
    public  double Precio(){
        return this.costo;
    }
}
