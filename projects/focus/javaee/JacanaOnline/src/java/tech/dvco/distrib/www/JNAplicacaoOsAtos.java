
package tech.dvco.distrib.www;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tech.dvco.distrib.modulosfunc.JNAlojamentoAtos;

@WebServlet(name = "JNAplicacaoOsAtos", urlPatterns = {"/JNAplicacaoOsAtos"})
public  class   JNAplicacaoOsAtos   extends     HttpServlet {


    private final synchronized void jnAplicacaoOsAtos ( HttpServletRequest request, 
    HttpServletResponse response )
    throws ServletException, IOException {
       
        
              request.setCharacterEncoding( "UTF-8" );
              
        
        final PrintWriter saida = response.getWriter( );
        saida.println("<html>");
        saida.println( "<head>" );
        saida.println( "<title>Atos existentes no servidor</title>" );
        saida.println( "<meta charset=\"utf-8\">" );
        saida.println( "<link rel=\"stylesheet\" media=\"screen\" href=\"https://fontlibrary.org/face/montreal\" type=\"text/css\"/> " );
        saida.println( "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>" );
        saida.println( "<link href=\"/Jacana/rec/folhas/os_atos.css\" rel=\"stylesheet\" type=\"text/css\">" );
        
        saida.println( "  <script \n" +
                    "            \n" +
                    "            src=\"/Jacana/execucao/processamento.ato/processamento.ato.uteis/JS/JNManipulaInterface.js\">\n" +
                    " \n" +
                    "        </script>" );
        
        saida.println( "</head>" );
        
        saida.println("<body id=\"jacana_body_1\">");
        saida.println("<section id=\"jacana_secao_principal\">");
        saida.println("<div id=\"jacana_div_1\">");
        saida.println("<p>");
        
        
            saida.println( JNAlojamentoAtos.realizarListagemPropria( 'w' ) );
        
        
        saida.println("</p>");
        saida.println("</div>");
        saida.println("</section>");
        
        saida.println( "                <div id=\"jacana_img_ic_sysic_0\">\n" +
    "            \n" +
    "                   <img src=\"/Jacana/rec/img/jn_sysicon_0.png\"><br>\n" +
    "                   <p style=\"color:WhiteSmoke\"> Sistema Jaçanã (2016)</p>\n" +
    "\n" +
    "            \n" +
    "                </div>" );
        
        
        saida.println( "<script>\n" +
    "        \n" +
    "    JNManipulaInterface.efeito_3_os_atos( );\n" +
    "    \n" +
    "    </script>" );
        
        saida.println("</body>");
        saida.println("</html>");
        
        
        
    }
    
    
    protected void processRequest( HttpServletRequest request, 
    HttpServletResponse response )
    throws ServletException, IOException {
    
    
      this.jnAplicacaoOsAtos( request, response );
        
    }
       
    
    
    @Override
    protected  void  doGet ( HttpServletRequest request, 
    HttpServletResponse response ) throws  ServletException,IOException {
        
        
        this.processRequest(    request, response   );
    
    
    }
 
}
