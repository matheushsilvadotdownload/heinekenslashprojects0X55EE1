
package tech.dvco.distrib.modulosfunc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public  final   class   JNArquivo {
    
private final synchronized void criarArquivoEm ( 
    final String caminhoProporcionado, final String conteudo ) {
try{

    if ( caminhoProporcionado != null && !caminhoProporcionado.equals("")
        && conteudo != null && !conteudo.equals("")
        ) {
    
    
    final File novoArquivo = new File ( caminhoProporcionado );
    
    if( !novoArquivo.exists( ) ){
    
    final boolean possivel = novoArquivo.createNewFile( );
    
    if( possivel ) {
        
        final FileWriter escreverARQ = new FileWriter ( novoArquivo.getAbsoluteFile( ) );
        final BufferedWriter escrevaEmBuffer = new BufferedWriter ( escreverARQ );
        escrevaEmBuffer.write( conteudo );
        escrevaEmBuffer.flush( );
        escrevaEmBuffer.close( );
    }
    
    }
    
    }

} catch ( Exception x ) {


}
        return;
}

public JNArquivo ( final String absolutoARQ, final String inserir ) {


    this.criarArquivoEm( absolutoARQ , inserir );
    
}

}