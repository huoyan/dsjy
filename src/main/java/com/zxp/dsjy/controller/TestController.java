package com.zxp.dsjy.controller;

import com.zxp.dsjy.data1.entity.Student;
import com.zxp.dsjy.data1.mapper.StudentDao;
import com.zxp.dsjy.data2.entity.City;
import com.zxp.dsjy.data2.mapper.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者 zxp
 * 创建时间 2018/10/22/022
 * 交流群 897841829
 */
@RestController
public class TestController {
    @Autowired
    StudentDao studentDao;
    @Autowired
    CityDao cityDao;

    @GetMapping("/student")
    public Student getStudent(Long id) {
        Student student = studentDao.findById(id);
        return student;
    }

    @GetMapping("/world")
    public City getWorld(Long id) {
        City city = cityDao.findById(id);
        return city;
    }

    @GetMapping("/test")
    public String test(){
        return "测试";
    }
}
