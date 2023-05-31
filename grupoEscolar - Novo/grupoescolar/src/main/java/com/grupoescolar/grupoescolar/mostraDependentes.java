package com.grupoescolar.grupoescolar;

public class mostraDependentes {
    private static String nome;
    private static int id;

/**
 * @param nome
 * @param id
 */
public void dependentes(String nome, int id) {
    dependentes.nome = nome;
    dependentes.id = id;
}

// Método setter para o atributo nome
/**
 * @param nome
 */
public static void setNome(String nome) {
    dependentes.nome = nome;
}

// Método getter para o atributo nome
public static String getNome() {
    return nome;
}

// Método setter para o atributo id
/**
 * @param id
 */
public void setId(int id) {
        id = id;
}

// Método getter para o atributo id
public static int getId() {
    return id;
}

@Override
public String toString() {
    return "mostraDepedentes []";
}
    
}
