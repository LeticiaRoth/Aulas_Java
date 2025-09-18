import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Desafio {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Determino minhas variaveis como 0 para iniciar
        double posicaoA = 0;
        double posicaoB = 0;
        double velocidadeA = 0;
        double velocidadeB = 0;

        // Validação da posição do trem A
        while (true) {
            System.out.print("Digite a posicao inicial do trem A (0 a 10000 KM): ");
            try {
                posicaoA = read.nextDouble();
                // Verificação
                if (posicaoA >= 0 && posicaoA <= 10000) {
                    break;
                } else {
                    System.out.println("Posicao invalida. A posicao deve estar entre 0 e 10000 KM.");
                }
                //Caso o usuário coloque uma string
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite um numero.");
                read.next();
            }
        }

        // Validação da posição do trem B
        while (true) {
            System.out.print("Digite a posicao inicial do trem B (0 a 10000 KM): ");
            try {
                posicaoB = read.nextDouble();
                if (posicaoB >= 0 && posicaoB <= 10000) {
                    break;
                } else {
                    System.out.println("Posicao invalida. A posicao deve estar entre 0 e 10000 KM.");
                }
                //Caso o usuário coloque uma string
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite um numero");
                read.next();
            }
        }

        // Validação da velocidade do trem A
        while (true) {
            System.out.print("Digite a velocidade do trem A (positiva, ate 300 km/h): ");
            try {
                velocidadeA = read.nextDouble();
                if (velocidadeA > 0 && velocidadeA <= 300) {
                    break;
                } else {
                    System.out.println("Velocidade invalida. Deve ser positiva e ate 300 km/h.");
                }
                //Caso o usuário coloque uma string
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite um numero.");
                read.next();
            }
        }

        // Validação da velocidade do trem B
        while (true) {
            System.out.print("Digite a velocidade do trem B (negativa, ate -300 km/h): ");
            try {
                velocidadeB = read.nextDouble();
                if (velocidadeB < 0 && velocidadeB >= -300) {
                    break;
                } else {
                    //Sentido contrari (Lembrar disso)
                    System.out.println("Velocidade invalida. Deve ser negativa e ate -300 km/h.");
                }
                //Caso o usuário coloque uma string
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite um numero");
                read.next();
            }
        }

        //Verificação e calcuo
        if (posicaoA > posicaoB) {
            System.out.println("\nOs trens nãoo irão colidir, pois estao se afastando.");
        } else {
            // Cálculo do tempo em horas
            double tempoHoras = (posicaoB - posicaoA) / (velocidadeA - velocidadeB);

            if (tempoHoras < 0) {
                System.out.println("\nOs trens nao irao colidir.");
            } else {
                // Cálculo da posição da colisão
                double posicaoColisao = posicaoA + velocidadeA * tempoHoras;

                // Conversão de tempo de horas para segundos
                double tempoSegundos = tempoHoras * 3600;

                // Cálculo do horário da colisão, uso o localtime
                LocalTime horaInicio = LocalTime.of(17, 0, 0);
                LocalTime horaColisao = horaInicio.plusSeconds((long) tempoSegundos);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                String horarioFormatado = horaColisao.format(formatter);

                System.out.printf("\nA colisao de trens acontecerá no KM %.2f e ocorrera apos %.0f segundos no horario de %s.\n",
                        posicaoColisao, tempoSegundos, horarioFormatado);
            }
        }

        System.out.println("FIM DO PROGRAMAm - DESAFIO DS18");
        read.close();
    }
}