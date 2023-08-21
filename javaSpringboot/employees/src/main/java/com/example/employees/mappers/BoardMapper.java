package com.example.employees.mappers;


import com.example.employees.dto.BoardDto;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {

    @Insert(" INSERT INTO kor_board VALUES(NULL, " +
            "#{korBoardNotice}, #{korBoardWriter}, #{korBoardSubject}, #{korBoardContent}, #{korBoardUploadName}, #{korBoardUploadUrl},  " +
            "#{korBoardUploadSize}, #{korBoardUploadTrans}, 0, #{korBoardReplyGrp}, 1, 1, NOW() ) ")
    void setBoardWrite(BoardDto boardDto);

    //ifnull(값, 1)
    @Select("SELECT ifnull( MAX(kor_board_reply_grp) + 1, 1 ) as Maxcnt FROM kor_board")
    int getMaxCnt();

    @Select("SELECT * FROM kor_board " +
            "ORDER BY kor_board_notice DESC, " +
            "kor_board_reply_grp DESC LIMIT #{start}, #{limit} ")
    List<BoardDto> getBoard(Map<String, Object> map);

    @Delete("DELETE FROM kor_board WHERE kor_board_id = #{korBoardId}")
    void deleteBoard(int korBoardId);

    @Select("SELECT * FROM kor_board WHERE kor_board_id = #{koroardId}")
    BoardDto viewBoard(int korBoardId);

    @Insert(" INSERT INTO kor_board VALUES(NULL, " +
            "#{korBoardNotice}, #{korBoardWriter}, #{korBoardSubject}, #{korBoardContent}, #{korBoardUploadName}, #{korBoardUploadUrl},  " +
            "#{korBoardUploadSize}, #{korBoardUploadTrans}, 0, #{korBoardReplyGrp}, #{korBoardReplyGrpSeq}, #{korBoardReplyGrpSeqIndent}, NOW() ) ")
    void replyBoard(BoardDto boardDto);

    @Update("UPDATE kor_board SET kor_board_visit = kor_board_visit + 1 WHERE kor_board_id = #{korBoardId}")
    void updateVisit(int korBoardId);

    @Update("UPDATE kor_board SET " +
            "kor_board_notice = #{korBoardNotice}, " +
            "kor_board_subject = #{korBoardSubject}, " +
            "kor_board_writer = #{korBoardWriter}, " +
            "kor_board_content = #{korBoardContent}, " +
            "kor_board_upload_name = #{korBoardUploadName}, " +
            "kor_board_upload_url = #{korBoardUploadUrl}, " +
            "kor_board_upload_size = #{korBoardUploadSize}, " +
            "kor_board_upload_trans = #{korBoardUploadTrans}, " +
            "kor_board_regdate = now() WHERE kor_board_id = #{korBoardId}")
    void setBoardUpdate(BoardDto boardDto);

    //페이지 처리를 하기 위한 전체 개시물 수
    @Select("SELECT COUNT(*) FROM kor_board")
    int getTotalCount();
}
