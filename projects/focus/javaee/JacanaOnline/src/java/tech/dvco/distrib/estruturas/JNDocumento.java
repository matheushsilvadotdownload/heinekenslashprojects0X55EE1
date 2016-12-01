
package tech.dvco.distrib.estruturas;

import java.util.Map;
import java.util.TreeMap;

public  final   class   JNDocumento {
   
    
private  Map<Short,String> titulosValidos = null;    

private final void definirTitulosAplicaveis ( ) {

    this.titulosValidos = new TreeMap<Short,String> ( );

 this.titulosValidos.put( (short)1, new String( "Escritura Pública" ) );
 this.titulosValidos.put( (short)2, new String( "Instrumento Particular" ) );
 this.titulosValidos.put( (short)3, new String( "Requerimento" ) );
 this.titulosValidos.put( (short)4, new String( "Mandado" ) );
 this.titulosValidos.put( (short)5, new String( "Notificação" ) );
 this.titulosValidos.put( (short)6, new String( "Penhora Online" ) );
 this.titulosValidos.put( (short)7, new String( "Formal Partilha" ) );
 this.titulosValidos.put( (short)8, new String( "Retificação" ) );
 this.titulosValidos.put( (short)9, new String( "Carta de Sentença" ) );
 this.titulosValidos.put( (short)10, new String( "Usucapião" ) );
 this.titulosValidos.put( (short)11, new String( "Carta de Adjudicação" ) );
 this.titulosValidos.put( (short)12, new String( "Oficio" ) );
 this.titulosValidos.put( (short)13, new String( "Cédula" ) );
 this.titulosValidos.put( (short)14, new String( "Ex-Oficio" ) );
 this.titulosValidos.put( (short)15, new String( "Certidão" ) );
 this.titulosValidos.put( (short)16, new String( "Regularização" ) );

        return;
} 


public final Map<Short,String> retornarTitulosValidos ( ) {

    if ( this.titulosValidos != null && 
         !this.titulosValidos.isEmpty( ) ) {
    
        return this.titulosValidos;
        
    } else {
    
        return  null;
        
    }

}


public      JNDocumento ( ) {

this.definirTitulosAplicaveis( );

}

}
