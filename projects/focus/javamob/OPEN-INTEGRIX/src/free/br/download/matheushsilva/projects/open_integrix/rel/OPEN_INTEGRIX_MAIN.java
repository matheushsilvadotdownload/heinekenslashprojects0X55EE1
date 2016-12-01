package free.br.download.matheushsilva.projects.open_integrix.rel;

import android.app.Activity;
import android.os.Bundle;



public class OPEN_INTEGRIX_MAIN extends Activity

{

    
    @Override
    public void onCreate(Bundle savedInstanceState)
    
    {
    
        super.onCreate(savedInstanceState);
        
        this.setContentView( new OPEN_INTEGRIX_LAYOUT_1 ( this ) );
    
    }
    
    
}
