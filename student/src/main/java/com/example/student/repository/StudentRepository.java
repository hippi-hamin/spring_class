package com.example.student.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.student.dto.StudentDTO;
import java.util.List;

@Repository
public class StudentRepository {
	@Autowired
	private SqlSessionTemplate sql;

	public void save(StudentDTO studentDTO) {
		sql.insert("Student.save", studentDTO);	
	}

	public List<StudentDTO> findAll() {
		return sql.selectList("Student.findAll");
	}
	
}
