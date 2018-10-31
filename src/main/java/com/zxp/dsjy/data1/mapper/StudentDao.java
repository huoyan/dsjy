package com.zxp.dsjy.data1.mapper;

import com.zxp.dsjy.data1.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface StudentDao {

    int add(Student aq);

    long updateById(Student aq);

    int deleteById(Long id);

    Student findById(Long id);

    List<Student> findAll();

}
