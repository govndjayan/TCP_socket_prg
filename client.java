
import java.io.*;
import java.net.*;
public class client
{
  public static void main(String[] args) throws Exception
  {
     Socket sock = new Socket("localhost", 3000);
                               
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
                        
     OutputStream ostream = sock.getOutputStream(); 
     PrintWriter pwrite = new PrintWriter(ostream, true);

                             
     InputStream istream = sock.getInputStream();
     BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

     System.out.println("Start the chitchat, type and press Enter key");

     String receiveMessage, num;               
     while(true)
     {
		 System.out.println("Enter a number");
        num = keyRead.readLine();  
        pwrite.println(num); 
        pwrite.flush();                    
        if((receiveMessage = receiveRead.readLine()) != null)
        {
            System.out.println(receiveMessage); 
        }         
      }               
    }                    
}                        
