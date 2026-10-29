import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aula15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Lendo arquivo texto com classes File e Scanner
         * 
         * Classes
         * • File - Representação abstrata de um arquivo e seu caminho
         * • https://docs.oracle.com/javase/10/docs/api/java/io/File.html
         * 
         * • Scanner - Leitor de texto
         * • https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
         * 
         * • IOException (Exception)
         * • https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html
         * 
         
        File file = new File("in.txt.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
_______________________________________________________________________________________________________________________________
         * Classes
         * • FileReader (stream de leitura de caracteres a partir de arquivos)
         * • https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html
         * 
         * • BufferedReader (mais rápido)
         * • https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html
         * • https://stackoverflow.com/questions/9648811/specific-difference-
         * betweenbufferedreader-and-filereader
         * 
         * 
         
        String path = "/home/mathe/estudos/POO/in.txt.txt";

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
            System.out.println("Error: " + e.getMessage());
        } finally {
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
     _______________________________________________________________________________________________________________________________

         * Bloco try-with-resources
         * • É um bloco try que declara um ou mais recursos, e garante que esses
         * recursos serão fechados ao final do bloco
         * • Disponível no Java 7 em diante
         * •
         * https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose
         * .html
         * 
         * 
         

        String path = "/home/mathe/estudos/POO/in.txt.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
_______________________________________________________________________________________________________________________________
        Classes
        • FileWriter (stream de escrita de caracteres em de arquivos)
        • https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html
        • Cria/recria o arquivo: new FileWriter(path)
        • Acrescenta ao arquivo existente: new FileWriter(path, true)
        • BufferedWriter (mais rápido)
        • https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html


        
       String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

        String path = "/home/mathe/estudos/POO/out.txt"; //criando o arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String string : lines) {
                bw.write(string);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
            /home/mathe/estudos/MultipleActivities/Files/in.csv
            
_______________________________________________________________________________________________________________________________
        INFORMAÇÕES SOBRE CAMINHO DO0 ARQUIVO:
        */
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        System.out.println("getPath: " + path.getPath()); //pega todo path
        System.out.println("getParent: " + path.getParent());// só o caminho
        System.out.println("getName: " + path.getName());//pega o nome
        
    }
}
