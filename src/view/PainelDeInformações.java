package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PainelDeInformações extends JPanel{
	
	public ListarVendas ListarVendas = new ListarVendas();
	public ListarClientes ListarClientes = new ListarClientes();
	public MostrarRelatório MostrarRelatório = new MostrarRelatório();
	public RealizarVenda RealizarVenda = new RealizarVenda();
	
	public PainelDeInformações() {
		
		this.setBackground(new Color(201,218,248));
		opções();
	}
	public void opções() {
		RealizarVenda.setPreferredSize(new Dimension(583, 520));
	    add(RealizarVenda, BorderLayout.SOUTH);
	    
		ListarVendas.setPreferredSize(new Dimension(590, 550));	
	    add(ListarVendas, BorderLayout.SOUTH);
	    
	    MostrarRelatório.setPreferredSize(new Dimension(590, 550));	
	    add(MostrarRelatório, BorderLayout.SOUTH);
	    
	    ListarClientes.setPreferredSize(new Dimension(590, 550));
	    add(ListarClientes, BorderLayout.SOUTH);
	}
	
}
