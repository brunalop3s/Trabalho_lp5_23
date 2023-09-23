/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FuncionarioBlf;
import bean.ProdutoBlf;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class FuncionarioControle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
        
    }
    
    public FuncionarioBlf getBean(int linha) {
        return (FuncionarioBlf) lista.get(linha);
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
        
        FuncionarioBlf funcionarioBlf = (FuncionarioBlf) lista.get(rowIndex);
         
        if (columnIndex == 0) {
       
            return funcionarioBlf.getIdFuncionarioBlf();
        }
        if (columnIndex == 1) {
            return funcionarioBlf.getNomeBlf();
        }
        if (columnIndex == 2) {
            return funcionarioBlf.getCpfBlf();
        }
        if (columnIndex == 3) {
            return funcionarioBlf.getCelularBlf();
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
            return "Cpf";
        }
        if (columnIndex == 3) {
            return "N° Celular";
        }
        return "";
    }
}

    


