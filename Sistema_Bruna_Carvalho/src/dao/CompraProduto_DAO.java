/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.CompraBlf;
import bean.CompraProdutoBlf;
import bean.FuncionarioBlf;
import bean.ProdutoBlf;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Bruna Lopes Freitas
 */
public class CompraProduto_DAO extends DAOAbstract{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

     @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraProdutoBlf.class);
        criteria.add(Restrictions.eq("idCompraProdutoBlf", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(CompraProdutoBlf.class);
       List lista = criteria.list();
       session.getTransaction().commit();
       return (ArrayList) lista;
    }
    
        public List listQuantidade(int quantidadeBlf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraProdutoBlf.class);
        criteria.add(Restrictions.eq("quantidadeBlf", quantidadeBlf));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
       
    }
    
    public List listValorUnitario(double valorUnitarioBlf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraProdutoBlf.class);
        criteria.add(Restrictions.eq("valorUnitarioBlf", valorUnitarioBlf));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
       
    }
    
    public List listQuantidadeValorUnitario(int quantidadeBlf, double valorUnitarioBlf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraProdutoBlf.class);
         criteria.add(Restrictions.eq("quantidadeBlf", quantidadeBlf));
        criteria.add(Restrictions.eq("valorUnitarioBlf", valorUnitarioBlf));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
       
    }
     public Object listProd(CompraBlf compraBlf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(CompraProdutoBlf.class);
        criteria.add(Restrictions.eq("compraBlf", compraBlf));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
