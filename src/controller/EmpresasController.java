package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.EmpresasModel;
import util.Conexao;

public class EmpresasController {

    public boolean inserir(EmpresasModel empresa) {

        String sql = "INSERT INTO empresas (nome,cnpj,fax,endereco,uf) VALUES (?,?,?,?,?);";
        boolean retorno = false;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, empresa.getNomeEmpresa());
            sentenca.setString(2, empresa.getCnpj());
            sentenca.setString(3, empresa.getFax());
            sentenca.setString(4, empresa.getEndereco());
            sentenca.setString(5, empresa.getUf());

            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados no SQL.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return retorno;

    }

    public boolean editar(EmpresasModel empresa) {
        String sql = "UPDATE empresas SET nome = ?, cnpj = ?, fax = ? , endereco = ?  , uf = ?   WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, empresa.getNomeEmpresa());
            sentenca.setString(2, empresa.getCnpj());
            sentenca.setString(3, empresa.getFax());
            sentenca.setString(4, empresa.getEndereco());
            sentenca.setString(5, empresa.getUf());
            sentenca.setInt(6, empresa.getId());

            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de edição.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return retorno;
    }

    public boolean excluir(EmpresasModel empresa) {
        String sql = "DELETE FROM empresas WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, empresa.getId());
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de exclusão.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return retorno;
    }
    
    

    public ArrayList<EmpresasModel> selecionarTodos() {
        ArrayList<EmpresasModel> empresa = new ArrayList<>();
        String sql = "SELECT * FROM empresas";
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                EmpresasModel modelo = new EmpresasModel();
                modelo.setId(resultado.getInt("id"));
                modelo.setNomeEmpresa(resultado.getString("nome"));
                modelo.setCnpj(resultado.getString("cnpj"));
                modelo.setEndereco(resultado.getString("endereco"));
                modelo.setFax(resultado.getString("fax"));
                modelo.setUf(resultado.getString("uf"));
                empresa.add(modelo);
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção.\n" + e.getMessage());
        }

        Conexao.desconectar();
        return empresa;
    }

    
    public EmpresasModel selecionarID(EmpresasModel empresa) {
        String sql = "SELECT * FROM empresas where ID = ?;";
        EmpresasModel idencontrado = null;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, empresa.getId());
            ResultSet resultado = sentenca.executeQuery();

            if (resultado.next()) {
                idencontrado = new EmpresasModel();
                sentenca.setString(1, empresa.getNomeEmpresa());
                sentenca.setString(2, empresa.getCnpj());
                sentenca.setString(3, empresa.getFax());
                sentenca.setString(4, empresa.getEndereco());
                sentenca.setString(5, empresa.getUf());
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return idencontrado;
    }

    
    
    public List<EmpresasModel> selecionarNome(EmpresasModel empresa) {
        String sql = "select * from empresas where nome like ?;";
        List<EmpresasModel> nomesEncontrado = new ArrayList<>();
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, "%" + empresa.getNomeEmpresa()+ "%"); // adicionando % no início e fim do nome para pesquisar substrings
            ResultSet resultado = sentenca.executeQuery();

            while (resultado.next()) {
                EmpresasModel nomeEncontrado = new EmpresasModel();
                nomeEncontrado.setId(resultado.getInt("id"));
                nomeEncontrado.setNomeEmpresa(resultado.getString("nome"));
                nomeEncontrado.setCnpj(resultado.getString("cnpj"));
                nomeEncontrado.setFax(resultado.getString("fax"));
                nomeEncontrado.setEndereco(resultado.getString("endereco"));
                nomeEncontrado.setUf(resultado.getString("uf"));
                nomesEncontrado.add(nomeEncontrado);
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return nomesEncontrado;
    }

    public List<EmpresasModel> selecionarUF(EmpresasModel empresa) {
        String sql = "select * from empresas where uf like ?;";
        List<EmpresasModel> UFEncontrado = new ArrayList<>();
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, "%" + empresa.getUf()+ "%"); // adicionando % no início e fim do nome para pesquisar substrings
            ResultSet resultado = sentenca.executeQuery();
            
            while (resultado.next()) {
                EmpresasModel nomeEncontrado = new EmpresasModel();
                nomeEncontrado.setId(resultado.getInt("id"));
                nomeEncontrado.setNomeEmpresa(resultado.getString("nome"));
                nomeEncontrado.setCnpj(resultado.getString("cnpj"));
                nomeEncontrado.setFax(resultado.getString("fax"));
                nomeEncontrado.setEndereco(resultado.getString("endereco"));
                nomeEncontrado.setUf(resultado.getString("uf"));
                UFEncontrado.add(nomeEncontrado);
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return UFEncontrado;
    }

    public EmpresasModel selecionarCNPJ(EmpresasModel empresa) {
        String sql = "SELECT * FROM empresas where cnpj = ?;";
        EmpresasModel idencontrado = null;
        Conexao.conectar();

        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, empresa.getCnpj());
            ResultSet resultado = sentenca.executeQuery();

            if (resultado.next()) {
                idencontrado = new EmpresasModel();
                 while (resultado.next()) {
                EmpresasModel nomeEncontrado = new EmpresasModel();
                nomeEncontrado.setId(resultado.getInt("id"));
                nomeEncontrado.setNomeEmpresa(resultado.getString("nome"));
                nomeEncontrado.setCnpj(resultado.getString("cnpj"));
                nomeEncontrado.setFax(resultado.getString("fax"));
                nomeEncontrado.setEndereco(resultado.getString("endereco"));
                nomeEncontrado.setUf(resultado.getString("uf"));
               
            }
            }

        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL de seleção: " + e.getMessage());
        }

        Conexao.desconectar();
        return idencontrado;
    }

}
