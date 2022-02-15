package br.com.alura.loja.mensagem;

import javax.swing.*;

public class MensagemEmail implements Mensagem {

    @Override
    public void enviar(String mensagem) {
        JOptionPane.showMessageDialog(null, "Email: " + mensagem);
    }
}
