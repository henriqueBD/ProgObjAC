public class Ebook extends Livro {

    String formato;
    boolean reservado = false;

    public Ebook(String a, String b, String c){
        super(a, b);
        formato = c;
    }

    public void reservar(){
        if(reservado){
            System.out.println("Livro ja reservado");
        }
        else{
            System.out.println("Livro reservado");
            reservado = true;
        }
    }

    public void cancelarReserva(){
        System.out.println("Resrva cancelada");
        reservado = false;
    }
    
}
