
package br.download.matheushsilva.rel.mogui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;



/**
 *
 * @author mhsilva
 */
public final class MoGUIGRI1  
extends RelativeLayout
{

    private final   RelativeLayout.LayoutParams basicLayParam = 
    new RelativeLayout.LayoutParams( RelativeLayout.LayoutParams.MATCH_PARENT,
    RelativeLayout.LayoutParams.WRAP_CONTENT );

    private final  RelativeLayout.LayoutParams thisLayParam   = 
    new LayoutParams( RelativeLayout.LayoutParams.MATCH_PARENT, 
    RelativeLayout.LayoutParams.MATCH_PARENT );
    
    private Button  mainButton = null;
    
    
    
    public MoGUIGRI1( final Context context ) 
    
    {
    
        super( context );


        this.basicLayParam.addRule  ( RelativeLayout.ALIGN_PARENT_BOTTOM );
        this.basicLayParam.addRule  ( RelativeLayout.ALIGN_PARENT_START  );
        
        
        this.mainButton = new Button ( context );
        this.mainButton.setLayoutParams( this.basicLayParam );
        this.mainButton.setText( "A V I S A R" );
        this.mainButton.setBackgroundColor( Color.parseColor( "#FFF279" ) );
        this.mainButton.setTextColor(Color.parseColor( "#131A00" ) );
        this.mainButton.setVisibility( View.VISIBLE );
        this.mainButton.setId( 1 );
        this.mainButton.setOnLongClickListener( new OnLongClickListener() {

            public boolean onLongClick( View v ) {
              
                    
                final MoASync ma = new MoASync ( );
                ma.myContextApply( context );
                ma.execute( -2 );
 
                
                return true;
            }
        } );

        
            
            this.setLayoutParams( this.thisLayParam );
            this.setBackgroundColor( Color.parseColor( "#DEFF7A" ) );
            this.addView( this.mainButton );
        
    
    }
    


    
}
