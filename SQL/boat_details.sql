-- create schema `practice`;

create table `practice`.`boat_details`(
`boat_id` INT primary key not null,
`boat_name` VARCHAR(15),
`boat_colour` VARCHAR(10),
`boat_bought` VARCHAR(3)
);

select *
from `practice`.`boat_details`;

insert into `boat_details`(boat_id, boat_name, boat_colour, boat_bought)
values (21, 'Titanic', 'White', 'Yes'),
(7, 'Night Fury', 'Black', 'No'),
(13, 'Aqua Holic', 'Blue', 'No'),
(11, 'Cease', 'Orange', 'Yes'),
(36, 'Sea Ways', 'Red', 'No');

create table `practice`.`boat_rentals`(
`boat_rental_id` INT NOT NULL,
`boat_rent_name` VARCHAR(30),
`boat_price` FLOAT,
`boat_id` INT,
primary key (`boat_rental_id`),
foreign key (`boat_id`) REFERENCES boat_details(`boat_id`)
);

select *
from `practice`.`boat_rentals`;

alter table `practice`.`boat_rentals`
add column `boat_rental_date` DATE;

alter table `practice`.`boat_rentals`
drop column `boat_rent_name`;

insert into `practice`.`boat_rentals`(boat_rental_id, boat_price, boat_id, boat_rental_date)
values (101, 543.76, 7, '2021-02-12');

insert into `practice`.`boat_rentals`(boat_rental_id, boat_price, boat_id, boat_rental_date)
values (105, 623.16, 11, '2021-02-14'),
(108, 548.92, 36, '2021-02-23'),
(104, 985.32, 21, '2021-02-12'),
(112, 753.98, 13, '2021-02-23'),
(107, 487.29, 36, '2021-02-08'),
(115, 676.82, 11, '2021-02-16'),
(113, 852.75, 36, '2021-02-20');

select *
from `practice`.`boat_details`;

select *
from `practice`.`boat_details`
where boat_bought = 'Yes';

select *
from `practice`.`boat_details`
where boat_bought = 'No';

select *
from `practice`.`boat_rentals`;

select *
from `practice`.`boat_rentals`
where boat_rental_date = '2021-02-12';

select *
from `practice`.`boat_rentals`
where boat_rental_date = '2021-02-14';

select *
from `practice`.`boat_rentals`
where boat_rental_date = '2021-02-23';

select *
from `practice`.`boat_rentals`
where boat_rental_date = '2021-02-08';

select *
from `practice`.`boat_rentals`
where boat_rental_date = '2021-02-20';

select *
from `practice`.`boat_rentals`
where boat_rental_date = '2021-02-16';

select *
from `practice`.`boat_rentals`
where boat_id = 7;

select *
from `practice`.`boat_rentals`
where boat_id = 11;

select *
from `practice`.`boat_rentals`
where boat_id = 36;

select *
from `practice`.`boat_rentals`
where boat_id = 21;

select *
from `practice`.`boat_rentals`
where boat_id = 13;

select *
from `practice`.`boat_rentals`;

select avg(boat_price)
from `practice`.`boat_rentals`;

select avg(boat_price)
from `practice`.`boat_rentals`
where boat_id = 7;

select avg(boat_price)
from `practice`.`boat_rentals`
where boat_id = 11;

select avg(boat_price)
from `practice`.`boat_rentals`
where boat_id = 13;

select avg(boat_price)
from `practice`.`boat_rentals`
where boat_id = 36;

select avg(boat_price)
from `practice`.`boat_rentals`
where boat_id = 21;

select avg(boat_price)
from `practice`.`boat_rentals`
where boat_rental_date = '2021-02-14';

select avg(boat_price)
from `practice`.`boat_rentals`
where boat_rental_date = '2021-02-12';

select*
from `practice`.`boat_rentals`;

select max(boat_price)
from `practice`.`boat_rentals`;

select min(boat_price)
from `practice`.`boat_rentals`;

select boat_id, boat_rental_date, boat_price
from `practice`.`boat_rentals`
where boat_price = (
select max(boat_price)
from `practice`.`boat_rentals`);

select boat_id, boat_rental_date, boat_price
from `practice`.`boat_rentals`
where boat_price = (
select min(boat_price)
from `practice`.`boat_rentals`);

select boat_id, count(*)
from `practice`.`boat_rentals`
group by boat_id;

select boat_bought, count(*)
from `practice`.`boat_details`
group by boat_bought;

select*
from `practice`.`boat_rentals`;

select boat_rental_date, count(*) as no_of_boats_rented
from `practice`.`boat_rentals`
group by boat_rental_date;

select boat.boat_id, boat.boat_name, rents.boat_rental_date
from `practice`.`boat_details` as boat
left join `practice`.`boat_rentals` as rents
on boat.boat_id = rents.boat_id;

delete
from `practice`.`boat_rentals`
where boat_id = 7;

select*
from `practice`.`boat_rentals`;

select boat.boat_id, boat.boat_name, rents.boat_rental_date
from `practice`.`boat_details` as boat
left join `practice`.`boat_rentals` as rents
on boat.boat_id = rents.boat_id;

delete
from `practice`.`boat_rentals`
where boat_id = 21;

select*
from `practice`.`boat_rentals`;

select deets.boat_id, deets.boat_name, rents.boat_rental_date
from boat_details as deets
left join boat_rentals as rents
on deets.boat_id = rents.boat_id;

select boat.boat_id, boat.boat_name, rent.boat_price, rent.boat_rental_date
from `practice`.`boat_details` as boat
right join `practice`.`boat_rentals` as rent
on boat.boat_id = rent.boat_id;

select boat.boat_id, boat.boat_name, rent.boat_price, rent.boat_rental_date
from `practice`.`boat_details` as boat
right join `practice`.`boat_rentals` as rent
on boat.boat_id = rent.boat_id
order by rent.boat_rental_date;

select boat.boat_id, boat.boat_name, boat.boat_colour, rent.boat_price
from `practice`.`boat_details` as boat
inner join `practice`.`boat_rentals` as rent
on boat.boat_id = rent.boat_id;

select *
from `practice`.`boat_details` as boat
inner join `practice`.`boat_rentals` as rent
on boat.boat_id = rent.boat_id;

