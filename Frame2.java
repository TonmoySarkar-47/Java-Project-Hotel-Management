import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame2 extends JFrame implements ActionListener
{
    JPanel panel;
    JLabel name,pass,admin;
    JButton logIn,back;
    JTextField txt;
    JPasswordField pf;

    Frame2()
    {
        super("Admin Login Page");
		this.setSize(400, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
        panel.setBackground(new Color(51,204,255));
        

        name=new JLabel("Name: ");
        name.setBounds(350,50,100,30);
		name.setForeground(new Color(102,51,0));
		name.setFont(new Font("Times New Roman",Font.PLAIN,20));
		panel.add(name);
        
        txt=new JTextField();
        txt.setBounds(450,50,100,30);
        panel.add(txt);

        pass=new JLabel("Password: ");
        pass.setBounds(350,70,100,30);
		pass.setForeground(new Color(102,51,0));
		pass.setFont(new Font("Times New Roman",Font.PLAIN,20));
		panel.add(pass);
        
        pf = new JPasswordField();
		pf.setBounds(450, 70, 100, 30);
		pf.setEchoChar('*');
		panel.add(pf);

        admin=new JLabel("Please Enter Your Name And Password To Log IN");
        admin.setBounds(350,10,600,40);
		admin.setForeground(new Color(102,51,0));
		admin.setFont(new Font("Times New Roman",Font.PLAIN,20));
		panel.add(admin);

        logIn=new JButton("Log In");
        logIn.setBounds(450,115,80,45);
        logIn.addActionListener(this);
        panel.add(logIn);

        back=new JButton("Back");
        back.setBounds(350,115,80,40);
        back.addActionListener(this);
        panel.add(back);

        this.add(panel);

    }

    public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(logIn.getText().equals(command))
		{
			String s1 = txt.getText();
			String s2 = pf.getText();
			if(s1.equals("Admin") && s2.equals("adminpass"))
			{
                Frame3 f3 = new Frame3(s1,s2, this);
                f3.setVisible(true);
                this.setVisible(false);
			}
            else 
            {
                System.exit(0);
            }         
			
		}
        else if(ae.getSource()==back) 
        {
            Frame1 f1=new Frame1();
            f1.setVisible(true);
            this.setVisible(false);
        }
    }
}
