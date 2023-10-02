package lessons.anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageText {
    static int c = 1;

    public static void main(String[] args) {
        Message sms = new Message() {
            @Override
            public void sendMessage(String text) {
                System.out.println("Sending sms " + text);
            }
        };
        sms.sendMessage("Hello");

        JFrame f = new JFrame();
        f.setSize(400, 600);
        JButton j = new JButton("Press me");
        f.add(j);
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Count " + c++);
            }
        });
        f.setVisible(true);
    }
}
