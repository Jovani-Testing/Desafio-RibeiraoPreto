package validacao_string;

import validacao_string.actions.MensagemMenuString;
import validacao_string.validation.ValidacaoString;

import java.util.Scanner;

public class PesquisarPresencaLetraA {

    public static void main(String[] args) {
        MensagemMenuString mensagem = new MensagemMenuString();
        ValidacaoString validacao = new ValidacaoString();

        Scanner leitura = new Scanner(System.in);
        boolean sair = false;


        while (!sair) {
            System.out.print(mensagem.mensagemBoasVindas);
            int opcaoMenu = leitura.nextInt();
            leitura.nextLine();
            // Consumir a linha vazia
            switch (opcaoMenu) {
                case 1:
                    System.out.print(mensagem.pesquisarPalavraInserida);
                    String palavraInserida = leitura.nextLine();
                    validacao.validarString(palavraInserida);
                    break;

                case 2:
                    System.out.print(mensagem.informacoesPesquisa);
                    System.out.print(mensagem.modalFinal);
                    int opcaoModal = leitura.nextInt();
                    leitura.nextLine();
                    switch (opcaoModal) {
                        case 1:
                            System.out.print(mensagem.pesquisarPalavraInserida);
                            String palavraInseridaModal = leitura.nextLine();
                            validacao.validarString(palavraInseridaModal);
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
            }
        }
    }
