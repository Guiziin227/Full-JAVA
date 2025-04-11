package aula05_hashcode;

public class Main {
    public static void main(String[] args) {
        String a = "Maria";
        String b = "Alex";
        String c = "Aelx";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
    }
}
