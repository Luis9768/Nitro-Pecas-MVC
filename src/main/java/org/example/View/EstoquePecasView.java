package org.example.View;

import org.example.Models.EstoquePecasModels;

import java.util.List;
import java.util.Scanner;

public class EstoquePecasView {
    private Scanner scanner;

    public EstoquePecasView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        System.out.println("Menu da Nitro Auto peças");
        System.out.println("1. Adicionar produto");
        System.out.println("2. Atualizar produto");
        System.out.println("3. Listar produtos");
        System.out.println("4. Listar produtos por quantidade Máxima");
        System.out.println("5. Listar produtos por quantidade Mínima");
        System.out.println("6. Listar produtos por valor Máximo");
        System.out.println("7. Listar produtos por valor Mínimo");
        System.out.println("8. Remover Produto");
        System.out.println("0. Sair");
    }

    public int lerOpcao() {
        int condicao = scanner.nextInt();
        scanner.nextLine();
        return condicao;
    }

    public String lerTexto() {
        return scanner.nextLine();
    }

    public void mostrarLista(List<EstoquePecasModels> lista) {
        System.out.println("--- Lista de Peças ---");
        for (EstoquePecasModels e : lista) {
            System.out.println(e);
        }
    }

}
