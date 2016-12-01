package br.matheushsilva.iguatunatu.sdetp.pak.rel.execucao;

import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.Cobrador;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.LinhaMunicipal;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.LinhaOperacional;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.nucleo.Motorista;
import br.matheushsilva.iguatunatu.sdetp.pak.rel.operacional.Saida;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.TreeMap;

/**
 * Created by mhsilva on 10/11/16.
 */
public final class TempoReal {

private TreeMap<String,LinhaMunicipal>          asLinhasMunicipais  = null;
private TreeMap<String,Cobrador>                osCobradores        = null;
private TreeMap<String,Motorista>               osMotoristas        = null;
private TreeMap<Integer,LinhaOperacional>       asLinhasOperantes   = null;


    private final       Thread            servidor ( final LinhaOperacional LO ) {

        return   new Thread(new Runnable( ) {

            @Override
            public void run( ) {

                try {

                    final ServerSocket servir = new ServerSocket( 771 );


                    while (  true  ) {


                        Socket conexaoAoSocket = servir.accept( );


                        BufferedReader requisicao =
                                       new BufferedReader(new InputStreamReader(conexaoAoSocket.getInputStream()));


                        if (requisicao.readLine().equals("INFO=L1")) {


                            DataOutputStream resultado = new DataOutputStream(conexaoAoSocket.getOutputStream());
                            resultado.writeBytes

                                    (


                                     LO.retornarIdentificacoesDestasLinhas()
                                     + new String(" - ") + LO.retornarPosicaoAtual() + new String("\n")


                                    );



                            requisicao.close( );
                            resultado.flush( );
                            resultado.close( );
                            conexaoAoSocket.close( );


                        } else {

                            requisicao.close( );
                            conexaoAoSocket.close( );

                        }


                    }

                    } catch( Exception x ){


                        Saida.STP_IGUA_ESCREVER(x.toString());


                            run ( );

                    }

            }

        }

        );

    }

    public final        Thread            atualizar ( ) {

            return  new Thread( new Runnable( ) {

                @Override
                public void run() {


                   final LinhaOperacional linhaOperante = (LinhaOperacional) asLinhasOperantes.get( 1 );

                    if ( linhaOperante != null ) {

                        final int progressao =
                                linhaOperante.retornarMotoristaResponsavel( ).retornarLinhaDesteMotorista( )[0].retornarItinerario( ).length;

                        short contando = 0;



                        TempoReal.this.servidor( linhaOperante ).start( );




                        while (true) {



                            if ( contando < progressao ){




                                linhaOperante.atualizarPosicao( contando );

                                System.out.println( linhaOperante.retornarIdentificacoesDestasLinhas( ) );

                                System.out.println( linhaOperante.retornarPosicaoAtual( ) );


                                contando++;

                                try {

                                    Thread.sleep( ( new Random( ).nextInt( ( 19200 - 8100 ) + 2 ) + 7911 ) );

                                } catch ( Exception x ) {

                                    Saida.STP_IGUA_ESCREVER( x.toString( ) );
                                }

                            } else {

                                contando = 0;

                                linhaOperante.atualizarPosicao( contando );


                                try {

                                    Thread.sleep( ( new Random( ).nextInt( ( 22500 - 15100 ) + 2 ) + 14991 ) );

                                } catch ( Exception x ) {

                                    Saida.STP_IGUA_ESCREVER( x.toString( ) );
                                }

                            }



                        }
                    }

                }
            }

            );


    }



        public TempoReal (

                final TreeMap<String,LinhaMunicipal> mapa_linhas,
                final TreeMap<String,Cobrador> mapa_cobradores,
                final TreeMap<String,Motorista> mapa_motoristas

                ) {


            this.asLinhasMunicipais     = mapa_linhas;
            this.osCobradores           = mapa_cobradores;
            this.osMotoristas           = mapa_motoristas;


            if ( this.asLinhasMunicipais != null && this.osCobradores != null && this.osMotoristas != null  ) {

              this.asLinhasOperantes = new TreeMap<Integer,LinhaOperacional>( );
              this.asLinhasOperantes.put(

                  1

                      ,

                      new LinhaOperacional(

                              (Motorista) this.osMotoristas.get( "FN002" )

                              )

              );

            }

        }


}