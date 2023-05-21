package model;

public class UsuarioModel {

    private int id;
    private String nome;
    private String senha;
    private String admin;
    private String cpf;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
    public UsuarioModel(int id, String nome, String senha, String admin, String cpf) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.admin = admin;
<<<<<<< Updated upstream
        this.cpf = cpf;
=======
        this.cpf =cpf;
>>>>>>> Stashed changes
    }
    
    public UsuarioModel() {
        id = 0;
        nome = "";
        senha = "";
        admin = "N";
<<<<<<< Updated upstream
        cpf = "";
=======
        cpf ="";
>>>>>>> Stashed changes
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
    
}
