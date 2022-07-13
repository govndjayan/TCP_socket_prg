import java.io.*;
import java.net.*;
public class server
{
  public static void main(String[] args) throws Exception
  {
      ServerSocket sersock = new ServerSocket(3000);
      System.out.println("Server  ready for chatting");
      Socket sock = sersock.accept( );                          
      BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
      OutputStream ostream = sock.getOutputStream(); 
      PrintWriter pwrite = new PrintWriter(ostream, true);

                              
      InputStream istream = sock.getInputStream();
      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

      String receiveMessage, sendMessage,num;
		
		while(true){
		num=receiveRead.readLine();
		int i= Integer.parseInt(num);
		int m=0;
		int flag=0;
        m=i/2;
			System.out.println("Client:"+num);
  if(i==0||i==1){  
   pwrite.println(" is not prime number");      
  }else{  
   for(int e=2;e<=m;e++){      
    if(i%e==0){      
     pwrite.println(" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { pwrite.println("is prime number"); }  
  }  
        pwrite.flush();
		}
    }                    
}                        
