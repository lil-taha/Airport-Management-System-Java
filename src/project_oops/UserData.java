package project_oops;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserData {
    private static final String FILE_NAME = "users.dat";

    public static void saveUser(User user) {
        List<User> users = loadUsers();
        users.add(user);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static List<User> loadUsers() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
