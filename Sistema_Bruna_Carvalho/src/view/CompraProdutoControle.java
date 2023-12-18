/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.CompraProdutoBlf;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bruna Lopes Freitas
 */
public class CompraProdutoControle extends AbstractTableModel {
    
    
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public CompraProdutoBlf getBean(int linha) {
        return (CompraProdutoBlf) lista.get(linha);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    public void addBean(CompraProdutoBlf compraProdutoBlf) {
        lista.add(compraProdutoBlf);
        this.fireTableDataChanged();
    }
    
     public void updateBean(int index, CompraProdutoBlf compraProdutoBlf) {
        lista.set(index, compraProdutoBlf);
        this.fireTableDataChanged();
    }
     
      public void removeBean(int index){
      lista.remove(index);
      this.fireTableDataChanged();
      }
          

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CompraProdutoBlf compraProdutoBlf = (CompraProdutoBlf) lista.get(rowIndex);
        
     
        if (columnIndex == 0) {
            return compraProdutoBlf.getProdutoBlf();
        }
        if (columnIndex == 1) {
            return compraProdutoBlf.getQuantidadeBlf();
        }
        if (columnIndex == 2) {
            return compraProdutoBlf.getValorUnitarioBlf();
        }
         //if (columnIndex == 3) {
           // return compraProdutoBlf.getTotalBlf();
       // }
        
        
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
       
        if (columnIndex == 0) {
            return "Produto";
        }
        if (columnIndex == 1) {
            return "Quantidade";
        }
        if (columnIndex == 2) {
            return "Valor Unitario";
        }
//        if (columnIndex == 3) {
//            return "Valor Total";
//        }
        return "";
    }
}
