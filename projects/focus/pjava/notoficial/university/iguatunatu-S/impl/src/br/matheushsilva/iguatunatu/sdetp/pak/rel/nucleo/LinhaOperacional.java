package br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo;

/**
 * Created by mhsilva on 05/11/16.
 */
public final class LinhaOperacional {


    private Motorista   motoristaOperante   = null;
    private String      posicaoEmItinerario = null;



    public final        Motorista   retornarMotoristaResponsavel ( ) {

        return  this.motoristaOperante;

    }

    public final        void        atualizarPosicao ( final short fr_posicao ) {


        for ( short conta = 0; conta < this.motoristaOperante.retornarLinhaDesteMotorista( ).length; conta++ ) {

            posicaoEmItinerario = this.motoristaOperante.retornarLinhaDesteMotorista( )
                    [ conta ].retornarItinerario( )[ fr_posicao ];

        }

                                                    return;
    }


    public final        String      retornarPosicaoAtual ( ) {

        return  this.posicaoEmItinerario;


    }

    public final        String      retornarIdentificacoesDestasLinhas ( ) {


        final StringBuilder juncaoDeInformacoesPertinentes = new StringBuilder ( );

        juncaoDeInformacoesPertinentes.append( this.motoristaOperante.retornarNomeDesteMotorista            ( ) + " | " );
        juncaoDeInformacoesPertinentes.append( this.motoristaOperante.retornarCobradorAtuanteDesteMotorista ( ) + " | " );
        juncaoDeInformacoesPertinentes.append( this.motoristaOperante.retornarLinhasOperadasPorEsteMotorista( ) + " | " );

            for ( short conta = 0; conta < this.motoristaOperante.retornarLinhaDesteMotorista( ).length; conta++  ) {

                juncaoDeInformacoesPertinentes.append (

                        this.motoristaOperante.retornarLinhaDesteMotorista()[ conta ].retornarHorariosUteis( )

                        + " | " );
            }


            return  juncaoDeInformacoesPertinentes.toString( );

    }



                public  LinhaOperacional ( final Motorista in_motoristaOperante ) {


                    this.motoristaOperante = in_motoristaOperante;


                        if ( this.motoristaOperante != null ) {

                            this.posicaoEmItinerario =
                                    this.motoristaOperante.retornarLinhaDesteMotorista( )[ 0 ].retornarItinerario( )[ 0 ];

                        }

                }



}
