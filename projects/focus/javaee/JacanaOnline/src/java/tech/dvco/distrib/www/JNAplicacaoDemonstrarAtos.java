
package tech.dvco.distrib.www;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tech.dvco.distrib.modulosfunc.JNAlojamentoAtos;

@WebServlet(name = "JNAplicacaoDemonstrarAtos", urlPatterns = {"/JNAplicacaoDemonstrarAtos"})
public class JNAplicacaoDemonstrarAtos extends HttpServlet {

    
    private final synchronized void jnAplicacaoDemonstrarAtos (HttpServletRequest request,
    HttpServletResponse response)
            throws ServletException, IOException {
        
        
                      request.setCharacterEncoding( "UTF-8" );
                      
        
        if ( !request.getParameter( "_d_arquivo" ).isEmpty() 
            && request.getParameter( "_d_arquivo" ).length() > 3 ) {
        
        final PrintWriter saida = response.getWriter( );
        saida.println("<html>");
        saida.println( "<head>" );
        saida.println( "<title>Demonstrar ato</title>" );
        saida.println( "<meta charset=\"utf-8\">" );
        saida.println( "<link rel=\"stylesheet\" media=\"screen\" href=\"https://fontlibrary.org/face/montreal\" type=\"text/css\"/> " );
        saida.println( "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>" );
        saida.println( "<link href=\"/Jacana/rec/folhas/demonstrar_ato.css\" rel=\"stylesheet\" type=\"text/css\">" );
        
        saida.println( "  <script \n" +
                    "            \n" +
                    "            src=\"/Jacana/execucao/processamento.ato/processamento.ato.uteis/JS/JNManipulaInterface.js\">\n" +
                    " \n" +
                    "        </script>" );
        
        saida.println( "</head>" );
        
        
        saida.println("<body>");
        saida.println("<section style=\"background:mediumaquamarine  ;\">");
        saida.println("<p>");
        
        
            saida.println( JNAlojamentoAtos.retornarConteudoAto
            ( request.getParameter( "_d_arquivo" ) ) );
        
        
        saida.println("</p>");
        saida.println("</section>");
        saida.println("</body>");
        saida.println("</html>");
        
        }
        
    
    
    }
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        
        this.jnAplicacaoDemonstrarAtos( request, response );
        
    }

     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    
        this.processRequest( request, response );
    
    }





}
