/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FornecedorBlf;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bruna Lopes Freitas
 */
public class FornecedorControle extends AbstractTableModel {
    
    private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
    }
    
    public FornecedorBlf getBean(int linha) {
        return (FornecedorBlf) lista.get(linha);
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
        FornecedorBlf fornecedorBlf = (FornecedorBlf) lista.get(rowIndex);
        if (columnIndex == 0) {
            return fornecedorBlf.getIdFornecedorBlf();
        }
        if (columnIndex == 1) {
            return fornecedorBlf.getEmpresaOuPessoaBlf();
        }
        if (columnIndex == 2) {
            return fornecedorBlf.getCnpjBlf();
        }
        if (columnIndex == 3) {
            return fornecedorBlf.getTelefoneBlf();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Empresa_ou_Nome";
        }
        if (columnIndex == 2) {
            return "CNPJ";
        }
        if (columnIndex == 3) {
            return "Telefone";
        }
        return "";
    }
}
