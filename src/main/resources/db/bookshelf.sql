create table books
(
	id int auto_increment
		primary key,
	name varchar(256) not null,
	isbn varchar(128) default 'NULL' null
)
;

create table orders
(
	id int auto_increment
		primary key,
	user_id int not null,
	book_id int not null
)
;

create table users
(
	id int auto_increment
		primary key,
	username varchar(128) not null,
	password int not null,
	status varchar(16) default '''CREATED''' null,
	enabled tinyint(1) default '1' null,
	constraint users_username_uindex
		unique (username)
)
;

