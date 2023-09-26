package entidades.Eventos;

public class EventoExposicao extends Evento {

    int faixaEtaria;
    int duracao;
    
    public EventoExposicao(String nome, String data, String local, int ingressosInteira, int ingressosMeia, double precoCheio){
        super(nome, data, local, ingressosMeia, ingressosInteira, precoCheio);
    }

    
}
