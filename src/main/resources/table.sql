CREATE TABLE todo(
                     id int NOT NULL auto_increment,
                     title varchar(20),
                     description_todo varchar(30),
                     priority varchar(15),
                     date_todo varchar(25),
                     PRIMARY KEY(id)
);
select * from todo;
insert into todo(title, description_todo, priority, date_todo)
values('shopping', 'buy food', 'low', '20.07.2022'),
      ('friend', 'call to friend', 'middle', '19.07.2022'),
      ('Dubai','fly to Dubai','high','25.07.2022');
select * from todo;