package br.matheushsilva.iguatunatu.sdetp.pak.rel.operacional;

import java.io.InputStream;


/**
 * Created by mhsilva on 10/11/16.
 */
public final class UtilComplementares {

public final InputStream            arquivoCadeiaDefinitiva ( )  {

    try {

        return
                ( this.getClass().getResourceAsStream("/br/matheushsilva/iguatunatu/sdetp/pak/rel/referencia/CadeiaDefinitiva_1.a" ) );

    } catch ( Exception x ) {

    Saida.STP_IGUA_ESCREVER( x.toString() );

        return null;

    }
}


}
