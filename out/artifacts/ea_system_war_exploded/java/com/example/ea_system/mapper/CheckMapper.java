package com.example.ea_system.mapper;

import com.example.ea_system.bean.Check;
import com.example.ea_system.bean.CheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckMapper {
    long countByExample(CheckExample example);

    int deleteByExample(CheckExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Check record);

    int insertSelective(Check record);

    List<Check> selectByExample(CheckExample example);

    Check selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Check record, @Param("example") CheckExample example);

    int updateByExample(@Param("record") Check record, @Param("example") CheckExample example);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);
}