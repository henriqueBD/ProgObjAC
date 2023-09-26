package entidades.Ingressos;

import entidades.Eventos.EventoShow;

public class IngressoShow extends Ingresso{

    EventoShow evento;
    String local;

    public IngressoShow(TipoIngresso tipo, EventoShow evento, String local){
        super(tipo);
        this.evento = evento;
        this.local = local;
    }

    double getPreco(){
        if(tipo.equals(TipoIngresso.MEIA)){
            return evento.precoCheio/2;
        }
        else if(tipo.equals(TipoIngresso.INTEIRA)){
            return evento.precoCheio;
        }
        return -1;
    }
    
}
