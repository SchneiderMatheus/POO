import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aula15 {
    public static void main(String[] args) {
        /* 
        Lendo arquivo texto com classes File e Scanner

        Classes
        • File - Representação abstrata de um arquivo e seu caminho
        • https://docs.oracle.com/javase/10/docs/api/java/io/File.html

        • Scanner - Leitor de texto
        • https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
        
        • IOException (Exception)
        • https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html

            
        File file = new File("in.txt.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
        Classes
        • FileReader (stream de leitura de caracteres a partir de arquivos)
        • https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html

        • BufferedReader (mais rápido)
        • https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html
        • https://stackoverflow.com/questions/9648811/specific-difference-betweenbufferedreader-and-filereader
        

        */
        String path ="\"D:\\in.txt.txt\"";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (Exception e) {
        System.out.println("Error: "+e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
