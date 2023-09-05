package exercicios6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();
        int op;
        boolean ligado = true;
        String nome;
        Scanner leia = new Scanner(System.in);

        while (ligado) {
            System.out.println("Digite a opção que deseja utilizar: "
                    + "\n1 - Adicionar cliente na fila"
                    + "\n2 - Listar todos os clientes"
                    + "\n3 - Retirar cliente da fila"
                    + "\n0 - Sair");
            op = leia.nextInt();
            leia.nextLine(); // Consumir a quebra de linha após ler a opção

            if (op == 1) {
                System.out.println("Digite o nome do cliente");
                nome = leia.nextLine(); // Leia o nome do cliente
                fila.add(nome);
            } else if (op == 2) {
                System.out.println("\nClientes na fila: " + fila);
            } else if (op == 3) {
                if (!fila.isEmpty()) {
                    System.out.println("\nCliente chamado: " + fila.remove());
                } else {
                    System.out.println("\nA fila está vazia.");
                }
            } else if (op == 0) {
                System.out.println("Programa finalizado");
                ligado = false;
            }
        }
    }
}