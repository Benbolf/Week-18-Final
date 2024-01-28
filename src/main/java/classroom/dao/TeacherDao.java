package classroom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import Employee.Dao.Employee;


public interface TeacherDao extends JpaRepository<Teacher, Long> {
	
}