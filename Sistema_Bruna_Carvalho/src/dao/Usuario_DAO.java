/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuarioBlf;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Bruna Lopes Freitas
 */
public class Usuario_DAO extends DAOAbstract{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.flush();
        session.clear();
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.update(object);
        session.flush();
        session.clear();
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.delete(object);
        session.flush();
        session.clear();
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioBlf.class);
        criteria.add(Restrictions.eq("idUsuarioBlf", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);

    }

    @Override
    public List listAll() {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuarioBlf.class);
       List lista = criteria.list();
       session.getTransaction().commit();
       return (ArrayList) lista;
    }
    
}
