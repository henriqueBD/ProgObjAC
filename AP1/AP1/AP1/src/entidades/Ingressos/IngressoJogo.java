package entidades.Ingressos;

import entidades.Eventos.EventoJogo;

public class IngressoJogo extends Ingresso{

    EventoJogo evento;
    double percentualDescontoTorcedor;

    public IngressoJogo(TipoIngresso tipo, EventoJogo evento, boolean descontoSocial, double desconto){
        super(tipo);
        this.evento = evento;
        this.percentualDescontoTorcedor = 1 - (desconto/100);
    }

    double getPreco(){
        return evento.precoCheio * (tipo.equals(TipoIngresso.MEIA) ? 0.5:1) * percentualDescontoTorcedor;
    }

}

