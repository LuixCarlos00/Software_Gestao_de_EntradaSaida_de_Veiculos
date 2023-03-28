package controller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FuncionarioModel;
import model.VeiculoModel;
import util.Conexao;

public class FuncionarioController {
    
    
    public static boolean inserir (FuncionarioModel funcionario ){
       
        String sql = "INSERT INTO funcionarios(nome,cpf,data_nascimento,setor) VALUES (?,?,?,?);";
        boolean retorno = false;
        Conexao.conectar();   
        
        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, funcionario.getNome());
            sentenca.setString(2, funcionario.getCPF());
            sentenca.setString(3, funcionario.getData_nascimento());
            sentenca.setString(4, funcionario.getSetor());
            
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro ao inserir dados no SQL.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
        
    }
    
    public static boolean editar(FuncionarioModel funcionario ) {
        String sql = "UPDATE funcionarios SET nome = ?, cpf = ?, data_nascimento = ? , setor = ?  WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();
        
         try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setString(1, funcionario.getNome());
            sentenca.setString(2, funcionario.getCPF());
            sentenca.setString(3, funcionario.getData_nascimento());
            sentenca.setString(4, funcionario.getSetor());
            sentenca.setInt(5, funcionario.getId());
           
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de edição.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
    }
    
    public static FuncionarioModel selecionar(FuncionarioModel funcionario){
        String sql = "SELECT * FROM funcionarios where ID = ?;";
        FuncionarioModel idencontrado = null;
        Conexao.conectar();
        
        try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, funcionario.getId());
            ResultSet resultado = sentenca.executeQuery();
            
            if(resultado.next()) {
                idencontrado = new FuncionarioModel();
                idencontrado.setId(resultado.getInt("id"));
                idencontrado.setNome(resultado.getString("nome"));
                idencontrado.setCPF(resultado.getString("cpf"));
                idencontrado.setData_nascimento(resultado.getString("data_nascimento"));
                idencontrado.setSetor(resultado.getString("setor"));
            }
            
        }
        
        catch(SQLException e){
            System.out.println("Erro na sentença SQL de seleção: "+ e.getMessage());
        }
        
        Conexao.desconectar();
        return idencontrado;
    } 
    
     public static boolean excluir(FuncionarioModel funcionario) {
        String sql = "DELETE FROM funcionarios WHERE id = ?;";
        boolean retorno = false;
        Conexao.conectar();
        
        try{
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            sentenca.setInt(1, funcionario.getId());
            if (!sentenca.execute())
                retorno = true;
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de exclusão.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return retorno;
    }
    
      public ArrayList <FuncionarioModel> selecionarTodos() {
        ArrayList<FuncionarioModel> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios";
        Conexao.conectar();
        
        try {
            PreparedStatement sentenca = Conexao.con.prepareStatement(sql);
            ResultSet resultado = sentenca.executeQuery();
            
            while(resultado.next()) {
                FuncionarioModel modelo = new FuncionarioModel();
                modelo.setId(resultado.getInt("id"));
                modelo.setNome(resultado.getString("nome"));
                modelo.setCPF(resultado.getString("cpf"));
                modelo.setData_nascimento(resultado.getString("data_nascimento"));
                modelo.setSetor(resultado.getString("setor"));
               
                funcionarios.add(modelo);
            }
        }
        
        catch(SQLException e) {
            System.out.println("Erro na sentença SQL de seleção.\n" + e.getMessage());
        }
        
        Conexao.desconectar();
        return funcionarios;
    }
    
     
     
     
}
