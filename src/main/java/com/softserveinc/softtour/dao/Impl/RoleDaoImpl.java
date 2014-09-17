package com.softserveinc.softtour.dao.Impl;

import com.softserveinc.softtour.dao.RoleDao;
import com.softserveinc.softtour.entity.Role;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Service
public class RoleDaoImpl extends HibernateDaoSupport implements RoleDao {
   
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
    public void save(String name){
        Role role = new Role(name);
        getHibernateTemplate().save(role);
    }
    @Override
    public void update(long id, String name){
        Role role = (Role) getHibernateTemplate().get(Role.class, id);
        if (role != null) {
            role.setName(name);
            getHibernateTemplate().update(role);
        } else {
            System.err.println("Error! \n you don't have role");
        }
    }
    @Override
    public void delete(long id){
        Role role = (Role) getHibernateTemplate().get(Role.class, id);
        if (role != null) {
            getHibernateTemplate().delete(role);
        } else {
            System.err.println("Error! \n you don't have role");
        }
    }
    @Override
    public Role findById(long id){
       // Role role = (Role) getHibernateTemplate().get(Role.class, id);
       Role role = entityManager.find(Role.class, id);
    	return role;
    }
    @Override
    public List<Role> findByName(String name){
        List<Role> list = (List<Role>) getHibernateTemplate().find("FROM Role WHERE name = ?", name);
        return list;
    }
    @Override
    public List<Role> getAll(){
        List<Role> list = (List<Role>) getHibernateTemplate().find("FROM Role");
        return list;
    }


}
