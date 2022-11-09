package com.example.demo.model;

public class DailyNote {

    private Long note_id;
    private String note_title;
    private String note_contents;
    private String note_writer;
    private String attach_yn;
    private String attach_path;
    private String edit_time;
    private String reg_time;
    private String comment_yn;
    private String comment_contents;
    private String comment_time;

    public DailyNote(Long note_id
            , String note_title
            , String note_contents
            , String note_writer
            , String attach_yn
            , String attach_path
            , String edit_time
            , String reg_time
            , String comment_yn
            , String comment_contents
            , String comment_time) {
        super();
        this.note_id = note_id;
        this.note_title = note_title;
        this.note_contents = note_contents;
        this.note_writer = note_writer;
        this.attach_yn = attach_yn;
        this.attach_path = attach_path;
        this.edit_time = edit_time;
        this.reg_time = reg_time;
        this.comment_yn = comment_yn;
        this.comment_contents = comment_contents;
        this.comment_time = comment_time;
    }

    public Long getNote_id() {
        return note_id;
    }

    public void setNote_id(Long note_id) {
        this.note_id = note_id;
    }

    public String getNote_title() {
        return note_title;
    }

    public void setNote_title(String note_title) {
        this.note_title = note_title;
    }

    public String getNote_contents() {
        return note_contents;
    }

    public void setNote_contents(String note_contents) {
        this.note_contents = note_contents;
    }

    public String getNote_writer() {
        return note_writer;
    }

    public void setNote_writer(String note_writer) {
        this.note_writer = note_writer;
    }

    public String getAttach_yn() {
        return attach_yn;
    }

    public void setAttach_yn(String attach_yn) {
        this.attach_yn = attach_yn;
    }

    public String getAttach_path() {
        return attach_path;
    }

    public void setAttach_path(String attach_path) {
        this.attach_path = attach_path;
    }

    public String getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(String edit_time) {
        this.edit_time = edit_time;
    }

    public String getReg_time() {
        return reg_time;
    }

    public void setReg_time(String reg_time) {
        this.reg_time = reg_time;
    }

    public String getComment_yn() {
        return comment_yn;
    }

    public void setComment_yn(String comment_yn) {
        this.comment_yn = comment_yn;
    }

    public String getComment_contents() {
        return comment_contents;
    }

    public void setComment_contents(String comment_contents) {
        this.comment_contents = comment_contents;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }


}
