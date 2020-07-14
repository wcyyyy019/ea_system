package com.example.ea_system.mapper;

import com.example.ea_system.bean.Loginer;
import com.example.ea_system.bean.LoginerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginerMapper {
    long countByExample(LoginerExample example);

    int deleteByExample(LoginerExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Loginer record);

    int insertSelective(Loginer record);

    List<Loginer> selectByExample(LoginerExample example);

    Loginer selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Loginer record, @Param("example") LoginerExample example);

    int updateByExample(@Param("record") Loginer record, @Param("example") LoginerExample example);

    int updateByPrimaryKeySelective(Loginer record);

    int updateByPrimaryKey(Loginer record);
}