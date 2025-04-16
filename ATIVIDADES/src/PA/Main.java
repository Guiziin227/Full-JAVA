package PA;

import PA.model.entities.Auxiliar;
import PA.model.entities.Medico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao PA");

        Medico m1 = new Medico("Gui", "2006-04-12", "123456");
        System.out.println(m1.calcularIdade());

        Auxiliar a1 = new Auxiliar("Ana", "2005-05-12", "654321");
        Auxiliar a2 = new Auxiliar("Malu", "2002-05-12", "6543241");


        m1.designarAuxiliar(a1);
        m1.designarAuxiliar(a2);
        a1.setMedico(m1);


        for (Auxiliar m : m1.getAuxiliares()) {
            System.out.println(m.getNome());
        }

        // Usando um auxiliar específico (exemplo com a1)
        if (a1.getMedico() != null) {
            System.out.println("Médico responsável: " + a1.getMedico().getNome() + " - CRM: " + a1.getMedico().getCrm());
        } else {
            System.out.println("Este auxiliar não está associado a nenhum médico.");
        }
        sc.close();
    }
}
