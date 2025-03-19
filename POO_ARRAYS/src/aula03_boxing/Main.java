package aula03_boxing;

public class Main {
    public static void main(String[] args) {
        //testes de boxing and unboxing

        //boxing
        int x = 20;

        Object obj = x;
        System.out.println(obj);

        //unboxing
        int y = (int) obj;
        System.out.println(y);

        /// wrapper
        int w = 40;
        Integer obj2 = w;
        int v = obj2 * 2;
        System.out.println(v);

    }
}
