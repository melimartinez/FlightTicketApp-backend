-- dropping tables
drop table customer;
drop table vendor;
drop table spaceship;
drop table spaceport;
drop table flight;
drop table ticket;

-- creating tables
create table customer (
	c_id serial primary key,
	first_name varchar(25),
	last_name varchar(25),
	dob varchar(10),
	email varchar(50),
	c_username varchar(7) not null unique,
	c_password varchar(7) not null,
	address_line_1 varchar(50) not null,
	address_line_2 varchar(50) default null,
	city varchar(50) not null,
	state varchar(2),
	zipcode int check (zipcode > 0),
	phone_number numeric(10, 0)
);

create table vendor (
	v_id serial primary key,
	company_name varchar(25),
	v_username varchar(7) not null unique,
	v_password varchar(7) not null,
	email varchar(50),
	phone_number numeric(10, 0),
	slogan varchar(50)
);

create table spaceship (
	ss_id serial primary key,
	type_of_spaceship varchar(25),
	ss_name varchar(25),
	num_seats numeric(3,0)
);

create table spaceport (
	sp_id serial primary key,
	sp_name varchar(25),
	planet varchar(15)
);

create table flight (
	f_id serial primary key,
	departure_spaceport int references spaceport(sp_id) on delete set null,
	arrival_spaceport int references spaceport(sp_id) on delete set null,
	departure_date_time bigint,
	arrival_date_time bigint,
	v_id int references vendor(v_id) on delete set null,
	ss_id int references spaceship(ss_id) on delete set null,
	price_per_ticket numeric(8,2),
	v_cost numeric(8,2),
	tickets_available int,
	status varchar(10)
);

create table ticket (
	t_id serial primary key,
	c_id int references customer(c_id) on delete set null,
	passport varchar(9),
	baggage int,
	meal varchar(15),
	f_id int references flight(f_id) on delete set null,
	cabin_class varchar(20)
);

