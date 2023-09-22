package entidades;
public class Evento {
    String nome;
    String data;
    String local;

    int ingressosInteira;
    int ingressosMeia;

    public Evento(String nome, String data, String local, int ingressosInteira, int ingressosMeia){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.ingressosInteira = ingressosInteira;
        this.ingressosMeia = ingressosMeia;
    }

    public boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade){
        if(tipo.equals(TipoIngresso.MEIA)){
            return ingressosMeia <= quantidade;
        }
        else if(tipo.equals(TipoIngresso.INTEIRA)){
            return ingressosInteira <= quantidade;
        }
        return false;
    }

    public void venderIngresso(TipoIngresso tipo, int quantidade){
        if(tipo.equals(TipoIngresso.MEIA)){
            ingressosMeia -= quantidade;
            return;
        }
        else if(tipo.equals(TipoIngresso.INTEIRA)){
            ingressosInteira -= quantidade;
            return;
        }

        System.out.println("Tipo invalido de ingresso");
        return;
    }


}
