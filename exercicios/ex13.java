import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        //Faça um algoritmo e crie uma variável inteira idade=(digite sua idade) e outra dias, verifique quantos dias você já viveu. Leve em consideração o ano com 365 dias.

        Scanner keyboard = new Scanner(System.in);

        int age, days;

        System.out.println("Type your age: ");
        age = keyboard.nextInt();

        days = age * 365;

        System.out.println("The total days you live is: " + days);
    }
}
