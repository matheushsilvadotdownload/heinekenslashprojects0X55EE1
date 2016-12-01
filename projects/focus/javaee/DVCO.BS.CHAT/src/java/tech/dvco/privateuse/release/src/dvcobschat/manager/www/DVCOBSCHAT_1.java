
package tech.dvco.privateuse.release.src.dvcobschat.manager.www;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tech.dvco.privateuse.release.src.dvcobschat.control.DBCIAM;
import tech.dvco.privateuse.release.src.dvcobschat.control.DBCUserControl;


@WebServlet(name = "DVCOBSCHAT_1", urlPatterns = {"/DVCOBSCHAT_1"})
public class 
DVCOBSCHAT_1 extends HttpServlet 
{


    private final String pageStructureToGo( final String user, final String plat )
    
    {
    
    
    return "<h2 style=\"color:white;background:blue\">Sua janela de Chat<h2/><br>" +
            "<br>" +
            "  <form  method=\"POST\" action=\"/DVCO.BS.CHAT/DVCOBSCHAT_2\" target=\"rr\"><br>"  +
            "  		<textarea name=\"m\"></textarea>  <br>" +
                        "<input style=\"background:white;color:blue;\" type=\"submit\" value=\"DIZER\">"+
            " <input type=\"hidden\" name=\"dv\" "
            + "value=\"BF576ABCF37824184386BE4C3A85D37539E224E33A08A11E3A232309D0F652F7DCBDEB9CE03ED1B454090D44228DB7D8F37B8F7AD03E447D633FD263588CA6DB__set\">"                 +
            " <input type=\"hidden\" name=\"a\" value=\"y\">"               +
            " <input type=\"hidden\" name=\"u\" value=\" " +  user  + " \">"               +
            " <input type=\"hidden\" name=\"aa\" value=\" " + plat  + " \">"               +
            "  </form>   "     +
            "  <iframe name=\"rr\" width=\"98%\" height=\"320px\">  "     +
            "  </iframe> "      +
            "<form method=\"POST\" action=\"/DVCO.BS.CHAT/DVCOBSCHAT_2\" target=\"rr\">\n" +
"<input type=\"hidden\" name=\"dv\" value=\"BF576ABCF37824184386BE4C3A85D37539E224E33A08A11E3A232309D0F652F7DCBDEB9CE03ED1B454090D44228DB7D8F37B8F7AD03E447D633FD263588CA6DB\">  \n" +
" \n" +
"<input style=\"background:green; color:white;\" type=\"submit\" value=\"Atualizar agora\">\n" +
"</form>"
            
            ;
    
    }
    
    
    private final void process_1(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
    
    response.setContentType("text/html;charset=UTF-8");
    
            if ( 
               
                  !request.getParameter("dvcobs_un").isEmpty()     
               && request.getParameter("dvcobs_un").length() > 2 
               && !request.getParameter("dvcobs_c1").isEmpty()     
               && request.getParameter("dvcobs_c1").length() > 2 
               && !request.getParameter("dvcobs_c2").isEmpty()     
               && request.getParameter("dvcobs_c2").length() > 2
                    
               )
            
            {
            
                final PrintWriter out = response.getWriter( );
              
                if (
                DBCUserControl.checkIfThisCanPass
                (request.getParameter("dvcobs_un"), 
                 request.getParameter("dvcobs_c1"),
                 request.getParameter("dvcobs_c2"))  > 0.87f
                        ) 
                
                {
                
                    out.println("<h2 style=\"color:red;\">Seja muito bem vindo, " 
                    + request.getParameter("dvcobs_un") + "</h2>" );
                    
                    final DBCIAM iam_ = new DBCIAM 
                    (
                    request.getParameter("dvcobs_un"), request.getHeader("USER-AGENT")
                    );
                
                    
                    out.println( this.pageStructureToGo( iam_.myUserName(),
                    iam_.myPlatform() ) );
                
                
                } 
                
                else 
                
                {
                
                    out.println("<h2 style=\"color:purple;\">????????????????? " 
                    + request.getParameter("dvcobs_un") + " ?????????????????</h2>" );
                    
                    out.close( );
                }
            
            } 
            
            else
                
            {
            final PrintWriter out = response.getWriter( );
            
            out.println("<h1 style=\"color:purple;\">| " 
             + "..." + " |<h1>" );
            
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
    
        
        process_1( request, response );
    
    
    }


}
