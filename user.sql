CREATE TABLE UserProfile (
                             id varchar(200) primary key,
                             name varchar(200) ,
                             phone varchar(30) ,
                             address varchar(500)
);
INSERT INTO UserProfile values (
                                   'id2',
                                   'name2',
                                   '010-2222-2222',
                                   'address22222'
                               );


SELECT *
From UserProfile
where 1=1;