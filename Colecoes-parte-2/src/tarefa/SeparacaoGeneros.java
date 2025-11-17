package tarefa;

import domain.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparacaoGeneros {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();
        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        while (true){
            System.out.println("Digite o nome (ou 'sair' para finalizar): ");
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("sair")){
                break;
            }

            System.out.println("Digite o sexo (M/F): ");
            String sexo = sc.nextLine();

            Pessoa p = new Pessoa(nome, sexo);
            pessoas.add(p);

            if (p.getSexo().equals("M")){
                masculino.add(p);
            }
            else if (p.getSexo().equals("F")){
                feminino.add(p);
            }
            else {
                System.out.println("Sexo inválido! (Use M ou F)");
            }
        }
        sc.close();

        System.out.println("\n--- Lista Masculina ---");
        for (Pessoa p : masculino){
            System.out.println(p.getNome());
        }

        System.out.println("\n--- Lista Feminina ---");
        for (Pessoa p : feminino){
            System.out.println(p.getNome());
        }
    }
}
