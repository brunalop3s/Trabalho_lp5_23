/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuarioBlf;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
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
    
    public List listNome(String nomeBlf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioBlf.class);
        criteria.add(Restrictions.ilike("nomeBlf", "%" + nomeBlf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
       
    }
    
    public List listCpf(String cpfBlf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioBlf.class);
        criteria.add(Restrictions.ilike("nomeBlf","%" + cpfBlf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
       
    }
    
    public List listNomeCpf(String nomefBlf, String cpfBlf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioBlf.class);
         criteria.add(Restrictions.ilike("nomeBlf","%" + cpfBlf + "%"));
        criteria.add(Restrictions.ilike("nomeBlf","%" + cpfBlf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
       
    }
    
    public UsuarioBlf fazerLogin(String apelidoBlf, String senhaBlf) {
    try {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuarioBlf.class);
        //Restrictions = class começa com letra grande
        //eq = metodo estatico
        //Restrictions todos os metodos serão estaticos
        criteria.add(Restrictions.eq("apelidoBlf", apelidoBlf));
        criteria.add(Restrictions.eq("senhaBlf", senhaBlf));

        UsuarioBlf usuarioBlf = (UsuarioBlf) criteria.uniqueResult();

        session.getTransaction().commit();

        return usuarioBlf;
    } catch (Exception e) {
        e.printStackTrace();
    }

    return null;
}

    public void listNome(UsuarioBlf usuarioBlf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void listNome(JTextField jTxtNome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
