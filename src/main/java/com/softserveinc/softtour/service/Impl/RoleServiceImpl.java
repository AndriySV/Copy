package com.softserveinc.softtour.service.Impl;


import com.softserveinc.softtour.dao.RoleDao;
import com.softserveinc.softtour.entity.Role;
import com.softserveinc.softtour.service.RoleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

    public void setRoleDao (RoleDao roleDao){this.roleDao = roleDao;}
    @Override
    public void save(String name){roleDao.save(name);}
    @Override
    public void update(long id, String name){roleDao.update(id, name);}
    @Override
    public void delete(long id){roleDao.delete(id);}
    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public Role findById(long id){return roleDao.findById(id);}
    @Override
    public List<Role> findByName(String name){return roleDao.findByName(name);}
    @Override
    public List<Role> getAll(){return roleDao.getAll();}
}
