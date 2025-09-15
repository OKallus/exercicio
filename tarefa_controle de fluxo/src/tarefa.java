import java.util.Scanner;

public class tarefa {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int somaNotas = 0;

        for (int i = 1; i <=4; i++ ) {
            System.out.println("Digite sua nota" + (i) + ":");
            somaNotas += sc.nextInt();
        }
        String ResultadoFinal = getResultado(somaNotas);
        System.out.println(ResultadoFinal);
    }

    public static String getResultado(int somaNotas){
        double media = somaNotas / 4;

        if (media >= 7){
            return "aprovado";
        }
        else if (media < 7 && media >= 5){
           return "recuperação";
        }
        else {
            return "reporvado";
        }
    }
}
