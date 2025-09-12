import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.println("\nDados de Cadastro do Candidato - Emprego Bosch");

        //Para ler os dados
        Scanner read = new Scanner(System.in);

        //Nome
        System.out.print("Digite seu nome:");
        String nome = read.nextLine();

        //Sobrenome
        System.out.print("\nDigite seu sobrenome: ");
        String sobrenome = read.nextLine();

        //Data de nascimento
        System.out.print("\nDigite sua data de nascimento (14/02/2007): ");
        String dataTexto = read.nextLine();

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataTexto,dataFormatada);


        //Pretencao salarial
        System.out.print("\nDigite sua pretenção salarial: ");
        double salario = read.nextDouble();


        //Grau de instrução
        System.out.print("\nEscolha seu grau de Instrução");
        System.out.print("\n1 - Ensino Médio");
        System.out.print("\n2 - Ensino Técnico");
        System.out.println("\n3 - Ensino Superior");

        System.out.print("Digite o número:");
        String grauInstrucao = read.nextLine();

        if (grauInstrucao == "1"){
            System.out.println("Ensino Médio");
            grauInstrucao = "Ensino Médio";

        } else if (grauInstrucao == "2"){
            System.out.println("Ensino Técnico");
            grauInstrucao ="Ensino Técnico";
        } else {
            grauInstrucao = "Ensino Superior";
        }

        read.nextLine(); //Limpar o buffer

        //Cargo Pretendido
        System.out.print("\nQual o cargo pretendido?");
        String cargo = read.nextLine();

        String cargoFormatado = cargo.toLowerCase();

        //CNH
        System.out.print("\nPossui CNH tipo B (S/N): ");
        String cnh = read.nextLine();
        // CNH
        if (cnh.equalsIgnoreCase("S")) {
            cnh = "possuo";
        }
        else if (cnh.equalsIgnoreCase("N")) {
            cnh = "não possuo";
        }

        System.out.print("\nDados do Candidato - Bosch");
        System.out.printf("Meu nome é %s %s, nasci no dia %s, minha pretensão salarial é de R$%.2f e possuo o %s completo, dentro da Bosch pretendo ocupar o cargo de %s e %s carteira de motorista", nome,sobrenome, data.format(dataFormatada),salario,grauInstrucao,cargoFormatado,cnh);


    }
}
