package com.example.demo.model;

public class DailyNote {

    private Long noteId;
    private String noteTitle;
    private String noteContents;
    private String noteWriter;
    private String attachYN;
    private String attachPath;
    private String editTime;
    private String regTime;
    private String commentYN;
    private String commentContents;
    private String commentTime;

    public DailyNote(Long noteId
            , String noteTitle
            , String noteContents
            , String noteWriter
            , String attachYN
            , String attachPath
            , String editTime
            , String regTime
            , String commentYN
            , String commentContents
            , String commentTime) {
        super();
        this.noteId = noteId;
        this.noteTitle = noteTitle;
        this.noteContents = noteContents;
        this.noteWriter = noteWriter;
        this.attachYN = attachYN;
        this.attachPath = attachPath;
        this.editTime = editTime;
        this.regTime = regTime;
        this.commentYN = commentYN;
        this.commentContents = commentContents;
        this.commentTime = commentTime;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteContents() {
        return noteContents;
    }

    public void setNoteContents(String noteContents) {
        this.noteContents = noteContents;
    }

    public String getNoteWriter() {
        return noteWriter;
    }

    public void setNoteWriter(String noteWriter) {
        this.noteWriter = noteWriter;
    }

    public String getAttachYN() {
        return attachYN;
    }

    public void setAttachYN(String attachYN) {
        this.attachYN = attachYN;
    }

    public String getAttachPath() {
        return attachPath;
    }

    public void setAttachPath(String attachPath) {
        this.attachPath = attachPath;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getCommentYN() {
        return commentYN;
    }

    public void setCommentYN(String commentYN) {
        this.commentYN = commentYN;
    }

    public String getCommentContents() {
        return commentContents;
    }

    public void setCommentContents(String commentContents) {
        this.commentContents = commentContents;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }


}
