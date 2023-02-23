package org.example.mensagem;
import org.example.usuario.Usuario;

public class Mensagem {
    private String destinatario;
    private String data;
    private Usuario usuario;

    public Mensagem(Usuario usuario, String data, String destinatario){
        this.usuario = usuario;
        this.data = data;
        this.destinatario = destinatario;
    }

    public String getDestinatario(){
        return this.destinatario;
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    public String getData(){
        return this.data;
    }

    public void setData(String data){
        this.data = data;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
