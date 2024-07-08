package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        Image i1 = imageIcon.getImage().getScaledInstance(858,680,Image.SCALE_DEFAULT); //To scale the added image by default
        add(label);

        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);

        try {
            Thread.sleep(3000);
            new Login(); //opening login window
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
