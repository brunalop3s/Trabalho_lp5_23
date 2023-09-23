/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutoBlf;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ProdutoControle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
        
    }
    
    public ProdutoBlf getBean(int linha) {
        return (ProdutoBlf) lista.get(linha);
        //M.P R.NúmLinha 
          
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 4;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        ProdutoBlf produtoBlf = (ProdutoBlf) lista.get(rowIndex);
         
        if (columnIndex == 0) {
       
            return produtoBlf.getIdProdutoBlf();
        }
        if (columnIndex == 1) {
            return produtoBlf.getNomeBlf();
        }
        if (columnIndex == 2) {
            return produtoBlf.getPrecoBlf();
        }
        if (columnIndex == 3) {
            return produtoBlf.getQuantidadeBlf();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Preço";
        }
        if (columnIndex == 3) {
            return "Quantidade";
        }
        return "";
    }
}

    


