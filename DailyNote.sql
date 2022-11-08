use  DailyNote;
CREATE TABLE noteTable (
                           note_id varchar(200) primary key,
                           note_title varchar(500) ,
                           note_contents varchar(5000) ,
                           note_writer varchar(100) ,
                           attach_yn varchar(2) ,
                           attach_path varchar(500) ,
                           edit_time varchar(50) ,
                           reg_time varchar(50) ,
                           comment_yn varchar(2) ,
                           comment_contents varchar(2000) ,
                           comment_time varchar(50)
);
INSERT INTO noteTable values (
                                 'test1','testTitle','testContents'
                             ,'testWriter','Y','testPath/path','testeditTime'
                             ,'testregTime','N',null,null
                             );
commit;

SELECT *
FROM noteTable;