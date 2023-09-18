create table users (
id bigserial primary key,
name text not null,
created timestamp
);

insert into users(name, created) values('test', now());