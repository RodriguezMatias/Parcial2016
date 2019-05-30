public abstract class Elemento {

    private String remitente;
    private String destinatario;
    private double peso;
    private int tracking;
    protected double costo;

    public abstract String Listar(Criterio c1);
    public abstract double Precio();
}
