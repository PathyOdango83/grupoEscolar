/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @authors Patrícia, Dandara
 * Codigo Java para criação e população de dados 
 */
 import java.sql.*;
 
public class grupoEscolar {
 

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grupoEscolar";
        String usuario = "root";
        String senha = " ";
//tratamento de erros ou possiveis erros.
try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement statement = conexao.createStatement();

            // Criar o banco de dados
            String sqlCriarBanco = "CREATE DATABASE IF NOT EXISTS grupoEscolar";
            statement.executeUpdate(sqlCriarBanco);

            // Usar o banco de dados
            String sqlUsarBanco = "USE grupoEscolar";
            statement.executeUpdate(sqlUsarBanco);

            // Criar a tabela escola
            String sqlCriarTabelaEscola = "CREATE TABLE IF NOT EXISTS escola (" +
                    "Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    "salas INT, " +
                    "funcionarios INT)";
            statement.executeUpdate(sqlCriarTabelaEscola);

            // Criar a tabela Funcionarios
            String sqlCriarTabelaFuncionarios = "CREATE TABLE IF NOT EXISTS funcionarios (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nome VARCHAR(20), " +
                    "Funcao INT)";
            statement.executeUpdate(sqlCriarTabelaFuncionarios);

            // Criar a tabela cargos
            String sqlCriarTabelaCargos = "CREATE TABLE IF NOT EXISTS cargos (" +
                    "Id_cargo INT AUTO_INCREMENT PRIMARY KEY, " +
                    "Nome VARCHAR(40))";
            statement.executeUpdate(sqlCriarTabelaCargos);

            // Criar a tabela salas
            String sqlCriarTabelaSalas = "CREATE TABLE IF NOT EXISTS salas (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "Tipo VARCHAR(40))";
            statement.executeUpdate(sqlCriarTabelaSalas);

            // Criar a tabela dependente
            String sqlCriarTabelaDependente = "CREATE TABLE IF NOT EXISTS dependente (" +
                    "Id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "Nome VARCHAR(40), " +
                    "funcionario INT)";
            statement.executeUpdate(sqlCriarTabelaDependente);

            // Criar a tabela cargos_funcionario
            String sqlCriarTabelaCargosFuncionario = "CREATE TABLE IF NOT EXISTS cargos_funcionario (" +
                    "Fk_cargo INT, " +
                    "Fk_funcionario INT, " +
                    "PRIMARY KEY(Fk_cargo, Fk_funcionario))";
            statement.executeUpdate(sqlCriarTabelaCargosFuncionario);

            // Adicionar as chaves estrangeiras
            String sqlAdicionarChavesEstrangeiras = "ALTER TABLE cargos_funcionario " +
                    "ADD FOREIGN KEY (Fk_cargo) REFERENCES cargos (Id_cargo), " +
                    "ADD FOREIGN KEY (Fk_funcionario) REFERENCES funcionarios (Id); " +
                    "ALTER TABLE dependente " +
                    "ADD FOREIGN KEY (funcionario) REFERENCES funcionarios (Id); " +
                    "ALTER TABLE escola " +
                    "ADD FOREIGN KEY (salas) REFERENCES salas (Id), " +
                    "ADD FOREIGN KEY (funcionarios) REFERENCES funcionarios (Id); " +
                    "ALTER TABLE funcionarios " +
                    "ADD FOREIGN KEY (Funcao) REFERENCES cargos (Id_cargo)";
            statement.executeUpdate(sqlAdicionarChavesEstrangeiras);

            // Inserir dados nas tabelas
            String sqlInserirCargos = "INSERT INTO cargos (Nome) VALUES " +
                    "('diretor'), " +
                    "('secretario(a)'), " +
                    "('professor')";
            statement.executeUpdate(sqlInserirCargos);

            String sqlInserirFuncionarios = "INSERT INTO funcionarios (Nome, Funcao) VALUES " +
                    "('Dandara', 1), " +
                    "('aryana', 2), " +
                    "('lua', 3)";
            statement.executeUpdate(sqlInserirFuncionarios);

            String sqlInserirDependentes = "INSERT INTO dependente (Nome, funcionario) VALUES " +
                    "('lua', 2), " +
                    "('estrela', 2)";
            statement.executeUpdate(sqlInserirDependentes);

            String sqlInserirSalas = "INSERT INTO salas (Tipo) VALUES " +
                    "('informatica 1'), " +
                    "('secretaria')";
            statement.executeUpdate(sqlInserirSalas);

            String sqlInserirEscola = "INSERT INTO escola (salas, funcionarios) VALUES " +
                    "(1, 2), " +
                    "(2, 2)";
            statement.executeUpdate(sqlInserirEscola);

            // Fechar conexão
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    

