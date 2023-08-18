import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        boolean sair = true;
        boolean opValido;
        boolean cont = true;
        int tmp;
        Scanner scanner = new Scanner(System.in);
        double X;
        int op;
        double Y;
        double res = 0;

        System.out.println("Valor 1: ");
        X = scanner.nextDouble();

        while(sair){
            opValido = false;
            cont = true;

            System.out.println("Valor 2: ");
            Y = scanner.nextDouble();

            while(!opValido){
                System.out.println("Operação (1) Soma (2) Subtração (3) Multiplicação (4) Divisão: ");
                op = scanner.nextInt();
                switch(op){
                    case 1:
                        res = soma(X,Y);
                        System.out.println(res);
                        opValido = true;
                        break;
                    case 2:
                        res = sub(X,Y);
                        System.out.println(res);
                        opValido = true;
                        break;
                    case 3:
                        res = mut(X,Y);
                        System.out.println(res);
                        opValido = true;
                        break;
                    case 4:
                        res = div(X,Y);
                        System.out.println(res);
                        opValido = true;
                        break;
                    default:
                        System.out.println("Operção invalida, tente novamente");
                }
            }

            while(cont){
                System.out.println("Continuar? (1) Sim / (2) Não / (3) Limpar memória");
                tmp = scanner.nextInt();
                switch(tmp){
                    case 1:
                        cont = false;
                        X = res;
                        break;
                    case 2:
                        cont = false;
                        sair = false;
                        break;
                    case 3:
                        cont = false;
                        System.out.println("Valor 1: ");
                        X = scanner.nextDouble();
                        break;
                    default:
                        System.out.println("Valor invalido, tente novamente");
                }
            }
        }
        scanner.close();
    }

    public static double soma(double x, double y){
        return x + y;
    }

    public static double sub(double x, double y){
        return x - y;
    }

    public static double mut(double x, double y){
        return x * y;
    }

    public static double div(double x, double y){
        return x / y;
    }
}