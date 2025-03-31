package aula01_read;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("../in.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }
    }
}