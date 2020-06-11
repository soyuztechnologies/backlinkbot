package anubhavtrainings.apk.Backlinkbot;

import java.awt.*;  
class LabelExample{  
public static void main(String args[]){  
	Button tf; Button l; Button b;  
    LabelExample(){  
        tf=new TextField();  
        tf.setBounds(50,50, 150,20);  
        l=new Label();  
        l.setBounds(50,100, 250,20);      
        b=new Button("Find IP");  
        b.setBounds(50,150,60,30);  
        b.addActionListener(this);    
        add(b);add(tf);add(l);    
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
	 
    try{  
    	
        String host=tf.getText();  
        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
        l.setText("IP of "+host+" is: "+ip);  
        }catch(Exception ex){System.out.println(ex);}  
    }  
}

private static void setLayout(Object object) {
	// TODO Auto-generated method stub
	
}

private static void setSize(int i, int j) {
	// TODO Auto-generated method stub
	
}

private static void add(Button b) {
	// TODO Auto-generated method stub
	
}

private static void LabelExample() {
	// TODO Auto-generated method stub
	
}  
}  