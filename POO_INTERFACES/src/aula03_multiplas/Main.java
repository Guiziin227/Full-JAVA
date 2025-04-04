package aula03_multiplas;

import aula03_multiplas.model.entities.ComboDevice;
import aula03_multiplas.model.entities.ConcretPrinter;
import aula03_multiplas.model.entities.ConcretScanner;

public class Main {
    public static void main(String[] args) {

        ConcretPrinter p = new ConcretPrinter("1080");
        p.processDoc("My doc");
        p.print("My doc");

         ConcretScanner s = new ConcretScanner("2003");
         s.processDoc("My doc");
        System.out.println(s.scan() + " " + s.getSerialNumber());

        ComboDevice cd = new ComboDevice("2003");

        cd.processDoc("My doc cd");
        cd.print("My doc");
        System.out.println(cd.scan() + " " + cd.getSerialNumber());
        System.out.println(cd.getSerialNumber());
    }
}
