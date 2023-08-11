public class App {
    public static void main(String[] args) throws Exception {
        eBissexto(2024);
    }

    public static void media(double ap1, double ap2, double ac){
        System.out.println(((ap1 + ap2) * 0.4 + ac * 0.2));
    }

    public static void printNum(){
        for(int i = 150; i < 201; i++){
            System.out.println(i);
        }
    }

    public static void ePrimo(int num){
        boolean primo = true;
        System.out.println("Números divisiveis por n: ");
        for(int i = 2; i < num; i++){
            if(num%i == 0){
                primo = false;
                System.out.println(i);
            }
        }
        if(primo){
            System.out.println("Nenhum. Numero primo");
        }
    }

    public static void semana(int num){

        switch(num){
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda");
            break;
            case 3:
            System.out.println("Terça");
            break;
            case 4:
            System.out.println("Quarta");
            break;
            case 5:
            System.out.println("Quinta");
            break;
            case 6:
            System.out.println("Sexta");
            break;
            case 7:
            System.out.println("Sabado");
            break;
            default:
            System.out.println("valor invalido");
        }
    }

    public static void eBissexto(int ano){

        if(ano%4 == 0){
            if(ano%100 == 0 && ano%400 == 0){
                System.out.println("É ano bissexto");
                return;
            }
            System.out.println("É ano bissexto");
            return;
        }

        System.out.println("Não é bissexto");
    }
}
