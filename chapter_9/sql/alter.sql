delete from comments;
delete from items;
alter table items add column author_id int not null references users(id);