//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int total = sc.nextInt();

        int horas = total / 3600;
        int resto = total % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + "h, " + minutos + "min e " + segundos + "seg");

        sc.close();
    }
}