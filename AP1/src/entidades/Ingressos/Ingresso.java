package entidades.Ingressos;

abstract public class Ingresso {

    TipoIngresso tipo;

    public Ingresso(TipoIngresso tipo){
        this.tipo = tipo;
    }

    abstract double getPreco();
    
}
