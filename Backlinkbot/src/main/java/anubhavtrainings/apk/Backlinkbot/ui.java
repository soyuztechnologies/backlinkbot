 /*package anubhavtrainings.apk.Backlinkbot;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ui {
	static void Ginterface1(final String[] args) throws IOException  {  
		  final JFrame frame = new JFrame(Userinterface.class.getSimpleName());
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JPanel mainPanel = new JPanel(new GridBagLayout());
	      mainPanel.setLayout(new GridLayout(3,1));
	      
	      mainPanel.setBackground(Color.orange);
	     
	      mainPanel.setBorder(BorderFactory.createLineBorder(Color.black, 3));
	      GridBagConstraints constraints = new GridBagConstraints();
	      constraints.insets = new Insets(100,100, 100, 10);
	      constraints.anchor = GridBagConstraints.WEST;
	      JPanel subPanel1 = new JPanel();
	      
	      
	      subPanel1.setBackground(Color.pink);
	      subPanel1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
	      subPanel1.add(new JLabel("Main Panel", SwingConstants.CENTER));
	      
	      JPanel subPanel2 = new JPanel(); // sub-panel 2
	      subPanel2.setBackground(Color.BLUE);
	      subPanel2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
	      subPanel2.add(new JLabel("Main Panel", SwingConstants.CENTER));
	      
	      JPanel box = new JPanel();
	      box.setBackground(Color.yellow);
	      box.setBorder(BorderFactory.createLineBorder(Color.black, 2));
	      box.add(new JLabel("Main Panel", SwingConstants.CENTER));
	      
	      mainPanel.add(box);
	      
	      
	      JButton btn1 = new JButton("ANUBHAV1");
	      btn1.setPreferredSize(new Dimension(btn1.WIDTH + 117, btn1.HEIGHT + 40));
	      box.add(btn1, constraints);
	      btn1.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			    	
			    	
			        }
		  	    
			    });
	      
	      JButton btn11 = new JButton("ANUBHAV2");
	      btn11.setPreferredSize(new Dimension(btn11.WIDTH + 157, btn1.HEIGHT + 30));
	      box.add(btn11, constraints);
	      btn11.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			    	
			    	
			        }
		  	    
			    });
	      
	      
	      JButton btn111 = new JButton("ANUBHAV3");
	      btn11.setPreferredSize(new Dimension(btn111.WIDTH + 137, btn1.HEIGHT + 30));
	      box.add(btn111, constraints);
	      btn111.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			    	
			    	
			        }
		  	    
			    });
	      
	      
	      
	      JButton btn2 = new JButton("Youtube Playlist");
	      btn2.setPreferredSize(new Dimension(btn2.WIDTH + 136, btn2.HEIGHT + 30));
	      btn2.addActionListener(new ActionListener(){  
	  	    public void actionPerformed(ActionEvent e){  
		    	Backlink  objy=new Backlink ();
		    	readfile  obj1=new readfile ();
		    	try {
					objy.youtube();
					String fileformateYou =obj1.CreateFileForYoutubeTrack(args);
			    	System.out.println(fileformateYou);
					FileWriter myWriter = new FileWriter(fileformateYou, true);
				      myWriter.write( objy.toString());
				      myWriter.write("\r\n");
				      myWriter.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	  	    }
		    });
	      subPanel1.add(btn2, constraints);
	      
	      JButton btn22 = new JButton("test1");
	      btn22.setPreferredSize(new Dimension(btn22.WIDTH + 117, btn22.HEIGHT + 40));
	      subPanel1.add(btn22, constraints);
	      btn22.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			    	
			    	
			        }
		  	    
			    });
	      
	      JButton btn222 = new JButton("test1");
	      btn222.setPreferredSize(new Dimension(btn222.WIDTH + 117, btn222.HEIGHT + 40));
	      subPanel1.add(btn222, constraints);
	      btn222.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			        }
		  	    
			    });
	      
	      JButton btn2222 = new JButton("test1");
	      btn2222.setPreferredSize(new Dimension(btn2222.WIDTH + 117, btn2222.HEIGHT + 40));
	      subPanel1.add(btn2222, constraints);
	      btn2222.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			        }
		  	    
			    });
	      
	      JButton btn22222 = new JButton("test1");
	      btn22222.setPreferredSize(new Dimension(btn22222.WIDTH + 117, btn22222.HEIGHT + 40));
	      subPanel1.add(btn22222, constraints);
	      btn22222.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			        }
		  	    
			    });
	      
	      JButton btn222222 = new JButton("test1");
	      btn222222.setPreferredSize(new Dimension(btn222222.WIDTH + 117, btn222222.HEIGHT + 40));
	      subPanel1.add(btn222222, constraints);
	      btn222222.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			        }
		  	    
			    });
	      
	      
	      JButton btn3 = new JButton("AnubhavSite");
	      btn3.setPreferredSize(new Dimension(btn3.WIDTH + 105, btn3.HEIGHT + 50));
	      btn3.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink ();
			    	readfile  obj1=new readfile ();
			    	try {
						obj.AnubhavSite();
						String fileformateSite =obj1.CreateFileForAnubhavSiteTrack(args);
				    	System.out.println(fileformateSite);
						FileWriter myWriter = new FileWriter(fileformateSite, true);
					      myWriter.write( obj.toString());
					      myWriter.write("\r\n");
					      myWriter.close();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      
	      subPanel2.add(btn3, constraints);
	      
	      JButton btn33 = new JButton("test1");
	      btn33.setPreferredSize(new Dimension(btn33.WIDTH + 117, btn33.HEIGHT + 40));
	      subPanel2.add(btn33, constraints);
	      btn33.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			        }
		  	    
			    });
	      
	      JButton btn333 = new JButton("test1");
	      btn333.setPreferredSize(new Dimension(btn333.WIDTH + 117, btn333.HEIGHT + 40));
	      subPanel2.add(btn333, constraints);
	      btn333.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	
			        }
		  	    
			    });
	        
	      mainPanel.add(subPanel1);
	      mainPanel.add(subPanel2);
	      frame.add(mainPanel);
	      frame.pack();
	      frame.setVisible(true);
	    
}

}*/
