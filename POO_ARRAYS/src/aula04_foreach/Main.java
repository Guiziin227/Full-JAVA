package aula04_foreach;

public class Main {
    public static void main(String[] args) {
        //testes de foreach
        String[] vect = new String[]{"Maria", "Bob", "Alex"};
        for (String obj : vect) {
            System.out.println(obj);
        }

        double sum = 0.0;
        Double soma = 0.0;
        Double[] vect2 = new Double[]{10.0, 20.0, 30.0};
        for (Double obj : vect2) {
            soma += obj;
            sum += obj;
        }
        System.out.println(soma.byteValue()); // posso colocar alguns métodos de bases de objetos
        System.out.println(sum);
    }
}


