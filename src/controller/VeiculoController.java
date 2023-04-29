package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.VeiculoModel;
import util.Conexao;

/*
 * @author Talles
 */
public class VeiculoController {

    public boolean inserir(VeiculoModel veiculo) {
        String sql = "INSERT INTO veiculos (placa,marca,modelo,ano,status) VALUES (?,?,?,?,?);";
        boolean retorno = false;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, veiculo.getPlaca());
            sentenca.setString(2, veiculo.getMarca());
            sentenca.setString(3, veiculo.getModelo());
            sentenca.setString(4, veiculo.getAno());
            sentenca.setString(5, "DISPONIVEL");
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de inserção.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return retorno;
    }

    public VeiculoModel selecionar(VeiculoModel veiculo) {
        String sql = "SELECT * FROM veiculos WHERE id = ?;";
        VeiculoModel modeloEncontrado = null;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, veiculo.getId());
            ResultSet resultado = sentenca.executeQuery();

            if (resultado.next()) {
                modeloEncontrado = new VeiculoModel();
                modeloEncontrado.setId(resultado.getInt("id"));
                modeloEncontrado.setPlaca(resultado.getString("placa"));
                modeloEncontrado.setMarca(resultado.getString("marca"));
                modeloEncontrado.setModelo(resultado.getString("modelo"));
                modeloEncontrado.setAno(resultado.getString("ano"));
                modeloEncontrado.setStatus(resultado.getString("status"));
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return modeloEncontrado;
    }

    public boolean editar(VeiculoModel veiculo) {
        String sql = "UPDATE veiculos SET placa = ?, marca = ?, modelo = ?, ano = ? WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, veiculo.getPlaca());
            sentenca.setString(2, veiculo.getMarca());
            sentenca.setString(3, veiculo.getModelo());
            sentenca.setString(4, veiculo.getAno());
            sentenca.setInt(5, veiculo.getId());
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de edição.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return retorno;
    }

    public boolean excluir(VeiculoModel veiculo) {
        String sql = "DELETE FROM veiculos WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, veiculo.getId());
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de exclusão.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return retorno;
    }

    public ArrayList<VeiculoModel> selecionarTodos() {
        ArrayList<VeiculoModel> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM veiculos";
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                VeiculoModel modelo = new VeiculoModel();
                modelo.setId(resultado.getInt("id"));
                modelo.setPlaca(resultado.getString("placa"));
                modelo.setMarca(resultado.getString("marca"));
                modelo.setModelo(resultado.getString("modelo"));
                modelo.setAno(resultado.getString("ano"));
                modelo.setStatus(resultado.getString("status"));
                veiculos.add(modelo);
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return veiculos;
    }

    public VeiculoModel selecionarID(VeiculoModel veiculo) {
        String sql = "SELECT * FROM veiculos where ID = ?;";
        VeiculoModel idencontrado = null;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, veiculo.getId());
            ResultSet resultado = sentenca.executeQuery();

            if (resultado.next()) {
                idencontrado = new VeiculoModel();
                idencontrado.setId(resultado.getInt("id"));
                idencontrado.setPlaca(resultado.getString("placa"));
                idencontrado.setMarca(resultado.getString("marca"));
                idencontrado.setModelo(resultado.getString("modelo"));
                idencontrado.setAno(resultado.getString("ano"));
                idencontrado.setStatus(resultado.getString("status"));
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return idencontrado;
    }

      public List<VeiculoModel> selecionarPlaca(VeiculoModel veiculos) {
        String sql = "select * from veiculos where placa like ?;";
        List<VeiculoModel> veiculos_encontrados = new ArrayList<>();
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, "%" + veiculos.getPlaca()+ "%"); // adicionando % no início e fim do nome para pesquisar substrings
            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                VeiculoModel veiculoEncontrados = new VeiculoModel();
                veiculoEncontrados.setId(resultado.getInt("id"));
                veiculoEncontrados.setPlaca(resultado.getString("placa"));
                veiculoEncontrados.setMarca(resultado.getString("marca"));
                veiculoEncontrados.setModelo(resultado.getString("modelo"));
                veiculoEncontrados.setAno(resultado.getString("ano"));
                veiculoEncontrados.setStatus(resultado.getString("status"));
                veiculos_encontrados.add(veiculoEncontrados);
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return veiculos_encontrados;
    }

    public List<VeiculoModel> selecionarMarca(VeiculoModel veiculos) {
        String sql = "select * from veiculos where marca like ?;";
        List<VeiculoModel> veiculos_encontrados = new ArrayList<>();
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, "%" + veiculos.getMarca() + "%"); // adicionando % no início e fim do nome para pesquisar substrings
            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                VeiculoModel veiculoEncontrados = new VeiculoModel();
                veiculoEncontrados.setId(resultado.getInt("id"));
                veiculoEncontrados.setPlaca(resultado.getString("placa"));
                veiculoEncontrados.setMarca(resultado.getString("marca"));
                veiculoEncontrados.setModelo(resultado.getString("modelo"));
                veiculoEncontrados.setAno(resultado.getString("ano"));
                veiculoEncontrados.setStatus(resultado.getString("status"));
                veiculos_encontrados.add(veiculoEncontrados);
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return veiculos_encontrados;
    }

    public List<VeiculoModel> selecionarModelo(VeiculoModel veiculos) {
        String sql = "select * from veiculos where modelo like ?;";
        List<VeiculoModel> veiculos_encontrados = new ArrayList<>();
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, "%" + veiculos.getModelo()+ "%"); // adicionando % no início e fim do nome para pesquisar substrings
            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                VeiculoModel veiculoEncontrados = new VeiculoModel();
                veiculoEncontrados.setId(resultado.getInt("id"));
                veiculoEncontrados.setPlaca(resultado.getString("placa"));
                veiculoEncontrados.setMarca(resultado.getString("marca"));
                veiculoEncontrados.setModelo(resultado.getString("modelo"));
                veiculoEncontrados.setAno(resultado.getString("ano"));
                veiculoEncontrados.setStatus(resultado.getString("status"));
                veiculos_encontrados.add(veiculoEncontrados);
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return veiculos_encontrados;
    }

    public VeiculoModel selecionarAno(VeiculoModel veiculo) {
        String sql = "SELECT * FROM veiculos where ano = ?;";
        VeiculoModel veiculoEncontrados = null;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, veiculo.getAno());
            ResultSet resultado = sentenca.executeQuery();

            if (resultado.next()) {
                veiculoEncontrados = new VeiculoModel();
                veiculoEncontrados.setId(resultado.getInt("id"));
                veiculoEncontrados.setPlaca(resultado.getString("placa"));
                veiculoEncontrados.setMarca(resultado.getString("marca"));
                veiculoEncontrados.setModelo(resultado.getString("modelo"));
                veiculoEncontrados.setAno(resultado.getString("ano"));
                veiculoEncontrados.setStatus(resultado.getString("status"));
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return veiculoEncontrados;
    }
        
     public List<VeiculoModel> selecionarStatus(VeiculoModel veiculos) {
        String sql = "select * from veiculos where Status like ?;";
        List<VeiculoModel> veiculos_encontrados = new ArrayList<>();
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, "%" + veiculos.getStatus()+ "%"); // adicionando % no início e fim do nome para pesquisar substrings
            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                VeiculoModel veiculoEncontrados = new VeiculoModel();
                veiculoEncontrados.setId(resultado.getInt("id"));
                veiculoEncontrados.setPlaca(resultado.getString("placa"));
                veiculoEncontrados.setMarca(resultado.getString("marca"));
                veiculoEncontrados.setModelo(resultado.getString("modelo"));
                veiculoEncontrados.setAno(resultado.getString("ano"));
                veiculoEncontrados.setStatus(resultado.getString("status"));
                veiculos_encontrados.add(veiculoEncontrados);
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return veiculos_encontrados;
    }

}
