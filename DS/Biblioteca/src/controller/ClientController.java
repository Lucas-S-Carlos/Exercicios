package controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.ClientDao;
import model.Cliente;
import view.Tela;

public class ClientController {
	private Tela tela;
	private ClientDao clientDao;
	
	public ClientController(Tela tela) {
        this.tela = tela;
        this.clientDao = new ClientDao();
	}
	
	public void salvar() {
        String titulo = tela.getTxttitulo().getText().trim();
        String autor = tela.getTxtautor().getText().trim();
        String genero = tela.getTxtgenero().getText().trim();
        String idioma = tela.getTxtidioma().getText().trim();
        String quantidade = tela.getTxtquantidade().getText().trim();
        String preco = tela.getTxtpreco().getText().trim();



        if (titulo.isEmpty() || autor.isEmpty() || genero.isEmpty() || idioma.isEmpty() || quantidade.isEmpty() || preco.isEmpty()) {
            JOptionPane.showMessageDialog(
                tela,
                "Preencha os campos corretamente.",
                "Atenção",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        try {
            String idTexto = tela.getTxtid().getText().trim();

            if (idTexto.isEmpty()) {
                Cliente cliente = new Cliente(titulo, autor, genero, idioma, quantidade, preco);
                clientDao.salvar(cliente);
                JOptionPane.showMessageDialog(tela, "Cliente salvo com sucesso.");
            } else {
                Cliente cliente = new Cliente(Integer.parseInt(idTexto), titulo, autor, genero, idioma, quantidade, preco);
                clientDao.atualizar(cliente);
                JOptionPane.showMessageDialog(tela, "Cliente atualizado com sucesso.");
            }

            limpar();
            carregarTabela();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                tela,
                "Erro ao salvar: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }	
	}
    public void excluir() {
        int linha = tela.getTabelaClientes().getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(
                tela,
                "Selecione um cliente na tabela para excluir.",
                "Atenção",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        int confirmacao = JOptionPane.showConfirmDialog(
            tela,
            "Deseja realmente excluir o cliente selecionado?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            int id = Integer.parseInt(tela.getTxtid().getText());
            clientDao.excluir(id);
            JOptionPane.showMessageDialog(tela, "Cliente excluído com sucesso.");
            limpar();
            carregarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                tela,
                "Erro ao excluir: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void limpar() {
        tela.getTxtid().setText("");
        tela.getTxttitulo().setText("");
        tela.getTxtautor().setText("");
        tela.getTxtgenero().setText("");
        tela.getTxtidioma().setText("");
        tela.getTxtquantidade().setText("");
        tela.getTxtpreco().setText("");

        
        
        tela.getTxttitulo().requestFocus();
        tela.getTabelaClientes().clearSelection();
    }

    public void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tela.getTabelaClientes().getModel();
        modelo.setRowCount(0);

        try {
            List<Cliente> clientes = clientDao.listar();

            int i;
            for (i = 0; i < clientes.size(); i++) {
                Cliente c = clientes.get(i);
                modelo.addRow(new Object[] {
                    c.getid(),
                    c.gettitulo(),
                    c.getautor(),
                    c.getgenero(),
                    c.getidioma(),
                    c.getquantidade(),
                    c.getpreco(),
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                tela,
                "Erro ao carregar tabela: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void preencherFormulario() {
        int linha = tela.getTabelaClientes().getSelectedRow();

        if (linha != -1) {
            tela.getTxtid().setText(tela.getTabelaClientes().getValueAt(linha, 0).toString());
            tela.getTxttitulo().setText(tela.getTabelaClientes().getValueAt(linha, 1).toString());
            tela.getTxtautor().setText(tela.getTabelaClientes().getValueAt(linha, 2).toString());
            tela.getTxtgenero().setText(tela.getTabelaClientes().getValueAt(linha, 3).toString());
            tela.getTxtidioma().setText(tela.getTabelaClientes().getValueAt(linha, 4).toString());
            tela.getTxtquantidade().setText(tela.getTabelaClientes().getValueAt(linha, 5).toString());
            tela.getTxtpreco().setText(tela.getTabelaClientes().getValueAt(linha, 6).toString());

        }
    }
}

	

