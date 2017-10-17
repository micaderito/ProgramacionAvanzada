package servidor;

import java.net.*;
import java.io.*;

public class Servidor {
	
	Servidor(){
		int i;
		try {
			ServerSocket s = new ServerSocket(10000);
			for(i=1; i<4;i++) {
				Socket c = s.accept();
				DataOutputStream f = new DataOutputStream(c.getOutputStream());
				f.writeUTF("Cliente" + i + ": Hola");
				c.close();
			}
			s.close();
		}catch(Exception e)
		{
			
		}
	}
 /// EN EL MAIN HACER NEW SERVIDOR
}
