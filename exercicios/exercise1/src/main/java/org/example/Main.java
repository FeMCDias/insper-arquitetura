package org.example;
import org.example.mensagem.Mensagem;
import org.example.mensagem.mensagemArquivo;
import org.example.mensagem.mensagemTexto;
import org.example.usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", "123456789", "999999999");
        Mensagem mensagem = new Mensagem(usuario, "10/10/2020", "Maria");
        mensagemArquivo mensagemArquivo = new mensagemArquivo("arquivo.txt", usuario, "10/10/2020", "Maria");
        mensagemTexto mensagemTexto = new mensagemTexto("Olá, tudo bem?", usuario, "10/10/2020", "Maria");

        System.out.println(mensagem.getUsuario().getNome()); // Testa a classe Mensagem com relação a classe Usuario
        System.out.println(mensagemArquivo.getUsuario().getNome()); // Testa a classe MensagemArquivo com relação a classe Mensagem(heranca) e Usuario
        System.out.println(mensagemTexto.getUsuario().getNome()); // Testa a classe MensagemTexto com relação a classe Mensagem(heranca) e Usuario

    }

}