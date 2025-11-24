package org.example.Dao;

import org.example.Models.EstoquePecasModels;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoquePecasDAO {
    private static final String URL = "jdbc:mysql://luismjava.duckdns.org:3306/Sistema_Pecas";
    private static final String USER = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    public Connection getConnection() throws SQLException {
        //pega variaveis que contem os acessos dentro delas, para fazer o login
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void adicionarProduto(EstoquePecasModels estoquePecasModels) {
        String sql = "INSERT INTO Estoque_Pecas (Nome, Valor, Quantidade, Fabricante)VALUES (?,?,?,?)";
        try (Connection conn = getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, estoquePecasModels.getNome());
            stmt.setDouble(2, estoquePecasModels.getValor());
            stmt.setInt(3, estoquePecasModels.getQuantidade());
            stmt.setString(4, estoquePecasModels.getFabricante());

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<EstoquePecasModels> listarProdutos() {
        ArrayList<EstoquePecasModels> estoqueList = new ArrayList<>();
        String sql = "SELECT * FROM Estoque_Pecas";
        try (Connection conn = getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();//vai pesquisar e retornar a pesquisa

            while (rs.next()) {
                //vao receber do banco com novas variaveis
                int id = rs.getInt("Id");
                String nome = rs.getString("Nome");
                Double valor = rs.getDouble("Valor");
                int quantidade = rs.getInt("Quantidade");
                String fabricante = rs.getString("Fabricante");

                //criado um novo objeto com as novas variaveis e adicionadas a lista vazia criada acima (estoqueLis)
                EstoquePecasModels e = new EstoquePecasModels(id, nome, valor, fabricante, quantidade);
                estoqueList.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estoqueList;

    }

    public void atualizarProduto(EstoquePecasModels estoquePecasModels) {
        String sql = "Update Estoque_Pecas Set Nome = ?,Valor = ?, Quantidade = ?,Fabricante = ? Where Id = ?";
        try (Connection conn = getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, estoquePecasModels.getNome());
            stmt.setDouble(2, estoquePecasModels.getValor());
            stmt.setInt(3, estoquePecasModels.getQuantidade());
            stmt.setString(4, estoquePecasModels.getFabricante());
            stmt.setInt(5, estoquePecasModels.getId());

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<EstoquePecasModels> listarQuantidadeMax() {
        ArrayList<EstoquePecasModels> estoquePecasList = new ArrayList<>();//lista vazia
        String sql = "SELECT * FROM Estoque_Pecas ORDER BY Quantidade Desc;";//comando sql
        try (Connection conn = getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();//vai pesquisar e retornar a pesquisa
            while(rs.next()){
                int id = rs.getInt("Id");
                String nome = rs.getString("Nome");
                Double valor = rs.getDouble("Valor");
                int quantidade = rs.getInt("Quantidade");
                String fabricante = rs.getString("Fabricante");

                EstoquePecasModels e = new EstoquePecasModels(id, nome, valor, fabricante, quantidade);
                estoquePecasList.add(e);            }


        } catch (SQLException e) {
            e.printStackTrace();
        }return estoquePecasList;
    }
    public List<EstoquePecasModels> listarQuantidadeMin() {
        ArrayList<EstoquePecasModels> estoquePecasList = new ArrayList<>();//lista vazia
        String sql = "SELECT * FROM Estoque_Pecas ORDER BY Quantidade Asc;";//comando sql
        try (Connection conn = getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();//vai pesquisar e retornar a pesquisa
            while(rs.next()){
                int id = rs.getInt("Id");
                String nome = rs.getString("Nome");
                Double valor = rs.getDouble("Valor");
                int quantidade = rs.getInt("Quantidade");
                String fabricante = rs.getString("Fabricante");

                EstoquePecasModels e = new EstoquePecasModels(id, nome, valor, fabricante, quantidade);
                estoquePecasList.add(e);            }

        } catch (SQLException e) {
            e.printStackTrace();
        }return estoquePecasList;
    }
    public List<EstoquePecasModels> listarValorMax(){
        ArrayList<EstoquePecasModels> estoquePecasList = new ArrayList<>();//lista vazia
        String sql = "SELECT * FROM Estoque_Pecas ORDER BY Valor Desc;";
        try (Connection conn = getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();//vai pesquisar e retornar a pesquisa
            while(rs.next()){
                int id = rs.getInt("Id");
                String nome = rs.getString("Nome");
                Double valor = rs.getDouble("Valor");
                int quantidade = rs.getInt("Quantidade");
                String fabricante = rs.getString("Fabricante");

                EstoquePecasModels e = new EstoquePecasModels(id, nome, valor, fabricante, quantidade);
                estoquePecasList.add(e);            }

        } catch (SQLException e) {
            e.printStackTrace();
        }return estoquePecasList;

    }
    public List<EstoquePecasModels> listarValorMin(){
        ArrayList<EstoquePecasModels> estoquePecasList = new ArrayList<>();//lista vazia
        String sql = "SELECT * FROM Estoque_Pecas ORDER BY Valor Asc;";
        try (Connection conn = getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();//vai pesquisar e retornar a pesquisa
            while(rs.next()){
                int id = rs.getInt("Id");
                String nome = rs.getString("Nome");
                Double valor = rs.getDouble("Valor");
                int quantidade = rs.getInt("Quantidade");
                String fabricante = rs.getString("Fabricante");

                EstoquePecasModels e = new EstoquePecasModels(id, nome, valor, fabricante, quantidade);
                estoquePecasList.add(e);            }

        } catch (SQLException e) {
            e.printStackTrace();
        }return estoquePecasList;

    }
    public void remover(int id){

        String sql = "DELETE FROM Estoque_Pecas Where id = ?";//comando sql

        try(Connection conn = getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);//procura por id
            stmt.executeUpdate();//salva no banco

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}