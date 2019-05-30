import java.util.Vector;

public class Combo {
    private double descuento;
    private Criterio c1;
    Vector<Enviable> elementos;

   public  String Listar(Criterio c1) {
       String aux = "";
       for (int i = 0; i < elementos.size(); i++) {
           if (elementos.elementAt(i).cumple(c1))
               aux += elementos.elementAt(i).toString();

           return aux;
       }
   }

    public  double Precio(){
        double aux=0;
           for (int i = 0; i < elementos.size(); i++) {
               aux+=elementos.elementAt(i).Precio();
           }
           return aux;
    }
}

