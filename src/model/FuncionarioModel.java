package model;

public class FuncionarioModel{ 

    private int id;
    private String nome;
    private String cpf; 
    private String data_nascimento;
    private String setor;

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

    public String getCPF() {
        return cpf;
    }

    public void setCPF (String CPF) {
        this.cpf = CPF;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }
    
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getSetor() {
        return setor;
    }
    
    public void setSetor(String Setor) {
        this.setor = Setor;
    }

}