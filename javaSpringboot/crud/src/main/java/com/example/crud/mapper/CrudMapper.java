package com.example.crud.mapper;

import com.example.crud.dto.CrudDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CrudMapper {

    @Insert(" INSERT INTO mem VALUES(NULL, #{mUid}, #{mPWD}, #{mName} ) ")
    void setSave(CrudDto crudDto);

    @Select("select * from mem ${searchQuery} order by mId desc")
    List<CrudDto> getMem(String searchQuery);

    @Select("SELECT COUNT(*) FROM mem ${searchQuery}")
    int getMemCount(String searchQuery);

    @Select("SELECT * FROM mem WHERE mId = #{mId}")
    CrudDto getEdit(int mId);

    @Update("UPDATE mem SET mUid = #{mUid}, mPWD = #{mPWD}, mName = #{mName} WHERE mId = #{mId} ")
    void setEdit(CrudDto crudDto);

    @Delete("DELETE FROM mem WHERE mId = #{mId}")
    void setDelete(int mId);
}
