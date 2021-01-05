package pll.camp.it.files;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "E:\\IT-CAMP3\\testFile.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cos sie zepsuło !!");
        } catch (IOException e) {
            System.out.println("Nie czyta się !!");
        }

        String filePathWrite = "E:\\IT-CAMP3\\testWriteFile.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePathWrite, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append("s1");
            bufferedWriter.newLine();
            bufferedWriter.append("askdhjfkhasgdf");
            bufferedWriter.newLine();
            bufferedWriter.append("aksljhdgfk");
            bufferedWriter.newLine();
            bufferedWriter.append("kajsdfkljhasgdf");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
