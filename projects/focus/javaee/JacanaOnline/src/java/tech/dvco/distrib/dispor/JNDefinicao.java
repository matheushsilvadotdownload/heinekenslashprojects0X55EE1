
package tech.dvco.distrib.dispor;


import tech.dvco.distrib.estruturas.JNAtoRealizado;


public  abstract    class   JNDefinicao {
    

public final static synchronized JNAtoRealizado atribuirPropriedadesATO (


final String    forn_nomeEscrevente,
final String    forn_dataMomento,
final short     forn_numProtocolo,
final String    forn_nomeInteressado,
final String    forn_espeDocumento,
final short     forn_numMatricula,
final String    forn_espeLivro,
final String    forn_espeServico,
final String    forn_atoRealizado



) {


            JNAtoRealizado ofer_atoReal = null;
    
        
        
    if ( 
            
         forn_nomeEscrevente != null   &&  forn_nomeEscrevente.length()  > 3  &&
         forn_dataMomento != null      &&  forn_dataMomento.length()     > 3  &&
         forn_numProtocolo > 0         &&  
         forn_nomeInteressado != null  &&  forn_nomeInteressado.length() > 3  &&
         forn_espeDocumento != null    &&  forn_espeDocumento.length()   > 3  &&
         forn_numMatricula > 0         &&  
         forn_espeLivro != null        &&  forn_espeLivro.length()       > 1  &&
         forn_espeServico != null      &&  forn_espeServico.length()     > 2  &&
         forn_atoRealizado != null     &&  forn_atoRealizado.length()    > 2    
  
        ) {
        
  
    
        
        
        ofer_atoReal    =   new JNAtoRealizado  (
        
            forn_nomeEscrevente,
            forn_dataMomento,
            forn_numProtocolo,
            forn_nomeInteressado,
            forn_espeDocumento,
            forn_numMatricula,
            forn_espeLivro,
            forn_espeServico,
            forn_atoRealizado
                                                );
        
        
    
        return  ofer_atoReal;
    
    } else {
    
            return      ofer_atoReal;
    }
    
    

}



}