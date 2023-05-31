package com.grupoescolar.grupoescolar;

public class cargo {
        private static String nome;
        static int id;
    
    public cargo(String nome, int id) {
        cargo.nome = nome;
        cargo.id = id;
    }
    
    // Método setter para o atributo nome
    /**
     * @param nome
     */
    public static void setNome(String nome) {
        cargo.nome = nome;
    }
    
    // Método getter para o atributo nome
    public static String getNome() {
        return nome;
    }
    
    // Método setter para o atributo id
    public void setId(int id) {
        cargo.id = id;
    }
    
    // Método getter para o atributo id
    public static int getId() {
        return id;
    }
    }

