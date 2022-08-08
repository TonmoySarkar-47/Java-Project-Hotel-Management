import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame2 extends JFrame implements ActionListener,MouseListener,KeyListener
{
    JPanel panel;
    ImageIcon img;
    JLabel name,pass,admin,bgimg,key;
    JButton logIn,back;
    JTextField txt;
    JPasswordField pf;

    Frame2()
    {
        super("Admin Login Page");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.addKeyListener(this);
        
        img=new ImageIcon(this.getClass().getResource("Frame2.png"));
        bgimg=new JLabel(img);
        bgimg.setSize(this.getSize());
		bgimg.addKeyListener(this);
        panel.add(bgimg);

        admin=new JLabel("Please Enter Your Name And Password To Log In");
        admin.setBounds(180,145,600,40);
		admin.setForeground(Color.yellow);
		admin.setFont(new Font("Times New Roman",Font.PLAIN,23));
		bgimg.add(admin);

        name=new JLabel("Username: ");
        name.setBounds(280,230,100,30);
		name.setForeground(Color.yellow);
		name.setFont(new Font("Times New Roman",Font.PLAIN,20));
		bgimg.add(name);
        
        txt=new JTextField();
        txt.setBounds(400,230,100,30);
		txt.addKeyListener(this);
        bgimg.add(txt);

        pass=new JLabel("Password: ");
        pass.setBounds(280,280,100,30);
		pass.setForeground(Color.yellow);
		pass.setFont(new Font("Times New Roman",Font.PLAIN,20));
		bgimg.add(pass);
        
		pf=new JPasswordField();
		pf.setBounds(400, 280, 100, 30);
		pf.addKeyListener(this);
		pf.setEchoChar('*');
		bgimg.add(pf);

        logIn=new JButton("Log In");
        logIn.setBounds(440,330,80,30);
        logIn.addActionListener(this);
        logIn.addMouseListener(this);
		logIn.setFocusable(false);
        bgimg.add(logIn);

        back=new JButton("Back");
        back.setBounds(340,330,65,30);
        back.addActionListener(this);
        back.addMouseListener(this);
		back.setFocusable(false);
        bgimg.add(back);

        this.add(panel);

    }

    public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(logIn.getText().equals(command))
		{
			String s1 = txt.getText();
			String s2 = pf.getText();
			//String s2 = new String(pf.getPassword());
            //String s2= pf.getPassword();
			//String s2= String.valueOf(pf.getPassword());

			if(s1.equals("a") && s2.equals("a"))
			{
                Frame3 f3 = new Frame3(s1,s2, this);
                f3.setVisible(true);
                this.setVisible(false);
				showMessageDialog(null,"Log In Successful! ");
			}
            else 
            {
				showMessageDialog(null, "Invalid Username or password!");
				txt.setText("");
				pf.setText("");
            }         
			
		}
        else if(ae.getSource()==back) 
        {
            Frame1 f1=new Frame1();
            f1.setVisible(true);
            this.setVisible(false);
        }
    }

    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == back)
		{
			back.setBackground(Color.black);
			back.setForeground(Color.RED);
		}
		else if(me.getSource() == logIn)
		{
			logIn.setBackground(Color.black);
			logIn.setForeground(Color.GREEN);
		}

	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == back)
		{
			back.setBackground(Color.WHITE);
			back.setForeground(Color.BLACK);
		}
		else if(me.getSource() == logIn)
		{
			logIn.setBackground(Color.WHITE);
			logIn.setForeground(Color.BLACK);
		}
	
	}

	public void keyTyped(KeyEvent k){}
	public void keyPressed(KeyEvent k){

		if(k.getKeyCode()==10 && k.getSource()==txt )
		{			
            pf.requestFocus();		
		}
		else if(k.getKeyCode()==10 && k.getSource()==pf )
		{			
			String s1 = txt.getText();
			String s2 = pf.getText();

			if(s1.equals("a") && s2.equals("a"))
			{
                Frame3 f3 = new Frame3(s1,s2, this);
                f3.setVisible(true);
                this.setVisible(false);
				showMessageDialog(null,"Log In Successful! ");
			}
            else 
            {
				showMessageDialog(null, "Invalid Username or password!");
				txt.setText("");
				pf.setText("");
            }      	
		}
	}
	public void keyReleased(KeyEvent k){}
}
