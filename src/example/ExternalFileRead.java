package example;

import java.io.*;

public class ExternalFileRead {


    public static void main(String[] args) {
        String filePath = "C:\\Users\\Halip\\IdeaProjects\\SortingAlgotithms\\movies.txt";
        String relativePath = "movies.txt";
        File file  = new File(relativePath);
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line =bufferedReader.readLine();
            while(line!=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
