package modelo.dao;

import model.entity.Department;

import java.util.List;

public interface DepartmentDao {
     void insert(Department obj);
     void update(Department obj);
     void deleteById(Integer id);
     Department finById(Integer id);

     List<Department> findAll();
}
