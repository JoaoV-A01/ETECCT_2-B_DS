package AtividadeVendas_Telas;

import java.awt.*;
import javax.swing.*;

public class Tela4Cliente extends JFrame{
	
	public Tela4Cliente() {
		setTitle("Cadastro Cliente");
		setVisible(true);
		pack();
		criarForm();
	}
	public void criarForm() {
		setLayout(new BorderLayout());
		
		JPanel pTitulo = new JPanel();
		pTitulo.setLayout(new FlowLayout());
		JLabel titulo = new JLabel("CADASTRO DE CLIENTES");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 20));
		pTitulo.add(titulo);
		
		JPanel pCadastro = new JPanel();
		JLabel lblCod = new JLabel("Código");         	lblCod.setBounds(20,50,50,20);
		JTextField txtCod = new JTextField(5);		  	txtCod.setBounds(80,50,60,20);
		JLabel lblTel = new JLabel("Telefone");    	lblTel.setBounds(190,50,60,20);
		JTextField txtTel = new JTextField(20);			txtTel.setBounds(250,50,140,20);
		JLabel lblNome = new JLabel("Nome");			lblNome.setBounds(20,80,50,20);
		JTextField txtNome = new JTextField(20);		txtNome.setBounds(80,80,310,20);
		add(lblCod);	add(txtCod);
		add(lblNome);	add(txtNome);
		add(lblTel);	add(txtTel);
		
		JPanel pDress = new JPanel();
		JLabel lblLoc = new JLabel("LOCALIZAÇÃO");    	lblLoc.setBounds(180,110,100,20);
		JLabel lblDress = new JLabel("Endereço");    	lblDress.setBounds(20,140,70,20);
		JTextField txtDress = new JTextField(20);		txtDress.setBounds(80,140,310,20);
		JLabel lblCity = new JLabel("Cidade");        	lblCity.setBounds(20,170,50,20);	
		JTextField txtCity = new JTextField(20);		txtCity.setBounds(80,170,150,20);
		JLabel lblEstado = new JLabel("Estado");		lblEstado.setBounds(240,170,50,20);	
		String [] estados = {"Estado..." , "SP" , "MG" , "ES" , "RJ"};
		JComboBox cboxEstado = new JComboBox(estados);	cboxEstado.setBounds(290,170,100,20);
		JLabel lblBairro = new JLabel("Bairro");      	lblBairro.setBounds(20,200,50,20);	
		JTextField txtBairro = new JTextField(20);		txtBairro.setBounds(80,200,150,20);
		JLabel lblCEP = new JLabel("CEP");            	lblCEP.setBounds(240,200,30,20);	
		JTextField txtCEP = new JTextField(10);			txtCEP.setBounds(290,200,100,20);
		add(lblLoc);
		add(lblDress);  add(txtDress);
		add(lblCity);	add(txtCity);
		add(lblCEP);	add(txtCEP);
		add(lblBairro);	add(txtBairro);
		add(lblEstado);	add(cboxEstado);
		
		JLabel lblObs = new JLabel("Obs");   	lblObs.setBounds(20,230,90,20);
		JTextArea tareaObs = new JTextArea(20, getDefaultCloseOperation()); tareaObs.setBounds(80,230,210,70);
		JButton btnReturn = new JButton("Retorne");		btnReturn.setBounds(300,230,85,30);
		JButton btnRelat = new JButton("Relatório");	btnRelat.setBounds(300,270,85,30);
		add(lblObs);	add(tareaObs);
		add(btnRelat);
		add(btnReturn);
		
		JPanel pBtn = new JPanel();
		JLabel lblBtns = new JLabel("COMANDOS");    		lblBtns.setBounds(190,320,100,20);
		JButton btnNew = new JButton("Novo");			btnNew.setBounds(20,350,80,30);
		JButton btnSet = new JButton("Alterar");		btnSet.setBounds(115,350,80,30);
		JButton btnDelete = new JButton("Excluir");		btnDelete.setBounds(210,350,80,30);
		JButton btnSave = new JButton("Salvar");		btnSave.setBounds(305,350,80,30);

		add(lblBtns);
		add(btnNew);
		add(btnSet);
		add(btnDelete);
		add(btnSave);
		
		
		add(pTitulo, BorderLayout.NORTH);
		add(pCadastro, BorderLayout.CENTER);
		add(pBtn, BorderLayout.SOUTH);
		
	}
}
