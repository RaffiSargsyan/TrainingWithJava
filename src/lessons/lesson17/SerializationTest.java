package lessons.lesson17;

import java.io.*;



public class SerializationTest {
    public static void main(String[] args) {
        User user = new User("log13", "aa@aa.a", "pass15");
        serializeUser(user);
        User u = deserialize();
        System.out.println(u.toString());
    }

    private static User deserialize() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("user.ser");
            ois = new ObjectInputStream(fis);
            User o = (User) ois.readObject();
            return o;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    // try with resources
    private static void serializeUser(User user) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("user.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(user);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

