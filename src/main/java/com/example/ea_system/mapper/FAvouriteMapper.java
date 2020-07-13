package com.example.ea_system.mapper;

import com.example.ea_system.bean.Favourite;
import com.example.ea_system.bean.FavouriteExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FAvouriteMapper {
    long countByExample(FavouriteExample example);

    int deleteByExample(FavouriteExample example);

    int deleteByPrimaryKey(Integer favouriteid);

    int insert(Favourite record);

    int insertSelective(Favourite record);

    List<Favourite> selectByExample(FavouriteExample example);

    Favourite selectByPrimaryKey(Integer favouriteid);

    int updateByExampleSelective(@Param("record") Favourite record, @Param("example") FavouriteExample example);

    int updateByExample(@Param("record") Favourite record, @Param("example") FavouriteExample example);

    int updateByPrimaryKeySelective(Favourite record);

    int updateByPrimaryKey(Favourite record);
}
