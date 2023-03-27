package model;

public class UsuarioModel {

    private int id;
    private String nome;
    private String senha;
    private String admin;

    public UsuarioModel(int id, String nome, String senha, String admin) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.admin = admin;
    }
    
    public UsuarioModel() {
        id = 0;
        nome = "";
        senha = "";
        admin = "N";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    
}
