package com.softserveinc.softtour.service;

import java.sql.Date;
import java.util.List;

import com.softserveinc.softtour.entity.Role;
import com.softserveinc.softtour.entity.User;
import com.softserveinc.softtour.entity.template.Sex;

/**
 * @author Andriy
 * 	Contains the methods for work with table User in the SoftTour database
 */
public interface UserService {
	
	/**
	 * Saves the object user to the table User
	 */
	public void save(String name, String email, String password, Date birthday, byte age, Sex sex, String phone, Role role);

	/**
	 *  Updates the object user with the specified id
	 *  id - id of the object user which will updated
	 */
	public void update(long id, String name, String email, String password, Date birthday, byte age, Sex sex, String phone, Role role);
	
	/**
	 *  Deletes the object user with the specified id
	 *  id - id of the object user which will deleted
	 */
	public void delete(long id);
	
	/**
	 *  Returns the object user with the specified id
	 *  id - id of the object user which will returned
	 */
	public User findById(long id);
	
	/**
	 *  Returns list of the objects user with the specified name or names
	 */
	public List<User> findByName(String...name);
	
	/**
	 *  Returns list of the objects user with the specified email or emails
	 */
	public List<User> findByEmail(String...email);
	
	/**
	 *  Returns list of the objects user with the specified password or passwords
	 */
	public List<User> findByPassword(String...password);
	
	/**
	 *  Returns list of the objects user with the specified birthday or birthdays
	 */
	public List<User> findByBirthday(Date...birthday);
	
	/**
	 *  Returns list of the objects user with the specified age
	 */
	public List<User> findByAge(Byte...age);
	
	/**
	 *  Returns list of the objects user with the specified sex
	 */
	public List<User> findBySex(Sex sex);
	
	/**
	 *  Returns list of the objects user with the specified phone or phones
	 */
	public List<User> findByPhone(String...phone);
	
	/**
	 *  Returns the list of the objects user which contain the specified object or objects role
	 */
	public List<User> findByRole(Role...role);
	
	/**
	 *  Returns the list of all objects user which are contained in the table User
	 */
	public List<User> getAll();

}