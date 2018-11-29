create table users(
   id varchar2(50 char) primary key,
   username varchar2(50 char),
   password varchar2(50 char),
   roles_id varchar2(50 char)
);

insert into users values('u001','admin','123456');
insert into users values('u002','test','123456');

commit;
