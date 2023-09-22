public class Evento {

    String nome;
    String data;
    String local;

    int ingressosInteira;
    int ingressosMeia;

    boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade){

        int tipoIngresso = 0;

        if(tipoIngresso == 1){
            if(ingressosMeia <= quantidade)
                return true;
            else
                return false;
        }
        else if(tipoIngresso == 2){
            if(ingressosInteira <= quantidade)
                return true;
            else
                return false;
        }

    }

    
}
