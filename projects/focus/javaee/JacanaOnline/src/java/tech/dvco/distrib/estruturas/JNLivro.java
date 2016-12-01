
package tech.dvco.distrib.estruturas;

public  final   class   JNLivro {

    
    private  String especificadorDeste = null;
    
private final synchronized void especificarOIdentificadorDeste ( final String 
    valorDeAtribuicao ) {

    if ( valorDeAtribuicao != null && !valorDeAtribuicao.equals( "" ) &&
        valorDeAtribuicao.length() > 0 ) {

        this.especificadorDeste = valorDeAtribuicao;
        
    }
    
        return;
}    
 
public final synchronized String retornarOEspecificadorDeste ( ) {

if ( this.especificadorDeste != null && 
     this.especificadorDeste.length() > 0 ) {

    return  this.especificadorDeste;
} else {

    return new String ( "INAPROPRIADO" );
    
}
    
    
}


public      JNLivro ( final String valorAtribuido ) {

this.especificarOIdentificadorDeste( valorAtribuido );

}

}