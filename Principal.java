import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);

        //VALORES INICIAIS
        System.out.println("==========CALCULADORA==========");
        System.out.println("Adicione um valor (a): ");

        double num1 = S.nextDouble();

        System.out.println("Adicione outro valor (b): ");

        double num2 = S.nextDouble();

        //OPERAÇÃO
        Calculo calculo = new Calculo(num1, num2);
        System.out.println("Qual operação você deseja: ");

        System.out.println("(1) Soma");
        System.out.println("(2) Subtração");
        System.out.println("(3) Multiplicação");
        System.out.println("(4) Divisão");
        System.out.println("(5) Resto");
        System.out.println("(6) Exponenciação");
        System.out.println("(7) Porcentagem");

        System.out.println("==========RESULTADO==========");
        int operacao = S.nextInt();

        switch(operacao){
            case 1:
                System.out.println("Resultado da soma: " + calculo.soma());
                break;
            case 2:
                System.out.println("Resultado da subtração: " + calculo.subtracao());
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + calculo.multiplicacao());
                break;
            case 4:
                System.out.println("Resultado da Divisão: " + calculo.divisao());
                break;
            case 5:
                System.out.println("Resultado do Resto: " + calculo.resto());
                break;
            case 6:
                System.out.println("Resultado da Exponenciação: " + calculo.exponenciacao());
                break;
            case 7:
                System.out.println("Resultado da Porcentagem: " + calculo.Porcentagem());
                break;
            default:
                System.out.println("Valor inexistente! Tente novamente!");


        }

    }
}