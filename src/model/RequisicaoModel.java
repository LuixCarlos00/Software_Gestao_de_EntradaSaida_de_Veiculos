/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luixc
 */
public class RequisicaoModel {

    private int id;
    private String Itens;
    private float Quantidade;
    private float ValorUnitario;
    private String Empresa;
    private String Veiculo;
    private String Funcionario;
    private String Placaveiculo;
    private String data;

    public RequisicaoModel(int id, String Itens, float Quantidade, float ValorUnitario, String Empresa, String Veiculo, String Funcionario, String Placaveiculo, String data) {
        this.id = id;
        this.Itens = Itens;
        this.Quantidade = Quantidade;
        this.ValorUnitario = ValorUnitario;
        this.Empresa = Empresa;
        this.Veiculo = Veiculo;
        this.Funcionario = Funcionario;
        this.Placaveiculo = Placaveiculo;
        this.data = data;
    }

    public RequisicaoModel() {
        id = 0 ;
        Itens = " ";
        Quantidade = 0 ;
        ValorUnitario = 0 ;
        Empresa = " ";
        Veiculo = " ";
        Funcionario = " ";
        Placaveiculo = " ";
        data = " ";
    }


public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItens() {
        return Itens;
    }

    public void setItens(String Itens) {
        this.Itens = Itens;
    }

    public float getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(float Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(float ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(String Veiculo) {
        this.Veiculo = Veiculo;
    }

    public String getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(String Funcionario) {
        this.Funcionario = Funcionario;
    }

    public String getPlacaveiculo() {
        return Placaveiculo;
    }

    public void setPlacaveiculo(String Placaveiculo) {
        this.Placaveiculo = Placaveiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
