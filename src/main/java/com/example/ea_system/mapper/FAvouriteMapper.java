package com.example.ea_system.mapper;

import com.example.ea_system.bean.Favourite;
import com.example.ea_system.bean.FavouriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

<<<<<<< HEAD:src/main/java/com/example/ea_system/mapper/FAvouriteMapper.java
@Repository
public interface FAvouriteMapper {
=======
public interface FavouriteMapper {
>>>>>>> 4b9561199225373699d8763f921643518252a770:src/main/java/com/example/ea_system/mapper/FavouriteMapper.java
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