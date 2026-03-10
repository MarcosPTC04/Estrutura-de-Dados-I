//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor (multiplo de 10): ");
        int valor = sc.nextInt();

        int notas50 = valor / 50;
        int resto = valor % 50;

        int notas20 = resto / 20;
        resto = resto % 20;

        int notas10 = resto / 10;

        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);

        sc.close();
    }
}