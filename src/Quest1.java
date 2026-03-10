public class Main {
    public static void main(String[] args) {

        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Media: " + media);

        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                contador++;
            }
        }
        System.out.println("Alunos acima da media: " + contador);

        double maior = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        System.out.println("Maior nota: " + maior);
    }
}