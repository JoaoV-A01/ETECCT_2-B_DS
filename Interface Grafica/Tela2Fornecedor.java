package AtividadeVendas_Telas;

import java.awt.*;
import javax.swing.*;

public class Tela2Fornecedor extends JFrame{
	
	JLabel lblCod = new JLabel("Código");         JTextField txtCod = new JTextField(10);
	JLabel lblP = new JLabel("PJ/PF");
	String [] pps = {"..." , "PF" , "PJ"};
	JComboBox cboP = new JComboBox(pps);
	JLabel lblNome = new JLabel("Razão S./Nome"); JTextField txtNome = new JTextField(20);
	JLabel lblCPF = new JLabel("CNPJ/CPF");       JTextField txtCPF = new JTextField(20);
	JLabel lblRG = new JLabel("Ins. Est./RG");    JTextField txtRG = new JTextField(20);
	JLabel lblTel1 = new JLabel("Telefone 1");    JTextField txtTel1 = new JTextField(20);
	JLabel lblTel2 = new JLabel("Telefone 2");    JTextField txtTel2 = new JTextField(20);
	JLabel lblEmail = new JLabel("E-mail");       JTextField txtEmail = new JTextField(20);
	JLabel lblObs = new JLabel("Observações");    JTextArea tareaObs = new JTextArea("teste");
	JLabel lblProfs = new JLabel("Profissão");    JTextField txtProfs = new JTextField(20);
	JLabel lblCEP = new JLabel("CEP");            JTextField txtCEP = new JTextField(10);
	JLabel lblEstado = new JLabel("Estado");
	String [] estados = {"Selecione o Estado" , "SP" , "MG" , "ES" , "RJ"};
	JComboBox cboEst = new JComboBox(estados);
	JButton btnBusCEP = new JButton("BUSCAR CEP");
	JLabel lblCity = new JLabel("Cidade");        JTextField txtCity = new JTextField(20);
	JLabel lblRua = new JLabel("Rua");            JTextField txtRua = new JTextField(20);
	JLabel lblNeCompl = new JLabel("Nº e Complemento"); JTextField txtNeCompl = new JTextField(20);
	JLabel lblBairro = new JLabel("Bairro");      JTextField txtBairro = new JTextField(20);
	JLabel lblSitInsta = new JLabel("Site");      JTextField txtSitInsta = new JTextField(20);
	JButton btnSave = new JButton("SALVAR");
	JButton btnSair = new JButton("SAIR");
	
	public Tela2Fornecedor() {
		setLayout(new FlowLayout());
		
		Container c = getContentPane();
		setLayout(new GridLayout(10,4));
		setTitle("Cadastro Fornecedor");
		
		c.add(lblCod);      c.add(txtCod);
		c.add(lblP);		c.add(cboP);
		c.add(lblNome);     c.add(txtNome);
		c.add(lblCPF);      c.add(txtCPF);
		c.add(lblRG);       c.add(txtRG);
		c.add(lblTel1);     c.add(txtTel1);
		c.add(lblTel2);     c.add(txtTel2);
		c.add(lblEmail);    c.add(txtEmail);
		c.add(lblProfs);    c.add(txtProfs);
		c.add(lblCEP);      c.add(txtCEP);
		c.add(lblEstado);	c.add(cboEst);
		c.add(lblCity);     c.add(txtCity);
		c.add(lblRua);      c.add(txtRua);
		c.add(lblNeCompl);  c.add(txtNeCompl);
		c.add(lblBairro);   c.add(txtBairro);
		c.add(lblSitInsta); c.add(txtSitInsta);
		c.add(lblObs);      c.add(tareaObs);
		c.add(btnBusCEP);
		c.add(btnSave);
		c.add(btnSair);
		
		setVisible(true);
		pack();
	}
			
}
