
package tech.dvco.distrib.estruturas;

public  final    class   JNEscrevente {

    
    private  String nomeDeste = null;
    
    private final synchronized  void realizarDefinicaoDoNomeDeste ( 
    final String valorInsercao ) {
    
    
        if ( valorInsercao != null && !valorInsercao.equals( "" ) &&
             valorInsercao.length( ) >= 6 && 
             valorInsercao.length( ) <= 40 && !valorInsercao.matches( "[0-9]" ) )
        {
        
            this.nomeDeste = valorInsercao;
        
        }
        
        return;
    }
    
    public final synchronized String retornarNomeDeste ( ) {
    
        
        if ( this.nomeDeste != null && !this.nomeDeste.equals( "" ) ){
        
        return this.nomeDeste;
            
        } else {
        
            return new String ("INAPROPRIADO");
        
        }
    
    }
    
    
public    JNEscrevente ( final String valorEspecificacao ) {
    
        this.realizarDefinicaoDoNomeDeste( valorEspecificacao );
    
    }
    
}