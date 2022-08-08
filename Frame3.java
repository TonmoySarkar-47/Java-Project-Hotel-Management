import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame3 extends JFrame implements ActionListener,MouseListener
{
    JLabel label,bgimg;
    ImageIcon img;
    Frame2 f2;
    JPanel panel;
    JButton logOut;

    Frame3(String s1,String s2,Frame2 f2)
    {
        super("Management System");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.f2 = f2;
		
		panel = new JPanel();
		panel.setLayout(null);
       
        img=new ImageIcon(this.getClass().getResource("Frame3.png"));
        bgimg=new JLabel(img);
        bgimg.setSize(this.getSize());
        panel.add(bgimg);

        label=new JLabel("Welcome To Management");
        label.setBounds(280,120,500,30);
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Script MT Bold",Font.PLAIN,23));
		bgimg.add(label);

        logOut=new JButton("Log Out");
        logOut.setBounds(660,100,85,30);
        logOut.addActionListener(this);
        logOut.addMouseListener(this);
		logOut.setFocusable(false);
        bgimg.add(logOut);

         this.add(panel);
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==logOut) 
        {
                Frame1 f1 = new Frame1();
                f1.setVisible(true);
                this.setVisible(false);

				showMessageDialog(null,"Successfully Logged Out");
        }
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == logOut)
		{
			logOut.setBackground(Color.black);
			logOut.setForeground(Color.green);
		}
        else{}
		/*else if(me.getSource() == adminB)
		{
			adminB.setBackground(Color.black);
			adminB.setForeground(Color.GREEN);
		}*/

	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == logOut)
		{
			logOut.setBackground(Color.WHITE);
			logOut.setForeground(Color.BLACK);
		}
	
	}
}
