package com.te.springh2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springh2.EmployeeBean;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeBean, Integer>{

	public EmployeeBean findByIdAndName(Integer id,String name);
}
