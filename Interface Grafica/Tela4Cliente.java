package AtividadeVendas_Telas;

import java.awt.*;
import javax.swing.*;

public class Tela4Cliente extends JFrame{

	JLabel lblCod = new JLabel("Código");      JTextField txtCod = new JTextField(10);
	JLabel lblNome = new JLabel("Nome");       JTextField txtNome = new JTextField(60);
	JLabel lblDress = new JLabel("Endereço");  JTextField txtDress = new JTextField(60);
	JLabel lblBairro = new JLabel("Bairro");   JTextField txtBairro = new JTextField(20);
	JLabel lblCEP = new JLabel("CEP");         JTextField txtCEP = new JTextField(20);
	JLabel lblCity = new JLabel("Cidade");     JTextField txtCity = new JTextField(20);
	JLabel lblTel = new JLabel("Telefone");    JTextField txtTel = new JTextField(20);
	JLabel lblEstado = new JLabel("Estado");
	String [] estados = {"..." , "SP" , "MG" , "ES" , "RJ"};
	JComboBox cboEstado = new JComboBox(estados);
	JLabel lblObs = new JLabel("Observações"); JTextArea tareaObs = new JTextArea("teste");
	JButton btnNew = new JButton("Novo");
	JButton btnSet = new JButton("Alterar");
	JButton btnDelete = new JButton("Excluir");
	JButton btnSave = new JButton("SALVAR");
	JButton btnRel = new JButton("Relatório");
	JButton btnRet = new JButton("Retorne");
	
	public Tela4Cliente() {
		setLayout(new FlowLayout());
		Container c = getContentPane();
		setLayout(new GridLayout(6,4));
		
		c.add(lblCod);      c.add(txtCod);
		c.add(lblNome);     c.add(txtNome);
		c.add(lblDress);	c.add(txtDress);
		c.add(lblBairro);   c.add(txtBairro);
		c.add(lblCity);     c.add(txtCity);
		c.add(lblEstado);   c.add(cboEstado);
		c.add(lblCEP);      c.add(txtCEP);
		c.add(lblTel);     c.add(txtTel);
		c.add(lblObs);      c.add(tareaObs);
		c.add(btnNew);
		c.add(btnSet);
		c.add(btnDelete);
		c.add(btnSave);
		c.add(btnRel);
		c.add(btnRet);
		
		setVisible(true);
		pack();
	}
}
