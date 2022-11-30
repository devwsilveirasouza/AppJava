package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

    public static void main(String[] args) {
        /* Instânciando a classe. */
        Aluno aluno1 = new Aluno();
        /* Setando valores aos atributos. */
        aluno1.nome = "Pedro";
        /* Imprimir o atributo do objeto aluno no console. */
        System.out.println("O nome do aluno 1 é: " + aluno1.nome);
        
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Wellingotn";
        System.out.println("O nome do aluno 2 é: " + aluno2.nome);
        
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Maria";
        System.out.println("O nome do aluno 3 é: " + aluno3.nome);
        
        Aluno aluno4 = new Aluno("Marmota");        
        System.out.println("O nome do aluno 4 é: " + aluno4.nome);
        
        Aluno aluno5 = new Aluno("José", 50);
        System.out.println("O nome do aluno 5 é " + aluno5.nome + " e sua idade é " + aluno5.idade);
                
    }
    
}
