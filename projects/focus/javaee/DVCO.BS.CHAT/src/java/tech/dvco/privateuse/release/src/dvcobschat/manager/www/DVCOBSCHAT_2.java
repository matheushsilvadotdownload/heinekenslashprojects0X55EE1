
package tech.dvco.privateuse.release.src.dvcobschat.manager.www;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tech.dvco.privateuse.release.src.dvcobschat.control.DBCIAM;
import tech.dvco.privateuse.release.src.dvcobschat.manager.DBCChatTools;


public class DVCOBSCHAT_2 extends HttpServlet {

    
    
private final String h512_auth = 
"BF576ABCF37824184386BE4C3A85D37539E224E33A08A11E3A232309D0F652F7DCBDEB9CE03ED1B454090D44228DB7D8F37B8F7AD03E447D633FD263588CA6DB";
    
    

    private final void process_1(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, Exception
    
    {
       
        response.setContentType("text/html;charset=UTF-8");
        
        if ( request.getParameter( "dv" ).equals( (this.h512_auth+"__set") ) )
        {
        
            if ( 
                   request.getParameter("a").equals("y") 
               && !request.getParameter("u").isEmpty()
               && !request.getParameter("aa").isEmpty()
               && !request.getParameter("m").isEmpty()
                    
               ) 
            {
            
            final DBCIAM aim = 
            new DBCIAM ( request.getParameter("u"),request.getParameter("aa") );  
            
            
                DBCChatTools.saySomething( aim, request.getParameter("m") );
            
            
            final PrintWriter out = response.getWriter( );
            
            out.println("<div style=\"color:white;background:gray;\">");
            
                out.println( DBCChatTools.allChatContent( ) );
            
            out.println("</div>");
            
            } else 
            
            {
            
             final PrintWriter out = response.getWriter( );
            
            out.println("<h1 style=\"color:purple;\">| " 
             + "O que voce realmente quer?" + " |<h1>" );
            
                out.close( );
            }
        
        } 
        
        else if (  request.getParameter( "dv" ).equals( ( this.h512_auth ) ) ) 
            
        {
        
         final PrintWriter out = response.getWriter( );
            
            out.println("<div style=\"color:white;background:gray;\">");
            
                out.println( DBCChatTools.allChatContent( ) );
            
            out.println("</div>");
        
        }
        
        else
            
        {
            final PrintWriter out = response.getWriter( );
            
            out.println("<h1 style=\"color:purple;\">| " 
             + "Credenciais invalidas!" + " |<h1>" );
            
                out.close( );
        
        }

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    
    {
        
     final PrintWriter out = response.getWriter( );
     out.println("<center><h1>! PROIBIDO !</h1></center>");
     out.close();
    
    
    }

    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    
    {
    
        
        try
        {
        
            process_1(request, response);
       
        } 
        catch ( Exception ex )
        {
        
        }
        
    
    }



}
