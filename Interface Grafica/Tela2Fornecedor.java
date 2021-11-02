package AtividadeVendas_Telas;

import java.awt.*;
import javax.swing.*;

public class Tela2Fornecedor extends JFrame{
	
	public Tela2Fornecedor() {
		setTitle("Cadastro Fornecedor");
		setVisible(true);
		pack();
		criarForm();
	}
	public void criarForm () {
		setLayout(new BorderLayout());
		
		JPanel pTitulo = new JPanel();
		pTitulo.setLayout(new FlowLayout());
		JLabel titulo = new JLabel("Cadastrar novo Fornecedor");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 20));
		pTitulo.add(titulo);
										//bounds x y e lar e altu
		JPanel pCadastro = new JPanel();
		JLabel lblCod = new JLabel("Código:");         	lblCod.setBounds(10,40,50,20);
		JTextField txtCod = new JTextField(5);		  	txtCod.setBounds(60,40,70,20);
		JLabel lblP = new JLabel("PJ/PF");			  	lblP.setBounds(140,40,60,20);
		String [] pps = {"..." , "Pessoa Fisica" , "Pessoa Juridica"};
		JComboBox cboxP = new JComboBox(pps);			cboxP.setBounds(190,40,120,20);
		JLabel lblRG = new JLabel("Ins. Est./RG");    	lblRG.setBounds(340,40,70,20);
		JTextField txtRG = new JTextField(20);			txtRG.setBounds(410,40,100,20);
		JLabel lblNome = new JLabel("Razão S./Nome");	lblNome.setBounds(10,70,90,20);
		JTextField txtNome = new JTextField(20);		txtNome.setBounds(100,70,210,20);
		JLabel lblCPF = new JLabel("CNPJ/CPF");			lblCPF.setBounds(340,70,70,20);
		JTextField txtCPF = new JTextField(20);			txtCPF.setBounds(410,70,100,20);
		
		JLabel lblContato = new JLabel("CONTATOS");    	lblContato.setBounds(250,100,100,20);
		Color cor = new Color(0,0,100);
		lblContato.setBackground(cor);
		
		JLabel lblProfs = new JLabel("Atividad/Profissão");    	lblProfs.setBounds(10,120,110,20);
		JTextField txtProfs = new JTextField(20);		txtProfs.setBounds(120,120,350,20);
		JLabel lblEmail = new JLabel("E-mail");       	lblEmail.setBounds(10,150,110,20);
		JTextField txtEmail = new JTextField(20);		txtEmail.setBounds(120,150,190,20);
		JLabel lblTel1 = new JLabel("Telefone 1");    	lblTel1.setBounds(340,150,70,20);
		JTextField txtTel1 = new JTextField(20);		txtTel1.setBounds(410,150,100,20);
		JLabel lblSitInsta = new JLabel("Site");      	lblSitInsta.setBounds(10,180,110,20);
		JTextField txtSitInsta = new JTextField(20);	txtSitInsta.setBounds(120,180,190,20);
		JLabel lblTel2 = new JLabel("Telefone 2");   	lblTel2.setBounds(340,180,70,20);
		JTextField txtTel2 = new JTextField(20);		txtTel2.setBounds(410,180,100,20);
		
		add(lblContato);
		add(lblCod);      add(txtCod);
		add(lblP);		  add(cboxP);
		add(lblNome);     add(txtNome);
		add(lblCPF);      add(txtCPF);
		add(lblRG);       add(txtRG);
		add(lblTel1);     add(txtTel1);
		add(lblTel2);     add(txtTel2);
		add(lblEmail);    add(txtEmail);
		add(lblProfs);    add(txtProfs);
		add(lblSitInsta); add(txtSitInsta);
		
		JPanel pDress = new JPanel();
		JLabel lblDress = new JLabel("ENDEREÇO");    	lblDress.setBounds(250,210,100,20);
		JLabel lblCity = new JLabel("Cidade");        	lblCity.setBounds(10,230,50,20);	
		JTextField txtCity = new JTextField(20);		txtCity.setBounds(60,230,160,20);
		JLabel lblCEP = new JLabel("CEP");            	lblCEP.setBounds(230,230,30,20);	
		JTextField txtCEP = new JTextField(10);			txtCEP.setBounds(260,230,80,20);
		JButton btnBusCEP = new JButton("BUSCAR CEP");  btnBusCEP.setBounds(350,230,130,20);
		JLabel lblBairro = new JLabel("Bairro");      	lblBairro.setBounds(10,260,50,20);	
		JTextField txtBairro = new JTextField(20);		txtBairro.setBounds(60,260,160,20);
		JLabel lblEstado = new JLabel("Estado");		lblEstado.setBounds(230,260,120,20);	
		String [] estados = {"Estado..." , "SP" , "MG" , "ES" , "RJ"};
		JComboBox cboxEstado = new JComboBox(estados);	cboxEstado.setBounds(350,260,130,20);
		JLabel lblRua = new JLabel("Rua");           	lblRua.setBounds(10,290,50,20);	
		JTextField txtRua = new JTextField(20);			txtRua.setBounds(60,290,160,20);
		JLabel lblNeCompl = new JLabel("Nº e Complemento"); lblNeCompl.setBounds(230,290,120,20);
		JTextField txtNeCompl = new JTextField(20);		txtNeCompl.setBounds(350,290,130,20);
		
		add(lblDress);
		add(lblCEP);      add(txtCEP);
		add(lblEstado);   add(cboxEstado);
		add(lblCity);     add(txtCity);
		add(lblRua);      add(txtRua);
		add(lblNeCompl);  add(txtNeCompl);
		add(lblBairro);   add(txtBairro);
		add(btnBusCEP);
		
		
		JPanel pBtn = new JPanel();
		JLabel lblObs = new JLabel("Observações");   	lblObs.setBounds(10,340,90,20);
		JTextArea tareaObs = new JTextArea(20, getDefaultCloseOperation()); tareaObs.setBounds(100,340,200,40);
		JButton btnSave = new JButton("SALVAR");		btnSave.setBounds(310,340,90,30);
		JButton btnSair = new JButton("SAIR");			btnSair.setBounds(410,340,90,30);
		
		add(lblObs);      add(tareaObs);
		add(btnSave);
		add(btnSair);
		
		add(pTitulo, BorderLayout.NORTH);
		add(pCadastro, BorderLayout.CENTER);
	}
			
}
