package pll.camp.it.files;

import java.io.*;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        String pathToFile = "E:\\IT-CAMP3\\users.txt";

        try {
            FileReader fileReader = new FileReader(pathToFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(";");

                User user = new User();
                user.setId(Integer.parseInt(data[0]));
                user.setLogin(data[1]);
                user.setPass(data[2]);
                user.setName(data[3]);
                user.setSurname(data[4]);

                users.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(users);
    }
}
