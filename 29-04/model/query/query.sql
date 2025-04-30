create database base;
use base;

create table cliente
(
	id int(4) auto_increment primary key,
    code int(4),
    name_cliente varchar(60),
    phone varchar(60),
    email varchar(60)
);