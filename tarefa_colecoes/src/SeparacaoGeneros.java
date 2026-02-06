

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparacaoGeneros {

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            List<String> homens = new ArrayList<>();
            List<String> mulheres = new ArrayList<>();

            while (true) {
                System.out.print("Digite o nome (ou 'fim' para encerrar): ");
                String nome = scanner.nextLine();

                if (nome.equalsIgnoreCase("fim")) {
                    break;
                }

                System.out.print("Digite o sexo (M/F): ");
                String sexo = scanner.nextLine();

                if (sexo.equalsIgnoreCase("M")) {
                    homens.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    mulheres.add(nome);
                } else {
                    System.out.println("Sexo inválido! Use M ou F.");
                }
            }

            System.out.println("\nHomens:");
            for (String h : homens) {
                System.out.println("- " + h);
            }

            System.out.println("\nMulheres:");
            for (String m : mulheres) {
                System.out.println("- " + m);
            }

            scanner.close();
        }
    }
