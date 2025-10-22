package ed.view;

import java.util.Scanner;
import ed.tad.ListaLigada;
import ed.tad.No;

public class Principal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ListaLigada fila = new ListaLigada();

            while (true) {
                System.out.println("FILA ENCADEADA");
                System.out.println("[1] - Enfileirar");
                System.out.println("[2] - Desenfileirar");
                System.out.println("[3] - Ver início");
                System.out.println("[4] - Ver fim");
                System.out.println("[9] - Encerrar\n");
                System.out.print("Opção: ");
                int opc = sc.nextInt();

                if (opc == 9) break;
                else if (opc == 1) {
                    System.out.print("Nome: ");
                    String nm = sc.next();
                    System.out.print("Valor: ");
                    int nr = sc.nextInt();
                    No e = new No(nm, nr);
                    System.out.println(fila.enqueue(e)
                            ? "Enfileirado com sucesso!"
                            : "Falha ao enfileirar!");
                } else if (opc == 2) {
                    No e = fila.dequeue();
                    if (e == null) System.err.println("A fila está vazia!");
                    else {
                        System.out.println("Removido:");
                        System.out.println(" > Nome: " + e.getNome());
                        System.out.println(" > Número: " + e.getNumero());
                    }
                } else if (opc == 3) {
                    No e = fila.getInicio();
                    System.out.println(e == null ? "Fila vazia." :
                            "Início -> " + e.getNome() + " (" + e.getNumero() + ")");
                } else if (opc == 4) {
                    No e = fila.getFim();
                    System.out.println(e == null ? "Fila vazia." :
                            "Fim -> " + e.getNome() + " (" + e.getNumero() + ")");
                }
            }
        }
    }
}
