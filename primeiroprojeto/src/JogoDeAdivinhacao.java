import java.util.Random;
import java.util.Scanner;

//Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:

//Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

//Dicas:
//Para gerar um número aleatório em Java: new Random().nextInt(100);
//Utilize o Scanner para obter os dados do usuário;
//Utilize uma variável para contar as tentativas;
//Utilize um loop para controlar as tentativas;
//Utilize a instrução break; para interromper o loop.


public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = random.nextInt(101);
        int numeroUsuario = 0;
        //System.out.println(numeroAleatorio);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Tente advinhar o número secreto de 1 a 100: ");
            numeroUsuario = scanner.nextInt();
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou! O número secreto é: "+ numeroAleatorio);
                System.out.println("""
                         ██████  ██████  ███    ██  ██████  ██████   █████  ████████ ██    ██ ██       █████  ████████ ██  ██████  ███    ██ ███████ ██ ██ ██\s
                        ██      ██    ██ ████   ██ ██       ██   ██ ██   ██    ██    ██    ██ ██      ██   ██    ██    ██ ██    ██ ████   ██ ██      ██ ██ ██\s
                        ██      ██    ██ ██ ██  ██ ██   ███ ██████  ███████    ██    ██    ██ ██      ███████    ██    ██ ██    ██ ██ ██  ██ ███████ ██ ██ ██\s
                        ██      ██    ██ ██  ██ ██ ██    ██ ██   ██ ██   ██    ██    ██    ██ ██      ██   ██    ██    ██ ██    ██ ██  ██ ██      ██         \s
                         ██████  ██████  ██   ████  ██████  ██   ██ ██   ██    ██     ██████  ███████ ██   ██    ██    ██  ██████  ██   ████ ███████ ██ ██ ██\s
                                                                                                                                                             \s
                                                                                                                                                             \s 
                        """);
                break;
            } else if (i == 5) {
                System.out.println("Errou, essa foi sua " + i + "º e última tentativa. Infelizmente você não advinhou! Pressione Shift + F10 para jogar novamente!");
                System.out.println("""
                        ██╗      ██████╗  ██████╗ ███████╗███████╗██████╗\s
                        ██║     ██╔═══██╗██╔═══██╗██╔════╝██╔════╝██╔══██╗
                        ██║     ██║   ██║██║   ██║███████╗█████╗  ██████╔╝
                        ██║     ██║   ██║██║   ██║╚════██║██╔══╝  ██╔══██╗
                        ███████╗╚██████╔╝╚██████╔╝███████║███████╗██║  ██║
                        ╚══════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═╝
                                                                         \s
                        """);
                break;
            } else {
                System.out.println("Errou, essa foi sua " + i + "º tentativa");
            }
        }

    }
}
