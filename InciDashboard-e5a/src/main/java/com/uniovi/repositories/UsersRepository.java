package com.uniovi.repositories;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.uniovi.model.User;




public interface UsersRepository extends CrudRepository<User, Long>{
	
    
	@Query("SELECT u FROM User u WHERE u.identificador= ?1 and u.password = ?2")
	public User findUserByIdentificadorAndPassword(String identificador, String password);
	
}
