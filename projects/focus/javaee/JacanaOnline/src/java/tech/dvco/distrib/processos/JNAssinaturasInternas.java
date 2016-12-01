
package tech.dvco.distrib.processos;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;


public  abstract    class   JNAssinaturasInternas {
    
public final static synchronized String gerarA_R1 ( ) throws NoSuchAlgorithmException, UnsupportedEncodingException {

    final MessageDigest md = MessageDigest.getInstance( "SHA-256" );

    final String opcoes[ ] = new String[ ] {
    
"b5aa9a8277ca65aa622782",
"c4b6893ccab48754381451",
"51c59244c257a56ceaaaae",
"7c3eb28577b2e9286a3a47",
"15679939aa5469e6c84c62",
"16e91cb63c23eb83874e98",
"5a27a96b6669b54e844928",
"298a2a856a676cc546b8e3",
"155b8156ecb47c8e39944e",
"cce72655941347765b85e7",
"e5ec34477764878968e1b4",
"3c437a557b3289b844b921",
"83511454b9b554e866e7a7",
"61b65a3c395a6329698694"
    
    };
    
final int escolhaAleatoria = new Random().nextInt( ( (13) - (0) ) + 1 ) - 0;

md.update( opcoes[ escolhaAleatoria ].getBytes("UTF-8") );


byte digerir[ ] = md.digest();


return  new String ( digerir );

}


}
