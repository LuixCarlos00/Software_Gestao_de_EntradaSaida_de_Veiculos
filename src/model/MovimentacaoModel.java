package model;

/**
 *
 * @author Talles
 */
public class MovimentacaoModel {
    private int id;
    private String tipo;
    private int idVeiculo;
    private int idFuncionario;
    private String data;
    private String hora;
    private String destino;
    private int quilometragem;

    public MovimentacaoModel(int id, String tipo, int idVeiculo, int idFuncionario, String data, String hora, String destino, int quilometragem) {
        this.id = id;
        this.tipo = tipo;
        this.idVeiculo = idVeiculo;
        this.idFuncionario = idFuncionario;
        this.data = data;
        this.hora = hora;
        this.destino = destino;
        this.quilometragem = quilometragem;
    }

    
    public MovimentacaoModel() {
        id = 0;
        tipo = "";
        idVeiculo = 0;
        idFuncionario = 0;
        data = "";
        hora = "";
        destino = "";
        quilometragem = 0;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    
    
}