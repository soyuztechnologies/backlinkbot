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

import com.sun.prism.paint.Color;

import java.io.IOException;
public class Userinterface {
	static void Ginterface(String[] args) throws IOException  {  
		  final JFrame frame = new JFrame(Userinterface.class.getSimpleName());
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JPanel panel = new JPanel(new GridBagLayout());
	      GridBagConstraints constraints = new GridBagConstraints();
	      constraints.insets = new Insets(100,10, 100, 10);
	      constraints.anchor = GridBagConstraints.WEST;
	      JButton btn1 = new JButton("Make Backlink");
	      btn1.setPreferredSize(new Dimension(btn1.WIDTH + 117, btn1.HEIGHT + 40));
	      panel.add(btn1, constraints);
	      btn1.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink ();  
			    	try {
						obj.BacklinkWin1();
						obj.BacklinkWin2();
						obj.BacklinkWin3();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        }  
			    });
	      JButton btn2 = new JButton("Youtube Playlist");
	      btn2.setPreferredSize(new Dimension(btn2.WIDTH + 126, btn2.HEIGHT + 50));
	      btn2.addActionListener(new ActionListener(){  
	  	    public void actionPerformed(ActionEvent e){  
		    	Backlink  obj=new Backlink ();  
		    	try {
					obj.youtube();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	  	    }
		    });
	      panel.add(btn2, constraints);
	      JButton btn3 = new JButton("AnubhavSite");
	      btn3.setPreferredSize(new Dimension(btn3.WIDTH + 105, btn3.HEIGHT + 50));
	      btn3.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink ();  
			    	try {
						obj.AnubhavSite();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      
	      panel.add(btn3, constraints);
	      JButton btn4 = new JButton("Onlywire");
	      btn4.setPreferredSize(new Dimension(btn4.WIDTH + 90, btn4.HEIGHT + 50));
	      btn4.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
		  	    	PinSites  obj=new PinSites ();  
			    	try {
						obj.Onlywire();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	  
	      panel.add(btn4, constraints);
	      JButton btn5 = new JButton("5");
	      btn5.setPreferredSize(new Dimension(btn2.getPreferredSize().width, btn3 .getPreferredSize().height + 5));
	      panel.add(btn5, constraints);
	      frame.add(panel);
	      frame.pack();
	      frame.setVisible(true);
	    
}

}