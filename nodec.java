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
import java.security.*;
import javax.crypto.*;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import sun.misc.BASE64Encoder;
class nodecwin extends JFrame implements ActionListener
{
	String filesel,s1,s2,mst;
  
   	 JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    
	 JLabel cs;
	 JTextArea nodea,nodeb,nodec,noded,nodee,nodef,nodesink;
	 JButton refresh;
	 JButton senda,sendb,sendc,sendd,sende,sendf,sink;
	 JButton browse;
	 JLabel title,title1,title2;
	
	 JTextArea packet1;
	 JTextField t1,t2,t3;	 
	 String msg="";
   String temp[]=null; 
	 Container c;
	 ImageIcon ii;
	 ImageIcon i2;
	 	Socket c1;
	 
	 public nodecwin()
	
	 {
	
		initializeComponent();
		
	 }
		
		
		private void initializeComponent()

	   {
		
	
	
 l1=new JLabel("<html><font color=Red size=+2><strong><center><i>Node A</i></center></strong></font>");						   
l2=new JLabel("<html><font color=Red size=+2><strong><center><i>Node B</i></center></strong></font>");
l3=new JLabel("<html><font color=Red size=+2><strong><center><i>Node C</i></center></strong></font>");	
l4=new JLabel("<html><font color=Red size=+2><strong><center><i>Node D</i></center></strong></font>");						   
l5=new JLabel("<html><font color=Red size=+2><strong><center><i>Node E</i></center></strong></font>");						   
l6=new JLabel("<html><font color=Red size=+2><strong><center><i>Node F</i></center></strong></font>");						   
l7=new JLabel("<html><font color=Red size=+2><strong><center><i>Sink</i></center></strong></font>");						   					   						   		   
		   
	
title=new JLabel("<html><font color=White size=+2><strong><center><i>Vampire attacks-Draining life from wireless ad-hoc sensor networks-Node C</i></center></strong></font>");
	   
	        
title1=new JLabel("<html><font color=Red size=+2><strong><center><i>Send Your Data Via--></i></center></strong></font>");		
		 
title2=new JLabel("<html><font color=Red size=+2><strong><center><i>Send To</i></center></strong></font>");				
		   browse=new JButton("Browse");
		   browse.addActionListener(this);
		 
		  refresh=new JButton("Refresh");
		 
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
		       
		       sink=new JButton("Sink");
		        sink.addActionListener(this);
		  
		   nodea=new JTextArea();
		 nodeb=new JTextArea();
		  nodec=new JTextArea();
		 noded=new JTextArea();
		  nodee=new JTextArea();
		 nodef=new JTextArea();
		  nodesink=new JTextArea();
		 
		  packet1=new JTextArea();
		  
		  
		  JScrollPane sa = new JScrollPane(packet1);
		  
		 c=getContentPane();
		 
		 c.setLayout(null);
		  t1=new JTextField(30);
		 t2=new JTextField(30);
		 t3=new JTextField(30);
		 
	//	 c.add(imageLabel1);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		c.add(l7);
			//c.add(cs);
		//	cs.setBounds(155,460,500,60);
		
	     c.add(browse);
	     c.add(refresh);
	     c.add(senda);
	     c.add(sendb);
	     c.add(sendc);
	     c.add(sendd);
	     c.add(sende);
	     c.add(sendf);
	     c.add(sa);
	  	  c.add(t1);
	  	   c.add(t2);
	  	    c.add(t3);
	 c.add(title);
	 c.add(title1);
	 c.add(title2);
	 c.add(sink);
	c.add(nodea);
		c.add(nodeb);
		c.add(nodec);
		c.add(noded);
		c.add(nodee);
		c.add(nodef);
		c.add(nodesink);
		 
		 c.setBackground(new java.awt.Color(160,0,45));
         c.setLocation(300,300);
         setTitle("Node C");
            setSize(750,720);
         setVisible(true);
		
//	   	imageLabel1.setBounds(475,125,450,350);
	   
	nodea.setBounds(20,440,90,175);
    nodeb.setBounds(120,440,90,175);
	nodec.setBounds(220,440,90,175);
	noded.setBounds(320,440,90,175);
	nodee.setBounds(420,440,90,175);
	nodef.setBounds(520,440,90,175);
	nodesink.setBounds(620,440,90,175);
	
	
l1.setBounds(20,390,500,60);
l2.setBounds(120,390,500,60);
l3.setBounds(220,390,500,60);
l4.setBounds(320,390,500,60);
l5.setBounds(420,390,500,60);
l6.setBounds(520,390,500,60);
l7.setBounds(620,390,500,60);
		sa.setBounds(290,170,190,105);	
		//t2.setBounds(10,170,20,20);	
			//t3.setBounds(10,240,100,30);
    //browse.setBounds(280,290,105,25);
	//refresh.setBounds(390,290,105,25);
		
	//senda.setBounds(20,400,90,25);
	//sendb.setBounds(120,400,90,25);
	//sendc.setBounds(220,400,90,25);
	//sendd.setBounds(320,400,90,25);
	//sende.setBounds(420,400,90,25);
//	sendf.setBounds(520,400,90,25);
//	sink.setBounds(620,400,90,25);
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
	  	if(ae.getSource()==browse)
		{
			  
       

	    }
	    
	    
	   
	    
	    
	    
	    
	    }
	    }
	  
	   public class nodec extends UnicastRemoteObject implements srvint
    {		
      
	
    nodecwin nw=new nodecwin();
	

	

		public nodec() throws RemoteException
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
			String [] temp1=t;
	String nodeaa="node"+temp1[0];
	
		if(nodeaa.equals("nodec"))
		{
			try
			{
				
				
			nw.nodec.setText("");
			
			String tt=data2;	
		
String plainData=tt,cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    
    Cipher aesCipher = Cipher.getInstance("AES");
    
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    
    byte[] byteDataToEncrypt = plainData.getBytes();
    
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    
    cipherText = new BASE64Encoder().encode(byteCipherText);
    
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    
    decryptedText = new String(byteDecryptedText);
    
      tt = cipherText.substring(0,(cipherText.length()-tt.length()));
        cipherText = cipherText.substring(tt.length(),(cipherText.length()));   
        
     
			
			
			
			nw.nodec.append(tt+"\n");	
				
		
			
			
		
     
			
			
			
		
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				nw.nodec.append("received:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
				//nw.nodea.setText("");
				
				
				
				}
				
				
				catch(Exception e){
					
				}
		}
		
		
		
		
		
		
			nw.packet1.setText(data2);
		nw.t1.setText(via2);	
		
		int i1=i+1;

		
	 try
		{
		   
	 try
				{
			Thread.sleep(4200);
				nw.packet1.setText("");
				}catch(Exception e){}	
		
		
		
	
		
			String nodeaaa="node"+temp1[i1];
	
		if(nodeaaa.equals("nodea"))
		{
			
			
			
			
			
						nw.nodea.setText("");
			
			String tt=data2;	
		
String plainData=tt,cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    
    Cipher aesCipher = Cipher.getInstance("AES");
    
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    
    byte[] byteDataToEncrypt = plainData.getBytes();
    
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    
    cipherText = new BASE64Encoder().encode(byteCipherText);
    
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    
    decryptedText = new String(byteDecryptedText);
    
      tt = cipherText.substring(0,(cipherText.length()-tt.length()));
        cipherText = cipherText.substring(tt.length(),(cipherText.length()));   
        
     
			
			
			
			nw.nodea.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				nw.nodea.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodea.setText("");
		}
		
			
		else if(nodeaaa.equals("nodesink"))
		{
			
			
			
			
			
						nw.nodesink.setText("");
			
			String tt=data2;	
		
String plainData=tt,cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    
    Cipher aesCipher = Cipher.getInstance("AES");
    
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    
    byte[] byteDataToEncrypt = plainData.getBytes();
    
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    
    cipherText = new BASE64Encoder().encode(byteCipherText);
    
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    
    decryptedText = new String(byteDecryptedText);
    
      tt = cipherText.substring(0,(cipherText.length()-tt.length()));
        cipherText = cipherText.substring(tt.length(),(cipherText.length()));   
        
     
			
			
			
			nw.nodesink.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				nw.nodesink.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodesink.setText("");
		}
		
		else if(nodeaaa.equals("nodeb"))
		{
			
			
			
			
			
						nw.nodeb.setText("");
			
			String tt=data2;	
		
String plainData=tt,cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    
    Cipher aesCipher = Cipher.getInstance("AES");
    
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    
    byte[] byteDataToEncrypt = plainData.getBytes();
    
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    
    cipherText = new BASE64Encoder().encode(byteCipherText);
    
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    
    decryptedText = new String(byteDecryptedText);
    
      tt = cipherText.substring(0,(cipherText.length()-tt.length()));
        cipherText = cipherText.substring(tt.length(),(cipherText.length()));   
        
     
			
			
			
			nw.nodeb.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				nw.nodeb.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
				//nw.nodeb.setText("");
		}
		
		
		
		else if(nodeaaa.equals("nodec"))
		{
			
			
			
			
			
						nw.nodec.setText("");
			
			String tt=data2;	
		
String plainData=tt,cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    
    Cipher aesCipher = Cipher.getInstance("AES");
    
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    
    byte[] byteDataToEncrypt = plainData.getBytes();
    
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    
    cipherText = new BASE64Encoder().encode(byteCipherText);
    
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    
    decryptedText = new String(byteDecryptedText);
    
      tt = cipherText.substring(0,(cipherText.length()-tt.length()));
        cipherText = cipherText.substring(tt.length(),(cipherText.length()));   
        
     
			
			
			
			nw.nodec.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				nw.nodec.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodec.setText("");
		}
		
		
		else if(nodeaaa.equals("noded"))
		{
			
			
			
			
			
						nw.noded.setText("");
			
			String tt=data2;	
		
String plainData=tt,cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    
    Cipher aesCipher = Cipher.getInstance("AES");
    
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    
    byte[] byteDataToEncrypt = plainData.getBytes();
    
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    
    cipherText = new BASE64Encoder().encode(byteCipherText);
    
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    
    decryptedText = new String(byteDecryptedText);
    
      tt = cipherText.substring(0,(cipherText.length()-tt.length()));
        cipherText = cipherText.substring(tt.length(),(cipherText.length()));   
        
     
			
			
			
			nw.noded.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
				
				nw.noded.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.noded.setText("");
		}
		
		
	else if(nodeaaa.equals("nodesink"))
		{
			
			
			
			
			
						nw.nodesink.setText("");
			
			String tt=data2;	
		
String plainData=tt,cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    
    Cipher aesCipher = Cipher.getInstance("AES");
    
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    
    byte[] byteDataToEncrypt = plainData.getBytes();
    
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    
    cipherText = new BASE64Encoder().encode(byteCipherText);
    
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    
    decryptedText = new String(byteDecryptedText);
    
      tt = cipherText.substring(0,(cipherText.length()-tt.length()));
        cipherText = cipherText.substring(tt.length(),(cipherText.length()));   
        
     
			
			
			
			nw.nodesink.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
			
				nw.nodesink.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodef.setText("");
		}
				
		
		
		else if(nodeaaa.equals("nodee"))
		{
			
			
			
			
			
						nw.nodee.setText("");
			
			String tt=data2;	
		
String plainData=tt,cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    
    Cipher aesCipher = Cipher.getInstance("AES");
    
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    
    byte[] byteDataToEncrypt = plainData.getBytes();
    
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    
    cipherText = new BASE64Encoder().encode(byteCipherText);
    
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    
    decryptedText = new String(byteDecryptedText);
    
      tt = cipherText.substring(0,(cipherText.length()-tt.length()));
        cipherText = cipherText.substring(tt.length(),(cipherText.length()));   
        
     
			
			
			
			nw.nodee.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				nw.nodee.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodee.setText("");
		}
		
		
		
		
		
		
		
		
		
		
		
		else if(nodeaaa.equals("nodef"))
		{
			
			
			
			
			
						nw.nodef.setText("");
			
			String tt=data2;	
		
String plainData=tt,cipherText,decryptedText;
    KeyGenerator keyGen = KeyGenerator.getInstance("AES");
    keyGen.init(128);
    SecretKey secretKey = keyGen.generateKey();
    
    Cipher aesCipher = Cipher.getInstance("AES");
    
    aesCipher.init(Cipher.ENCRYPT_MODE,secretKey);
    
    byte[] byteDataToEncrypt = plainData.getBytes();
    
    byte[] byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
    
    cipherText = new BASE64Encoder().encode(byteCipherText);
    
    aesCipher.init(Cipher.DECRYPT_MODE,secretKey,aesCipher.getParameters());
    
    byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
    
    decryptedText = new String(byteDecryptedText);
    
      tt = cipherText.substring(0,(cipherText.length()-tt.length()));
        cipherText = cipherText.substring(tt.length(),(cipherText.length()));   
        
     
			
			
			
			nw.nodef.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				nw.nodef.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodef.setText("");
		}
		
		
	String url = "rmi://127.0.0.1/node"+temp1[i1];

            srvint in = (srvint) Naming.lookup(url);
            in.sendfile3(data,via,temp1,i1);
           // JOptionPane.showMessageDialog(null,"File send to node"+temp1[i]); 
           
	    }
	    catch(Exception e)
	 {
	 }	
	 
	 
	  
	}

	
		public void sendfile1(String path,String userid)
	{
		
		
	
	}
	 
	    public static void main(String args[])
	    {
	    try
			{
			nodec na=new nodec();
		    Naming.rebind("nodec",na);
	
			}catch(Exception e){}
	
			 
	    }
	 
	   	


	   }
	   
	   
	
		
	
		
	 
	
		

	
	




