
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Client {
	private JTextField nome;
	private JTextField email;
	private JTextField cpf;
	private JTextField idade;
	private JTextArea resultado;
	
	public Client (
				JTextField txtnome,
				JTextField txtemail,
				JTextField txtcpf,
				JTextField txtidade,
				JTextArea areResultado
			) {
		this.nome = txtnome;
		this.email = txtemail;
		this.cpf = txtcpf;
		this.idade = txtidade;
		this.resultado = areResultado;
	}
	public ActionListener Client() {
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String txtnome = nome.getText();
				String txtemail = email.getText();
				String txtcpf = cpf.getText();
				String txtidade = idade.getText();
				
				
				
				resultado.append("Nome: " + txtnome + '\n');
				resultado.append("Email: " + txtemail + '\n');
				resultado.append("Cpf: " + txtcpf + '\n');
				resultado.append("Idade: " + txtidade);
				
			}
			
		};
	}
	
	
	
	
	
	
	
	
	
	
	public JTextField getNome() {
		return nome;
	}
	public void setNome(JTextField nome) {
		this.nome = nome;
	}
	public JTextField getIdade() {
		return idade;
	}
	public void setIdade(JTextField idade) {
		this.idade = idade;
	}
	public JTextField getCpf() {
		return cpf;
	}
	public void setCpf(JTextField cpf) {
		this.cpf = cpf;
	}
	public JTextField getEmail() {
		return email;
	}
	public void setEmail(JTextField email) {
		this.email = email;
	}











	
}
