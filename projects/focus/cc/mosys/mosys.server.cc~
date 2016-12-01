
#include <iostream>

#include <stdio.h>
#include <stdlib.h>
#include <netdb.h>
#include <netinet/in.h>
#include <string.h>
#include <unistd.h>







class MoSYSServer


{


public:

  static const short  *execute ( );
  static const char   *msg     ( );


};




const short  *MoSYSServer :: execute ( ) 

{



  int sockfd, newsockfd, portno;
  socklen_t clilen;   
  char buffer[512];
  struct sockaddr_in serv_addr, cli_addr;
  int  n;
   

   /* First call to socket() function */
   sockfd = socket(AF_INET, SOCK_STREAM, 0);
   

   if (sockfd < 0) {
      perror("ERRO ao iniciar abertura de socket...");
      exit(1);
   }
   
   /* Initialize socket structure */
   bzero((char *) &serv_addr, sizeof(serv_addr));
   portno = 27300;
   
   serv_addr.sin_family = AF_INET;
   serv_addr.sin_addr.s_addr = INADDR_ANY;
   serv_addr.sin_port = htons(portno);
   
   /* Now bind the host address using bind() call.*/
   if (bind(sockfd, (struct sockaddr *) &serv_addr, sizeof(serv_addr)) < 0) {
      perror("ERROR ao inicializar soket...");
      exit(1);
   }
      
   /* Now start listening for the clients, here process will
      * go in sleep mode and will wait for the incoming connection
   */

   
   listen(sockfd,5);
   clilen = sizeof(cli_addr);
   


     std::cout << "MOSYS-SERVER em execucao | Matheus H. Silva | (C) 2016 | \u20D5\u20D5" << std::endl;



   while ( true ) 

     {


   /* Accept actual connection from the client */
   newsockfd = accept(sockfd, (struct sockaddr *)&cli_addr, &clilen);
	
   if (newsockfd < 0) {
      perror("ERRO ao aceitar.");
      exit(1);
   }
   
   /* If connection is established then start communicating */
   bzero(buffer,512);
   n = read( newsockfd,buffer,511 );
   
   if (n < 0) {
      perror("ERROR em ler.");
      exit(1);
   }


   
   std::cout << "requisicao: " << buffer << std::endl;
   

   if  ( strcmp( "008", buffer )  )

     {

       system ( "aplay ./mosys.server/cheguei.wav & > /dev/null" );

       /* Write a response to the client */
       n = write(newsockfd,"ok,ok\n",6);

     }
   


   
   if (n < 0) {
      perror("ERRO ao escrever.");
      exit(1);      
   }



   close( newsockfd );



     }



  return new short ( 0 );
}


const char  *MoSYSServer :: msg ( )

{

  return "(MOSYS-SERVER)\nMatheus Silva (C)\n\n\tArgumento:\n\t\u2022 = i: Inicializar servidor.\n";


}






int main ( int argc, char *argv[ ] ) 

{


  if ( argc == 3 ) 

    {

  
      if ( *argv[1] == '=' ) 

	{



	  switch ( *argv[2] ) 

	    {


	      
	    case 'i' :


	      MoSYSServer :: execute ( );


	    break;
	    

	    default :

	      std::cout  << "*SEM FOCO."            << std::endl;
	      std::cout  << MoSYSServer :: msg ( )  << std::endl;

	    }


	



	} 

      else
	
	{


      
      std::cout << "*SEM ARGUMENTOS OU CHAMADA IMPROPRIA."      << std::endl;
      std::cout << MoSYSServer :: msg ( )                       << std::endl;	

	

	}


    

    } 

     else

    {

      
      std::cout << "*SEM ARGUMENTOS OU CHAMADA IMPROPRIA."      << std::endl;
      std::cout << MoSYSServer :: msg ( )                       << std::endl;


    }









  return 0;
};
