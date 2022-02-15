package br.com.alura.loja;

import br.com.alura.loja.mensagem.Mensagem;
import br.com.alura.loja.mensagem.MensagemFactory;


import javax.swing.*;

public class TestesMensagem {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null);

        Mensagem mensagem = MensagemFactory.getMensagem(1);
        mensagem.enviar(texto);
    }
}
