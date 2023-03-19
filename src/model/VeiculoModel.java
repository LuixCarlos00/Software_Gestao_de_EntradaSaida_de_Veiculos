package model;

public class VeiculoModel {
    private int id;
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private String status;

    public VeiculoModel(int id, String placa, String marca, String modelo, int ano, String status) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.status = status;
    }
    
    public VeiculoModel() {
        id = 0;
        placa = "";
        marca = "";
        modelo = "";
        ano = 0;
        status = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}