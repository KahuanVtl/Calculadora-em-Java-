public class Calculo{
    private double num1;
    private double num2;

    //Construtor
    public Calculo(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //Métodos
    public double soma(){
        return num1 + num2;
    }

    public double subtracao(){
        return num1 - num2;
    }

    public double multiplicacao(){
        return num1 * num2;
    }

    public double divisao(){
        if (num2 != 0 && num1 != 0){
            return num1 / num2;
        } else {
            System.out.println("Divisão por 0 não é permitido");
            return 0;
        }
    }

    public double resto(){
        return num1 % num2;
    }

    public double exponenciacao(){
        return Math.pow(num1, num2);
    }

    public double Porcentagem(){
        return (num1*100)/num2;
    }

}