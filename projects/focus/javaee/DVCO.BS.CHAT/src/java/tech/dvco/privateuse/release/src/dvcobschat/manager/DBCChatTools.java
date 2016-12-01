
package tech.dvco.privateuse.release.src.dvcobschat.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import tech.dvco.privateuse.release.src.dvcobschat.control.DBCIAM;

public abstract class 
DBCChatTools 

{
   
    
    public final static synchronized boolean saySomething ( final DBCIAM iam,
    final String msg 
    )
    throws Exception
            
            
    {
    
    final String content = "@@@@" + iam.myUserName() + ", atraves: "
    + "("+ iam.myPlatform( )  + ") -- disse: <b>" + msg + "</b>\nem = " + new Date( ) ;
    
    final File backUPfile = new File( "/var/www/dbschat/dbschat.chat" );
    
        if ( backUPfile.exists() )
        
        {
            final FileWriter        fw = new FileWriter     ( backUPfile,true );
            final BufferedWriter    bw = new BufferedWriter ( fw );
        
            bw.append( content );
            bw.flush( );
            bw.close( );
            
            return  true;
        } 
        
        else 
        
        {
        
            return false;
        
        }
    
    
    }
    
    public final synchronized static String allChatContent  ( )
    throws Exception
            
            
    {
    
        final File backUPfile = new File( "/var/www/dbschat/dbschat.chat" );
        
    if ( backUPfile.exists() )
        
    {
    
        final FileReader     fr         = new FileReader     ( backUPfile );
        final BufferedReader br         = new BufferedReader ( fr );
        final StringBuilder  content    = new StringBuilder( );
        String anl                      = "";
        
            while ( ( anl = br.readLine( ) ) != null )
            {
            
                content.append( anl + "<br>" );
                
            }
    
    return content.toString( );
    
    } 
    
    else
    {
    
        return "O CHAT ESTA COM PROBLEMAS!";
    }
    
    }


}