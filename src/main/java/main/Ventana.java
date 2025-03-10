package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    public Ventana() {
        setTitle("Interfaz Swing");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel lblBienvenido = new JLabel("Bienvenido", SwingConstants.CENTER);
        add(lblBienvenido, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel();
        JButton btnHola = new JButton("Hola");
        JButton btnAdios = new JButton("Adiós");

        panelBotones.add(btnHola);
        panelBotones.add(btnAdios);
        add(panelBotones, BorderLayout.CENTER);

        btnHola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola");
            }
        });

        btnAdios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Adiós");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }
}