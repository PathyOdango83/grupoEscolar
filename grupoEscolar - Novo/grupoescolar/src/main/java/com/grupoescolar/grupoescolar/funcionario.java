package com.grupoescolar.grupoescolar;
public class funcionario {
    private static String nome;
    static int id;

public funcionario(String nome, int id) {
    funcionario.nome = nome;
    funcionario.id = id;
}

// Método setter para o atributo nome
/**
 * @param nome
 */
public static void setNome(String nome) {
    funcionario.nome = nome;
}

// Método getter para o atributo nome
public static String getNome() {
    return nome;
}

// Método setter para o atributo id
public void setId(int id) {
    funcionario.id = id;
}

// Método getter para o atributo id
public static int getId() {
    return id;
}
}