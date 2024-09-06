package fibonacci.Actions;

public class MensagemMenu {
   public String modalInicial = """
                               ** Olá tubem ? estou aqui para te ajudar a navegar pelas funcionalidades do sistema, por favor digite a opção desejada:**
                                    Digite 1 - Consultar sequência de Fibonacci
                                    Digite 2 - Entender como funciona as regras de  sequência de Fibonacci
                                    Digite 3 - Sair
              
                        """;

    String PesquisarSequencia = """
                                ** Por favor digite o numero desejado, iremos verificar se ele pertence a sequência de Fibonacci:**
                        """;


    public String modalFinal = """
                               **  Muito bem!, espero que tenha obtido uma ótima experiência com nosso sistema, para dar sequência no atendimento digite a opção desejada :**
                                   Caso desteje encerrar o antentinento digite a opção 3
                                   
                                    Digite 1 - Consultar sequência de Fibonacci
                                    Digite 2 - Entender como funciona as regras de sequência de Fibonacci
                                    Digite 3 - Sair
              
                         """;

    public String informarNumeroPesquisa = """
                               **Você optou por "Consultar sequência de Fibonacci" **
                                    Por favor insira um número para realziar a pesquisa:
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
}
