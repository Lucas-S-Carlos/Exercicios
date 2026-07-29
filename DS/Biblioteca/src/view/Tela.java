package view;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controller.ClientController;

public class Tela extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel lblid;
	private JLabel lbltitulo;
	private JLabel lblautor;
	private JLabel lblgenero;
	private JLabel lblidioma;
	private JLabel lblquantidade;
	private JLabel lblpreco;

	
	private JTextField txtid;
	private JTextField txttitulo;
	private JTextField txtautor;
	private JTextField txtgenero;
	private JTextField txtidioma;
	private JTextField txtquantidade;
	private JTextField txtpreco;

    private JButton btnNovo;
    private JButton btnSalvar;
    private JButton btnExcluir;
    private JButton btnLimpar;
    
    private JTable tabelaLivros;
    private DefaultTableModel modeloTabela;
    
    private ClientController controller;
    
    public Tela() {
        setTitle("Registros da biblioteca");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        criarComponentes();

        controller = new ClientController(this);
        configurarEventos();
        controller.carregarTabela();
    }
    private void criarComponentes() {
        JPanel painelFormulario = new JPanel(new GridLayout(4, 2, 10, 10));
        painelFormulario.setBorder(BorderFactory.createTitledBorder("Edição de Livros"));
    
        lblid = new JLabel("ID:");
        txtid = new JTextField();
        txtid.setEditable(false);
        
        lbltitulo = new JLabel("Título:");
        txttitulo = new JTextField();
        
        lblautor = new JLabel("Autor:");
        txtautor = new JTextField();
        
        lblgenero = new JLabel("Gênero:");
        txtgenero = new JTextField();
        
        lblidioma = new JLabel("Idioma:");
        txtidioma = new JTextField();
        
        lblquantidade = new JLabel("Quantidade:");
        txtquantidade = new JTextField();
        
        lblpreco = new JLabel("Preço:");
        txtpreco = new JTextField();
                
        painelFormulario.add(lblid);
        painelFormulario.add(txtid);
        painelFormulario.add(lbltitulo);
        painelFormulario.add(txttitulo);
        painelFormulario.add(lblautor);
        painelFormulario.add(txtautor);
        painelFormulario.add(lblgenero);
        painelFormulario.add(txtgenero);
        painelFormulario.add(lblidioma);
        painelFormulario.add(txtidioma);
        painelFormulario.add(lblquantidade);
        painelFormulario.add(txtquantidade);
        painelFormulario.add(lblpreco);
        painelFormulario.add(txtpreco);


        add(painelFormulario, BorderLayout.NORTH);

        modeloTabela = new DefaultTableModel(new Object[] { "ID", "Livros", "Autor", "Gênero", "Idioma", "Quantidade", "Preço"}, 0) {
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tabelaLivros = new JTable(modeloTabela);
        JScrollPane scrollPane = new JScrollPane(tabelaLivros);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Lista de Livros"));
        add(scrollPane, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));

        btnNovo = new JButton("Novo");
        btnSalvar = new JButton("Salvar");
        btnExcluir = new JButton("Excluir");
        btnLimpar = new JButton("Limpar");

        painelBotoes.add(btnNovo);
        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnLimpar);

        add(painelBotoes, BorderLayout.SOUTH);
    }
    private void configurarEventos() {
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                controller.limpar();
            }
        });

        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                controller.salvar();
            }
        });

        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                controller.excluir();
            }
        });

        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                controller.limpar();
            }
        });

        tabelaLivros.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                controller.preencherFormulario();
            }
        });
    }

    public JTextField getTxtid() {
        return txtid;
    }

    public JTextField getTxttitulo() {
        return txttitulo;
    }

    public JTextField getTxtautor() {
        return txtautor;
    }
    
    public JTextField getTxtgenero() {
        return txtgenero;
    }
    
    public JTextField getTxtidioma() {
        return txtidioma;
    }
    
    public JTextField getTxtquantidade() {
        return txtquantidade;
    }
    
    public JTextField getTxtpreco() {
        return txtpreco;
    }
    
    public JTable getTabelaClientes() {
        return tabelaLivros;
    }
   }
    


