import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        System.out.println("La suma de los números desde 1 hasta " + n + " es: " + ej33.suma(n));
        System.out.println("La suma de los números desde 1 hasta " + n + " es: " + ej33.suma2(n));
    }
}