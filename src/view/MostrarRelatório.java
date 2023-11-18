package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MostrarRelatório extends JPanel {
	
	public MostrarRelatório() {
		JLabel texto = new JLabel();
		texto.setText("Coloque aqui os relatórios de venda");
		texto.setFont(new Font("arial", Font.BOLD,20));
		this.setBackground(new Color(201,218,248));
		add(texto);
	}
}
