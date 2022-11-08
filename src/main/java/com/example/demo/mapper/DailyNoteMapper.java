package com.example.demo.mapper;

import com.example.demo.model.DailyNote;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DailyNoteMapper {

    @Select("SELECT * FROM NoteTable WHERE note_id=#{noteId}")
    DailyNote getDailyNote(@Param("noteId") String noteId);

    @Select("SELECT * FROM NoteTable")
    List<DailyNote> getDailyNoteList();

    @Insert("INSERT INTO NoteTable VALUES(#{noteId}, #{noteTitle}, #{noteContents},#{noteWriter},'N',null,null,#{regTime},'N',null,null)")
    int insertDailyNoteWithIdTitleContentsWriter(@Param("noteId") String noteId
                                                , @Param("noteTitle") String noteTitle
                                                , @Param("noteContents") String noteContents
                                                , @Param("noteWriter") String noteWriter
                                                , @Param("regTime") String regTime);

    @Update("UPDATE NoteTable SET note_title=#{noteTitle}, note_contents=#{noteContents}, edit_time=#{editTime} WHERE note_id=#{noteId}")
    int updateDailyNote(@Param("noteId") String noteId
                        , @Param("noteTitle") String noteTitle
                        , @Param("noteContents") String noteContents
                        , @Param("editTime") String editTime);

    @Delete("DELETE FROM NoteTable WHERE note_id=#{noteId}")
    int deleteDailyNote(@Param("noteId") String noteId);

}
