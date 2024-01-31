package com.example.demo.Repositories;

import com.example.demo.Models.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findEmployeeByEmail(String email);
    //jpql
    @Query("select s from Employee s where s.id = ?1")
    Employee findByCustomerId(Long id);
    //native query
    @Query(value = "select * from Employee where email= ?1",nativeQuery = true)
    Employee findByEmail(String email);
    @Transactional
    @Modifying
    @Query(value = "update Employee e set e.firstName= ?2 where e.id = ?1")
    void updateById(Long id, String newFirstName);
    @Query(value = "select * from Employee where company_id = ?1",nativeQuery = true)
    List<Employee> findEmployeeByCompanyId(long id);
}
