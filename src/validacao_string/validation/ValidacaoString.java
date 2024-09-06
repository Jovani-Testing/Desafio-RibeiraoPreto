package validacao_string.validation;

public class ValidacaoString {

    public void validarString(String palavraInserida) {
        int contador = 0;

        for (int i = 0; i < palavraInserida.length(); i++) {
            char caractere = palavraInserida.charAt(i);

            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        // Impressão da mensagem apenas uma vez, com o resultado final
        if (contador > 0) {
            System.out.println("---------------------------------------------------------- ");
            System.out.println("A letra 'a' ocorre " + contador + " vezes na string.");
            System.out.println("---------------------------------------------------------- ");
            System.out.println("Exibiremos o menu novamnente para que você possa continuar navegando.\n");
        } else {
            System.out.println("---------------------------------------------------------- ");
            System.out.println("A letra 'a' não ocorre na string.");
            System.out.println("---------------------------------------------------------- ");
            System.out.println("Exibiremos o menu novamnente para que você possa continuar navegando.\n");
        }
    }
}