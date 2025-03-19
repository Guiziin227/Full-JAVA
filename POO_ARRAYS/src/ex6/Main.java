package ex6;

import ex6.entities.Employe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employe> employes = new ArrayList<>();

        System.out.println("Quantos funcionários serão registrados?");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Funcionario #" + i);
            Integer id = i;
            sc.nextLine();
            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Salario:");
            Double salario = sc.nextDouble();
            Employe emp = new Employe(nome,id,salario);
            employes.add(emp);
        }

        for (Employe emp : employes) {
            System.out.println(emp.getId() + " " + emp.getNome() + " " + emp.getSalario());
        }


        System.out.println("Buscar alguém por ID");
        int id = sc.nextInt();
        Employe emp = employes.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Esse id nao existe");
        }else{
            System.out.println("Enter the percent:");
            double percent = sc.nextDouble();
            //employes.get(emp.getId()).aumentarSalario(percent);
            emp.aumentarSalario(percent);
        }

//        Integer pos = hasId(employes,id);
//        if (pos == null) {
//            System.out.println("Esse id nao existe");
//        }else{
//            System.out.println("Enter the percent:");
//            double percent = sc.nextDouble();
//            employes.get(pos).aumentarSalario(percent);
//        }


        for (Employe e : employes) {
            System.out.println(e.getId() + " " + e.getNome() + " " + e.getSalario());
        }

    }

    public static Integer hasId(List<Employe> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
