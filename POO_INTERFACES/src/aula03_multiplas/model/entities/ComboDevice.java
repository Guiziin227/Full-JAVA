package aula03_multiplas.model.entities;

public class ComboDevice extends Device implements Printer, Scanner{

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processing: " + doc);
    }

    @Override
    public String scan() {
        return "Scan result";
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
