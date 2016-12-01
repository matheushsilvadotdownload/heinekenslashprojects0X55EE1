
package tech.dvco.distrib.estruturas;

public  final    class  JNAtoRealizado {
 
    private String        da_escrevente             = null;
    private String        da_data                   = null;
    private short         da_protocolo              = -1;
    private String        da_interessado            = null;
    private String        da_documento              = null;
    private short         da_matricula              = -1;
    private String        da_livro                  = null;
    private String        da_servico                = null;
    private String        da_aato                   = null;
    
    
    
        private final void instituirAtributos (
        
        final String                f_constr_escrevente,
        final String                f_constr_data,
        final short                 f_constr_protocolo,
        final String                f_constr_interessado,
        final String                f_constr_documento,
        final short                 f_constr_matricula,
        final String                f_constr_livro,
        final String                f_constr_servico,
        final String                f_constr_aato 
        
        
        ) {
        
                    if (  
                    
                f_constr_escrevente != null &&
                f_constr_data != null &&
                f_constr_protocolo > 99 &&
                f_constr_interessado != null &&
                f_constr_documento != null &&
                f_constr_matricula > 99 &&
                f_constr_livro != null &&
                f_constr_servico != null &&
                f_constr_aato != null
        
            ){                    
            
            
           this.da_escrevente = f_constr_escrevente;
           this.da_data = f_constr_data;
           this.da_protocolo =  f_constr_protocolo;
           this.da_interessado = f_constr_interessado;
           this.da_documento = f_constr_documento;
           this.da_matricula = f_constr_matricula;
           this.da_livro = f_constr_livro;
           this.da_servico = f_constr_servico;
           this.da_aato = f_constr_aato;
            
            }
            
        
                return;
        }
    
    

        public final    String                  retornarEscrevente ( ){    
            if ( this.da_escrevente != null ) {  return this.da_escrevente; } else { return null; }
        
        }
        public final    String                  retornarData ( ){    
            if ( this.da_data != null ) { return this.da_data; } else { return null; }
        
        }
        public final    short                   retornarProtocolo ( ){    
            if ( this.da_protocolo > 0 ) { return this.da_protocolo; } else { return  (short)(-1); }
        
        }
        public final    String                  retornarInteressado ( ){    
            if ( this.da_interessado != null ) { return this.da_interessado; } else { return null; }
        
        }
        public final    String                  retornarDocumento ( ){    
            if ( this.da_documento != null ) { return this.da_documento; } else { return null; }
        
        }
        public final    short                   retornarMatricula ( ){    
            if ( this.da_matricula > 0 ) { return this.da_matricula; } else { return  (short)(-1); }
        
        }
        public final    String                  retornarLivro ( ){    
            if ( this.da_livro != null ) { return this.da_livro; } else { return null; }
        
        }
        public final    String                  retornarServico ( ){    
            if ( this.da_servico != null ) { return this.da_servico; } else { return null; }
        
        }
        public final    String                  retornarTipoAto ( ){    
            if ( this.da_aato != null ) { return this.da_aato; } else { return null; }
        
        }
    
        
        
    public    JNAtoRealizado (
        
    final String                constr_escrevente,
    final String                constr_data,
    final short                 constr_protocolo,
    final String                constr_interessado,
    final String                constr_documento,
    final short                 constr_matricula,
    final String                constr_livro,
    final String                constr_servico,
    final String                constr_aato 
        
        ) {
       
            
this.instituirAtributos(
        
        constr_escrevente, 
        constr_data, 
        constr_protocolo, 
        constr_interessado, 
        constr_documento, 
        constr_matricula, 
        constr_livro, 
        constr_servico, 
        constr_aato

);
        
        
        }
    
}