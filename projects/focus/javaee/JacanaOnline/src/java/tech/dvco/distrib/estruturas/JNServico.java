
package tech.dvco.distrib.estruturas;

public  final   class   JNServico {
    

private  String classesDisponiveis[ ] = null;

private final synchronized void definirAsClasses ( ) {


    this.classesDisponiveis = new String[ ]{ "RRI","RTD","RPJ" };
    
        return;
}


public final synchronized String[] classes ( ) {

    if ( this.classesDisponiveis != null && this.classesDisponiveis.length > 1 ) {
    
        return this.classesDisponiveis;
    
    } else {
    
        return  null;
    
    }

}


public      JNServico ( ) {

this.definirAsClasses();

}


}