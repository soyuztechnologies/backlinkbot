package anubhavtrainings.apk.Backlinkbot;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 

import java.io.IOException;
public class Userinterface {
	static void Ginterface(String[] args) throws IOException  {  
		  final JFrame frame = new JFrame(Userinterface.class.getSimpleName());
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JPanel panel = new JPanel(new GridBagLayout());
	      GridBagConstraints constraints = new GridBagConstraints();
	      constraints.insets = new Insets(5, 5, 5, 5);
	      constraints.anchor = GridBagConstraints.WEST;
	      JButton btn1 = new JButton("1");
	      panel.add(btn1, constraints);
	      JButton btn2 = new JButton("2");
	      btn2.setPreferredSize(new Dimension(btn1.getPreferredSize().width, btn1 .getPreferredSize().height + 30));
	      btn2.addActionListener(new ActionListener(){  
	  	    public void actionPerformed(ActionEvent e){  
		    	Backlink  obj=new Backlink ();  
		    	try {
					obj.myMethod1();
					obj.myMethod2();
					obj.myMethod();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        }  
		    });
	      panel.add(btn2, constraints);
	      JButton btn3 = new JButton("3");
	      btn3.setPreferredSize(new Dimension(btn2.getPreferredSize().width, btn2 .getPreferredSize().height + 20));
	      panel.add(btn3, constraints);
	      JButton btn4 = new JButton("4");
	      btn4.setPreferredSize(new Dimension(btn2.getPreferredSize().width, btn3 .getPreferredSize().height + 5));
	      panel.add(btn4, constraints);
	      JButton btn5 = new JButton("5");
	      btn5.setPreferredSize(new Dimension(btn2.getPreferredSize().width, btn3 .getPreferredSize().height + 50));
	      panel.add(btn5, constraints);
	      frame.add(panel);
	      frame.pack();
	      frame.setVisible(true);
	    
}
}
