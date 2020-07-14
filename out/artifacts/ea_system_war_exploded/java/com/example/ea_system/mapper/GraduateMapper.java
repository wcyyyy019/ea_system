package com.example.ea_system.mapper;

import com.example.ea_system.bean.Graduate;
import com.example.ea_system.bean.GraduateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GraduateMapper {
    long countByExample(GraduateExample example);

    int deleteByExample(GraduateExample example);

    int deleteByPrimaryKey(Integer graduateid);

    int insert(Graduate record);

    int insertSelective(Graduate record);

    List<Graduate> selectByExample(GraduateExample example);

    Graduate selectByPrimaryKey(Integer graduateid);

    int updateByExampleSelective(@Param("record") Graduate record, @Param("example") GraduateExample example);

    int updateByExample(@Param("record") Graduate record, @Param("example") GraduateExample example);

    int updateByPrimaryKeySelective(Graduate record);

    int updateByPrimaryKey(Graduate record);
}