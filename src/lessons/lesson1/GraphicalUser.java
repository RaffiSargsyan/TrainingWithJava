package lessons.lesson1;

import javax.swing.JOptionPane;

public class GraphicalUser {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name");
        JOptionPane.showMessageDialog(null, "Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }
}
