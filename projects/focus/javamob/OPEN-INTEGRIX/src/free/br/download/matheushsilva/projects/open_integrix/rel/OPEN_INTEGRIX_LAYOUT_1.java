
package free.br.download.matheushsilva.projects.open_integrix.rel;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public final class OPEN_INTEGRIX_LAYOUT_1 
extends LinearLayout

{
    
    
    private final static void buttonCALL 
    ( final EditText myTextEdit )
            
    {
    
    
        if(myTextEdit != null)
        myTextEdit.setText( OPEN_INTEGRIX_OPER.calc( myTextEdit.getText( ).toString( ) ) );
        
        
    }
    
    
    
    
    
    private final LinearLayout.LayoutParams aplParams = 
            new LinearLayout.LayoutParams
        ( LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT );
    
    
    
    
    private final LinearLayout.LayoutParams otParams = 
            new LinearLayout.LayoutParams
        ( LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT );
    
    
    
    private         TextView    msgTop;
    private         EditText    mainInput;
    private         Button      _submit;
    
    

    public OPEN_INTEGRIX_LAYOUT_1( Context c ) 
    
    {
    
        super( c );
        this.setLayoutParams( this.aplParams );
        this.setBackgroundColor( Color.parseColor( "#4E3E4E" ) );
        this.setOrientation( LinearLayout.VERTICAL );
        
        
        msgTop = new TextView ( c );
        msgTop.setLayoutParams( this.otParams );
        msgTop.setText( "Calculadora mínima de Integrais - Projeto OPEN-INTEGRIX" );
        msgTop.setTextColor( Color.WHITE );
        
        mainInput = new EditText ( c );
        mainInput.setLayoutParams( this.otParams );
        mainInput.setBackgroundColor( Color.parseColor("#4E2F2D") );
        mainInput.setTextColor( Color.WHITE );
        
        _submit = new Button ( c );
        _submit.setLayoutParams( this.otParams );
        _submit.setText( "=>" );
        _submit.setBackgroundColor( Color.parseColor("#4E2F2D") );
        _submit.setTextColor( Color.WHITE );
        _submit.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
        
            buttonCALL( mainInput );
            
            }
        });
        
        
        
        
        
        
        this.addView( msgTop );
        this.addView( mainInput );
        this.addView( _submit );
        this.refreshDrawableState( );
        
        
        
        mainInput.animate( )    .translationY( 64 ).withLayer( ).setDuration( 1766 );
        _submit.animate( )      .translationY( 64 ).withLayer( ).setDuration( 1766 );
        
    }
    
}
