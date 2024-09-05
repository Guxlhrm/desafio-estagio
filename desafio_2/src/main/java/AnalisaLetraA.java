import java.util.Scanner;

public class AnalisaLetraA {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String input = scanner.nextLine();

        int contagem = 0;

        for (char l : input.toCharArray()) {
            // Verificando se o caractere é 'a' ou 'A'
            if (l == 'a' || l == 'A') {
                contagem++;
            }
        }

        if (contagem > 0) {
            System.out.println("A letra 'a' aparece " + contagem + " vez(es) nessa(s) palavra(s).");
        } else {
            System.out.println("A letra 'a' não aparece nessa(s) palavra(s).");
        }

        scanner.close();
    }
}
