# Number Guessing Game

Projeto feito seguindo o roadmap de projetos do [roadmap.sh](https://roadmap.sh/projects/number-guessing-game), com o objetivo de praticar Java.

## Descrição

O Number Guessing Game é uma aplicação de linha de comando (CLI) onde o jogador tenta adivinhar um número aleatório gerado pelo sistema.  
A cada tentativa, o programa informa se o número inserido é maior ou menor ao número sorteado, até que o jogador acerte.

## Tecnologias utilizadas

- **Java** – Linguagem principal
- **CLI (Command Line Interface)** – Interface baseada em terminal
- **Arquivo `.jar`** – Distribuição empacotada da aplicação

## Como rodar o projeto

### 1. Baixe ou clone o repositório

```bash
git clone https://github.com/JessicaLorenzon/number-guessing-game-java-cli.git
cd number-guessing-game-java-cli
```

### 2. Navegue até o diretório onde está o `.jar`:

```bash
cd out/artifacts/number_guessing_game_java_cli_jar
```

### 3. Execute o aplicativo:

```bash
java -jar number-guessing-game-java-cli.jar
```

## Exemplo de uso:

```bash
$ java -jar number-guessing-game-java-cli.jar
```
```text
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 2

Great! You have selected the Medium difficulty level.
You have 5 chances.
Let's start the game!

Enter your guess: 50
Incorrect! The number is less than 50.

Enter your guess: 25
Incorrect! The number is greater than 25.

Enter your guess: 35
Incorrect! The number is less than 35.

Enter your guess: 30
Congratulations! You guessed the correct number in 4 attempts.
