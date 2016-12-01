
package tech.dvco.distrib.processos;

import tech.dvco.distrib.modulosfunc.JNArquivo;

public  abstract    class   JNRegistro {
    

public final static synchronized void proporcionarRegistro (

final String    nomeEscrevente,
final String    dataMomento,
final short     numProtocolo,
final String    nomeInteressado,
final String    espeDocumento,
final short     numMatricula,
final String    espeLivro,
final String    espeServico,
final String    atoRealizado
        
) {


    if( nomeEscrevente != null && !nomeEscrevente.equals("") 
        && nomeEscrevente.length() > 3 && 
             dataMomento != null && !dataMomento.equals("") 
        && dataMomento.length() > 3 && 
             nomeInteressado != null && !nomeInteressado.equals("") 
        && nomeInteressado.length() > 3 && 
             espeDocumento != null && !espeDocumento.equals("") 
        && espeDocumento.length() > 2 && 
             espeLivro != null && !espeLivro.equals("") 
        && espeLivro.length() > 1 && 
             espeServico != null && !espeServico.equals("") 
        && espeServico.length() > 2 && 
             atoRealizado != null && !atoRealizado.equals("") 
        && atoRealizado.length() > 3 
        && numProtocolo > 0 && numMatricula > 0
            ) {
    
        try{
        
        final StringBuilder conteudoLocal = new StringBuilder ( );
        conteudoLocal.append( "*******JACANA__DADOS*******\n\n(ATO)\n\n" );
        conteudoLocal.append( "escrevente==>"+ nomeEscrevente + "\n" );
        conteudoLocal.append( "data==>"+dataMomento + "\n" );
        conteudoLocal.append( "nome.interessado==>"+ nomeInteressado + "\n" );
        conteudoLocal.append( "documento==>"+espeDocumento + "\n" );
        conteudoLocal.append( "livro==>"+espeLivro + "\n" );
        conteudoLocal.append( "servico==>"+espeServico + "\n" );
        conteudoLocal.append( "ato==>"+atoRealizado + "\n" );
        conteudoLocal.append( "protocolo==>"+ String.valueOf( numProtocolo ) + "\n" );
        conteudoLocal.append( "matricula==>"+ String.valueOf( numMatricula ) + "\n" );
        conteudoLocal.append( "R1==>"+ JNAssinaturasInternas.gerarA_R1( ) + "\n;" );
        
        
        final JNArquivo novoARQ = new JNArquivo ( 
        new String ( "/var/www/atos/ato--" + dataMomento.replaceAll("\\s+", "_")
                     .replaceAll("/", "_") )   
        , conteudoLocal.toString() );
        
        
        
        
        } catch ( Exception x ) {
        
        
        }
    
    }

}

}