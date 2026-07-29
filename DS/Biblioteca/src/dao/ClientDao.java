package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import util.Conexao;

public class ClientDao {

    public void salvar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "INSERT INTO Livro (titulo, autor, genero, idioma, quantidade, preco) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.gettitulo());
            stmt.setString(2, cliente.getautor());
            stmt.setString(3, cliente.getgenero());
            stmt.setString(4, cliente.getidioma());
            stmt.setString(5, cliente.getquantidade());
            stmt.setString(6, cliente.getpreco());

            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar livro: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void atualizar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE Livro SET titulo = ?, autor = ?, genero = ?, idioma = ?, quantidade = ?, preco = ?  WHERE id = ?";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.gettitulo());
            stmt.setString(2, cliente.getautor());
            stmt.setString(3, cliente.getgenero());
            stmt.setString(4, cliente.getidioma());
            stmt.setString(5, cliente.getquantidade());
            stmt.setString(6, cliente.getpreco());
            stmt.setInt(7, cliente.getid());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar livro: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void excluir(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM Livro WHERE id = ?";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir livro: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<Cliente>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Livro ORDER BY id DESC";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setid(rs.getInt("id"));
                cliente.settitulo(rs.getString("titulo"));
                cliente.setautor(rs.getString("autor"));
                cliente.setgenero(rs.getString("genero"));
                cliente.setidioma(rs.getString("idioma"));
                cliente.setquantidade(rs.getString("quantidade"));
                cliente.setpreco(rs.getString("preco"));
                lista.add(cliente);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar Livros: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return lista;
    }
}
