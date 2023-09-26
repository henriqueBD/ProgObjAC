package entidades.Ingressos;

import entidades.Eventos.EventoExposicao;

public class IngressoExposicao extends Ingresso{

    EventoExposicao evento;
    boolean descontoSocial;

    public IngressoExposicao(TipoIngresso tipo, EventoExposicao evento, boolean descontoSocial){
        super(tipo);
        this.evento = evento;
        this.descontoSocial = descontoSocial;
    }

    double getPreco(){
        if(descontoSocial){
            return 0;
        }

        if(tipo.equals(TipoIngresso.MEIA)){
            return evento.precoCheio/2;
        }
        else if(tipo.equals(TipoIngresso.INTEIRA)){
            return evento.precoCheio;
        }

        return -1;
    }
    
}
