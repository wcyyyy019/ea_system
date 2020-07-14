package com.example.ea_system.mapper;

import com.example.ea_system.bean.Tutorial;
import com.example.ea_system.bean.TutorialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialMapper {
    long countByExample(TutorialExample example);

    int deleteByExample(TutorialExample example);

    int deleteByPrimaryKey(Integer tutorialid);

    int insert(Tutorial record);

    int insertSelective(Tutorial record);

    List<Tutorial> selectByExample(TutorialExample example);

    Tutorial selectByPrimaryKey(Integer tutorialid);

    int updateByExampleSelective(@Param("record") Tutorial record, @Param("example") TutorialExample example);

    int updateByExample(@Param("record") Tutorial record, @Param("example") TutorialExample example);

    int updateByPrimaryKeySelective(Tutorial record);

    int updateByPrimaryKey(Tutorial record);
}