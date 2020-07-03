package com.example.ea_system.mapper;

import com.example.ea_system.bean.Graduate_Resume_Job;
import com.example.ea_system.bean.Graduate_Resume_JobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Graduate_Resume_JobMapper {
    long countByExample(Graduate_Resume_JobExample example);

    int deleteByExample(Graduate_Resume_JobExample example);

    int deleteByPrimaryKey(Integer resumeid);

    int insert(Graduate_Resume_Job record);

    int insertSelective(Graduate_Resume_Job record);

    List<Graduate_Resume_Job> selectByExample(Graduate_Resume_JobExample example);

    Graduate_Resume_Job selectByPrimaryKey(Integer resumeid);

    int updateByExampleSelective(@Param("record") Graduate_Resume_Job record, @Param("example") Graduate_Resume_JobExample example);

    int updateByExample(@Param("record") Graduate_Resume_Job record, @Param("example") Graduate_Resume_JobExample example);

    int updateByPrimaryKeySelective(Graduate_Resume_Job record);

    int updateByPrimaryKey(Graduate_Resume_Job record);
}