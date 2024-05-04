# Sistema Bancário em Java

Este é um simples sistema bancário em Java que demonstra o conceito de entidades, contas correntes e contas poupança.

## Como Executar

Certifique-se de ter o Java JDK instalado em seu sistema.

1. Clone este repositório para o seu computador.
2. Abra um terminal e navegue até o diretório onde o repositório foi clonado.
3. Compile o código-fonte com o comando:

```java
   javac *.java
```

4. Execute o aplicativo com o comando:

```java
   java App
```

## Funcionalidades

Este sistema bancário apresenta as seguintes funcionalidades:

- Criação de cliente com nome.
- Criação de contas correntes e contas poupança associadas a um cliente.
- Depósito em uma conta corrente.
- Transferência de fundos entre contas.
- Impressão de extrato de uma conta.
  
  ## Funcionalidades

Este sistema bancário apresenta as seguintes funcionalidades:

- Criação de cliente com nome.
- Criação de contas correntes e contas poupança associadas a um cliente.
- Depósito em uma conta corrente.
- Transferência de fundos entre contas.
- Impressão de extrato de uma conta.

## Estrutura do Código

- `Cliente.java`: Classe que representa um cliente com um nome.
- `Conta.java`: Classe abstrata que define as operações básicas de uma conta.
- `ContaCorrente.java`: Classe que representa uma conta corrente, estendendo a classe `Conta`.
- `ContaPoupanca.java`: Classe que representa uma conta poupança, estendendo a classe `Conta`.
- `App.java`: Classe principal que contém o método `main` e demonstra o uso das classes.