package org.example.Controller;

import org.example.Dao.EstoquePecasDAO;
import org.example.Models.EstoquePecasModels;
import org.example.View.EstoquePecasView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoquePecasController {
    private Scanner scanner;
    private EstoquePecasModels estoquePecasModels;
    private EstoquePecasView estoquePecasView;

    public EstoquePecasController(Scanner scanner) {
        this.scanner = scanner;
    }
    public void iniciar(){
        EstoquePecasDAO estoqueDao = new EstoquePecasDAO();
        int condicao = scanner.nextInt();
        do {

            condicao = scanner.nextInt();
            switch (condicao){
                case 1:
                    System.out.println("Adicione uma produto: ");
                    //logica
                    break;
                case 2:
                    System.out.println("Atualize um produto: ");
                    //logica
                    break;
                case 3:
                    System.out.println("Exibindo Lista de Produtos:\n");
                    //logica
                    break;
                case 4:
                    System.out.println("Exibindo produtos por quantidade Máxima:\n");
                    //logica
                    break;
                case 5:
                    System.out.println("Exibindo produtos por quantidade Mínima:\n");
                    //logica
                    break;
                case 6:
                    System.out.println("Exibindo produtos por valor Máximo:\n");
                    //logica
                    break;
                case 7:
                    System.out.println("Exibindo produtos por valor Mínimo:\n");
                    //logica
                    break;
                case 8:
                    System.out.println("Digite o id do produto á ser removido: ");
                    //logica
                    break;
            }

        }while (condicao != 0);
    }
}
