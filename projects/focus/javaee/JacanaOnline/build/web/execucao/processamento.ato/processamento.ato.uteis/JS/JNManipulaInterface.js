    
    var JNManipulaInterface = {
        
        efeito_1_formulario : function ( ) {
            
            $( document ).ready(function( ) {

            $("#jacana_tit_topo_principal").slideDown( 700, function( ){} );
            $("#jacana_formulario").fadeIn( 1100, function( ){} );
            $("#jacana_img_ic_sysic_0").fadeIn( 1800, function( ){});

        } );
                
        },
        
        efeito_2_aplicacao_ato : function ( ) {
            
            $( document ).ready(function( ) {

            $("h1").slideDown( 1350, function( ){} );
            $("h2").slideDown( 1450, function( ){} );
            $("h3").slideDown( 1550, function( ){} );
            $("p").slideDown( 2000, function( ){} );
  

        } );
            
        },
        
        efeito_3_os_atos : function ( ) {
            
            $( document ).ready(function( ) {


                $("p").toggle( 1350, function( ){} );
                $("#jacana_img_ic_sysic_0").fadeIn( 1800, function( ){});
  

        } );
            
        }
        
        
    };