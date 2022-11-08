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

    @GetMapping("/dailyNote/{noteId}")
    public DailyNote getDailyNote(@PathVariable("noteId") String noteId) {
        return mapper.getDailyNote(noteId);
    }

    @GetMapping("/dailyNote/all")
    public List<DailyNote> getDailyNoteList(){
        return mapper.getDailyNoteList();
    }

    @PutMapping("/dailyNote/{noteId}")
    public void putDailyNote(@PathVariable("noteId")String noteId,
                             @RequestParam("noteTitle")String noteTitle,
                             @RequestParam("noteContents")String noteContents,
                             @RequestParam("noteWriter")String noteWriter,
                             @RequestParam("regTime")String regTime){
        mapper.insertDailyNoteWithIdTitleContentsWriter(noteId,noteTitle,noteContents,noteWriter,regTime);
    }

    @PostMapping("/dailyNote/{noteId}")
    public void postDailyNote(@PathVariable("noteId") String noteId
            , @RequestParam("noteTitle") String noteTitle
            , @RequestParam("noteContents") String noteContents
            , @RequestParam("editTime") String editTime){
        mapper.updateDailyNote(noteId,noteTitle,noteContents,editTime);
    }

    @DeleteMapping("/dailyNote/{noteId}")
    public void deleteDailyNote(@PathVariable("noteId")String noteId){
        mapper.deleteDailyNote(noteId);
    }
}
