package org.example.mensagem;
import org.example.usuario.Usuario;

public class mensagemTexto extends Mensagem{
    private String mensagem;
    private String tipo = "texto";

    public mensagemTexto(String mensagem, Usuario usuario, String data, String destinatario){
        super(usuario, data, destinatario);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
