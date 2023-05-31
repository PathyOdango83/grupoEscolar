package com.grupoescolar;

import com.grupoescolar.grupoescolar.escola;

public class testaEscola {
    static String nome;
    static int cnpj;
        /**
         * @param nome
         * @param cnpj
         */
        public testaEscola(String nome, int cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    
    // Método setter para o atributo nome
    /**
     * @param nome
     */
    public void setNome(String nome) {
        escola.nome = nome;
    }
    
    // Método getter para o atributo nome
    public static String getNome() {
        return nome;
    }
    
    // Método setter para o atributo id
    public void setCnpj(int cnpj) {
        escola.cnpj = cnpj;
    }
    
    // Método getter para o atributo id
    public static int getCnpj() {
        return cnpj;
    }
    
}

