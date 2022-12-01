package cursojava.classes;

/**
 *
 * @author Wellington
 */
public class Aluno {
    /* Por default o Java cria os atributos como private. 
    * para ter acesso publico é preciso informar no atributo 
    * que é public. */
    private String nome;
    private int idade;
    
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
    
    /* Métodos SETTERS e GETTERS do Objeto */
    // Recebe dados

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     
}
