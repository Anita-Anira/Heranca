package sample;

public class Main {

    public static void main(String[] args){

        Aluno aluno = new Aluno();
        Docente docente = new Docente();

        System.out.println("Docente é uma pessoa? "+(docente instanceof Pessoa));
        System.out.println("Docente é uma servidor? "+(docente instanceof Servidor));
        System.out.println("Aluno é uma pessoa? "+(aluno instanceof Pessoa));
        System.out.println("Docente é um Objects? "+(docente instanceof Object));
    }
}


