/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.UsuarioBlf;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class UsuarioControlle extends AbstractTableModel{//classe Usuario Controle
     private List lista;//var
    
    public void setList(List lista) {
        this.lista = lista;
        // Método=> recebe lista como argumento = a var lista
       // this.fireTableDataChanged();
        
    }
    
    public UsuarioBlf getBean(int linha) {
        return (UsuarioBlf) lista.get(linha);
        //M.P R.NúmLinha 
       // retorna o objeto Usuario correspondente numero de linha na lista.    
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
        //retorna o número de linhas da tabela
    }

    @Override
    public int getColumnCount() {
        return 4;
        //número de colunas 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //retorna o valor a ser exibido em uma célula específica da tabela
        UsuarioBlf usuario = (UsuarioBlf) lista.get(rowIndex);
        // número da linha (rowIndex) 
        if (columnIndex == 0) {
       // número da coluna (columnIndex)
            return usuario.getIdUsuarioBlf();
        }
        if (columnIndex == 1) {
            return usuario.getNomeBlf();
        }
        if (columnIndex == 2) {
            return usuario.getApelidoBlf();
        }
        if (columnIndex == 3) {
            return usuario.getCpfBlf();
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
            return "Apelido";
        }
        if (columnIndex == 3) {
            return "CPF";
        }
        return "";
    }
}

    


