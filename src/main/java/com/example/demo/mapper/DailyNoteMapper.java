package com.example.demo.mapper;

import com.example.demo.model.DailyNote;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DailyNoteMapper {

    @Select("SELECT * FROM noteTable WHERE note_id=#{note_id}")
    DailyNote getDailyNote(@Param("note_id") String note_id);

    @Select("SELECT * FROM noteTable")
    List<DailyNote> getDailyNoteList();

    @Insert("INSERT INTO noteTable VALUES(#{note_id}, #{note_title}, #{note_contents},#{note_writer},'N',null,null,#{reg_time},'N',null,null)")
    int insertDailyNoteWithIdTitleContentsWriter(@Param("note_id") String note_id
                                                , @Param("note_title") String note_title
                                                , @Param("note_contents") String note_contents
                                                , @Param("note_writer") String note_writer
                                                , @Param("reg_time") String reg_time);

    @Update("UPDATE noteTable SET note_title=#{note_title}, note_contents=#{note_contents}, edit_time=#{edit_time} WHERE note_id=#{note_id}")
    int updateDailyNote(@Param("note_id") String note_id
                        , @Param("note_title") String note_title
                        , @Param("note_contents") String note_contents
                        , @Param("edit_time") String edit_time);

    @Delete("DELETE FROM noteTable WHERE note_id=#{note_id}")
    int deleteDailyNote(@Param("note_id") String note_id);

}
