
package br.download.matheushsilva.rel.mogui;

import android.app.Activity;
import android.os.Bundle;

public class MoGUIMAct extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
    
        super.onCreate( savedInstanceState );
        
        MoGUIServiceAPPL.int_( this );
        this.setContentView( new  MoGUIGRI1( this ) );
    
    }
}
