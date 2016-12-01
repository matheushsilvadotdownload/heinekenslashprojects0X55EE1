package br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo;

/**
 * Created by mhsilva on 05/11/16.
 */
public final class Motorista {


    private String              codigoUnicidade     =   null;
    private String              regiaoAtuante       =   null;
    private LinhaMunicipal      linhasOperadas [ ]  =   null;
    private String              nome                =   null;
    private String              sexo                =   null;
    private short               idade               =   0;
    private Cobrador            cobradorDesignado   =   null;



    public final        String              retornarCodigoUnicidadeDesteMotorista ( ) {


        return      this.codigoUnicidade;


    }

    public final        String              retornarRegiaoAtuanteDesteMotorista ( ) {


        return      this.regiaoAtuante;


    }


    public final        String              retornarLinhasOperadasPorEsteMotorista ( ) {

        final    StringBuilder conjuntoDeLinhas = new StringBuilder( );

        for ( short conta = 0; conta <  this.linhasOperadas.length; conta++ ) {


            conjuntoDeLinhas.append( linhasOperadas[ conta ].retornarNomePopular( ) + " | " );

        }

        return  conjuntoDeLinhas.toString( );

    }

    public final        String              retornarNomeDesteMotorista ( ) {


        return      this.nome;


    }

    public final        String              retornarSexoDesteMotorista ( ) {


        return      this.sexo;


    }

    public final        short               retornarIdadeDesteMotorista ( ) {


        return      this.idade;


    }

    public final        String              retornarCobradorAtuanteDesteMotorista ( ) {


        return      this.cobradorDesignado.retornarNomeDesteCobrador();


    }

    public final        LinhaMunicipal[ ]      retornarLinhaDesteMotorista  ( ) {


        return this.linhasOperadas;

    }

    public final        Cobrador                retornarCobradorDesteMotorista  ( ) {


        return this.cobradorDesignado;

    }



                public  Motorista  (

                        final String              in_codigoUnicidade,
                        final String              in_regiaoAtuante,
                        final LinhaMunicipal      in_linhasOperadas [ ],
                        final String              in_nome,
                        final String              in_sexo,
                        final short               in_idade,
                        final Cobrador            in_cobradorDesignado


                ){



                    this.codigoUnicidade        = in_codigoUnicidade;
                    this.regiaoAtuante          = in_regiaoAtuante;
                    this.linhasOperadas         = in_linhasOperadas;
                    this.nome                   = in_nome;
                    this.sexo                   = in_sexo;
                    this.idade                  = in_idade;
                    this.cobradorDesignado      = in_cobradorDesignado;

                }


}
