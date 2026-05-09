package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentData;

@Service
public class StudentService {
	
	@Autowired
	public JdbcTemplate jt;
	
	public void insertStudent()
	{
		StudentData st=new StudentData(1,"Nandan",98);
		String query = "INSERT INTO student VALUES(?,?,?)";
		jt.update(query, st.getSid(), st.getSname(), st.getSmarks());
		 System.out.println("Data Inserted Successfully");
	}
	
	public List<StudentData> getStudentData()
	{
	    String query = "select * from student";

	    return jt.query(query, (rs, rowNum) -> {

	        return new StudentData(
	            rs.getInt("sid"),
	            rs.getString("sname"),
	            rs.getInt("smarks")
	        );
	    });
	}

}
