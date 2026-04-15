
import javax.swing.*;



public class Main extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4648172894076113183L;
	JLabel lblTitulo, lblnome, lblemail, lblcpf, lblidade;
	JTextField txtnome, txtemail, txtcpf, txtidade;
	JTextArea areResultado;
	JButton btnconfirmar;
	
	
	
	public Main() {
		setTitle("Cadastro");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		lblTitulo = new JLabel ("Cadastro");
		lblTitulo.setBounds (250, 10, 200, 30);
		add(lblTitulo);
		
		lblnome = new JLabel ("Nome: ");
		lblnome.setBounds(150, 50, 200, 25);
		add(lblnome);
		
		txtnome = new JTextField ();
		txtnome.setBounds(300, 50, 200, 25);
		add(txtnome);
		
		lblemail = new JLabel ("Email: ");
		lblemail.setBounds(150, 90, 200, 25);
		add(lblemail);
		
		txtemail = new JTextField ();
		txtemail.setBounds(300, 90, 200, 25);
		add(txtemail);
		
		lblcpf = new JLabel ("Cpf: ");
		lblcpf.setBounds(150, 130, 200, 25);
		add(lblcpf);
		
		txtcpf = new JTextField ();
		txtcpf.setBounds(300, 130, 200, 25);
		add(txtcpf);
		
		lblidade = new JLabel ("Idade: ");
		lblidade.setBounds(150, 170, 200, 25);
		add(lblidade);
		
		txtidade = new JTextField ();
		txtidade.setBounds(300, 170, 200, 25);
		add(txtidade);

		areResultado = new JTextArea ();
		areResultado.setWrapStyleWord(true);
		areResultado.setBounds(300, 200, 200, 100);
		add(areResultado);
		
		btnconfirmar = new JButton ("Confirmar");
		btnconfirmar.setBounds(200, 320, 200, 30);
		add(btnconfirmar);
		
		
		Client cadastro = new Client(
		         txtnome,
		         txtemail,
		         txtcpf,
		         txtidade,
		         areResultado
		 );

		btnconfirmar.addActionListener(cadastro.Client());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Main Tela = new Main();
		Tela.setVisible (true);
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */

	
}