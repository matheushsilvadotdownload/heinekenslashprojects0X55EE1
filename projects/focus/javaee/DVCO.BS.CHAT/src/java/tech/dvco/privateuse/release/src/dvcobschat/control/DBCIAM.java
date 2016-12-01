/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.dvco.privateuse.release.src.dvcobschat.control;

public final class 
DBCIAM 

{

    private String username = null;
    private String platformSource = null;
    
    
    public String myUserName ( )
    {
    
        if ( this.username != null )
        
        {
        
            return this.username;
        
        }
        
        else
        
        {
        
            return "WTF";
        
        
        }
    
    }

        public String myPlatform ( )
    {
    
        if ( this.platformSource != null )
        
        {
        
            return this.platformSource;
        
        }
        
        else
        
        {
        
            return "WTF_IS_THIS_PLATFORM_SOURCE";
        
        
        }
    
    }
        
        
        public  DBCIAM ( final String cusername, final String c_plSource ) 
        
        {
        
        
            if ( !cusername.isEmpty() && !c_plSource.isEmpty() )
            {
            
                this.username           = cusername;
                this.platformSource     = c_plSource;
            
            }
        
        }
    
}