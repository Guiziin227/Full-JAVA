package aula03_multiplas.model.entities;

public class ConcretScanner extends Device implements Scanner{
    public ConcretScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanning: " + doc);
    }

    @Override
    public String scan() {
        return "Scan result";
    }
}
