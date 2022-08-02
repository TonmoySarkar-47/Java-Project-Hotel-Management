import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame1 extends JFrame implements ActionListener,MouseListener
{
    JPanel panel;
    JButton guestB,adminB;
    JLabel label;

    Frame1()
    {
        super("Hotel Name");
        this.setSize(500,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(51,204,255));
       

        label = new JLabel("Welcome To Our Hotel");
		label.setBounds(180,10,700,700);
		label.setForeground(new Color(153,0,0));
		label.setFont(new Font("Script MT Bold",Font.PLAIN,56));
		panel.add(label);

        guestB=new JButton("Guest Login");
        guestB.setBounds(820,220,120,80);
        guestB.addActionListener(this);
        panel.add(guestB);

        adminB=new JButton("Admin Login");
        adminB.setBounds(820,420,120,80);
        adminB.addActionListener(this);
        panel.add(adminB);

         this.add(panel);

    }

    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==guestB)
        {
            System.out.println("Working");
        }
        else if(ae.getSource()==adminB) 
        {
            Frame2 f2=new Frame2();
            f2.setVisible(true);
            this.setVisible(false);
        }
    }
    
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == guestB)
		{
			guestB.setBackground(Color.black);
			guestB.setForeground(Color.GREEN);
		}
		else if(me.getSource() == adminB)
		{
			adminB.setBackground(Color.black);
			adminB.setForeground(Color.GREEN);
		}

	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == guestB)
		{
			guestB.setBackground(Color.WHITE);
			guestB.setForeground(Color.BLACK);
		}
		else if(me.getSource() == adminB)
		{
			adminB.setBackground(Color.WHITE);
			adminB.setForeground(Color.BLACK);
		}
	
	}

}