import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        //Fazer um algoritmo que mostre a média aritmética das notas. Leia as notas nota1, nota2, nota3. Calcule a média1. Leia as notas4, nota5, nota6. Calcule a média2. Depois faça a soma das duas médias.

        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3, mid1, n4, n5, n6, mid2, finalmid;

        System.out.println("Type the first note: ");
        n1 = entrada.nextInt();

        System.out.println("Type the second note: ");
        n2 = entrada.nextInt();

        System.out.println("Type the third note: ");
        n3 = entrada.nextInt();

        mid1 = (n1 + n2 + n3) / 3;

        System.out.println("Type the fourth note: ");
        n4 = entrada.nextInt();

        System.out.println("Type the fifty note: ");
        n5 = entrada.nextInt();

        System.out.println("Type the sixty note: ");
        n6 = entrada.nextInt();

        mid2 = (n4 + n5 + n6) / 3;

        finalmid = (mid1 + mid2) / 2;

        System.out.println("The first mid was: " + mid1);
        System.out.println("The second mid was: " + mid2);
        System.out.println("And the total mid was: " + finalmid);

    }
}
