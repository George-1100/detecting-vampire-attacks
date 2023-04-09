import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.event.*;
import java.sql.*;
import java.rmi.*;
import java.util.Collections;
 import java.util.ArrayList;
import databaseconnection.*;
 
 public class register extends JFrame implements ActionListener




{
	
	
	JLabel cs;
	String filesel,s1,s2,mst;
  
    String[] str1=new String[10];
    Random r;
   
		String aw=null;
  	String[] b=new String[20];
  	
  	
  	String f=null;

JLabel enterName;
JTextField name;
JButton login,newuser;
String storeName;

 JLabel l1,l2,l3,l4,l5,l6,l7;
  JTextField t1,t2,t3,t4,t5,t6;	 
	 JLabel n1;
	 
	  JPasswordField jp1;
	 JLabel title;
	

	
	 String msg="";

	 
	 Container c;
	 ImageIcon ii;
	 ImageIcon i2;
	 	Socket c1;
	 
	 public register()
	
	 {
	
		initializeComponent();
		
	 }
		
		
		private void initializeComponent()

	   {
		
	


	
 title=new JLabel("<html><font color=White size=+2><strong><center><i>Vampire attacks-Draining life from wireless ad-hoc sensor networks</i></center></strong></font>");
 l1=new JLabel("<html><font color=#FF69B4 size=+1><strong><center><i>User Name</i></center></strong></font>");
l2=new JLabel("<html><font color=#FF69B4 size=+1><strong><center><i>Password</i></center></strong></font>");
 l3=new JLabel("<html><font color=#FF69B4 size=+1><strong><center><i>Mobile No</i></center></strong></font>");
	       
l4=new JLabel("<html><font color=#FF69B4 size=+1><strong><center><i>Email Id</i></center></strong></font>");	        
		
l5=new JLabel("<html><font color=#FF69B4 size=+1><strong><center><i>Security Question</i></center></strong></font>");
l6=new JLabel("<html><font color=#FF69B4 size=+1><strong><center><i>Answer</i></center></strong></font>");	        		
		 login=new JButton("Login");
		login.addActionListener(this);
		 newuser=new JButton("New User?");
		
		  
		 
		  
		 c=getContentPane();
		 
		 c.setLayout(null);
		  t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);
		t4=new JTextField(30);
		t5=new JTextField(30);
		t6=new JTextField(30);
		 
		 jp1 = new JPasswordField();
	 			
		
		
	 	c.add(jp1);
		 
	//	 c.add(imageLabel1);
		
		
		
	    //	c.add(cs);
			//cs.setBounds(155,460,500,60);
	  	 
	    c.add(title);
        c.add(l1);
	    c.add(l2);
	    c.add(l3);
	    c.add(l4);
	    c.add(l5);
	    c.add(l6);
	    
	    	
	    c.add(t1);
	    c.add(t2);
	    c.add(t3);
	    c.add(t4);
	    c.add(t5);
	    c.add(login);
	   
		 
		 c.setBackground(new java.awt.Color(10,100,80));
         c.setLocation(300,300);
         setTitle("Vampire attack");
         setSize(550,600);
         setVisible(true);
		
//	   	imageLabel1.setBounds(475,125,450,350);
	   
	
	
	
	
	title.setBounds(45,30,500,60);
	l1.setBounds(50,160,125,25);
	l2.setBounds(50,210,125,25);
	l3.setBounds(50,260,125,25);
	l4.setBounds(50,310,125,25);
	l5.setBounds(50,360,175,25);
	l6.setBounds(50,410,175,25);
	
	
	t1.setBounds(205,160,180,30);
	t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t1.setForeground(new Color(64,0,0));
		t1.setBackground(new Color(26,176,164));
		
   	jp1.setBounds(205,205,180,30);
   	jp1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		jp1.setForeground(new Color(64,0,0));
		jp1.setBackground(new Color(26,176,164));
	
	
	t2.setBounds(205,255,180,30);
   	t2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t2.setForeground(new Color(64,0,0));
		t2.setBackground(new Color(26,176,164));
		
		t3.setBounds(205,315,180,30);
   	t3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t3.setForeground(new Color(64,0,0));
		t3.setBackground(new Color(26,176,164));
		
		t4.setBounds(205,365,180,30);
   	t4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t4.setForeground(new Color(64,0,0));
		t4.setBackground(new Color(26,176,164));
		
	t5.setBounds(205,415,180,30);
   	t5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t5.setForeground(new Color(64,0,0));
		t5.setBackground(new Color(26,176,164));	
		
		
		login.setBounds(240,450,70,30);
	
	    }
	    
	  
	   
			public void actionPerformed(ActionEvent ae)
	{
	
	     
	     
	     if(ae.getSource()==login)
	      {   	
	      
		if(t1.getText().equals(""))
	    	
	    	{
	         
	        
	      JOptionPane.showMessageDialog(null,"Enter name.","Login error",JOptionPane.ERROR_MESSAGE);

	    	
	    	}
	    	
	    	 else if(jp1.getText().equals(""))
	    	     {
	    		     
	             JOptionPane.showMessageDialog(null,"Enter Password.","Login error",JOptionPane.ERROR_MESSAGE);
	             }
	             
	             
	          else if(t2.getText().equals(""))
	    	     {
	    		     
	             JOptionPane.showMessageDialog(null,"Enter Mobile No.","Login error",JOptionPane.ERROR_MESSAGE);
	             }    
	             
	           else if(t3.getText().equals(""))
	    	     {
	    		     
	             JOptionPane.showMessageDialog(null,"Enter Email id.","Login error",JOptionPane.ERROR_MESSAGE);
	             }  
	             
	             
	             else if(t4.getText().equals(""))
	    	     {
	    		     
	             JOptionPane.showMessageDialog(null,"Enter Security Que.","Login error",JOptionPane.ERROR_MESSAGE);
	             }  
	    	
	    	
	    	else if(t5.getText().equals(""))
	    	     {
	    		     
	             JOptionPane.showMessageDialog(null,"Enter Answer.","Login error",JOptionPane.ERROR_MESSAGE);
	             } 
	             
	             
	             
	             else
	             {
	             	
	             	
	             	
	             
   
    
  
	             	
	             		try
	             	{
	             	
	             			
	             	    
	Connection con = databasecon.getconnection();
       					Statement st = con.createStatement();
       				    String str="insert into user(uname,pass,mobile,mailid,ques,ans) values('"+t1.getText()+"','"+jp1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')";
       					st.executeUpdate(str);
       					
	                    JOptionPane.showMessageDialog(null,"Successfully Completed.","Result",JOptionPane.PLAIN_MESSAGE);
       				
       				
       				
       				dispose();       
       				login w1=new login();
       				
       					
	             		
	             	}
	             	catch(Exception e)
	             	{
	             		
	             	}
	             }
	    	
	    	}
	    	}
	   
	    public static void main(String ar[])
	    {
	    	register so=new register();
	    }
	   
	 
	   	


	   }
	   
	   
	
