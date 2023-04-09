import java.rmi.*;
import java.io.*;

public interface srvint extends Remote
{

	public void sendfile1(String path,String userid) throws RemoteException;
		public void sendfile2(String data,String via,String sid,String node) throws RemoteException;
			public void sendfile3(String data,String via,String [] t,int i) throws RemoteException;

}
	
	