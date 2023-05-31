package com.grupoescolar.grupoescolar;

public class mostraSala {

        private static String tipo;
        static int id;
    
    public void salas(String tipo,int id) {
        salas.tipo = tipo;
        salas.id = id;
    }
    
    // Método setter para o atributo nome
    /**
     * @param tipo
     */
    public static void setNome(String tipo) {
        salas.tipo = mostraSala.tipo;
    }
    
    // Método getter para o atributo nome
    public static String getTipo() {
        return tipo;
    }
    
    // Método setter para o atributo id
    public void setId(int id) {
        salas.id = id;
    }
    
    // Método getter para o atributo id
    public static int getId() {
        return id;
    }
}
    

