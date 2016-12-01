package br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo;

/**
 * Created by mhsilva on 05/11/16.
 */
public final class Cobrador {


    private String      codigoUnicidade =    null;
    private String      nome            =    null;
    private String      sexo            =    null;
    private short       idade           =    0;



   public final     String      retornarCodigoUnicidadeDesteCobrador ( ) {

        return  this.codigoUnicidade;

   }

    public final     String      retornarNomeDesteCobrador ( ) {

        return  this.nome;

    }

    public final     String      retornarSexoDesteCobrador ( ) {

        return  this.sexo;

    }

    public final     short      retornarIdadeDesteCobrador ( ) {

        return  this.idade;

    }


            public  Cobrador (

                    final String    in_codigoUnicidade,
                    final String    in_nome,
                    final String    in_sexo,
                    final short     in_idade

            ){


                this.codigoUnicidade = in_codigoUnicidade;
                this.nome            = in_nome;
                this.sexo            = in_sexo;
                this.idade           = in_idade;


            }


}