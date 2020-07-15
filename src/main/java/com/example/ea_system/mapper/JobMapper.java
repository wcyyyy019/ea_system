package com.example.ea_system.mapper;

import com.example.ea_system.bean.Job;
import com.example.ea_system.bean.JobExample;
import java.util.List;

import com.example.ea_system.bean.Resume;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface JobMapper {
    long countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(Integer jobid);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);

    Job selectByPrimaryKey(Integer jobid);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

    List<Job> selectAll();

    List<Job> selectBycompany(int id);

    List<Job> selectName(String title);

}