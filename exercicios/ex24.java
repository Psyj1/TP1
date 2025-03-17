import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        //Faça um programa que, a partir das medidas dos lados de um retângulo, calcule a área e o perímetro deste retângulo. Leia a medida do lado a e lado b em centímetros.

        Scanner sc = new Scanner(System.in);

        int a, b, perimeter, area;

        System.out.print("Type a value for A: ");
        a = sc.nextInt();

        System.out.print("Type b value for B: ");
        b = sc.nextInt();

        perimeter = 2 * a + 2 * b;
        area = a * b;

        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);
    }
}
