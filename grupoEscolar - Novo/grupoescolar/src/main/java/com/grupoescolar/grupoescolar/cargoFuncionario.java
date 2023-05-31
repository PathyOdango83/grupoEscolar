package com.grupoescolar.grupoescolar;

import java.sql.*;

public class cargoFuncionario {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String username = "root";
        String password = "  ";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            
            String createCargosFuncionarioTable = "CREATE TABLE cargos_funcionario(" +
                    "Fk_cargo INT, " +
                    "Fk_funcionario INT, " +
                    "PRIMARY KEY(Fk_cargo, Fk_funcionario))";
            statement.executeUpdate(createCargosFuncionarioTable);

            
            String alterCargosFuncionarioTable = "ALTER TABLE cargos_funcionario " +
                    "ADD FOREIGN KEY (Fk_cargo) REFERENCES cargos (id_cargo), " +
                    "ADD FOREIGN KEY (Fk_funcionario) REFERENCES funcionarios (id)";
            statement.executeUpdate(alterCargosFuncionarioTable);

            
            String alterDependenteTable = "ALTER TABLE dependente " +
                    "ADD FOREIGN KEY (funcionario) REFERENCES funcionarios (id)";
            statement.executeUpdate(alterDependenteTable);

          
            String alterFuncionariosTable = "ALTER TABLE funcionarios " +
                    "ADD FOREIGN KEY (Funcao) REFERENCES cargos (Id_cargo)";
            statement.executeUpdate(alterFuncionariosTable);

           
            String insertCargos = "INSERT INTO cargos (nome) VALUES ('diretor'), ('secretario(a)'), ('professor')";
            statement.executeUpdate(insertCargos);

            String insertFuncionarios = "INSERT INTO funcionarios (nome, funcao) VALUES " +
                    "('Dandara', 1), ('aryana', 2), ('lua', 3)";
            statement.executeUpdate(insertFuncionarios);

            String insertDependente = "INSERT INTO dependente (nome, funcionario) VALUES " +
                    "('lua', 2), ('estrela', 2)";
            statement.executeUpdate(insertDependente);

      

            System.out.println("Script executado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
