package example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWriteExample {
    public static void main(String[] args) {
        String relativePath = "out.txt";

        File file = new File(relativePath);
        try{
            String message = "djsaufs dioisadh usad uf ufwgrfiqbask fq3i KUFL WFHKdf  hweuif wiwe fewu fwef9fwakjflsagfwa";
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message);
            bufferedWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}