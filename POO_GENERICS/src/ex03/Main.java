package ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> votos = new HashMap<>();

        String path = "./POO_GENERICS/src/ex03/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null){
                String []partes = line.split(",");
                String name = partes[0];
                int count = Integer.parseInt(partes[1]);

                if (votos.containsKey(name)) {
                    int votesSoFar = votos.get(name);
                    votos.put(name, count + votesSoFar);
                }
                else {
                    votos.put(name, count);
                }

            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(votos);

    }
}
