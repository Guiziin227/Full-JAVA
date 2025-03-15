package ex5.entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalGrade() {
        return (nota1 + nota2 + nota3);
    }

    public String isApproved() {
        if (finalGrade() >= (110 * 0.6)) {
            return "PASS" + "\nFINAL GRADE: " + finalGrade();
        } else {
            return "FINAL GRADE: " + finalGrade() + "\nFAILED\nMISSING " + ((110 * 0.6) - finalGrade()) + " POINTS";

        }
    }
}
