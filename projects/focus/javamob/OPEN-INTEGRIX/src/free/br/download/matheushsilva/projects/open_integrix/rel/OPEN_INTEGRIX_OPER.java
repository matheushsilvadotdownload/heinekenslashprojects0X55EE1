
package free.br.download.matheushsilva.projects.open_integrix.rel;

public abstract class OPEN_INTEGRIX_OPER

{

    
    public final static synchronized String calc ( final String anl )
            
    {
    
    
        
        if ( anl!= null && anl.length( ) > 0 && !anl.isEmpty( ) )
            
        {
        
        
            
        if ( anl.matches( ".*[*+-/XRU<>0-9].*" ) && !anl.matches( ".*[Cc].*" ) )
            
        {
        
        
            if ( anl.length( ) <= 3  && !anl.matches( ".*[XxRU<>+-*/].*" ) )
            
            {
            
                if ( anl.matches( ".*[0-9+-].*" ) )
                    
                {
                
                    return new String ( anl + "X+C" );
                
                }
                
                else
                    
                {
                
                    return new String ( "? C:A2" );
                
                }
            
                
                
            }
            
            
            
            else
                
            {
            
                
                
                
                if ( anl.endsWith( "[Xx]" ) )
                    
                {
                
                    
                    
                return new String ( "? C:A55" );
                
                }
                
                
                
                else
                    
                {
                
                
                
                    
                    if ( anl.matches(".*[0-9].*")  && !anl.matches( ".*[XxRU<>+-*/].*" ) )
                        
                    {
                    
                        return new String ( anl + "X+C" );
                    
                    
                    }
                    
                    
                    
                    else
                        
                    {

                                        
                        return new String ( "? C:A59" );
                        
                    
                    }

                    
                
                
                
                }
                
                
                             
   
            
            }
        
        
        
        }
        
        
        else
            
        {
        
            
                                return new String ( "? C:A17" );
        
        }
            
            
        
        
        }
        
        else 
        
        {
        
            
            return new String ( "? C:A22" );
        
        
        }
        
        
        
        
        
        
        

    
    
    }
    
    
    
}
