
package br.download.matheushsilva.rel.mogui;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author mhsilva
 */
public abstract class MoGUIServiceAPPL 

{
  
    
  private static DataOutputStream       outToServer     = null;
  private static BufferedReader         inFromServer    = null;   
  private static Socket                 clientSocket    = null; 
  private static String                 fromServer      = null;
  
  
  
    public final static void int_ ( final Context context )
            
    {
    
       Toast.makeText( context, "Por Matheus H. Silva - NF - 2016 (C)" , Toast.LENGTH_SHORT ).show( );
    
    }
    
    
    public final static int tryTalk (  ) 
    

    {
    
    try 
  
    {
      
        clientSocket = new Socket( );
        clientSocket.connect( new InetSocketAddress( "192.168.0.99" , 27300 ), 
        3000 );
    
        outToServer =   new DataOutputStream( clientSocket.getOutputStream( ) );
        inFromServer =  new BufferedReader( new InputStreamReader( clientSocket.getInputStream( ) ) );
    
  

        outToServer.writeBytes( "008"+"\n" );
  
 
     
           fromServer = inFromServer.readLine( );

            
  
    } 
  
    catch ( Exception ex )
          
          {
          
              Log.i( "MOGUICLISERVICE-SOCK_EX", ex.toString( ) );  
  
              
              return 1;          
          }
    
          finally 
  
            {
  
                try{
                
                outToServer.flush();
                outToServer.close();
                inFromServer.close();
                
                
                
                    clientSocket.close( );
                    
               
            
                    if ( fromServer != null && fromServer.equals( "ok,ok" ) )
            
                    {
            
                    return 0;
                
                    }
            
                    else
            
                    {   
                
                    Log.v( "MOGUICLISERVICE-SOCK_UN", "NO-CON" );      
                    return 1;
                
                    }
                
                } 
                
                catch ( Exception ex1 )
                {

                              
              Log.i( "MOGUICLISERVICE-SOCK_EX", ex1.toString( ) ); 
  
              
                     return 1;          
                
                }
  
  
            }

    }
    
}
