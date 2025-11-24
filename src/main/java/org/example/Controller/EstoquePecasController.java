package org.example.Controller;

import org.example.Dao.EstoquePecasDAO;
import org.example.Models.EstoquePecasModels;
import org.example.View.EstoquePecasView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoquePecasController {
    private Scanner scanner;
    private EstoquePecasModels estoquePecasModels;
    private EstoquePecasView estoquePecasView;

    public EstoquePecasController(Scanner scanner) {
        this.scanner = scanner;
        this.estoquePecasView = new EstoquePecasView(scanner);
    }

    public void iniciar() {
        EstoquePecasDAO estoqueDao = new EstoquePecasDAO();
        int condicao = 0;
        do {
            estoquePecasView.menu();
            System.out.println("Digite sua opção: ");
            condicao = scanner.nextInt();
            scanner.nextLine();
            switch (condicao) {
                case 1:
                    System.out.println("Adicione uma produto: ");
                    estoqueDao.adicionarProduto(estoquePecasView.lerDadosProduto());
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o ID do produto que deseja atualizar: ");
                    int idDigitado = estoquePecasView.lerOpcao();
                    System.out.println("Produto atualizado com sucesso!");

                    System.out.println("Preencha os dados do produto: ");
                    EstoquePecasModels estoquePecasAtualizada = estoquePecasView.lerDadosProduto();
                    estoquePecasAtualizada.setId(idDigitado);
                    estoqueDao.atualizarProduto(estoquePecasAtualizada);
                    System.out.println("Peças atualizadas com sucesso!");
                    break;
                case 3:
                    System.out.println("Exibindo Lista de Produtos:\n");
                    List<EstoquePecasModels> listaPecas = estoqueDao.listarProdutos();
                    estoquePecasView.mostrarLista(listaPecas);
                    break;
                case 4:
                    System.out.println("Exibindo produtos por quantidade Máxima:\n");
                    List<EstoquePecasModels> listarQuantidadeMax = estoqueDao.listarQuantidadeMax();
                    estoquePecasView.mostrarLista(listarQuantidadeMax);
                    break;
                case 5:
                    System.out.println("Exibindo produtos por quantidade Mínima:\n");
                    List<EstoquePecasModels> listaQuantidadeMinima = estoqueDao.listarQuantidadeMin();
                    estoquePecasView.mostrarLista(listaQuantidadeMinima);
                    break;
                case 6:
                    System.out.println("Exibindo produtos por valor Máximo:\n");
                    List<EstoquePecasModels> listaValorMaximo = estoqueDao.listarValorMax();
                    estoquePecasView.mostrarLista(listaValorMaximo);
                    break;
                case 7:
                    System.out.println("Exibindo produtos por valor Mínimo:\n");
                    List<EstoquePecasModels> listaValorMinimo = estoqueDao.listarValorMin();
                    estoquePecasView.mostrarLista(listaValorMinimo);
                    break;
                case 8:
                    System.out.println("Digite o id do produto á ser removido: ");
                    int remover = estoquePecasView.lerOpcao();
                    estoqueDao.remover(remover);
                    System.out.println("Produto removido com sucesso!");
                    break;
                default:
            }

        } while (condicao != 0);
    }
}
