package com.zxp.dsjy.data2.mapper;

import com.zxp.dsjy.data2.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CityDao {

    int add(City aq);

    long updateById(City aq);

    int deleteById(Long id);

    City findById(Long id);

    List<City> findAll();

}
