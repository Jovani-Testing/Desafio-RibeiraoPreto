package validacao_string.actions;

public class MensagemMenuString {

        public String mensagemBoasVindas = """
                               ** Olá tudo bem? estou aqui para te ajudar a navegar pelas funcionalidades do sistema, por favor digite a opção desejada:**
                                    Digite 1 - Consultar em uma string, a existência da letra ‘a’
                                    Digite 2 - Entender como funciona as de consulta
                                    Digite 3 - Sair
              
                        """;

        public String pesquisarPalavraInserida= """
                                ** Por favor digite a palavra desejada, iremos verificar se existe a presenta da letra A maíúscula ou minúscula:**
                        """;


        public String modalFinal = """
                               **  Muito bem!, agora que você já entendeu a pesquisa  escolha entreas opções abaixo:**
                                  
                                    Digite 1 - Consultar em uma string, a existência da letra ‘a’
                                    Digite 3 - Sair
              
                         """;


    public String informacoesPesquisa = """
                               ** Informações sobre a pesquisa **
                               
                        Ao inserir uma string, o sistema realizará a validação da quantidade de letras 'a' inseridas, 
                        verificando tanto maiúsculas (A) como minúsculas (a). 
                        Em seguida, o sistema imprimirá a quantidade de vezes que a letra 'a' ocorre na string.
                        
                        
                        """;

        public String explicacao = """
                            **Você optou por "Consultar sequência de Fibonacci **
                            A sequência de Fibonacci é uma série de números em que cada número é a soma dos dois números anteriores, começando por 0 e 1. A lógica por trás disso é simples:
                            
                            O primeiro número é 0
                            O segundo número é 1
                            Cada número subsequente é a soma dos dois números anteriores
                            Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, ...
                           
                            A lógica por trás disso é que cada número é a soma dos dois números anteriores, o que cria uma sequência infinita de números que crescem de forma exponencial.
                            Essa sequência é nomeada em homenagem ao matemático italiano Leonardo Fibonacci, que a descobriu no século 13.
                           
                        """;

    public String entradaInvalida = """
                               **Você não digitou uma opção válida!" **
                                    Por favor insira um número que válido de acordo com as opções abaixo:
                        """;
    }


