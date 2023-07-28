package com.example.kor.mapper;

import com.example.kor.dto.ArticleDto;
import com.example.kor.dto.ConfigDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ConfigMapper {

    @Insert("INSERT INTO config VALUES(#{code}, #{title}, #{color})")
    void setConfig(ConfigDto configDto);

    @Select("create table kortb_${code}(\n" +
            "id int not null auto_increment,\n" +
            "subject varchar(100),\n" +
            "writer varchar(20),\n" +
            "content text,\n" +
            "grp int,\n" +
            "dept int,\n" +
            "primary key (id)\n" +
            ");")
    void createTable(String code);

    @Select("SELECT * FROM config ORDER BY code ASC")
    List<ConfigDto> getConfig();

    @Delete("DELETE FROM config WHERE code= #{code}")
    void deleteConfig(String code);

    @Select("DROP TABLE kortb_${code}")
    void dropConfig(String code);

    @Select("SELECT * FROM config WHERE code= #{code}")
    ConfigDto getTitle(String code);

    @Select("SELECT * FROM kortb_${code} ORDER BY grp DESC, dept ASC")
    List<ArticleDto> getList(String code);

    @Insert("INSERT INTO kortb_${code} values(null, #{subject}, #{writer}, #{content}, #{grp}, 1)")
    void setWrite(ArticleDto articleDto);

    @Select("SELECT ifnull(max(grp)+1 ,1) as maxCnt FROM kortb_${code}")
    int getMaxCnt(String code);

    @Delete("DELETE FROM kortb_${code} WHERE id= #{id}")
    void delArticle(ArticleDto articleDto);

    @Select("SELECT * FROM kortb_${code} WHERE id=#{id}")
    ArticleDto getEdit(ArticleDto articleDto);

    @Update("UPDATE kortb_${code} SET subject = #{subject}, writer = #{writer}, content=#{content} WHERE id = #{id}")
    void setEdit(ArticleDto articleDto);
}
