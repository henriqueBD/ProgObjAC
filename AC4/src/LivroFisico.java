public class LivroFisico extends Livro {

    boolean reservado = false;
    boolean emprestado = false;
    
    public LivroFisico(String a, String b){
        super(a, b);
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

    public void emprestar(){
        if(!reservado){
            System.out.println("Livro não foi reservado");
            return;
        }

        if(emprestado){
            System.out.println("Livro ja foi emprestado");
        }
        else{
            emprestado = true;
            System.out.println("Livro emprestado");
        }
    }

    public void devolver(){
        if(!emprestado){
            System.out.println("Livro não emprestado");
            return;
        }

        System.out.println("Livro devolvido");
        emprestado = false;
        reservado = false;
    }

}
