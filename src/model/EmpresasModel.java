/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luixc
 */
public class EmpresasModel {

    private int id;
    private String NomeEmpresa;
    private String cnpj;
    private String fax;
    private String endereco;
    private String uf;

    public EmpresasModel() {
    }

    public EmpresasModel(int id, String NomeEmpresa, String cnpj, String fax, String endereco, String uf) {
        this.id = id;
        this.NomeEmpresa = NomeEmpresa;
        this.cnpj = cnpj;
        this.fax = fax;
        this.endereco = endereco;
        this.uf = uf;
    }

   
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    
    
    
}
