package com.tvidushi.repositary;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.tvidushi.model.Employee;

@Repository
@Transactional
public class EmployeeRepositoryCustomImpl  implements EmployeeRepositoryCustom{
	
    @PersistenceContext
    EntityManager entityManager;

	@Override
	public List<Employee> findByName(String name) {
		Query query = entityManager.createNativeQuery("Select * from com.tvidushi.model.Employee where emp_name = ?",Employee.class);
		 query.setParameter(1,name);
		return query.getResultList();
	}
	
	
	

  /*  @Override
    public List<Employee> getFirstNamesLike(String firstName) {
        Query query = entityManager.createNativeQuery("SELECT em.* FROM spring_data_jpa_example.employee as em " +
                "WHERE em.firstname LIKE ?", Employee.class);
        query.setParameter(1, firstName + "%");
        return query.getResultList();
    }
    
    */

}
