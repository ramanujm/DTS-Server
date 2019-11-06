/**
 * 
 */
package com.dts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dts.entity.Employee;

/**
 * @author mishrar
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
