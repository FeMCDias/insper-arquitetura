package org.example.mensagem;
import org.example.usuario.Usuario;

public class mensagemArquivo extends Mensagem {
    private String arquivo;
    private String tipo = "arquivo";

    public mensagemArquivo(String arquivo,Usuario usuario, String data, String destinatario){
        super(usuario, data, destinatario);
        this.arquivo = arquivo;

    }

    public String getArquivo(){
        return this.arquivo;
    }

    public void setArquivo(String arquivo){
        this.arquivo = arquivo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

}
