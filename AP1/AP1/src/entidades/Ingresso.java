package entidades;
public class Ingresso {

    Evento evento;
    double preçoCheio;
    TipoIngresso tipo;

    public Ingresso(TipoIngresso tipo){
        this.tipo = TipoIngresso.tipo;
    }

    double getPreco(){
        return preçoCheio / (tipo.ordinal() + 1);
    }
    
}
