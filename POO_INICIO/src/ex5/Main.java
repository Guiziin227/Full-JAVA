package ex5;

import ex5.entities.Student;

public class Main {
    public static void main(String[] args) {
        Student aluno1 = new Student();
        Student aluno2 = new Student();
        aluno1.name = "Malu";
        aluno1.nota1 = 27.0;
        aluno1.nota2 = 35.0;
        aluno1.nota3 = 32.0;
        System.out.println(aluno1.name + ": " + aluno1.isApproved());
        aluno2.name = "Guilherme";
        aluno2.nota1 = 17.0;
        aluno2.nota2 = 15.0;
        aluno2.nota3 = 12.0;
        System.out.println(aluno2.name + ": " + aluno2.isApproved());
    }
}
