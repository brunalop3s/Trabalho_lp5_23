/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.FuncionarioBlf;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Bruna Lopes Freitas
 */
public class Funcionario_DAO extends DAOAbstract{

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
        Criteria criteria = session.createCriteria(FuncionarioBlf.class);
        criteria.add(Restrictions.eq("idFuncionarioBlf", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
       Criteria criteria = session.createCriteria(FuncionarioBlf.class);
       List lista = criteria.list();
       session.getTransaction().commit();
       return (ArrayList) lista;
    }
    
      public List listNome(String nomeBlf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionarioBlf.class);
        criteria.add(Restrictions.ilike("nomeBlf", "%" + nomeBlf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
       
    }
    
    public List listData(Date dataNascimentoBlf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionarioBlf.class);
        criteria.add(Restrictions.eq("dataNascimentoBlf", dataNascimentoBlf));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
       
    }
    
    public List listNomeData(String nomefBlf, Date dataNascimentoBlf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FuncionarioBlf.class);
         criteria.add(Restrictions.ilike("nomeBlf","%" + nomefBlf + "%"));
        criteria.add(Restrictions.eq("dataNascimentoBlf", dataNascimentoBlf));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
       
    }
}
