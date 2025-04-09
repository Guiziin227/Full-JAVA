package petshop.model.services;

import petshop.model.entities.Pets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class SaveService {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ddMMyyyy'T'HHmm").withZone(ZoneId.systemDefault());

    private Instant instant;

    public SaveService(Instant instant){
        this.instant = instant;
    }


    public void saveFile(Pets pets, String nome){
        String nomeArquivo = fmt.format(instant) + "-" + nome.replaceAll("\\s+", "").toUpperCase() + ".txt";;
        System.out.println(nomeArquivo);


        String dirPath = "./ATIVIDADES/src/petshop/petsCadastrados";
        File directory = new File(dirPath);
        if (!directory.exists()){
            directory.mkdirs();
        }

        String path = dirPath + "/" + nomeArquivo;

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            bw.write("1 - " + pets.getNomeCompleto());
            bw.newLine();
            bw.write("2 - " + pets.getTipo());
            bw.newLine();
            bw.write("3 - " + pets.getSexo());
            bw.newLine();
            bw.write("4 - " + pets.getEndereço());
            bw.newLine();
            bw.write("5 - " + pets.getIdade());
            bw.newLine();
            bw.write("6 - " + pets.getPeso());
            bw.newLine();
            bw.write("7 - " + pets.getRaça());
            bw.newLine();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
