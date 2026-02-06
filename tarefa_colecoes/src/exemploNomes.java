import java.util.Scanner;


public class exemploNomes {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula:");

        String resposta = sc.nextLine();

        // split quebra a String em um array de nomes
        String[] vet = resposta.split(",");

        // remove espaços extras antes/depois dos nomes
        for (int i = 0; i < vet.length; i++) {
            vet[i] = vet[i].trim();
        }

        System.out.println("\nVetor desordenado:");
        for (String nome : vet) {
            System.out.println(nome);
        }

        // Bubble Sort
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j].compareToIgnoreCase(vet[j + 1]) > 0) {
                    String aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println("\nVetor ordenado:");
        for (String nome : vet) {
            System.out.println(nome);
        }

        sc.close();
    }
}
