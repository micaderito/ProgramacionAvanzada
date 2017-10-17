package cliente;

import java.net.*;
import java.io.*;

public class Cliente {
	
	Cliente(){
		try {
			Socket c = new Socket("localhost",10000);
			DataInputStream f = new DataInputStream(c.getInputStream());
				String msg = f.readUTF();
				System.out.println(msg);
				c.close();
		}
		catch(Exception e)
		{
			
		}
	}
}
