
package br.download.matheushsilva.rel.mogui;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

/**
 *
 * @author mhsilva
 */
public class MoASync 
extends AsyncTask<Integer,Integer,Void>

{

    
    private int                 execution   = -1;
    
    
    private Context             tcontext     = null;
    
    
    public final void myContextApply ( final Context context )
    
    {
        
        if ( context != null )
        {
        
            tcontext = context;
            
        }
        
    
    }
    
    
    private final void showResultInGUI ( final int result )
    {
    
    if ( result == 0 ) 
    
    {
        
        Toast.makeText( tcontext, "Perfeito." , Toast.LENGTH_SHORT ).show( );
    
    }
    
    else
        
    {
    
        Toast.makeText( tcontext, "O problema sou eu..." , Toast.LENGTH_SHORT ).show( );    
    
    }
    
    
    }

    
    private final int properExecution ( final char mode, final int atr )
            
    {
    
        if ( mode == 's' )
        
        {
        
            this.execution = atr;
            return 2;
        
        }
        
        else
        
        {
        
            return this.execution;
        
        }
    
    
    }
    

    @Override
    protected Void doInBackground(Integer... params) {
        
        
        this.publishProgress( MoGUIServiceAPPL.tryTalk( ) );
        
        
           return null;
    }
    
    @Override
    protected void onProgressUpdate( Integer... progress ) {
        
     
            this.properExecution( 's', progress[ 0 ] );
           
        
    }
    
    @Override
    protected void onPostExecute( Void result ) {
     
        Log.v("MoGUI_SOCK_COMUN_TRUE", String.valueOf( this.properExecution('x', 0) ) );
        this.showResultInGUI ( this.properExecution('x', 0) );
    
    }

    
    
    
}
