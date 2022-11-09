package com.example.demo.controller;

import com.example.demo.mapper.DailyNoteMapper;
import com.example.demo.model.DailyNote;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DailyNoteController {

    private DailyNoteMapper mapper;

    public DailyNoteController(DailyNoteMapper mapper){
        this.mapper = mapper;
    }

    @GetMapping("/dailyNote/{note_id}")
    public DailyNote getDailyNote(@PathVariable("note_id") String note_id) {
        return mapper.getDailyNote(note_id);
    }

    @GetMapping("/dailyNote/all")
    public List<DailyNote> getDailyNoteList(){
        return mapper.getDailyNoteList();
    }
    @PutMapping("/dailyNote/{note_id}")
    public void putDailyNote(@PathVariable("note_id")String note_id,
                             @RequestParam("note_title")String note_title,
                             @RequestParam("note_contents")String note_contents,
                             @RequestParam("note_writer")String note_writer,
                             @RequestParam("reg_time")String regTime){
        mapper.insertDailyNoteWithIdTitleContentsWriter(note_id,note_title,note_contents,note_writer,regTime);
    }

    @PostMapping("/dailyNote/{note_id}")
    public void postDailyNote(@PathVariable("note_id") String note_id
            , @RequestParam("note_title") String note_title
            , @RequestParam("note_contents") String note_contents
            , @RequestParam("edit_time") String edit_time){
        mapper.updateDailyNote(note_id,note_title,note_contents,edit_time);
    }

    @DeleteMapping("/dailyNote/{note_id}")
    public void deleteDailyNote(@PathVariable("note_id")String note_id){
        mapper.deleteDailyNote(note_id);
    }
}
