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
class nodesinkwin extends JFrame implements ActionListener
{
	String filesel,s1,s2,mst;
  
    String id=null,id1=null,id2=null,id3=null;
 String[] pmes; 
    String temp[]=null; 
    
	 JLabel cs,l6;

	 JButton save;
	 JButton refresh;
	 JButton reject;
	 JButton senda,sendb,sendc,sendd,sende,sendf,nodesink;
	 JButton browse,verify;
	 JLabel title,title1,title2;
	
	 JTextArea packet1;
	 
	 	 JTextArea packet2,packet3;
	 
	 
		 JTextField t1,t2,t3;	 
	 String msg,msg1;

	 JLabel n1,n2;
	 Container c;
	 ImageIcon ii;
	 ImageIcon i2;
	 	Socket c1;
	 
	 public nodesinkwin()
	
	 {
	
		initializeComponent();
		
	 }
		
		
		private void initializeComponent()

	   {
		
	
	

	
title=new JLabel("<html><font color=White size=+2><strong><center><i>Vampire attacks-Draining life from wireless ad-hoc sensor networks</i></center></strong></font>");
	   
	        
title1=new JLabel("<html><font color=Red size=+2><strong><center><i>Send Your Data Via--></i></center></strong></font>");		
		 
title2=new JLabel("<html><font color=Red size=+2><strong><center><i>Send To</i></center></strong></font>");				
		  
n1=new JLabel("<html><font color=Green size=+1><strong><center><i>Honest Node Data</i></center></strong></font>");  
 n2=new JLabel("<html><font color=Green size=+1><strong><center><i>Malicious Node Data</i></center></strong></font>"); 		  
		  
		  
		   save=new JButton("Save");
		 
		 
		 save.addActionListener(this);
		 
		  refresh=new JButton("Refresh");
		  
		   refresh.addActionListener(this);
		  
		  reject=new JButton("Reject");
		  
		   reject.addActionListener(this);
		 
		  senda=new JButton("Node A");
		  senda.addActionListener(this);
		  
		  
		   sendb=new JButton("Node B");
		   sendb.addActionListener(this);
		   
		    sendc=new JButton("Node C");
		    sendc.addActionListener(this);
		    
		     sendd=new JButton("Node D");
		     sendd.addActionListener(this);
		     
		      sende=new JButton("Node E");
		      sende.addActionListener(this);
		      
		       sendf=new JButton("Node F");
		       sendf.addActionListener(this);
		       
		       
		      verify=new JButton("Verify");
		       verify.addActionListener(this);
		       
		       nodesink=new JButton("nodesink");
		       
		  
		   packet2=new JTextArea();
		  packet3=new JTextArea();
		 
		  packet1=new JTextArea();
		  
		  
		  JScrollPane sa = new JScrollPane(packet1);
		  
		 c=getContentPane();
		 
		 c.setLayout(null);
		  t1=new JTextField(30);
		 t2=new JTextField(30);
		 t3=new JTextField(30);
		 
	//	 c.add(imageLabel1);
			//c.add(cs);
		//	cs.setBounds(1,200,500,60);
		ImageIcon xl = new ImageIcon("images1.jpg");
	    l6=new JLabel(xl);
	    l6.setBounds(20, 170, 260, 197);		
		l6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		l6.setForeground(new Color(64,0,0));
		l6.setBackground(new Color(154,190,200));
	 	c.add(l6);
		 c.add(packet2);
		  c.add(packet3);
	     c.add(save);
	     c.add(refresh);
	     c.add(reject);
	     c.add(senda);
	     c.add(sendb);
	     c.add(sendc);
	     c.add(sendd);
	     c.add(sende);
	     c.add(sendf);
	     c.add(verify);
	     c.add(n1);
	      c.add(n2);
	     c.add(sa);
	  	  c.add(t1);
	  	   c.add(t2);
	  	    c.add(t3);
	 c.add(title);
	 c.add(title1);
	 c.add(title2);
	 c.add(nodesink);

		 
		 c.setBackground(new java.awt.Color(110,170,240));
         c.setLocation(300,300);
         setTitle("nodesink");
         setSize(700,700);
         setVisible(true);
		
//	imageLabel1.setBounds(475,125,450,350);
	   
	
	packet2.setBounds(390,390,250,145);	
	//mali
		packet3.setBounds(40,390,250,145);	
	
		sa.setBounds(290,170,190,105);	
		//t2.setBounds(10,170,20,20);
		//t3.setBounds(10,240,100,30);	
    //browse.setBounds(280,290,105,25);
	//refresh.setBounds(390,290,105,25);
		
//	senda.setBounds(20,400,90,25);
//	sendb.setBounds(120,400,90,25);
//	sendc.setBounds(220,400,90,25);
//	sendd.setBounds(320,400,90,25);
//	sende.setBounds(420,400,90,25);
//	sendf.setBounds(520,400,90,25);
//	nodesink.setBounds(620,400,90,25);

 save.setBounds(120,560,105,25);
		refresh.setBounds(280,560,105,25);
		
       reject.setBounds(420,560,105,25);



 n1.setBounds(65,350,300,60);
		n2.setBounds(405,350,300,60);

verify.setBounds(325,300,100,25);

	title.setBounds(45,30,500,60);
	title1.setBounds(15,110,500,60);
	//title2.setBounds(225,330,500,60);
	
		t1.setBounds(290,125,190,30);
	t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t1.setForeground(new Color(64,0,0));
		t1.setBackground(new Color(26,176,164));
		
	    }
	   public void actionPerformed(ActionEvent ae)
	
	  	{
	  	
	  	
	  	
	  	 if(ae.getSource()==save)
		{
			
			
	   String ax=packet3.getText();
		
			
			
        String file,dir,path,ms;
	
	  
JOptionPane.showMessageDialog(null,"Are you want to save");
          
          
          
          if(ax.equals(""))
          {
          	
          	JOptionPane.showMessageDialog(null,"packet is empty");
           
	  }
	  else
        	{
	    byte b1[];
		FileDialog fd2=new FileDialog(this,"SAVE",FileDialog.SAVE);
		fd2.setVisible(true);
		file=fd2.getFile();
		dir=fd2.getDirectory();
		path=dir+file;
	
			
			try
			{
			FileOutputStream fos=new FileOutputStream(path);
			//System.out.println(str1);
			b1=ax.getBytes();

				
		    fos.write(b1);
				
		
			}
			catch(Exception e)
			{
				}   
			
		
		
		packet2.setText("");
             
        packet3.setText("");  
        	 
        	
        	}
		
	}
			
			
	
	   	 
		  if(ae.getSource()==refresh)
		{
				packet2.setText("");
				packet3.setText("");
             
        packet1.setText("");  
        
        t1.setText("");
		
		}

 
		  if(ae.getSource()==reject)
		{
			
		
	  
JOptionPane.showMessageDialog(null,"Are you want to reject");
             
       packet2.setText("");
             
        packet3.setText("");        
		
			}
			
		
			
		
	
			
	
		
	  	
	  	
	  	
	    
	    if(ae.getSource()==verify)
	     {
	     	
	     	
	    	try
		{
		   String data=packet1.getText();
		   
	
		
		String via=t1.getText();
			String sid=t2.getText();
			
			
			String node3=t3.getText();
		
			Connection con1 = databasecon.getconnection();
       	Statement st1 = con1.createStatement();
       		ResultSet rs1 = st1.executeQuery("select path from paths");
      			while(rs1.next())
        	{
       	    							
       			 msg1=rs1.getString("path");
       			
       		}
       		
       		System.out.print(msg1);
       		
       		
			          	    
		Connection con = databasecon.getconnection();
       	Statement st = con.createStatement();
       		ResultSet rs = st.executeQuery("select path from user where id='"+msg1+"'");
      			if(rs.next())
        	{
       	    							
       			 msg=rs.getString("path");
       			
       		}
       		
       		String text=t1.getText();



temp=text.split("-",4);
for(int i=0; i<temp.length; i++){
id=temp[0];
id1=temp[1];
id2=temp[2];
id3=temp[3];



}


String gm=id+id1+id2;
	

       		
       		if(gm.equals(msg))
       		{
       			
       			packet3.setText("");
       			packet2.setText("");
       			 packet3.setText(data);
       		}
       		else
       		{
       			
       			
       				packet3.setText("");
       			packet2.setText("");
       	packet2.setText(data);
       		}
			
		//	System.out.print(msg);
			
	
	    }
	    catch(Exception e)
	 {
	 }
	 

	     	}
	    
	    
	    
	    
	    }
	    }
	  
	   public class nodesink extends UnicastRemoteObject implements srvint
    {		
      
	
    nodesinkwin nw=new nodesinkwin();
	

	

		public nodesink() throws RemoteException
	{
	
	}
	
	public void sendfile2(String data,String via,String sid,String node)
	{
		
		
		String data2=data;
		 String via2=via;
		String sid2=sid;
		String node2=node;
	//	System.out.print(node2);
	nw.packet1.setText(data2);
		nw.t1.setText(via2);	
		nw.t2.setText(sid2);
			nw.t3.setText(node2);
		
	}
	 

public void sendfile3(String data,String via,String [] t,int i)
	{
		
		
			String data2=data;
		 String via2=via;
	
	nw.packet1.setText(data2);
		nw.t1.setText(via2);
		
	int i1=i+1;
	String [] temp1=t;
	
		
	
	
	}
	
	
	
	
	
	

	
		public void sendfile1(String path,String userid)
	{
		
		
	
	}
	 
	    public static void main(String args[])
	    {
	    try
			{
			nodesink na=new nodesink();
		    Naming.rebind("nodesink",na);
	
			}catch(Exception e){}
	
			 
	    }
	 
	   	


	   }
	   
	   
	
		
	
		
	 
	
		

	
	




