package OO.streams;

import java.util.Objects;

public class Aluno {

    final String nome;
    final double nota;



    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }



    public Object charAt(int i) {
        return null;
    }
    
    public String toString(){
        return nome + " tem nota " + nota;
    }




    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && nota == aluno.nota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
  

}
