package br.matheushsilva.iguatunatu.sdetp.pak.rel.operacional;

import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.LinhaMunicipal;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.Cobrador;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.Motorista;

import java.util.TreeMap;

/**
 * Created by mhsilva on 10/11/16.
 */
public abstract class UtilPrimario {


public final static TreeMap<String,LinhaMunicipal> interpretacaoResponsivaLinhaMunicipal
        ( final String objetoBusca[ ] ) {



final TreeMap<String,LinhaMunicipal>  absorcao = new TreeMap<String,LinhaMunicipal>( );


        for ( short conta = 0; conta < objetoBusca.length; conta++ ) {


         if ( objetoBusca[ conta ].contains( "(LINHA.MUNICIPAL)" )

                 && ( objetoBusca.length - 7 ) > 1

                 ) {


             String ci,cr,np,hpu[],hpe[],pit[],pp,oc[];
             ci = cr = np = pp = null;
             hpu = hpe = pit = oc = null;


             if ( objetoBusca[ ( conta+1 ) ].contains("=>") ) {


                if ( objetoBusca[ ( conta+2 ) ].contains("ci>") ) {

                    ci = objetoBusca[ ( conta+2 ) ].split(">")[1];

                }


                if ( objetoBusca[ ( conta+3 ) ].contains("cr>") ) {

                     cr = objetoBusca[ ( conta+3 ) ].split(">")[1];

                 }


                 if ( objetoBusca[ ( conta+4 ) ].contains("np>") ) {

                     np = objetoBusca[ ( conta+4 ) ].split(">")[1];

                 }

                 if ( objetoBusca[ ( conta+5 ) ].contains("hpu>") ) {

                     hpu = objetoBusca[ ( conta+5 ) ].split(">")[1].split("_");

                 }

                 if ( objetoBusca[ ( conta+6 ) ].contains("hpe>") ) {

                     hpe = objetoBusca[ ( conta+6 ) ].split(">")[1].split("_");

                 }

                 if ( objetoBusca[ ( conta+7 ) ].contains("pit>") ) {

                     pit = objetoBusca[ ( conta+7 ) ].split(">")[1].split("_");

                 }

                 if ( objetoBusca[ ( conta+8 ) ].contains("pp>") ) {

                     pp = objetoBusca[ ( conta+8 ) ].split(">")[1];

                 }

                 if ( objetoBusca[ ( conta+9 ) ].contains("oc>") ) {

                     oc = objetoBusca[ ( conta+9 ) ].split(">")[1].split("_");

                 }




                        if (

                                        ci  != null     &&
                                        cr  != null     &&
                                        np  != null     &&
                                        hpu != null     &&
                                        hpe != null     &&
                                        pit != null     &&
                                        pp  != null     &&
                                        oc  != null     &&

                                                objetoBusca[ ( conta+10 ) ].contains ( "<=" )
                                ) {

                          final LinhaMunicipal resultadoLinhaMunicipal = new
                                LinhaMunicipal ( ci,Integer.parseInt( cr ),np,hpu,hpe,pit,Float.parseFloat( pp ),oc );


                            absorcao.put (

                                    cr,

                                    resultadoLinhaMunicipal  );

                        }



             }

         }



        }




    return  absorcao;
}

public final static TreeMap<String,Cobrador>  interpretacaoResponsivaCobrador ( final String objetoBusca[ ] ) {





    final TreeMap<String,Cobrador>  absorcao = new TreeMap<String,Cobrador>( );


    for ( short conta = 0; conta < objetoBusca.length; conta++ ) {


        if ( objetoBusca[ conta ].contains( "(COBRADOR)" )

                && ( objetoBusca.length - 3 ) > 1

                ) {


            String cun,n,s,i = null;
            cun = n = s = i;


            if ( objetoBusca[ ( conta+1 ) ].contains("=>") ) {


                if ( objetoBusca[ ( conta+2 ) ].contains("cun>") ) {

                    cun = objetoBusca[ ( conta+2 ) ].split(">")[1];

                }


                if ( objetoBusca[ ( conta+3 ) ].contains("n>") ) {

                    n = objetoBusca[ ( conta+3 ) ].split(">")[1];

                }


                if ( objetoBusca[ ( conta+4 ) ].contains("s>") ) {

                    s = objetoBusca[ ( conta+4 ) ].split(">")[1];

                }

                if ( objetoBusca[ ( conta+5 ) ].contains("i>") ) {

                    i = objetoBusca[ ( conta+5 ) ].split(">")[1];

                }

                if (

                                cun     != null     &&
                                n       != null     &&
                                s       != null     &&
                                i       != null     &&

                                objetoBusca[ ( conta+6 ) ].contains ( "<=" )
                        ) {

                    final Cobrador resultadoCobrador = new
                            Cobrador ( cun,n,s,Short.parseShort( i ) );


                    absorcao.put (

                            cun,

                            resultadoCobrador  );

                }



            }

        }



    }




    return  absorcao;

}

    public final static TreeMap<String,Motorista>  interpretacaoResponsivaMotorista ( final String objetoBusca[ ]
    , final TreeMap<String,Cobrador> arvoreCobrador, final TreeMap<String,LinhaMunicipal> arvoreLinha ) {





        final TreeMap<String,Motorista>  absorcao = new TreeMap<String,Motorista>( );


        for ( short conta = 0; conta < objetoBusca.length; conta++ ) {


            if ( objetoBusca[ conta ].contains( "(MOTORISTA)" )

                    && ( objetoBusca.length - 6 ) > 1

                    ) {


                String cun,rat,n,s,i;
                cun = rat = n = s = i = null;
                LinhaMunicipal lo[ ]   = null;
                Cobrador co           = null;


                if ( objetoBusca[ ( conta+1 ) ].contains("=>") ) {


                    if ( objetoBusca[ ( conta+2 ) ].contains("cun>") ) {

                        cun = objetoBusca[ ( conta+2 ) ].split(">")[1];

                    }


                    if ( objetoBusca[ ( conta+3 ) ].contains("rat>") ) {

                        rat = objetoBusca[ ( conta+3 ) ].split(">")[1];

                    }


                    if ( objetoBusca[ ( conta+4 ) ].contains("lo>") ) {

                        final String linhasO[ ] = objetoBusca[ ( conta+4 ) ].split(">")[1].split("_");

                            if ( linhasO != null && linhasO.length > 0 ) {

                                lo = new LinhaMunicipal[ linhasO.length ];

                                for ( short _cconta = 0 ; _cconta < linhasO.length; _cconta++ ) {

                                    lo[ _cconta ] = (LinhaMunicipal) arvoreLinha.get( linhasO [ _cconta ] );

                                }

                            }

                    }

                    if ( objetoBusca[ ( conta+5 ) ].contains("n>") ) {

                        n = objetoBusca[ ( conta+5 ) ].split(">")[1];

                    }

                    if ( objetoBusca[ ( conta+6 ) ].contains("s>") ) {

                        s = objetoBusca[ ( conta+6 ) ].split(">")[1];

                    }

                    if ( objetoBusca[ ( conta+7 ) ].contains("i>") ) {

                        i = objetoBusca[ ( conta+7 ) ].split(">")[1];

                    }

                    if ( objetoBusca[ ( conta+8 ) ].contains("co>") ) {

                        final String tmpCodCobrador = objetoBusca[(conta + 8)].split(">")[1];
                        co = (Cobrador) arvoreCobrador.get( tmpCodCobrador );

                    }


                        if (

                                    cun     != null     &&

                                            rat     !=  null &&
                                            lo      !=  null &&
                                            co      !=  null &&

                                    n       != null     &&
                                    s       != null     &&
                                    i       != null     &&

                                    objetoBusca[ ( conta+9 ) ].contains ( "<=" )
                            ) {

                        final Motorista resultadoMotorista = new
                                Motorista ( cun,rat,lo,n,s,Short.parseShort( i ),co );


                        absorcao.put (

                                cun,

                                resultadoMotorista  );

                    }



                }

            }



        }




        return  absorcao;

    }


}
