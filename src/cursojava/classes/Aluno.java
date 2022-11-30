/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursojava.classes;

/**
 *
 * @author Wellington
 */
public class Aluno {
    /* Por default o Java cria os atributos como private. 
    * para ter acesso publico é preciso informar no atributo 
    * que é public. */
    public String nome;
    public int idade;
    
    public Aluno() {
        // Cria os dados da memória - construtor padrão Java
    }
    
    public Aluno(String nomePadrao) {
        // Cria os dados na memória com dados definidos - construtor padrão Java
        nome = nomePadrao;
    }
    
    public Aluno (String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao; 
    }
}
