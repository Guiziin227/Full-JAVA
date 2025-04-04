package ex01;

import ex01.model.entities.Contract;
import ex01.model.entities.Installment;
import ex01.model.services.ContractService;
import ex01.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Contract contract;

        System.out.println("Entre com o contrato");
        System.out.println("Numero: ");
        int number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy)");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.println("Valor contrato: ");
        double valorContrato = sc.nextDouble();

        contract = new Contract(number,date,valorContrato);

        System.out.println("Entre com o numero de parcelas");
        int parcelas = sc.nextInt();
        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract,parcelas);
        System.out.println("Parcelas:");
        for (Installment i : contract.getInstallments()){
            System.out.println(i);
        }

    }
}
