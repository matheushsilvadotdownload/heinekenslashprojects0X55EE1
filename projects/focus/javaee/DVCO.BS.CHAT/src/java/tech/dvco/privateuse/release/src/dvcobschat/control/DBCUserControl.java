/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.dvco.privateuse.release.src.dvcobschat.control;


public abstract class 
DBCUserControl 

{
    
private static final String allowedGuys [][] = new String [][]
{

     {"Michel","CRED220","CRED230"},{"Henrique","CRED110","CRED120"},
     {"Matheus","CRED009","CRED010"},{"Emerson","CRED700","CRED705"}

};

public final synchronized static float checkIfThisCanPass 
( final String user, final String cred1, final String cred2 ) 

{

    float   testing = 0.0f;
        
           if 
           ( 
            !user.isEmpty( ) && user.length() > 2 && !cred1.isEmpty() 
            && cred1.length() == 7 && !cred2.isEmpty() 
            && cred2.length() == 7
           )
        {
        
                for ( short count = 0; count < allowedGuys.length; count++)
                {
                
                    for ( short count2 = 0; count2 < allowedGuys[0].length; count2++ )
                    {
                    
                        if ( testing != 0.9f )
                        
                        {
                        
                        if ( user.equals( allowedGuys[count][count2] ) )
                        
                        {
                        
                            testing+=0.3f;
                        
                        
                        } else if ( cred1.equals( allowedGuys[count][count2] ) ) {
                                                        
                                testing+=0.3f;
                        
                        } else if ( cred2.equals( allowedGuys[count][count2] ) ) {
                        
                                testing+=0.3f;
                        
                        }
                         
                        
                        
                        } else {
                        
                        
                            break;
                            
                        }
                        
                    }
                
                }
            
        }

        return  testing;
}


}