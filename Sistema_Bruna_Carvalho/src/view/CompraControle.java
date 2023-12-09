/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.CompraBlf;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class CompraControle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
        
    }
    
    public CompraBlf getBean(int linha) {
        return (CompraBlf) lista.get(linha);
        //M.P R.NúmLinha 
          
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 3;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        CompraBlf compraBlf = (CompraBlf) lista.get(rowIndex);
         
        if (columnIndex == 0) {
       
            return compraBlf.getIdCompraBlf();
        }
      
        if (columnIndex == 1) {
            return compraBlf.getDataCompraBlf();
        }
        if (columnIndex == 2) {
            return compraBlf.getTotalCompraBlf();
        }
        
        
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        
        if (columnIndex == 1) {
            return "Data da Compra";
        }
        if (columnIndex == 2) {
            return "Valor total da Compra";
        }
        return "";
    }
}

    


