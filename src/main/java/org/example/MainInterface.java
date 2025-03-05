package org.example;

import javax.swing.*;
import java.awt.*;


public class MainInterface {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Escoge tus asignaturas favoritas");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.setLayout(new BorderLayout());

            // Panel principal con márgenes
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());
            mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

            // Título H1
            JLabel titleLabel = new JLabel("Asignaturas Favoritas", SwingConstants.CENTER);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
            mainPanel.add(titleLabel, BorderLayout.NORTH);

            // Panel de checkboxes
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(6, 1, 10, 10));

            JCheckBox cbPMDM = new JCheckBox("PMDM");
            JCheckBox cbPSPR = new JCheckBox("PSPR");
            JCheckBox cbDESIN = new JCheckBox("DESIN");
            JCheckBox cbADT = new JCheckBox("ADT");
            JCheckBox cbEIE = new JCheckBox("EIE");
            JCheckBox cbSGEM = new JCheckBox("SGEM");

            panel.add(cbPMDM);
            panel.add(cbPSPR);
            panel.add(cbDESIN);
            panel.add(cbADT);
            panel.add(cbEIE);
            panel.add(cbSGEM);

            // Panel de botones
            JPanel buttonPanel = new JPanel();
            JButton button = new JButton("Escoger");
            button.addActionListener(e -> {
                StringBuilder seleccionadas = new StringBuilder("Has escogido: ");
                if (cbPMDM.isSelected()) seleccionadas.append("PMDM ");
                if (cbPSPR.isSelected()) seleccionadas.append("PSPR ");
                if (cbDESIN.isSelected()) seleccionadas.append("DESIN ");
                if (cbADT.isSelected()) seleccionadas.append("ADT ");
                if (cbEIE.isSelected()) seleccionadas.append("EIE ");
                if (cbSGEM.isSelected()) seleccionadas.append("SGEM ");

                JOptionPane.showMessageDialog(frame, seleccionadas.toString());
            });
            buttonPanel.add(button);

            mainPanel.add(panel, BorderLayout.CENTER);
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }
}
