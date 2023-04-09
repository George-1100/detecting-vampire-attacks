import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.event.*;
import java.sql.*;
import java.rmi.*;
import java.rmi.server.*;
import databaseconnection.*;

 public class login extends JFrame implements ActionListener



{
	String filesel,s1,s2,mst;
  
    String[] str1=new String[10];
    Random r;
    File f;

	String f1=null,f2=null;
JLabel enterName;
JTextField name;
JButton login,newuser;
String storeName;
String uname,pass,path,userid;

 JLabel l1,l2,l3,l4,l5,l6,l7;
  JTextField t1,t2;	 
	 JLabel n1;
	 
	  JPasswordField jp1;
	 JLabel title;
	
JLabel cs;
	
		String aw=null;
  	String[] b=new String[20];
  	
  	
  	String fake=null,fake1=null;
	
	
	
	 String msg="";
String kk=null;
	 
	 Container c;
	 ImageIcon ii;
	 ImageIcon i2;
	 	Socket c1;
	 
	 public login()
	
	 {
	
		initializeComponent();
		
	 }
		
		
		private void initializeComponent()

	   {
		
	


	
	     title=new JLabel("<html><font color=White size=+2><strong><center><i>Vampire attacks-Draining life from wireless ad-hoc sensor networks</i></center></strong></font>");
	      l1=new JLabel("<html><font color=#FF69B4 size=+1><strong><center><i>User Name</i></center></strong></font>");
	       l2=new JLabel("<html><font color=#FF69B4 size=+1><strong><center><i>Password</i></center></strong></font>");
	        
		 login=new JButton("Login");
		 
		 login.addActionListener(this);
		 
		 newuser=new JButton("New User?");
		
		 newuser.addActionListener(this);
		 
		  
		 c=getContentPane();
		 
		 c.setLayout(null);
		  t1=new JTextField(30);
		
		 
		 jp1 = new JPasswordField();
	 			
	//	c.add(cs);
		//	cs.setBounds(155,460,500,60);
		
		
		
	 	c.add(jp1);
		 
	//	 c.add(imageLabel1);
		
		ImageIcon xl = new ImageIcon("attack1.jpg");
	    l6=new JLabel(xl);
	    l6.setBounds(350, 140, 250, 177);		
		l6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		l6.setForeground(new Color(64,0,0));
		l6.setBackground(new Color(154,190,200));
	 	c.add(l6);
		
	    
	   
	  	 
	    c.add(title);
        c.add(l1);
	    c.add(l2);	
	    c.add(t1);
	    c.add(login);
	    c.add(newuser);
		 
		 c.setBackground(new java.awt.Color(0,100,0));
         c.setLocation(300,300);
         setTitle("Vampire attack");
         setSize(650,600);
         setVisible(true);
		
//	   	imageLabel1.setBounds(475,125,450,350);
	   
	
	
	
	
	title.setBounds(45,30,500,60);
	l1.setBounds(50,160,125,25);
	l2.setBounds(50,210,125,25);
	
	t1.setBounds(160,160,180,30);
	t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t1.setForeground(new Color(64,0,0));
		t1.setBackground(new Color(26,176,164));
		
   	jp1.setBounds(160,205,180,30);
   	jp1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		jp1.setForeground(new Color(64,0,0));
		jp1.setBackground(new Color(26,176,164));
		
		
		login.setBounds(160,250,70,30);
		newuser.setBounds(235,250,100,30);
	    }
	    
	  
	   public void actionPerformed(ActionEvent ae)
	
	  	{
	  	if(ae.getSource()==newuser)
		{
			  
          
			 dispose();       
		    register w1=new register();
  
		
	    }
	    
	   if(ae.getSource()==login)
	   {
	   	
	   	if(t1.getText().equals(""))
	    	
	    	{
	        	        
	      	JOptionPane.showMessageDialog(null,"Enter UserName.","Login error",JOptionPane.ERROR_MESSAGE);
	    	
	    	}
	    	else if(jp1.getText().equals(""))
	    	     {
	    		     
	             JOptionPane.showMessageDialog(null,"Enter Password.","Login error",JOptionPane.ERROR_MESSAGE);
	             }
	             
	             
	             else
	             {
	             	
	             	
	             		try
	              	{          	    
		Connection con = databasecon.getconnection();
       					Statement st = con.createStatement();
       							ResultSet rs = st.executeQuery("select * from user where uname='"+t1.getText()+"' and pass='"+jp1.getText()+"'");
      							if(rs.next())
        						{
       	    							
       								    uname=rs.getString("ques");
       								    pass=rs.getString("ans");
       								    path=rs.getString("path");
       								     userid=rs.getString("id");
       		

       								   kk=JOptionPane.showInputDialog(null,uname,"Security question",JOptionPane.QUESTION_MESSAGE);
       								   
       							
       							
       							if(kk.equals(pass))
       							
       							{
       								
       		
       		
       		ArrayList<String> numbers = new ArrayList<String>();
 
     numbers.add("a");
     numbers.add("b");
     numbers.add("c");
      numbers.add("d");
     numbers.add("e");
     numbers.add("f");
      Collections.shuffle(numbers);
    for(int j =0; j < 3; j++)
     {
     	
     	
   aw= numbers.get(j);
  
    b[j]=aw;
     
     }
     	
     	
 String a1=b[0];
 String b1=b[1];
 String c1=b[2];

  
f1=a1+b1+c1;
 	
       		
     f2=a1+"-"+b1+"-"+c1+"-"+"sink";  		
       		
       								
       							 
		 
	    	try
	    	
	    	
	    	
		{
		   //String ff=packet1.getText();
		
		
		
		Connection con1 = databasecon.getconnection();
       					Statement st1 = con1.createStatement();
       				    String str1="update user set path='"+f1+"' where id='"+userid+"'";
       					st1.executeUpdate(str1);
		
		
		
		
		
		
		
		   String url = "rmi://127.0.0.1/source";

            srvint in = (srvint) Naming.lookup(url);
            in.sendfile1(f2,userid);
            
             dispose();   
	
	    }
	    catch(Exception e)
	 {
	 }
	 
	 
	 
	 
	 try
	    	
	    	
	    	
		{
		   //String ff=packet1.getText();
		
		
		
		Connection con2 = databasecon.getconnection();
       					Statement st2 = con2.createStatement();
       				    String str2="insert into paths(path) values('"+userid+"')";
       					st2.executeUpdate(str2);
		
		
		
		
		
		
		 
	
	    }
	    catch(Exception e)
	 {
	 }
	 
	 
	 
	 
	 
	 
       							//	System.out.print("a1");
       								
       							}
       							else
       							{
       								
       									ArrayList<String> numbers = new ArrayList<String>();
 
      numbers.add("a");
     numbers.add("b");
     numbers.add("c");
      numbers.add("d");
     numbers.add("e");
     numbers.add("f");
      Collections.shuffle(numbers);
    for(int j =0; j < 3; j++)
     {
     	
     	
   aw= numbers.get(j);
  
    b[j]=aw;
     
     }
     	
     	
 String a1=b[0];
 String b1=b[1];
 String c1=b[2];
 

  
fake=a1+b1+c1;
   fake1=a1+"-"+b1+"-"+c1+"-"+"sink"; 
       							 	try
		{
		   //String ff=packet1.getText();
		
		   String url = "rmi://127.0.0.1/source";

            srvint in = (srvint) Naming.lookup(url);
            in.sendfile1(fake1,userid);
            
             dispose();   
	
	    }
	    catch(Exception e)
	 {
	 }
       									
       							}
       							
       								    							    
       							}
       							else
       							{
       								JOptionPane.showMessageDialog(null,"Enter Correct UserName And Password.","Login error",JOptionPane.ERROR_MESSAGE);
       							}	
       							
      
       							rs.close();
       							st.close();
       							con.close();
	              	}
	              	catch(Exception ee)
	              	{
	              		
	              	}
	              	
	             	
	             }
	   	
	   	
	   }
	    
	    
	    
	    
	   
	    
	    }
		
	    
	   
	    public static void main(String ar[])
	    {
	    	login so=new login();
	    }
	   
	 
	   	


	   }
	   
	   
	
