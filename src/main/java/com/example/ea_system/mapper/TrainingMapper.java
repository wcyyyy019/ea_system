package com.example.ea_system.mapper;

import com.example.ea_system.bean.Training;
import com.example.ea_system.bean.TrainingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingMapper {
    long countByExample(TrainingExample example);

    int deleteByExample(TrainingExample example);

    int deleteByPrimaryKey(Integer graduateid);

    int insert(Training record);

    int insertSelective(Training record);

    List<Training> selectByExample(TrainingExample example);

    Training selectByPrimaryKey(Integer graduateid);

    int updateByExampleSelective(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExample(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKey(Training record);
}