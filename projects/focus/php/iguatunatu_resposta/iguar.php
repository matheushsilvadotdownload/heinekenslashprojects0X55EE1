<?php

 class IguatunatuResposta 

{





      public final static function		processarRetorno ( ) 

	
	{


	$PortaDispoServico =	 771;
	$Endereco	   =	 gethostbyname('localhost');
	$Envio		   = 	'INFO=L1' . chr(10);



	$socket_util = socket_create( AF_INET, SOCK_STREAM, SOL_TCP );


		     if ( $socket_util === false ) 
		     
		     {
    		     
		     echo "Nao foi possivel realizar a criacao da via comunicativa--> " 
		     . socket_strerror( socket_last_error() ) . "\n";

		     } 
		     
		     else 

		     {
    		     
		     echo "IGUAR - Utilitario de atualizacao responsiva das Linhas Municipais (C) Matheus H. Silva.\n";
		     
		     }




			 $resultado = socket_connect( $socket_util , $Endereco , $PortaDispoServico );


			 if ( $resultado === false ) 
			
			 {
   
			 echo "Conexao comprometida--> " . socket_strerror( socket_last_error($socket_util) ) . "\n";
			 
			 } 
			 
			 else 
			 
			 {
    			
			 echo "V. 0.A22\n";
			
			 }





			 $saida = '';


			 socket_write( $socket_util, $Envio , strlen( $Envio ) );



			 while ( $saida = socket_read( $socket_util, 2048 ) ) 

			 {

				echo $saida;

			 }


					socket_close( $socket_util );

      
	


      	}



}

	
//**
 


	IguatunatuResposta::processarRetorno ( );



?>