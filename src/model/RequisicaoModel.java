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
    

    private String Itens;
    private float Quantidade;
    private float ValorUnitario;

    public RequisicaoModel( String Itens, int Quantidade, float ValorUnitario) {
    
        this.Itens = Itens;
        this.Quantidade = Quantidade;
        this.ValorUnitario = ValorUnitario;
    }

    public RequisicaoModel() {    
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
    
    
    
    
    
}
