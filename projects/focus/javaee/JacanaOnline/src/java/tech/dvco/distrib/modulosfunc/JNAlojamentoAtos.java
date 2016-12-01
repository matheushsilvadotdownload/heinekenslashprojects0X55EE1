
package tech.dvco.distrib.modulosfunc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public  abstract   class   JNAlojamentoAtos {
    

    private final static String     caminhoDefinido = "/var/www/atos/";
    private final static File       diretorioPrincipal = new File ( caminhoDefinido );

    
    
    public final static synchronized String retornarConteudoAto (
    final String arquivoAnalise ) {
    
        try{
        
            
            
            if ( arquivoAnalise != null && !arquivoAnalise.isEmpty( )
                 && arquivoAnalise.length( ) > 2
               ) {
            
                
                final String arquivo_valido = caminhoDefinido +arquivoAnalise;
                
                final StringBuilder conteudoUtil = new StringBuilder ( );
                
                final File atoEmFoco = new File ( arquivo_valido );
                
                if ( atoEmFoco.exists( ) ) {
                
                    final FileReader leitor = new FileReader ( atoEmFoco );
                    final BufferedReader leituraEmBuffer =
                    new BufferedReader ( leitor );
                    
                    String absorcao = null;
                    
                    
                        while ( ( absorcao = leituraEmBuffer.readLine( ) ) 
                               != null ) {
                        
                        conteudoUtil.append(  absorcao + "<br>"  );
                        
                        }
                        
                        leituraEmBuffer.close( );
                        
                        
                        
                return  conteudoUtil.toString( );
                
                } else {
                
                return  new String ( "Conteudo invalido durante processamento." );
                
                }
                
            } else {
            
            return  new String ( "Conteudo invalido durante processamento." );
            
            }
            
            
        }catch (  Exception x ) {
        
            return new String ( "Erro critico, " + x.getMessage( ) );
            
        }
        
    
    }
    
    
    public final static synchronized String realizarListagemPropria (
    final char modo ) {
    
        try{
    
            
            
            
        if ( diretorioPrincipal.exists( ) ) {
        
        if ( modo == 'w' ) {
            
            StringBuilder conteudoUtil = new StringBuilder( );
            
            if ( diretorioPrincipal.list( ).length > 0 ) {
            
            for (short conta = 0; conta < diretorioPrincipal.list( ).length; 
                conta ++ ){
            
            conteudoUtil.append( "<a href=\"/Jacana/JNAplicacaoDemonstrarAtos?_d_arquivo=" + 
            diretorioPrincipal.list( )[ conta ] + "\">Consultar ato " + 
            diretorioPrincipal.list( )[ conta ] + "</a><br><br>" );
            
            }
            
            
            
                    return  conteudoUtil.toString( );
            
            
            } else {
            
            return  new String ( "Nao foram encontrados ATOS PERTINENTES." );
            
            }
            
            
            
        } else {
        
            return  
            new String ( "Nao foram encontrados ATOS PERTINENTES, modo de acesso invalido." );
        
        }
        
        } else {
        
            return  
            new String ( "Nao foram encontrados ATOS PERTINENTES, erro em alojamento." );
            
        } 
    
        
        } catch ( Exception x ){
        
        return  
        new String ( "Erro critico, " + x.getMessage( ) );
            
            
        }
        
    
    
    }

}