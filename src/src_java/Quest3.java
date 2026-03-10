//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        boolean tamanhoValido = false;
        boolean especialValido = false;

        if (senha.length() >= 8) {
            tamanhoValido = true;
        }

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (c == '@' || c == '#' || c == '$' ||
                    c == '%' || c == '&' || c == '*') {
                especialValido = true;
            }
        }

        if (tamanhoValido && especialValido) {
            System.out.println("Senha Valida");
        } else {
            System.out.println("Senha Invalida");

            if (!tamanhoValido) {
                System.out.println("Deve ter pelo menos 8 caracteres.");
            }

            if (!especialValido) {
                System.out.println("Deve conter caractere especial.");
            }
        }

        sc.close();
    }
}