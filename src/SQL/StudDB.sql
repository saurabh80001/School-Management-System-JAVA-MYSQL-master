drop table if exists student;
create table student
(
    roll_no int not null,
    Name varchar(50) not null,
    Class varchar(8) not null,
    Section varchar(8) not null,
    Gender varchar(6) not null,
    Address varchar(80) not null,
    Phone_No varchar(10) not null,
    s1 varchar(10) not null,
    s2 varchar(10) not null,
    s3 varchar(10) not null,
    s4 varchar(10) not null,
    s5 varchar(10) not null
);
/*----------------------------------------------------------------------------*/
insert into student values(1,"Amit Sharma","XII","A","Male","Surat","9876543210","Physics","Chemistry","English","Maths","IP");
insert into student values(2,"Dharmesh Jain","XII","A","Male","Kadodara","9786453120","Physics","Chemistry","English","Maths","PE");
insert into student values(1,"Anjali Mehta","XI","A","Female","Surat","9876543210","Physics","Chemistry","English","Biology","IP");
insert into student values(2,"Parth Lathiya","XI","A","Male","Surat","9876543210","Physics","Chemistry","English","Maths","PE");