package br.matheushsilva.iguatunatu.sdetp.pak.rel.operacional;

import java.io.InputStream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by mhsilva on 10/11/16.
 */
public abstract class UtilSecundario {


public final static     String[ ]           retornarCadeiaDefinitivaInterna ( ) {

    try {

        final StringBuilder     construtor  = new StringBuilder( );
        final InputStream       arquivo     = new UtilComplementares().arquivoCadeiaDefinitiva();
        final BufferedReader    emBuffer    = new BufferedReader( new InputStreamReader( arquivo ) );
        String                  tmp         = null;

            while ( ( tmp = emBuffer.readLine( ) ) != null ) {


                construtor.append( tmp + "&&&" );

            }
            emBuffer.close();



        return construtor.toString().split("&&&");


    } catch ( Exception x ) {



        Saida.STP_IGUA_ESCREVER( x.toString() );

        return  null;
    }

}



}
