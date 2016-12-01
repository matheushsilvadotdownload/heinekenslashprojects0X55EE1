
package tech.dvco.distrib.estruturas;

import java.util.Map;
import java.util.TreeMap;

public  final    class   JNTipoAto {
 
    
    private Map< Short,String > tiposDisponiveisDeAtos = null;
    
    private final synchronized void definirAtosAplicaveis ( ) {
    
        this.tiposDisponiveisDeAtos = new TreeMap < Short,String > ( );
        
tiposDisponiveisDeAtos.put ( (short) 1,  new String( "Livro-2R-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 2,  new String( "Livro-2A-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 3,  new String( "Prenotação-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 4,  new String( "Certidão-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 5,  new String( "Abertura-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 6,  new String( "Notificação-Intimação-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 7,  new String( "Prenotação-Desconto-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 8,  new String( "Livro-2R-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 9,  new String( "Livro-2A-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 10,  new String( "Certidão-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 11,  new String( "Informação-Verbal-ou-Eletrônica-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 12,  new String( "Visualização-eletrônica-de-matrícula-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 13,  new String( "Notificação-RTD" ) );
tiposDisponiveisDeAtos.put ( (short) 14,  new String( "Registros-RTD-LB" ) );
tiposDisponiveisDeAtos.put ( (short) 15,  new String( "Registro-RPJ-LA" ) );
tiposDisponiveisDeAtos.put ( (short) 16,  new String( "Livro 3R-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 17,  new String( "Certidão-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 18,  new String( "Prenotação-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 19,  new String( "Certidão-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 20,  new String( "Livro-2R-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 21,  new String( "Livro-2A-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 22,  new String( "Abertura-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 23,  new String( "Livro-2R-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 24,  new String( "Livro- 2A-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 25,  new String( "Abertura-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 26,  new String( "Abertura-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 27,  new String( "Certidão-RPJ" ) );
tiposDisponiveisDeAtos.put ( (short) 28,  new String( "Condomínio-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 29,  new String( "Incorporação-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 30,  new String( "Loteamento-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 31,  new String( "Exame-e-álculo-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 32,  new String( "Livro-3A-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 33,  new String( "Visualização-eletrônica-de-documento-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 34,  new String( "Certidão-RTD" ) );
tiposDisponiveisDeAtos.put ( (short) 35,  new String( "Prenotação-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 36,  new String( "Busca-RPJ" ) );
tiposDisponiveisDeAtos.put ( (short) 37,  new String( "Busca-RTD" ) );
tiposDisponiveisDeAtos.put ( (short) 38,  new String( "Notificação-Intimação-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 39,  new String( "Notificação-Intimação-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 40,  new String( "Notificação-Intimação-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 41,  new String( "Informação-Eletrônica-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 42,  new String( "Informação-Eletrônica-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 43,  new String( "Informação-Eletrônica-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 44,  new String( "Prenotação-Desconto-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 45,  new String( "Informação-Verbal-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 46,  new String( "Informação-Verbal-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 47,  new String( "Informação-Verbal-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 48,  new String( "Exame-e-Cálculo-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 49,  new String( "Exame-e-Cálculo-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 50,  new String( "Exame-e-Cálculo-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 51,  new String( "Visualização-eletrônica-de-documento-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 52,  new String( "Visualização-eletrônica-de-matrícula-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 53,  new String( "Visualização-eletrônica-de-documento-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 54,  new String( "Visualização-eletrônica-de-matrícula-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 55,  new String( "Visualização-eletrônica-de-documento-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 56,  new String( "Visualização-eletrônica-de-matrícula-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 57,  new String( "Prenotação-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 58,  new String( "Averbação-RRI" ) );
tiposDisponiveisDeAtos.put ( (short) 59,  new String( "Averbação-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 60,  new String( "Averbação-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 61,  new String( "Averbação-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 62,  new String( "Condomínio-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 63,  new String( "Condomínio-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 64,  new String( "Condomínio-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 65,  new String( "Incorporação-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 66,  new String( "Incorporação-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 67,  new String( "Incorporação-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 68,  new String( "Loteamento-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 69,  new String( "Registro-RPJ-LB" ) );
tiposDisponiveisDeAtos.put ( (short) 70,  new String( "Registros-RTD-LC" ) );
tiposDisponiveisDeAtos.put ( (short) 71,  new String( "Livro 3A-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 72,  new String( "Livro 3A-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 73,  new String( "Livro 3A-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 74,  new String( "Livro 3R-RRI-G" ) );
tiposDisponiveisDeAtos.put ( (short) 75,  new String( "Livro 3R-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 76,  new String( "Livro 3R-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 77,  new String( "Loteamento-RRI-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 78,  new String( "Loteamento-RRI-SP" ) );
tiposDisponiveisDeAtos.put ( (short) 79,  new String( "Registro-RPJ-LA-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 80,  new String( "Registros-RTD-LB-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 81,  new String( "Certidão-RPJ-G" ) );
tiposDisponiveisDeAtos.put ( (short) 82,  new String( "Certidão-RPJ-GG" ) );
tiposDisponiveisDeAtos.put ( (short) 83,  new String( "Certidão-RTD-G" ) );
tiposDisponiveisDeAtos.put ( (short) 84,  new String( "Certidão-RTD-GG" ) );
        
        
            return;
    }
    
    
    
    public final synchronized Map < Short,String > retornarTiposAtosValidos ( ) {
    
        if ( this.tiposDisponiveisDeAtos != null && !this.tiposDisponiveisDeAtos.isEmpty() ) {
        
            return this.tiposDisponiveisDeAtos;
            
        } else {
        
        
                return  null;
        }
    
    }
    

public      JNTipoAto ( ) {

    this.definirAtosAplicaveis( );

}


}