
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame{
    
    About() {
    
        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(Color.WHITE);
        
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
    Image i2 = i1.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(350,0,300,200);
    add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70,20,300,130);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);
        
        JLabel name = new JLabel("Developed By:Anand Mohan Jha");
        name.setBounds(70,220,500,40);
        name.setFont(new Font("Tahoma",Font.BOLD,30));
        add(name);
        
        JLabel rollno = new JLabel("Roll Number: 430119010168");
        rollno.setBounds(70,280,500,40);
        rollno.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(rollno);
        
        JLabel contact = new JLabel("Contact:anandjhaa920@gmail.com");
        contact.setBounds(70,340,500,40);
        contact.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    
    public static void main(String[] args)
    {
        new About();
    }
            
}
