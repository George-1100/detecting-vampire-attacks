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

class sourcewin extends JFrame implements ActionListener
{
	String filesel,s1,s2,mst;
  String w1,w2,w3;
   File f;
    Random r;
    File f1;
    JLabel l6;
    
    
    
    JLabel l1,l2,l3,l4,l5,l9,l7,l8;
	
    File p1;
  String id=null,id1=null,id2=null,id3=null;
 String[] pmes; 
    String temp[]=null; 
    byte[] bFile; 
    
    Thread th = new Thread();
    
	Random rand=new Random();
	 JButton refresh;
	 JButton senda,sendb,sendc,sendd,sende,sendf;
	 JButton browse;
	 JLabel title,title1,title2;
	
	 JTextArea packet1;
	 JTextArea nodea,nodeb,nodec,noded,nodee,nodef,nodesink;
	 JTextField t1,t2;	 
	 String msg="";

	 
	 Container c;
	 ImageIcon ii;
	 ImageIcon i2;
	 	Socket c1;
	 JButton send;
	 public sourcewin()
	
	 {
	
		initializeComponent();
		
	 }
		
		
		private void initializeComponent()

	   {
		
	
	

	
title=new JLabel("<html><font color=White size=+2><strong><center><i>Vampire attacks-Draining life from wireless ad-hoc sensor networks</i></center></strong></font>");
	   
	        
title1=new JLabel("<html><font color=Red size=+2><strong><center><i>Send Your Data Via--></i></center></strong></font>");		
		 
title2=new JLabel("<html><font color=Red size=+2><strong><center><i>Send To</i></center></strong></font>");				
l1=new JLabel("<html><font color=Red size=+2><strong><center><i>Node A</i></center></strong></font>");						   
l2=new JLabel("<html><font color=Red size=+2><strong><center><i>Node B</i></center></strong></font>");
l3=new JLabel("<html><font color=Red size=+2><strong><center><i>Node C</i></center></strong></font>");	
l4=new JLabel("<html><font color=Red size=+2><strong><center><i>Node D</i></center></strong></font>");						   
l5=new JLabel("<html><font color=Red size=+2><strong><center><i>Node E</i></center></strong></font>");						   
l9=new JLabel("<html><font color=Red size=+2><strong><center><i>Node F</i></center></strong></font>");						   
l7=new JLabel("<html><font color=Red size=+2><strong><center><i>Sink</i></center></strong></font>");
l8=new JLabel("<html><font color=Red size=+2><strong><center><i>Node A</i></center></strong></font>");						   					   						   		   
			 
		 
		  browse=new JButton("Browse");
		   browse.addActionListener(this);
		 
		  refresh=new JButton("Refresh");
		  refresh.addActionListener(this);
		 
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
		       
		  
		   send=new JButton("Send");
		       send.addActionListener(this);
		 
		  packet1=new JTextArea();
		  nodea=new JTextArea();
		 nodeb=new JTextArea();
		  nodec=new JTextArea();
		 noded=new JTextArea();
		  nodee=new JTextArea();
		 nodef=new JTextArea();
		  nodesink=new JTextArea();
		  
		  
		  JScrollPane sa = new JScrollPane(packet1);
		  
		 c=getContentPane();
		 
		 c.setLayout(null);
		  t1=new JTextField(30);
		 t2=new JTextField(30);
		 
		 
	//	 c.add(imageLabel1);
		
		ImageIcon xl = new ImageIcon("images1.jpg");
	    l6=new JLabel(xl);
	    l6.setBounds(20, 170, 260, 197);		
		l6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		l6.setForeground(new Color(64,0,0));
		l6.setBackground(new Color(154,190,200));
	 	c.add(l6);
		
		c.add(nodea);
		c.add(nodeb);
		c.add(nodec);
		c.add(noded);
		c.add(nodee);
		c.add(nodef);
		c.add(nodesink);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l9);
		c.add(l7);
		c.add(l8);
		c.add(send);
		
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
	 c.add(title);
	 c.add(title1);
	 c.add(title2);

		 
		 c.setBackground(new java.awt.Color(0,110,0));
         c.setLocation(300,300);
         setTitle("Source");
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
	
		sa.setBounds(290,170,190,105);	
		
    browse.setBounds(280,290,105,25);
	refresh.setBounds(390,290,105,25);
		
	//senda.setBounds(20,400,90,25);
	//sendb.setBounds(120,400,90,25);
///	sendc.setBounds(220,400,90,25);
//	sendd.setBounds(320,400,90,25);
//	sende.setBounds(420,400,90,25);
	send.setBounds(500,290,90,25);
	title.setBounds(45,30,500,60);
	title1.setBounds(15,110,500,60);
//	title2.setBounds(225,330,500,60);
	l1.setBounds(20,390,500,60);
l2.setBounds(120,390,500,60);
l3.setBounds(220,390,500,60);
l4.setBounds(320,390,500,60);
l5.setBounds(420,390,500,60);
l9.setBounds(520,390,500,60);
l7.setBounds(620,390,500,60);

		t1.setBounds(290,125,190,30);
		
		//t2.setBounds(10,170,20,20);
		
		
	t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t1.setForeground(new Color(64,0,0));
		t1.setBackground(new Color(26,176,164));
		
	    }
	    public void actionPerformed(ActionEvent ae)
	
	  	{

+		{
			  
        FileDialog fd1=new FileDialog(this,"OPEN",FileDialog.LOAD);
	    fd1.setVisible(true);
     	filesel=fd1.getDirectory()+fd1.getFile();
     	
    
     	 File f=new File(filesel);
		String st;
		try
		{
			int sz;
			byte[] buffer;

		
		
			FileInputStream fin=new FileInputStream(filesel);
	
			sz=fin.available();
			buffer=new byte[sz];
				
			

			
				fin.read(buffer);
				st=new String(buffer);
				packet1.setText(st);
				
			
				
			}
			catch(Exception e)
			{
			}
			
	    

	    }
	    
	    
	    	
	    	if(ae.getSource()==send)
	     {
	     	
	     	
	     if(packet1.getText().equals(""))
	    	{
	    		JOptionPane.showMessageDialog(null,"Choose file");
	    		packet1.requestFocus();
	    	}	
	     	
	     		try
		{
		   String data=packet1.getText();
		   
String text=t1.getText();



temp=text.split("-",4);
for(int i=0; i<temp.length; i++){
id=temp[0];
id1=temp[1];
id2=temp[2];
id3=temp[3];



}
//String id3=null;
//id3=temp[3];
w1="node"+id;
w2="node"+id1;
 w3="node"+id2;
//temp[3] ="sink";
		
	nodea.setText("");	
	String nodeaa="node"+temp[0];
	
		if(nodeaa.equals("nodea"))
		{
	
			
	String tt=packet1.getText();		
		
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
        
     
			
			
			nodea.append(tt+"\n");	
			
			
			
			
			
			
			
			
			
			
			
			
		
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
				nodea.append("sent:\n");
					try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
			
				//nw.nodea.setText("");
		}
		
		
		
		
		else if(nodeaa.equals("nodeb"))
		{
			
			
			nodeb.setText("");
			
			String tt=packet1.getText();		
		
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
        
     
			
			
			
			nodeb.append(tt+"\n");	
			
			
			
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
				nodeb.append("sent:\n");
					try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				//nw.nodeb.setText("");
		}
		
		
		
		else if(nodeaa.equals("nodec"))
		{
			
			
			
			
					nodec.setText("");
			
			String tt=packet1.getText();		
		
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
        
     
			
			
			
			nodec.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				nodec.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodec.setText("");
		}
		
		
		else if(nodeaa.equals("noded"))
		{
			
			
			
			
			noded.setText("");
			
			String tt=packet1.getText();		
		
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
        
     
			
			
			
			noded.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				noded.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.noded.setText("");
		}
		
		
		
		
		
		else if(nodeaa.equals("nodee"))
		{
			
			
			
			
			nodee.setText("");
			
			String tt=packet1.getText();		
		
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
        
     
			
			
			
			nodee.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
			
				nodee.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodee.setText("");
		}
		
		
		
		
		
		
		
		
		
		
		
		else if(nodeaa.equals("nodef"))
		{
			
			
			
			
			nodef.setText("");
			
			String tt=packet1.getText();		
		
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
        
     
			
			
			
			nodef.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				
				
				nodef.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodef.setText("");
		}
		
		
		else if(nodeaa.equals("nodesink"))
		{
			
			
			
			
			nodesink.setText("");
			
			String tt=packet1.getText();		
		
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
        
     
			
			
			
			nodesink.append(tt+"\n");
				
				try
				{
						Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				
				
				nodesink.append("sent:\n");
					try
				{
						Thread.sleep(800);
				}
				catch(Exception e)
				{
					
				}
			//	nw.nodesink.setText("");
		}
		
	
 try
		{
		   //String data=packet1.getText();
		   

		

		
		String via=t1.getText();
		
	
		int i=0;
		
	  //JOptionPane.showMessageDialog(null,"File send to node"+temp[i],"Result",JOptionPane.PLAIN_MESSAGE);
       				
		
		// JOptionPane.showMessageDialog(null,"File send to node"+temp[i]);  
             
		
		   String url = "rmi://127.0.0.1/node"+temp[i];




            srvint in = (srvint) Naming.lookup(url);
            in.sendfile3(data,via,temp,i);
            
           
	    }
	    catch(Exception e)
	 {
	 }
	 
     	
	
	
			
		
 }
 
 
 
 
 
 
	    catch(Exception e)
	 {
	 }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
     
     
    
     String st;	
     
     
		
		
		
		
		
	//System.out.print(data);
 
	   
     
     
     
     
     
     
     
       
  
       
	     }
	    
	
	    
	    
	    
	    
	    
	    
	    if(ae.getSource()==refresh)
	    {
	    	packet1.setText("");
	    }
	    
	    
	    
	   
	    
	  
	    
	    
	    
	    }
	    }
	  
	   public class source extends UnicastRemoteObject implements srvint
    {		
      
	
    sourcewin nw=new sourcewin();
	

	

		public source() throws RemoteException
	{
	
	}
	

		public void sendfile2(String path,String userid,String uid,String node)
	{
		
		}
		
		
			public void sendfile3(String path,String userid,String [] t,int i)
	{
		
		}
	
		public void sendfile1(String path,String userid)
	{
		
		 String uid=null;
		String sss=path;
		uid=userid;
		
	 System.out.println(uid);
		nw.t1.setText(sss);	
		nw.t2.setText(uid);
		
	}
	 
	    public static void main(String args[])
	    {
	    try
			{
			source na=new source();
		    Naming.rebind("source",na);
	
			}catch(Exception e){}
	
			 
	    }
	 
	   	


	   }
	   
	   
	
		
	
		
	 
	
		

	
	




