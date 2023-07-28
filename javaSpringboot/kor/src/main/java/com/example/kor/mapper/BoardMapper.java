package com.example.kor.mapper;

import com.example.kor.dto.BoardDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Insert("INSERT INTO board VALUES(NULL, #{subject}, #{writer}, #{grp}, 1)")
    void setBoardWrite(BoardDto boardDto);

    @Select("SELECT * FROM board ORDER BY grp DESC, depth ASC")
    List<BoardDto> getBoardList();

    @Select("SELECT * FROM board WHERE id = #{id}")
    BoardDto getView(int id);

    @Insert("INSERT INTO board VALUES(NULL, #{subject}, #{writer}, #{grp}, #{depth})")
    void setReply(BoardDto boardDto);

    @Select("SELECT ifnull( max(grp) + 1, 1) as maxCnt FROM board")
    int maxCnt();
}
