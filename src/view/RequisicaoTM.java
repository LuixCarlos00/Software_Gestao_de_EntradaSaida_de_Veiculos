/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.RequisicaoModel;

/**
 *
 * @author luixc
 */
public class RequisicaoTM extends AbstractTableModel{

    private List<RequisicaoModel> linhas ;
    private String[] colunas = new String[]{"Itens","Quantidade","Valor Unitario"};
            
     
    
    public RequisicaoTM() {
        linhas = new ArrayList<RequisicaoModel>();
    }
    
    public RequisicaoTM(List<RequisicaoModel> lista) {
        linhas = new ArrayList<RequisicaoModel>(lista);
    }
    
    @Override
    public int getColumnCount() {        
        return colunas.length;
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        /*
        switch(columnIndex){
            case 0:
                return Integer.class;
            default:
                return String.class;
        }
        */
        return String.class;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RequisicaoModel f = linhas.get(rowIndex);

        switch (columnIndex) {
           
            case 0:
                return f.getItens();
            case 1:
                return f.getQuantidade();
            case 2:
                return f.getValorUnitario();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        RequisicaoModel f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            
            case 0:
                f.setItens(aValue.toString());
                break;
            case 1:
                f.setQuantidade(Integer.valueOf(aValue.toString()));
            case 2:
                f.setValorUnitario(Float.parseFloat(aValue.toString()));
                break;
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(RequisicaoModel aValue, int rowIndex) {
        RequisicaoModel f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
      
        f.setItens(aValue.getItens());
        f.setQuantidade(Float.parseFloat(aValue.toString()));
        f.setValorUnitario(Float.parseFloat(aValue.toString()));
  
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public RequisicaoModel getCompras(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addCompras(RequisicaoModel f) {
        // Adiciona o registro.
        linhas.add(f);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     /* Remove a linha especificada. */
    public void remove(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addLista(List<RequisicaoModel> f) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.
        linhas.addAll(f);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }   
   
}
    

