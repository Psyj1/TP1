import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        //Analisando a formula valoratraso = valor + (valor * (taxa/100) * tempo), crie um algoritmo para efetuar o calculo do valor de uma prestação em atraso. Leia o valor da prestação e a taxa de juros imposta pelo banco, e leia a quantidade de meses em atraso. (tempo)

        Scanner sc = new Scanner(System.in);

        double pres, tax, month, value, vtotal;

        System.out.println("What is the value to pay?: ");
        value = sc.nextDouble();

        System.out.println("How much prestation is unpaid?: ");
        pres = sc.nextDouble();

        System.out.println("What is the tax for month?: ");
        tax = sc.nextDouble();

        System.out.println("For how much months?: ");
        month = sc.nextDouble();

        vtotal = value + (value * (tax/100) * month);

        System.out.println("The total value is: " + vtotal);



    }
}
