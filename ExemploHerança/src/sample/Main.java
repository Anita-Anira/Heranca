package sample;
public class Main {

    public static void main(String[] args){

        Aluno aluno = new Aluno();

        aluno.nome = "Anita";
        aluno.matricula = "12345";
        aluno.conceitos = new String[] {" A "," B "," C "};

        System.out.println(aluno.nome+" "+aluno.matricula+" "+aluno.conceitos[0]);
    }
}


