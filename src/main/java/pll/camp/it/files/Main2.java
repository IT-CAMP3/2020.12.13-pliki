package pll.camp.it.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "admin", "admin", "Pan", "Admin"));
        list.add(new User(2, "mateusz", "mateusz", "Mateusz", "Bereda"));
        list.add(new User(3, "janusz", "janusz", "Janusz", "Kowalski"));
        list.add(new User(4, "bogdan", "bogdan", "Bogdan", "Malinowski"));

        String filePathWrite = "E:\\IT-CAMP3\\users.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePathWrite, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean flag = false;
            for(User user : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(user.getId())
                        .append(";")
                        .append(user.getLogin())
                        .append(";")
                        .append(user.getPass())
                        .append(";")
                        .append(user.getName())
                        .append(";")
                        .append(user.getSurname());
                if(flag) {
                    bufferedWriter.newLine();
                } else {
                    flag = true;
                }

                bufferedWriter.append(sb.toString());
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
