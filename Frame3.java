import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame3 extends JFrame implements ActionListener
{
    JLabel label;
    Frame2 f2;
    JPanel panel;
    JButton button;

    Frame3(String s1,String s2,Frame2 f2)
    {
        super("Page 3");
		this.setSize(600, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.f2 = f2;
		
		panel = new JPanel();
		panel.setLayout(null);
        panel.setBackground(new Color(51,204,255));
       


        label=new JLabel("Log In Successful");
        label.setBounds(180,100,700,70);
		label.setForeground(new Color(0,102,0));
		label.setFont(new Font("Script MT Bold",Font.PLAIN,56));
		panel.add(label);

        button=new JButton("Log Out");
        button.setBounds(350,190,90,60);
        button.addActionListener(this);
        panel.add(button);

         this.add(panel);
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==button) 
        {
                Frame1 f1 = new Frame1();
                f1.setVisible(true);
                this.setVisible(false);
        }
    }
}