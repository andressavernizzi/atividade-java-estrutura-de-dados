package exercicios6;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		boolean ligado = true;
		int opcao;
		String livro;
		
		while (ligado) {
            System.out.println("Digite a opção que deseja utilizar: "
                    + "\n1 - Para adicionar um novo livro"
                    + "\n2 - Listar os livros"
                    + "\n3 - Retirar livro da pilha"
                    + "\n0 - Sair");
            opcao = leia.nextInt();
            leia.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do livro");
                livro = leia.nextLine();
                pilha.add(livro);
            } else if (opcao == 2) {
                System.out.println("\nClientes na fila: " + pilha);
            } else if (opcao == 3) {
                if (!pilha.isEmpty()) {
                    System.out.println("\nLivro retirado: " + pilha.pop());
                } else {
                    System.out.println("\nA fila está vazia.");
                }
            } else if (opcao == 0) {
                System.out.println("Programa finalizado");
                ligado = false;
            }
        }
	}

}
