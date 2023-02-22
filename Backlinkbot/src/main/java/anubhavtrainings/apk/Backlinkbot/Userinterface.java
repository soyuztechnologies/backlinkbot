package anubhavtrainings.apk.Backlinkbot;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javafx.scene.control.Button;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class Userinterface {
	static JFrame f;
	static void Ginterface(final String[] args) throws IOException  {  
		  final JFrame frame = new JFrame(Userinterface.class.getSimpleName());
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JPanel panel = new JPanel(new GridBagLayout());
	      GridBagConstraints constraints = new GridBagConstraints();
	      panel.setBackground(Color.blue);
	      constraints.insets = new Insets(100,1, 100, 10);
	      constraints.anchor = GridBagConstraints.WEST;
	      JButton btn1 = new JButton("AutoRun Backlink");
	      //btn1.setLocation(1200, 800);
	      btn1.setPreferredSize(new Dimension(btn1.WIDTH + 117, btn1.HEIGHT + 40));
	      btn1.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	IPChanger i = new IPChanger();
			    	
			    	try {
			    		do{  
			    			//code to be executed
				    		 obj.BacklinkWin1();
	                         TimeUnit.MINUTES.sleep(30);
	                         i.closeall();
	                         System.out.println("first all page closed");
							 //JFrame f = new JFrame(); 
							   // JOptionPane.showMessageDialog(f," PLEASE CloseAll and RESTART.","EXECUTION COMPLETED",JOptionPane.WARNING_MESSAGE);
	                         IPChanger i1 = new IPChanger();
	                         Thread.sleep(30);
				    		 //obj.BacklinkWin1();
							 obj.BacklinkWin3();
	                         TimeUnit.MINUTES.sleep(30);
	                         i1.closeall();
	                         System.out.println("2nd all page closed");
	                         i1.closeall();
	                         IPChanger i2 = new IPChanger();
	                         Thread.sleep(30);
				    		 //obj.BacklinkWin1();
							 obj.BacklinkWin2();
							 
	                         TimeUnit.MINUTES.sleep(30);
	                         i2.closeall();
	                         System.out.println("3rd all page closed");
	                         i2.closeall();
			    			}while(true);  
						 //Backlink  objbacklink=new Backlink ();
						 //objbacklink.BacklinkWin1();
						 //objbacklink.BacklinkWin2();
						// objbacklink.BacklinkWin3();
						 
			    		
						//System.out.println(obj);
						//obj1.CreateFileWithTimeStamp(args);
				    	//String fileformate =obj1.CreateFileForBacklinkTrack(args);
				    	//System.out.println(fileformate);
						//FileWriter myWriter = new FileWriter(fileformate, true);
					     // myWriter.write( obj.toString());
					      //myWriter.write("\r\n");
					      //myWriter.close();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    	
			        }
		  	    
			    });
	      JButton btnytube = new JButton("Youtube Playlist");
	      btnytube.setPreferredSize(new Dimension(btnytube.WIDTH + 126, btnytube.HEIGHT + 50));
	      btnytube.addActionListener(new ActionListener(){  
	  	    public void actionPerformed(ActionEvent e){  
		    	Backlink  objy=new Backlink ();
		    	readfile  obj1=new readfile ();
		    	try {
		    		do{  
		    			objy.youtube();
						String fileformateYou =obj1.CreateFileForYoutubeTrack(args);
				    	System.out.println(fileformateYou);
						FileWriter myWriter = new FileWriter(fileformateYou, true);
					      myWriter.write( objy.toString());
					      myWriter.write("\r\n");
					      myWriter.close();  
		    			}while(true); 
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	  	    }
		    });
	      //panel.add(btn2, constraints);
	      JButton btn3 = new JButton("AnubhavSite");
	      btn3.setPreferredSize(new Dimension(btn3.WIDTH + 105, btn3.HEIGHT + 50));
	      btn3.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink ();
			    	readfile  obj1=new readfile ();
			    	try {
			    		do {
			    			  // code block to be executed
			    			obj.AnubhavSite();
							String fileformateSite =obj1.CreateFileForAnubhavSiteTrack(args);
					    	System.out.println(fileformateSite);
							FileWriter myWriter = new FileWriter(fileformateSite, true);
						      myWriter.write( obj.toString());
						      myWriter.write("\r\n");
						      myWriter.close();
			    			}
			    			while (true);
						
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      panel.add(btn3, constraints);
	      JButton btnclose = new JButton("Close All");
	      btnclose.setBackground(Color.yellow);
	      btnclose.setPreferredSize(new Dimension(btnclose.WIDTH + 90, btnclose.HEIGHT + 50));
	      btnclose.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
		  	    	IPChanger  obj=new IPChanger ();  
			    	try {
						obj.closeall();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      JButton btnabap = new JButton("Google Abap");
	      btnabap.setPreferredSize(new Dimension(btnabap.WIDTH + 130, btnabap.HEIGHT + 50));
	      btnabap.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
		  	    	googleplay  obj=new googleplay ();  
			    	try {
			    		do{  
			    			obj.googleabap(); 
			    			}while(true); 
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      JButton btngui5 = new JButton("Google fiori");
	      btngui5.setPreferredSize(new Dimension(btngui5.WIDTH + 130, btngui5.HEIGHT + 50));
	      btngui5.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
		  	    	googleplay  obj=new googleplay ();  
			    	try {
			    		do{  
			    			obj.googlerunui5(); 
			    			}while(true); 
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      JButton btngbtp = new JButton("Google BTP");
	      btngbtp.setPreferredSize(new Dimension(btngbtp.WIDTH + 130, btngbtp.HEIGHT + 50));
	      btngbtp.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
		  	    	googleplay  obj=new googleplay ();  
			    	try {
			    		do{  
			    			obj.googlerunbtp();  
			    			}while(true); 
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      
	      JButton btngsac = new JButton("Google SAC");
	      btngsac.setPreferredSize(new Dimension(btngsac.WIDTH + 130, btngsac.HEIGHT + 50));
	      btngsac.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
		  	    	googleplay  obj=new googleplay ();  
			    	try {
			    		do{  
			    			obj.googlerunsac();  
			    			}while(true); 
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      JButton btnautobacklink = new JButton("backlink 30");
	      btnautobacklink.setPreferredSize(new Dimension(btnautobacklink.WIDTH + 130, btnautobacklink.HEIGHT + 50));
	      btnautobacklink.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
			    	Backlink  obj=new Backlink (); 
			    	readfile  obj1=new readfile ();
			    	IPChanger i = new IPChanger();  
			    	try {
			    		 obj.BacklinkWin1();
			    		 obj.BacklinkWin2();
			    		 obj.BacklinkWin3();
						
					} catch (IOException | InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      JButton btnworkflow = new JButton("Workflow");
	      btnworkflow.setPreferredSize(new Dimension(btnworkflow.WIDTH + 130, btnworkflow.HEIGHT + 50));
	      btnworkflow.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
		  	    	googleplay  obj=new googleplay ();  
			    	try {
			    		do{  
			    			obj.googlerunworkflow();  
			    			}while(true); 
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      JButton btnghybrid = new JButton("Hybrid");
	      btnghybrid.setPreferredSize(new Dimension(btnghybrid.WIDTH + 130, btnghybrid.HEIGHT + 50));
	      btnghybrid.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
		  	    	googleplay  obj=new googleplay ();  
			    	try {
			    		do{  
			    			obj.googlerunhybrid();  
			    			}while(true); 
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      JButton jclose = new JButton("Exit");
	      jclose.setBackground(Color.red);
	      jclose.setPreferredSize(new Dimension(jclose.WIDTH + 90, jclose.HEIGHT + 50));
	      jclose.addActionListener(new ActionListener(){  
		  	    public void actionPerformed(ActionEvent e){  
		  	    	IPChanger  obj=new IPChanger ();  
			    	try {
						obj.closejava();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		  	    }
			    });
	      panel.add(btnghybrid, constraints);
	      panel.add(btnworkflow, constraints);
	      panel.add(btnautobacklink, constraints);
	      panel.add(btnytube, constraints);
	      panel.add(btn1, constraints);
	      panel.add(btngsac, constraints);
	      panel.add(btngbtp, constraints);
	      panel.add(btngui5, constraints);
          panel.add(btnabap, constraints);
          panel.add(jclose, constraints);
	      panel.add(btnclose, constraints);
	      frame.add(panel);
	      frame.pack();
	      frame.setVisible(true);
	    
}
	void ComboBoxExample(){    
	    f=new JFrame("ComboBox Example");   
	    final JLabel label = new JLabel();          
	    label.setHorizontalAlignment(JLabel.CENTER);  
	    label.setSize(400,100);  
	    JButton b=new JButton("Show");  
	    b.setBounds(200,100,75,20);  
	    String languages[]={"C","C++","C#","Java","PHP"};        
	    final JComboBox cb=new JComboBox(languages);
	    System.out.println("selected" + cb.getSelectedIndex());
	    cb.setBounds(50, 100,90,20);    
	    f.add(cb); f.add(label); f.add(b);    
	    f.setLayout(null);    
	    f.setSize(350,350);    
	    f.setVisible(true);       
	    b.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) { 
	        	System.out.println("selected after" + cb.getSelectedIndex());
	        	try {
	        		switch(cb.getSelectedIndex()) {
	        		  case 0:
	        		    // code block
	        			  googleplay  obj1=new googleplay ();
	        			  obj1.googlerunsac();
	        		    break;
	        		  case 1:
	        		    // code block
	        			  googleplay  obj2=new googleplay ();
	        			  obj2.googlerunbtp();
	        		    break;
	        		  case 2:
		        		    // code block
	        			    Backlink  obj=new Backlink ();
	        			    obj.BacklinkWin1();
		        		    break;
	        		  case 3:
		        		    // code block
	        			  googleplay  obj3=new googleplay ();
	        			  obj3.googlerunworkflow();
		        		    break;
	        		  case 4:
		        		    // code block
	        			  googleplay  obj4=new googleplay ();
	        			  obj4.googlerunhybrid();
		        		    break;
	        		  default:
	        		    // code block
	        			  System.out.println("selected last" + cb.getSelectedIndex());
	        		}
					//obj.BacklinkWin1();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	
	//String data = "Programming language Selected: "   
	  // + cb.getItemAt(cb.getSelectedIndex());  
	//label.setText(data);  
	}  
	});           
	}
}