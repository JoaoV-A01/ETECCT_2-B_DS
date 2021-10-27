package AtividadeVendas_Telas;

import java.awt.*;
import javax.swing.*;

public class Tela3Produto extends JFrame{
	
	public Tela3Produto() {
		setTitle("Cadastro do Produto");
		setVisible(true);
		pack();
		criarForm();
	}
	public void criarForm() {
		setLayout(new BorderLayout());
		
		JPanel pTitulo = new JPanel();
		JLabel titulo = new JLabel("Dados Cadastro");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 16));
		pTitulo.add(titulo);
		
		JPanel pCadastro = new JPanel();
		JLabel lblDesc = new JLabel("Descrição:");  		lblDesc.setBounds(10,30,70,20);	   
		JTextField txtDesc = new JTextField(10);			txtDesc.setBounds(110,30,150,20);
		
		JLabel lblEspe = new JLabel("Espécie:");			lblEspe.setBounds(10,60,70,20);
		String [] especies = {"..." , "cavalo marinho"};
		JComboBox cboEspe = new JComboBox(especies);		cboEspe.setBounds(110,60,100,20);
		
		JLabel lblUEntr = new JLabel("Unidade Entrada:");	lblUEntr.setBounds(10,90,100,20);
		String [] uentrs = {"..." , "sim"};
		JComboBox cboUEntr = new JComboBox(uentrs);			cboUEntr.setBounds(110,90,100,20);
		
		JLabel lblSubdiv = new JLabel("Subdivisível?:");	lblSubdiv.setBounds(10,120,90,20);
		String [] subdivs = {"..." , "sim"};
		JComboBox cboSubdiv = new JComboBox(subdivs);		cboSubdiv.setBounds(110,120,100,20);
		
		JLabel lblUExit = new JLabel("Unidade Saída:");		lblUExit.setBounds(10,150,100,20);
		String [] uexits = {"..." , "sim"};
		JComboBox cboUExit = new JComboBox(uexits); 		cboUExit.setBounds(110,150,100,20);
		
		JLabel lblQSubdiv = new JLabel("Qt. Subdivisão:");  lblQSubdiv.setBounds(10,180,100,20);
		JTextField txtQSubdiv = new JTextField(10);			txtQSubdiv.setBounds(110,180,120,20);
		
		add(lblDesc);    add(txtDesc);
		add(lblEspe);    add(cboEspe);
		add(lblUEntr);   add(cboUEntr);
		add(lblSubdiv);  add(cboSubdiv);
		add(lblUExit);   add(cboUExit);
		add(lblQSubdiv); add(txtQSubdiv);
		
		add(pTitulo, BorderLayout.NORTH);
		add(pCadastro, BorderLayout.CENTER);
	}
}
