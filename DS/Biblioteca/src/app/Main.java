package app;

import javax.swing.SwingUtilities;

import view.Tela;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Tela tela = new Tela();
                tela.setVisible(true);
            }
        });
    }
}
