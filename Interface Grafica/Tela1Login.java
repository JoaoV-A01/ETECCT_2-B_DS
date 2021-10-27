package AtividadeVendas_Telas;

import java.awt.*;
import javax.swing.*;

public class Tela1Login extends JFrame {
	
	public Tela1Login() {
		setTitle("Logar");
		setVisible(true);
		pack();
		criarForm();
	}
	private void criarForm() {
		setLayout(new BorderLayout());
		
		JPanel pTitulo = new JPanel();
		pTitulo.setLayout(new FlowLayout());
		JLabel titulo = new JLabel("Projeto Vendas");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 16));
		pTitulo.add(titulo);
		
		JPanel pCadastro = new JPanel();
		pCadastro.setLayout(new FlowLayout());
		JLabel lblLogin = new JLabel("Login:"); JTextField txtLogin = new JTextField(20);
		JLabel lblSenha = new JLabel("Senha:"); JPasswordField pasSenha = new JPasswordField(20);
		pCadastro.add(lblLogin);	pCadastro.add(txtLogin);
		pCadastro.add(lblSenha);	pCadastro.add(pasSenha);
		
		JPanel pBtn = new JPanel();
		pBtn.setLayout(new FlowLayout());
		JButton btnOK = new JButton("OK");
		JLabel lblmissPass = new JLabel("Esqueceu a senha?");
		pBtn.add(lblmissPass);
		pBtn.add(btnOK);
		
		add(pTitulo, BorderLayout.NORTH);
		add(pCadastro, BorderLayout.CENTER);
		add(pBtn, BorderLayout.SOUTH);
	}
}
