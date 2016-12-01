package br.matheushsilva.iguatunatu.sdetp.pak.rel;

import br.matheushsilva.iguatunatu.sdetp.pak.rel.execucao.TempoReal;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.Cobrador;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.LinhaMunicipal;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.Motorista;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.operacional.Saida;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.operacional.UtilPrimario;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.operacional.UtilSecundario;


import java.util.Map;
import java.util.TreeMap;

public class STP_Iguatunatu {




    public static               void        main( String [ ] args ) {

        if ( args.length > 1 ) {

            if ( args[0].equals("-#") ) {

                switch (args[1]) {


                    case "d":

                        final TreeMap<String, LinhaMunicipal> ARVLinhaMun = UtilPrimario.interpretacaoResponsivaLinhaMunicipal
                                (UtilSecundario.retornarCadeiaDefinitivaInterna());

                        final TreeMap<String, Cobrador> ARVCobrador = UtilPrimario.interpretacaoResponsivaCobrador
                                (UtilSecundario.retornarCadeiaDefinitivaInterna());

                        final TreeMap<String, Motorista> ARVMotorista = UtilPrimario.interpretacaoResponsivaMotorista(
                                UtilSecundario.retornarCadeiaDefinitivaInterna(), ARVCobrador, ARVLinhaMun);


                        Saida.STP_IGUA_ESCREVER("<Processando>");


                        for (Map.Entry<String, LinhaMunicipal> entr : ARVLinhaMun.entrySet()) {

                            System.out.println("-->" + entr.getKey() + "=" + entr.getValue() + ":");
                            System.out.println(entr.getValue().retornarCodigoIdentificatorio());
                            System.out.println(entr.getValue().retornarNomePopular());
                            System.out.println(entr.getValue().retornarCodigoReconhecimento());

                        }

                        for (Map.Entry<String, Cobrador> entr : ARVCobrador.entrySet()) {

                            System.out.println("-->" + entr.getKey() + "=" + entr.getValue() + ":");
                            System.out.println(entr.getValue().retornarNomeDesteCobrador());
                            System.out.println(entr.getValue().retornarCodigoUnicidadeDesteCobrador());

                        }


                        for (Map.Entry<String, Motorista> entr : ARVMotorista.entrySet()) {

                            System.out.println("-->" + entr.getKey() + "=" + entr.getValue() + ":");
                            System.out.println(entr.getValue().retornarNomeDesteMotorista());
                            System.out.println(entr.getValue().retornarIdadeDesteMotorista());
                            System.out.println(entr.getValue().retornarCobradorAtuanteDesteMotorista());
                            System.out.println(entr.getValue().retornarLinhasOperadasPorEsteMotorista());

                        }


                        Saida.STP_IGUA_ESCREVER("OK...");

                        break;





                    case "e":

                        Saida.STP_IGUA_ESCREVER( "Servico inicializado!" );


                        final TreeMap<String, LinhaMunicipal> E__ARVLinhaMun = UtilPrimario.interpretacaoResponsivaLinhaMunicipal
                                (UtilSecundario.retornarCadeiaDefinitivaInterna());

                        final TreeMap<String, Cobrador> E__ARVCobrador = UtilPrimario.interpretacaoResponsivaCobrador
                                (UtilSecundario.retornarCadeiaDefinitivaInterna());

                        final TreeMap<String, Motorista> E__ARVMotorista = UtilPrimario.interpretacaoResponsivaMotorista(
                                UtilSecundario.retornarCadeiaDefinitivaInterna(), E__ARVCobrador,E__ARVLinhaMun);


                        new TempoReal( E__ARVLinhaMun,E__ARVCobrador,E__ARVMotorista ).atualizar( ).start( );


                        break;


                    default:

                        Saida.STP_IGUA_MODO_UTILIZACAO();

                        break;


                }

            } else {


                Saida.STP_IGUA_MODO_UTILIZACAO( );


            }

        } else {

            Saida.STP_IGUA_MODO_UTILIZACAO( );

        }


    }

}
