

package gerenciabanco;

import java.util.Scanner;
        
public class GerenciaBanco {

    
    static class Cliente {
        private String nome;
        private String sobrenome;
        private String cpf;

        public Cliente(String nome, String sobrenome, String cpf) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cpf = cpf;
        }

        public String getNomeCompleto() {
            return nome + " " + sobrenome;
        }

        public String getCpf() {
            return cpf;
        }
    }

    
    static class ContaBancaria {
        private Cliente cliente;
        private double saldo;

        public ContaBancaria(Cliente cliente) {
            this.cliente = cliente;
            this.saldo = 0.0;
        }

        public void consultarSaldo() {
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado com sucesso.");
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saque inválido. Verifique o valor ou saldo insuficiente.");
            }
        }

        public Cliente getCliente() {
            return cliente;
        }
    }

    
    public static void exibirMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Realizar depósito");
        System.out.println("3 - Realizar saque");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco!");
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Informe seu CPF: ");
        String cpf = scanner.nextLine();

        Cliente cliente = new Cliente(nome, sobrenome, cpf);
        ContaBancaria conta = new ContaBancaria(cliente);

        int opcao;
        do {
            exibirMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número válido.");
                scanner.next(); 
                exibirMenu();
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nosso sistema, " + cliente.getNomeCompleto() + "!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}