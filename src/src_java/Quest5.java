//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Função que verifica se há números repetidos
    public static String verificarUnicos(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return "Ha numeros repetidos.";
                }
            }
        }

        return "Todos os numeros sao unicos.";
    }

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        String resultado = verificarUnicos(numeros);
        System.out.println(resultado);
    }
}