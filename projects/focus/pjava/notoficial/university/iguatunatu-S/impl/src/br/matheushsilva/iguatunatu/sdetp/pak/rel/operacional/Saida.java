package br.matheushsilva.iguatunatu.sdetp.pak.rel.operacional;

/**
 * Created by mhsilva on 10/11/16.
 */
public abstract class Saida {

public final static     void            STP_IGUA_ESCREVER ( final String mensagem ) {


    System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ NUCLEO IGUATUNATU DIZ:");
    System.out.println( mensagem.toUpperCase() );
    System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");


                return;
}

public final static     void            STP_IGUA_MODO_UTILIZACAO ( ) {

    for (short conta = 0; conta < 3; conta++) {

        System.out.print("\n");
    }


    System.out.println("IGUATUNATU SDETP (C) Matheus H. Silva");
    System.out.print
            ("\t-\tPara se utilizar corretamente deste utilitario,\n\t\tsaiba como trabalhar adequadamente com os seguintes argumentos:\n\n");

    System.out.println("-# d\t:\tResponsavel por apresentar informacoes de teor tecnico e funcional do sistema.");
    System.out.println("-# e\t:\tResponsavel por inicializar o servico primario.");

    for (short conta = 0; conta < 3; conta++) {

        System.out.print("\n");
    }

}

}