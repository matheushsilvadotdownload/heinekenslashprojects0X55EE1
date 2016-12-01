package br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo;

/**
 * Created by mhsilva on 05/11/16.
 */
public final class LinhaMunicipal {


    private String      condigoIdentificatorio          = null;
    private int         codigoReconhecimento            = 0;
    private String      nomePopular                     = null;
    private String      horariosPartidasUteis [ ]       = null;
    private String      horariosPartidasEspeciais [ ]   = null;
    private String      percursoItinerario [ ]          = null;
    private float       precoPassagem                   = 0.0f;
    private String      onibusComponentes   [ ]         = null;



    public final        String      retornarCodigoIdentificatorio ( ) {

        return  this.condigoIdentificatorio;

    }

    public final        int      retornarCodigoReconhecimento ( ) {

        return  this.codigoReconhecimento;

    }

    public final        String      retornarNomePopular ( ) {

        return  this.nomePopular;

    }

    public final        String      retornarHorariosUteis ( ) {

    final    StringBuilder conjuntoDeHorarios = new StringBuilder( );

            for ( short conta = 0; conta <  this.horariosPartidasUteis.length; conta++ ) {


                conjuntoDeHorarios.append( horariosPartidasUteis[ conta ] + " | " );

            }

                return  conjuntoDeHorarios.toString( );

    }

    public final        String      retornarPercursoItinerario ( ) {

        final    StringBuilder conjuntoDePontos = new StringBuilder( );

        for ( short conta = 0; conta <  this.percursoItinerario.length; conta++ ) {


            conjuntoDePontos.append( percursoItinerario[ conta ] + " | " );

        }

        return  conjuntoDePontos.toString( );

    }


    public final        String[ ]      retornarItinerario ( ) {


        return  this.percursoItinerario;


    }


    public final        String      retornarHorariosEspeciais ( ) {

        final    StringBuilder conjuntoDeHorarios = new StringBuilder( );

        for ( short conta = 0; conta <  this.horariosPartidasEspeciais.length; conta++ ) {


            conjuntoDeHorarios.append( horariosPartidasEspeciais[ conta ] + " | " );

        }

        return  conjuntoDeHorarios.toString( );

    }


    public final        float      retornarPrecoPassagem ( ) {

        return  this.precoPassagem;

    }

    public final        String      retornarOnibusComponentes ( ) {

        final    StringBuilder conjuntoDeVeiculos = new StringBuilder( );

        for ( short conta = 0; conta <  this.onibusComponentes.length; conta++ ) {


            conjuntoDeVeiculos.append( onibusComponentes[ conta ] + " | " );

        }

        return  conjuntoDeVeiculos.toString( );

    }


            public  LinhaMunicipal (

                    final String      in_condigoIdentificatorio,
                    final int         in_codigoReconhecimento,
                    final String      in_nomePopular,
                    final String      in_horariosPartidasUteis [ ],
                    final String      in_horariosPartidasEspeciais [ ],
                    final String      in_percursoItinerario [ ],
                    final float       in_precoPassagem ,
                    final String      in_onibusComponentes   [ ]

            ) {


                this.condigoIdentificatorio     = in_condigoIdentificatorio;
                this.codigoReconhecimento       = in_codigoReconhecimento;
                this.nomePopular                = in_nomePopular;
                this.horariosPartidasUteis      = in_horariosPartidasUteis;
                this.horariosPartidasEspeciais  = in_horariosPartidasEspeciais;
                this.percursoItinerario         = in_percursoItinerario;
                this.precoPassagem              = in_precoPassagem;
                this.onibusComponentes          = in_onibusComponentes;


            }



}
