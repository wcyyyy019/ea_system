package com.example.ea_system.mapper;

import com.example.ea_system.bean.Work_Experience;
import com.example.ea_system.bean.Work_ExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Work_ExperienceMapper {
    long countByExample(Work_ExperienceExample example);

    int deleteByExample(Work_ExperienceExample example);

    int deleteByPrimaryKey(Integer graduateid);

    int insert(Work_Experience record);

    int insertSelective(Work_Experience record);

    List<Work_Experience> selectByExample(Work_ExperienceExample example);

    Work_Experience selectByPrimaryKey(Integer graduateid);

    int updateByExampleSelective(@Param("record") Work_Experience record, @Param("example") Work_ExperienceExample example);

    int updateByExample(@Param("record") Work_Experience record, @Param("example") Work_ExperienceExample example);

    int updateByPrimaryKeySelective(Work_Experience record);

    int updateByPrimaryKey(Work_Experience record);
}