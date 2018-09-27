create database sms;
use sms;

create table tbl_attendence(AttendenceId int primary key
auto_increment, Total_Present_Days int primary key,
Total_Absent_Days int primary key);
-----------------------------------------------------------------------
create table tbl_Library(LM_Id int primary key auto_increment,
Book_Name varchar(50) not null, Issued_Date timestamp default
 CURRENT_TIMESTAMP, Expiry_Date timestamp null, Fine int primary key, 
status tinyint(1));

--------------------------------------------------------------------------
create table tbl_staffaccount( Staff_AccNo int primary key);

------------------------------------------------------------------
create table tbl_studentaccount( student_Account_Number int primary key);

--------------------------------------------------------------------------

create table tbl_subject(SubjectId int auto_increment, 
Subject_Name varchar(50) not null);
---------------------------------------------------------------------------

create table tbl_vehicle(VehicleId int auto_increment, Vehicle_Registration_No
varchar(50) not null, Vehicle_Route varchar(100) not null);
  

----------------------------------------------------------------------
create table tbl_Staff (Staff_Id int primary key auto_increment,
Staff_Address varchar(50) not null, Staff_Post varchar(50) not null,
V_id int, LM_Id int, Att_id int, Staff_Account_No int,
Staff_Status tinyint(1));


alter table tbl_Staff add foreign key(library_id) references  
tbl_Library(LM_Id);

alter table tbl_Staff add foreign key(V_id) references  
tbl_vehicle(VehicleId);

alter table tbl_Staff add foreign key(Att_id) references  
tbl_attendence(LM_Id);

alter table tbl_Staff add foreign key(Staff_Account_No) references  
tbl_staffaccount(Staff_AccNo);
-------------------------------------------------------------------------

create table tbl_Student(S_Id int primary key auto_increment, S_Name
varchar(100) not null, S_Address varchar(50) not null, S_PhoneNo varchar(50) not null,
S_FatherName varchar(100) not null, S_MotherName varchar(100) not null,
S_Status tinyint(1));

alter table tbl_Student add foreign key(S_Id ) references tbl_staffaccount
(S_Id);

alter table tbl_Student add foreign key(Vehicle_Id) references tbl_vehicle
(Vehicle_Id);

alter table tbl_Student add foreign key(library_Id ) references tbl_Library
(LM_Id);

alter table tbl_Student add foreign key(attendence_Id ) references tbl_attendence
(AttendenceId);

------------------------------------------------------------------------


create table tbl_Teacher (Teacher_Id int auto_increment, Teacher_Position 
varchar(50) not null);

alter table tbl_Teacher add foreign key(Staff_Id ) references tbl_Staff
(Staff_id);
------------------------------------------------------------------------

create table tbl_TimeTable(TimeTable_Id int auto_increment, TimeTable_Period
int not null, Starting_time timestamp not null);

alter table tbl_TimeTable add foreign key(Teacher_Id) references tbl_Teacher
(Teacher_Id);

alter table tbl_TimeTable add foreign key(SubjectId) references tbl_subject
(SubjectId);

--------------------------------------------------------------------
