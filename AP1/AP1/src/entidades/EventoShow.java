package entidades;
public class EventoShow extends Evento {

    String nomeArtista;
    String generoMusica;

    String local;

    public EventoShow(String nome, String data, String local, int ingressosInteira, int ingressosMeia,
        String nomeArtista, String generoMusica){

        super(nome, data, local, ingressosMeia, ingressosInteira);
        this.nomeArtista = nomeArtista;
        this.generoMusica = generoMusica;
    }

}
