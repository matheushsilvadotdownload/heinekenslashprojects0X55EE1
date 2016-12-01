
package tech.dvco.distrib.www;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tech.dvco.distrib.dispor.JNDefinicao;
import tech.dvco.distrib.estruturas.JNAtoRealizado;
import tech.dvco.distrib.estruturas.JNData;
import tech.dvco.distrib.estruturas.JNDocumento;
import tech.dvco.distrib.estruturas.JNEscrevente;
import tech.dvco.distrib.estruturas.JNInteressado;
import tech.dvco.distrib.estruturas.JNLivro;
import tech.dvco.distrib.estruturas.JNMatricula;
import tech.dvco.distrib.estruturas.JNProtocolo;
import tech.dvco.distrib.estruturas.JNServico;
import tech.dvco.distrib.estruturas.JNTipoAto;
import tech.dvco.distrib.processos.JNRegistro;



@WebServlet(name = "JNAplicacaoAto", urlPatterns = {"/JNAplicacaoAto"})
public  class   JNAplicacaoAto  extends     HttpServlet {

    
    private final void jnAplicacaoAto (
    
    HttpServletRequest request, 
    HttpServletResponse response
    
    ) throws ServletException,IOException {

        
                      request.setCharacterEncoding( "UTF-8" );
        
                      
        if (  
                
        !request.getParameter( "_d_escrevente" ).isEmpty( )          &&
         request.getParameter( "_d_escrevente" ).length( )  > 1      &&
        !request.getParameter( "_d_protocolo" ).isEmpty( )           &&
         request.getParameter( "_d_protocolo" ).length( )   > 1      &&     
        !request.getParameter( "_d_interessado" ).isEmpty( )         &&
         request.getParameter( "_d_interessado" ).length( ) > 1      &&       
        !request.getParameter( "_d_documento" ).isEmpty( )           &&
         request.getParameter( "_d_documento" ).length( )   > 1      &&
        !request.getParameter( "_d_matricula" ).isEmpty( )           &&
         request.getParameter( "_d_matricula" ).length( )   > 1      &&
        !request.getParameter( "_d_livro" ).isEmpty( )               &&
         request.getParameter( "_d_livro" ).length( )       > 1      &&
        !request.getParameter( "_d_servico" ).isEmpty( )             &&
         request.getParameter( "_d_servico" ).length( )     > 1      &&
        !request.getParameter( "_d_ato" ).isEmpty( )                 &&
         request.getParameter( "_d_ato" ).length( )         > 1
                
                
            ){
        
        
        final PrintWriter saida     =   response.getWriter( );
        
        saida.println( "<html>" );
        saida.println( "<head>" );
        saida.println( "<title>Ato em processamento</title>" );
        saida.println( "<meta charset=\"utf-8\">" );
        saida.println( "<link rel=\"stylesheet\" media=\"screen\" href=\"https://fontlibrary.org/face/montreal\" type=\"text/css\"/> " );
        saida.println( "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>" );
        saida.println( "<link href=\"/Jacana/rec/folhas/aplicacao_ato.css\" rel=\"stylesheet\" type=\"text/css\">" );
        
        saida.println( "  <script \n" +
                    "            \n" +
                    "            src=\"/Jacana/execucao/processamento.ato/processamento.ato.uteis/JS/JNManipulaInterface.js\">\n" +
                    " \n" +
                    "        </script>" );
        
        saida.println( "</head>" );
        
        saida.println( "<body>" );
        
        saida.println( "<h1>" + "Em processamento..." + "</h1><br>" );
        
        
        
            
        final JNEscrevente fEscrevente = new JNEscrevente ( 
        request.getParameter( "_d_escrevente" ) ); 
        
        
        JNData.especificarFormatacaoData( 'a' );
        final String fData = JNData.retornarDataDeHoje( );
        
        
        final short fProtocolo = 
        new JNProtocolo( ).atribuirNumeroDeProtocolo 
        ( Short.valueOf( request.getParameter( "_d_protocolo" ) ) );
        
        final JNInteressado fInteressado = 
        new JNInteressado ( request.getParameter( "_d_interessado" ) );
        
        
        final JNDocumento fDoc = new JNDocumento( );
        String fDocEspecificado = null;
        if ( fDoc.retornarTitulosValidos().containsValue( 
            request.getParameter( "_d_documento" ) ) ) {
        
            fDocEspecificado = request.getParameter( "_d_documento" );
            
        }
        
        
        final short fMatricula = new 
        JNMatricula( ).atribuirNumeroDeMatricula( 
        Short.valueOf( request.getParameter( "_d_matricula" ) ) );
        
        
        final JNLivro fLivro = new JNLivro ( request.getParameter( "_d_livro" ) );
        
        
        final JNServico fServico = new JNServico ( );
        String fServicoEspecificado = null;
        
            for ( short conta = 0; conta < fServico.classes( ).length; conta++ ) {
                
                if ( request.getParameter( "_d_servico" ).equals ( 
                     fServico.classes()[ conta ] ) ) {
                
                
                    fServicoEspecificado = fServico.classes()[ conta ];
                    
                    break;
                
                
                }
                
            }
        
       
        final JNTipoAto fTAto = new JNTipoAto ( );
        String fTAtoEspecificado = null;
       
       
        if ( fTAto.retornarTiposAtosValidos().containsValue(
            request.getParameter( "_d_ato" ) ) ) {
        
        fTAtoEspecificado = request.getParameter( "_d_ato" );
        
        }
        
        
        
        
       final JNAtoRealizado ATO =    JNDefinicao.atribuirPropriedadesATO(
                
                fEscrevente.retornarNomeDeste( ),
                fData,
                fProtocolo,
                fInteressado.retornarNomeDeste( ),
                fDocEspecificado,
                fMatricula,
                fLivro.retornarOEspecificadorDeste(),
                fServicoEspecificado,
                fTAtoEspecificado
   
        
        
        );
          

        saida.println( "<h1>" + "Processamento realizado." + "</h1><br>" );

    
        
        

    

        saida.println( "<h2>" + "Verificando ultimos detalhes..." + "</h2><br>" );
        
        saida.println( "<h3>*" + ATO.retornarEscrevente() +  "</h3><br>" );
        saida.println( "<h3>*" + ATO.retornarDocumento()  +  "</h3><br>" );
        saida.println( "<h3>*" + ATO.retornarServico()    +  "</h3><br>" );
        
        
        
        
        
        saida.println("<p>");
        
        
        
        saida.println("Salvando...<br>");
        
        
        
        
        JNRegistro.proporcionarRegistro(
        
        ATO.retornarEscrevente(),
        ATO.retornarData(),
        ATO.retornarProtocolo(),
        ATO.retornarInteressado(),
        ATO.retornarDocumento(),
        ATO.retornarMatricula(),
        ATO.retornarLivro(),
        ATO.retornarServico(),
        ATO.retornarTipoAto()
        
        );
        
        
        
        
        saida.println( "Copia salva com sucesso...<br>" );
        
        
        saida.println( "<br><br><a href=\"/Jacana/JNAplicacaoOsAtos\">Verificar todos os atos</a>" );
        
        
        saida.println( "</p>" );
        
        saida.println( "<script>\n" +
"        \n" +
"    JNManipulaInterface.efeito_2_aplicacao_ato( );\n" +
"    \n" +
"    </script>" );
        
        
        saida.println( "</body>" );
        saida.println( "</html>" );    
        
        
        
    } else {
            
     
            final PrintWriter saida     =   response.getWriter( );
    
        saida.println( "<html>" );
        saida.println( "<body>" );
        saida.println( "<h1>" + "OPA, acredito que temos algum erro aqui..."
        + " Vamos ver:" + "</h1><br>" );
        
        
         saida.println( " ›  Escrevente:" +     request.getParameter  
        ( "_d_escrevente" ) + "<br>" );
         saida.println( " ›  Protocolo:" +      request.getParameter   
        ( "_d_protocolo" ) + "<br>" );
         saida.println( " ›  Interessado:" +    request.getParameter 
        ( "_d_interessado" ) + "<br>"  );
         saida.println( " ›  Documento:" +      request.getParameter   
        ( "_d_documento" ) + "<br>" );
         saida.println( " ›  Matricula:" +      request.getParameter   
        ( "_d_matricula" ) + "<br>" );
         saida.println( " ›  Livro:" +          request.getParameter       
        ( "_d_livro" ) + "<br>" );
         saida.println( " ›  Servico:" +        request.getParameter      
        ( "_d_servico" ) + "<br>" );
         saida.println( " ›  Ato:" +            request.getParameter         
        ( "_d_ato" ) + "<br>" );
        
        
        saida.println( "<br><br><br>" );
        saida.println( "<a href=\"/Jacana/execucao/processamento.ato/registrarumato.html\">Voltar</a>" );
        saida.println( "</body>" );
        saida.println( "</html>" );    
            
    
        
    }
    
    
        
        
        
        return;    
    
    }  
    
    protected  void  processRequest (  HttpServletRequest request, 
    HttpServletResponse response    ) throws ServletException,IOException {
     
        this.jnAplicacaoAto( request, response );
          
    }

 
    @Override
    protected  void  doGet ( HttpServletRequest request, 
    HttpServletResponse response ) throws  ServletException,IOException {
        
        
        this.processRequest(    request, response   );
    
    
    }




}