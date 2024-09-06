package fibonacci;

import fibonacci.Actions.ActionMenu;
import fibonacci.Actions.MensagemMenu;
import fibonacci.validation.ValidacaoFibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PesquisarSequenciaFibonacci {
    public static void main(String[] args) {

        MensagemMenu menuMensagem = new MensagemMenu();
        ActionMenu actionMenu = new ActionMenu();
        ValidacaoFibonacci validacaoFibonacci = new ValidacaoFibonacci();

        Scanner leitura = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.print(menuMensagem.modalInicial);
            try {
                int opcao = leitura.nextInt();
                if (opcao < 1 || opcao > 3) {
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Erro: opção inválida. Por favor, digite 1, 2 ou 3.");
                    System.out.println("----------------------------------------------------------------------------------------");
                    leitura.next();
                    continue;
                }

                switch (opcao) {
                    case 1:
                        System.out.print(menuMensagem.informarNumeroPesquisa);
                        int num = leitura.nextInt();

                        boolean isFibonacci = validacaoFibonacci.isFibonacci(num);
                        if (isFibonacci) {
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("Validação concluída, o número " + num + " pertence à sequência de Fibonacci.");
                            System.out.println("----------------------------------------------------------------------------------------");
                        } else {
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("Validação concluída, O número " + num + " não pertence à sequência de Fibonacci.");
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("Caso tenha alguma dúvida,selecione a opção 2 , para saber mais sobre a sequência Fibonacci.\n");
                        }

                        System.out.print(menuMensagem.modalFinal);
                        int escolha = leitura.nextInt();
                        switch (escolha) {
                            case 1:
                                System.out.print(menuMensagem.informarNumeroPesquisa);
                                int numero = leitura.nextInt();

                                boolean isFibonacci2 = validacaoFibonacci.isFibonacci(numero);
                                if (isFibonacci2) {
                                    System.out.println("----------------------------------------------------------------------------------------");
                                    System.out.println("Validação concluída, o número " + num + " pertence à sequência de Fibonacci.");
                                    System.out.println("----------------------------------------------------------------------------------------");
                                } else {
                                    System.out.println("----------------------------------------------------------------------------------------");
                                    System.out.println("Validação concluída, O número " + num + " não pertence à sequência de Fibonacci.");
                                    System.out.println("----------------------------------------------------------------------------------------");
                                    System.out.println("Caso tenha alguma dúvida,selecione a opção 2 , para saber mais sobre a sequência Fibonacci.\n");

                                }
                                break;

                            case 2:
                                System.out.print(menuMensagem.explicacao);
                                break;

                            case 3:
                                sair = true;
                                break;
                        }
                        break;

                    case 2:
                        System.out.print(menuMensagem.explicacao);
                        System.out.print(menuMensagem.modalFinal);

                        int escolha2 = leitura.nextInt();
                        switch (escolha2) {
                            case 1:
                                System.out.print(menuMensagem.informarNumeroPesquisa);
                                int numero = leitura.nextInt();

                                boolean isFibonacci2 = validacaoFibonacci.isFibonacci(numero);
                                if (isFibonacci2) {
                                    System.out.println("----------------------------------------------------------------------------------------");
                                    System.out.println("Validação concluída, o número " + numero + " pertence à sequência de Fibonacci.");
                                    System.out.println("----------------------------------------------------------------------------------------");
                                } else {
                                    System.out.println("----------------------------------------------------------------------------------------");
                                    System.out.println("Validação concluída, O número " + numero + " não pertence à sequência de Fibonacci.");
                                    System.out.println("----------------------------------------------------------------------------------------");
                                    System.out.println("Caso tenha alguma dúvida,selecione a opção 2 , para saber mais sobre a sequência Fibonacci.\n");
                                }
                                break;

                            case 2:
                                System.out.print(menuMensagem.explicacao);
                                break;

                            case 3:
                                sair = true;
                                break;
                        }
                        break;

                    case 3:
                        sair = true;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Erro: entrada inválida. Por favor, digite um número inteiro.");
                System.out.println("----------------------------------------------------------------------------------------");
                leitura.next();
            }
        }
    }
}