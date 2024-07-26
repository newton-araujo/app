
# Projeto ContaTerminal

Este projeto é uma aplicação simples em Java que solicita informações do usuário e exibe essas informações formatadas. A aplicação foi desenvolvida para fins de aprendizado e prática de conceitos básicos de Java, como entrada de dados, uso de variáveis e métodos.

## Descrição

A classe `ContaTerminal` recebe valores informados pelo usuário, como número da conta, agência, nome do cliente e saldo, e retorna essas informações formatadas através do método `informacoesDoUsuario`.

## Estrutura do Código

O projeto consiste em uma única classe Java: `ContaTerminal`.

### Classe ContaTerminal

A classe `ContaTerminal` contém o método `main` que executa o programa, solicita as informações do usuário e chama o método `informacoesDoUsuario` para exibir os dados.

#### Variáveis

- `numeroConta`: Número da conta (int)
- `agencia`: Número da agência (String)
- `nomeCliente`: Nome do cliente (String)
- `saldo`: Saldo da conta (Double)

#### Método informacoesDoUsuario

O método `informacoesDoUsuario` recebe os valores das variáveis como parâmetros e exibe uma mensagem formatada com as informações do usuário.

```java
public static void informacoesDoUsuário(int numeroConta, String agencia, String Cliente, double saldo) {
    System.out.println("Olá, Seja bem-vindo " + Cliente + 
                       ". Sua conta: " + numeroConta + 
                       ", Agência: " + agencia + 
                       ", Saldo: R$ " + saldo);
}
```

## Como Executar

Para executar o projeto, siga os seguintes passos:

1. Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
2. Compile o código-fonte usando o comando:
    ```sh
    javac ContaTerminal.java
    ```
3. Execute o programa usando o comando:
    ```sh
    java ContaTerminal
    ```
4. Siga as instruções exibidas no terminal para inserir os dados necessários.

## Contribuição

Se você deseja contribuir com este projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request. Sugestões e melhorias são sempre bem-vindas!

## Autor

- **Newton Araujo**

## Licença

Este projeto é licenciado sob a licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter mais detalhes.

## Versão

1.0 - 2024

