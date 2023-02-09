package model.dao;

import model.entities.Department;

import java.util.List;


public interface DepartmentDao {

    void insert(Department testDepartment);
    void update(Department testDepartment);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();




}
