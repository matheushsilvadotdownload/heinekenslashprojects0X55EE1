
package tech.dvco.distrib.estruturas;

import java.text.SimpleDateFormat;
import java.util.Date;

public  abstract    class   JNData {
    
    private static char definicaoEspecif;
    
    
   public final static synchronized void especificarFormatacaoData ( 
   final char argForma ) {
   
       if ( argForma == 'a' ) {
       
           definicaoEspecif = argForma;
       
       }  
       
   
   }
    
   public final static synchronized String retornarDataDeHoje ( ) {
   
        if ( definicaoEspecif == 'a' ) {
        final SimpleDateFormat formatacao = new SimpleDateFormat 
        ( "dd/M/yyyy     hh:mm" );
        
        final Date             agora      = new Date ( );
                
            return new String ( formatacao.format( agora ).toString() );
 
        } else {
 
            return new String ( new Date ( ).toString( ) );
        }
            
}
   

}