package com.grupoescolar.grupoescolar;


public class funcionaro {

  public static void main (String[] args){

   funcionario ac = new funcionario(null, 0);

   // Exibindo os atributos do Funcionario
   System.out.println("Nome do funcionário: " + funcionario.getNome());
   System.out.println("ID do funcionário: " + funcionario.getId());
   
   // Alterando o nome do funcionário
   funcionario.setNome(null);
   
   // Exibindo o novo nome do funcionário
   System.out.println("Novo nome do funcionário: " + funcionario.getNome());

  } 
    
}
