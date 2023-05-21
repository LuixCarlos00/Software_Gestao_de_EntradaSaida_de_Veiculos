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
    
     
    private int ID;
    private String Itens;
    private int Quantidade;
    private float ValorUnitario;

    public RequisicaoModel(int ID, String Itens, int Quantidade, float ValorUnitario) {
        this.ID = ID;
        this.Itens = Itens;
        this.Quantidade = Quantidade;
        this.ValorUnitario = ValorUnitario;
    }

    public RequisicaoModel() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getItens() {
        return Itens;
    }

    public void setItens(String Itens) {
        this.Itens = Itens;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(float ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }
    
    
    
    
    
}
