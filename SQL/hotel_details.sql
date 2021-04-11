CREATE SCHEMA `wolken`;

CREATE TABLE `wolken`.`hotel_details` (
`hotel_id` INT,
`hotel_name` VARCHAR(20),
`hotel_loc` VARCHAR(15),
`hotel_no_of_outlets` INT,
`hotel_owner` VARCHAR(30),
`hotel_food_type` TINYINT);

SELECT * FROM `wolken`.`hotel_employee`;

SELECT * FROM `wolken`.`hotel_details`;

DROP TABLE `wolken`.`hotel_employee`;

SELECT * FROM `wolken`.`hotel_employee`;

DROP SCHEMA `wolken`;

CREATE SCHEMA `wolken`;

CREATE TABLE `wolken`.`hotel_details` (
`hotel_id` INT,
`hotel_name` VARCHAR(20),
`hotel_loc` VARCHAR(15),
`hotel_no_of_outlets` INT,
`hotel_owner` VARCHAR(30),
`hotel_food_type` TINYINT);

SELECT * FROM `wolken`.`hotel_details`;

insert into hotel_details(hotel_id, hotel_name, hotel_loc, hotel_no_of_outlets, hotel_owner, hotel_food_type)
values (2, 'Radisson', 'Bangalore', 3, 'Rishab Aar', 0);

ALTER TABLE `wolken`.`hotel_details` 
CHANGE COLUMN `hotel_id` `hotel_id` INT NOT NULL ,
ADD PRIMARY KEY (`hotel_id`);
;

DELETE FROM hotel_details WHERE hotel_name = 'Radisson';

truncate table hotel_details;

insert into hotel_details(hotel_id, hotel_name, hotel_loc, hotel_no_of_outlets, hotel_owner, hotel_food_type)
values (1, 'Four Seasons', 'Bangalore', 2, 'Nishant Suri', 1),
(5, 'JW Mariott', 'Bangalore', 4, 'Ashna Prasad', 1),
(4, 'Leela Palace', 'Bangalore', 1, 'Pranika Prabhu', 0);

SELECT * FROM `wolken`.`hotel_details`;

ALTER TABLE `wolken`.`hotel_details` 
CHANGE COLUMN `hotel_food_type` `hotel_food_veg` TINYINT NULL DEFAULT NULL ;

update hotel_details
set hotel_food_veg = 1
where hotel_name = 'Leela Palace';

update hotel_details
set hotel_food_veg = 0
where hotel_id = 5;

select distinct * from hotel_details;

insert into hotel_details(hotel_id, hotel_name, hotel_loc, hotel_no_of_outlets, hotel_owner, hotel_food_type)
values (3, 'Swiss International', 'Bahrain', 1, 'Deepak Wadhwani', 0),
(7, 'Four Seasons', 'Bahrain', 1, 'Shameer Hussain', 0),
(9, 'Ramada International', 'Bahrain', 4, 'Eman Shaikh', 0);

insert into hotel_details(hotel_id, hotel_name, hotel_loc, hotel_no_of_outlets, hotel_owner, hotel_food_veg)
values (3, 'Swiss International', 'Bahrain', 1, 'Deepak Wadhwani', 0);

insert into hotel_details(hotel_id, hotel_name, hotel_loc, hotel_no_of_outlets, hotel_owner, hotel_food_veg)
values
(7, 'Four Seasons', 'Bahrain', 1, 'Shameer Hussain', 0),
(9, 'Ramada International', 'Bahrain', 4, 'Eman Shaikh', 0);

select * from hotel_details
where hotel_name = 'Four Seasons';

select * from hotel_details
where hotel_no_of_outlets = 1;

select * from hotel_details
where hotel_no_of_outlets = 2;

select * from hotel_details
where hotel_no_of_outlets = 3;

select * from hotel_details
where hotel_no_of_outlets = 4;

select * from hotel_details
where hotel_no_of_outlets = 5;

select * from hotel_details
where hotel_no_of_outlets > 1;

select * from hotel_details
where hotel_food_veg = 1;

select * from hotel_details
where hotel_food_veg = 0;

update hotel_details
set hotel_food_veg = 1,
hotel_no_of_outlets = 2
where hotel_id = 3;

select * from hotel_details;

insert into hotel_details(hotel_id, hotel_name, hotel_loc, hotel_no_of_outlets, hotel_owner, hotel_food_veg)
values (8, 'The Domain', 'Bahrain', 2, 'Vinti Shahani', 1);

update hotel_details
set hotel_owner = 'Soniya Singhnani'
where hotel_name = 'Four Seasons';

set sql_safe_updates = 0;

update hotel_details
set hotel_owner = 'Shameer Hussain'
where hotel_id = 7;

update hotel_details
set hotel_loc = 'Bangalore'
where hotel_name like 'Ramada%';

select hotel_food_veg, count(hotel_name)
from hotel_details
group by hotel_food_veg
order by hotel_food_veg;

select *
from hotel_details;

delete
from hotel_details
where hotel_id = 5;

select hotel_no_of_outlets, count(hotel_name)
from hotel_details
group by hotel_no_of_outlets
order by hotel_no_of_outlets;

select hotel_loc as location, count(*) as count
from hotel_details as hotels
group by hotel_loc
order by hotel_loc;

select hotel_loc as location, sum(hotel_no_of_outlets) as sum
from hotel_details
group by hotel_loc
order by hotel_loc;

select hotel_loc as location, count(hotel_food_veg) as count
from hotel_details
where hotel_food_veg = 1
group by hotel_loc
order by hotel_loc;

select *
from hotel_details
where hotel_loc like 'Bang%';

select *
from hotel_details
where hotel_loc like 'Bah%';

select hotel_food_veg
from hotel_details
group by hotel_food_veg
order by count(hotel_food_veg) desc ;

select hotel_loc as location, avg(hotel_no_of_outlets) as average
from hotel_details as hotels
group by hotel_loc
order by hotel_loc;

select hotel_loc as location, count(hotel_no_of_outlets) as count
from hotel_details as hotels
group by hotel_loc
order by hotel_loc;

select sum(hotel_no_of_outlets)
from hotel_details;

select hotel_loc as location, sum(hotel_food_veg) as count
from hotel_details as hotels
where hotel_food_veg = 0
group by hotel_loc;

select hotel_loc as location, avg(hotel_food_veg) as average
from hotel_details as hotels
where hotel_food_veg = 1
group by hotel_loc;


create table `wolken`.`states_details`(
state_id INT primary key not null,
state_name VARCHAR(20),
state_capital VARCHAR(20),
state_zipCode INT
);

drop table `wolken`.`states_details`;

insert into `wolken`.`states_details`(state_id, state_name, state_capital, state_zipCode)
values(1, 'Karnataka', 'Bangalore', 560001),
(2, 'Maharashtra', 'Mumbai', 400018),
(3, 'Delhi', 'New Delhi', 110001),
(4, 'Goa', 'Panaji', 403516);

alter table state_details()
modify column state_name VARCHAR(20);

select *
from `wolken`.`states_details`;

drop table `wolken`.`states_details`;

create table `wolken`.`staff_details`(
staff_id INT primary key not null,
staff_name VARCHAR(30),
staff_work VARCHAR(20),
staff_gender CHAR);

select *
from `wolken`.`hotel_details`;

delete
from `wolken`.`hotel_details`
where hotel_id = 1;

alter table `wolken`.`staff_details`
add column staff_work_id INT;

alter table `wolken`.`staff_details`
drop column staff_work ;

select *
from `wolken`.`staff_details`;

insert into `wolken`.`staff_details` (staff_id, staff_name, staff_gender, staff_work_id)
values (131, 'Alice', 'F', 2),
(392, 'Bob', 'M', 4),
(714, 'Carol', 'F', 7),
(267, 'Daniel', 'M', 7),
(431, 'Emma', 'F', 8),
(528, 'Farhan', 'M', 2),
(641, 'Gloria', 'F', 3);

select *
from `wolken`.`hotel_details`
left join `wolken`.`staff_details`
on hotel_details.hotel_id = staff_details.staff_work_id;

select * from staff_details;

insert into `wolken`.`staff_details` (staff_id, staff_name, staff_gender, staff_work_id)
values (853, 'Harris', 'M', 9),
(942, 'Iliana', 'F', 2);

select *
from hotel_details
left join staff_details
on hotel_details.hotel_id = staff_details.staff_work_id
order by staff_work_id;

select *
from hotel_details
right join staff_details
on staff_details.staff_work_id = hotel_details.hotel_id
order by staff_work_id;

select *
from hotel_details
left outer join staff_details
on hotel_details.hotel_id = staff_details.staff_work_id
order by staff_work_id;

select *
from hotel_details
right outer join staff_details
on staff_details.staff_work_id = hotel_details.hotel_id
order by staff_work_id;

select *
from hotel_details
inner join staff_details
on staff_details.staff_work_id = hotel_details.hotel_id
order by staff_work_id;

delete from staff_details
where staff_work_id = 2;

alter table `wolken`.`staff_details`
add column staff_loc VARCHAR(15);

select *
from staff_details;

insert into `wolken`.`staff_details` (staff_id, staff_name, staff_gender, staff_work_id)
values (942, 'Iliana', 'F', 2),
(131, 'Alice', 'F', 2),
(528, 'Farhan', 'M', 2);

update staff_details
set staff_loc = null
where staff_id = 431;

create schema `practice`;

